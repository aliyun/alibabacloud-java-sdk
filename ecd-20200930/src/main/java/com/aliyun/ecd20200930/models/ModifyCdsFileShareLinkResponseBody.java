// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyCdsFileShareLinkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CdsFileShareLinkModel data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyCdsFileShareLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdsFileShareLinkResponseBody self = new ModifyCdsFileShareLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdsFileShareLinkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCdsFileShareLinkResponseBody setData(CdsFileShareLinkModel data) {
        this.data = data;
        return this;
    }
    public CdsFileShareLinkModel getData() {
        return this.data;
    }

    public ModifyCdsFileShareLinkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCdsFileShareLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCdsFileShareLinkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
