// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CredentialResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Credential data;

    @NameInMap("requestId")
    public String requestId;

    public static CredentialResult build(java.util.Map<String, ?> map) throws Exception {
        CredentialResult self = new CredentialResult();
        return TeaModel.build(map, self);
    }

    public CredentialResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialResult setData(Credential data) {
        this.data = data;
        return this;
    }
    public Credential getData() {
        return this.data;
    }

    public CredentialResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
