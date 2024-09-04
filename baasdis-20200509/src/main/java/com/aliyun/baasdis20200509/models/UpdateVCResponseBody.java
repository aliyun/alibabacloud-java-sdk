// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class UpdateVCResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;1265B5EA-704A-4DCA-83F9-29C4D3B69549&quot;</p>
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

    public static UpdateVCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateVCResponseBody self = new UpdateVCResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateVCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateVCResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateVCResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateVCResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
