// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountUpdateSessionExpireTimeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseAccountUpdateSessionExpireTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountUpdateSessionExpireTimeResponseBody self = new EnterpriseAccountUpdateSessionExpireTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountUpdateSessionExpireTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
