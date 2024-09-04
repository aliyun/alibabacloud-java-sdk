// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreateEenterpriseDIDResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxx&quot;</p>
     */
    @NameInMap("DID")
    public String DID;

    /**
     * <strong>example:</strong>
     * <p>&quot;7CEDB9B0-E68A-4E67-A258-EEE342695921&quot;</p>
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

    public static CreateEenterpriseDIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEenterpriseDIDResponseBody self = new CreateEenterpriseDIDResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEenterpriseDIDResponseBody setDID(String DID) {
        this.DID = DID;
        return this;
    }
    public String getDID() {
        return this.DID;
    }

    public CreateEenterpriseDIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEenterpriseDIDResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateEenterpriseDIDResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateEenterpriseDIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
