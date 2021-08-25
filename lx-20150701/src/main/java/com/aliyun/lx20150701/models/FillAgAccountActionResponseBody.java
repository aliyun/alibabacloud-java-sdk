// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class FillAgAccountActionResponseBody extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Invoker")
    public String invoker;

    @NameInMap("Pk")
    public String pk;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Success")
    public Boolean success;

    public static FillAgAccountActionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FillAgAccountActionResponseBody self = new FillAgAccountActionResponseBody();
        return TeaModel.build(map, self);
    }

    public FillAgAccountActionResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FillAgAccountActionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FillAgAccountActionResponseBody setInvoker(String invoker) {
        this.invoker = invoker;
        return this;
    }
    public String getInvoker() {
        return this.invoker;
    }

    public FillAgAccountActionResponseBody setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

    public FillAgAccountActionResponseBody setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public FillAgAccountActionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
