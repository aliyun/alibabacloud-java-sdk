// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class CreatePersonalDIDResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxx&quot;</p>
     */
    @NameInMap("DID")
    public String DID;

    /**
     * <strong>example:</strong>
     * <p>&quot;7C171509-B966-4AD2-B654-7BE14F1F3AA6&quot;</p>
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

    public static CreatePersonalDIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalDIDResponseBody self = new CreatePersonalDIDResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePersonalDIDResponseBody setDID(String DID) {
        this.DID = DID;
        return this;
    }
    public String getDID() {
        return this.DID;
    }

    public CreatePersonalDIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePersonalDIDResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreatePersonalDIDResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreatePersonalDIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
