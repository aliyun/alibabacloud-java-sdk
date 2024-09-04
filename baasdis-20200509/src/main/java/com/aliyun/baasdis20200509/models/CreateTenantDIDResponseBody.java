// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreateTenantDIDResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxx&quot;</p>
     */
    @NameInMap("DID")
    public String DID;

    /**
     * <strong>example:</strong>
     * <p>&quot;757DB186-A865-4F65-935D-7D990E0CE451&quot;</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>&quot;OK&quot;</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTenantDIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantDIDResponseBody self = new CreateTenantDIDResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantDIDResponseBody setDID(String DID) {
        this.DID = DID;
        return this;
    }
    public String getDID() {
        return this.DID;
    }

    public CreateTenantDIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantDIDResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateTenantDIDResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateTenantDIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
