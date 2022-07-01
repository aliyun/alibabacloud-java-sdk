// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20101011.models;

import com.aliyun.tea.*;

public class DemoHttpComplexResponseRequest extends TeaModel {
    @NameInMap("reqInfo")
    public String reqInfo;

    public static DemoHttpComplexResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        DemoHttpComplexResponseRequest self = new DemoHttpComplexResponseRequest();
        return TeaModel.build(map, self);
    }

    public DemoHttpComplexResponseRequest setReqInfo(String reqInfo) {
        this.reqInfo = reqInfo;
        return this;
    }
    public String getReqInfo() {
        return this.reqInfo;
    }

}
