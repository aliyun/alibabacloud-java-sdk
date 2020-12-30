// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupDrdsParamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Success")
    public Boolean success;

    public static SetupDrdsParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetupDrdsParamsResponseBody self = new SetupDrdsParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetupDrdsParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupDrdsParamsResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetupDrdsParamsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
