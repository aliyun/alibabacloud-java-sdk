// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoGrayReleaseTestTwoRequest extends TeaModel {
    @NameInMap("Code")
    public Long code;

    // A short description of struct
    @NameInMap("NumberCode")
    public String numberCode;

    public static DemoGrayReleaseTestTwoRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoGrayReleaseTestTwoRequest self = new DemoGrayReleaseTestTwoRequest();
        return TeaModel.build(map, self);
    }

    public DemoGrayReleaseTestTwoRequest setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DemoGrayReleaseTestTwoRequest setNumberCode(String numberCode) {
        this.numberCode = numberCode;
        return this;
    }
    public String getNumberCode() {
        return this.numberCode;
    }

}
