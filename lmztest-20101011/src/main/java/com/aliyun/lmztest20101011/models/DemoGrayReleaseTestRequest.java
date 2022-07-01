// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGrayReleaseTestRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("NumberCode")
    public Integer numberCode;

    public static DemoGrayReleaseTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoGrayReleaseTestRequest self = new DemoGrayReleaseTestRequest();
        return TeaModel.build(map, self);
    }

    public DemoGrayReleaseTestRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DemoGrayReleaseTestRequest setNumberCode(Integer numberCode) {
        this.numberCode = numberCode;
        return this;
    }
    public Integer getNumberCode() {
        return this.numberCode;
    }

}
