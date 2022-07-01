// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGreyReleaseTestRequest extends TeaModel {
    @NameInMap("Number")
    public Long number;

    public static DemoGreyReleaseTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoGreyReleaseTestRequest self = new DemoGreyReleaseTestRequest();
        return TeaModel.build(map, self);
    }

    public DemoGreyReleaseTestRequest setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

}
