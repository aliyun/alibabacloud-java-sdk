// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ResetDeviceRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    public static ResetDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceRequest self = new ResetDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ResetDeviceRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
