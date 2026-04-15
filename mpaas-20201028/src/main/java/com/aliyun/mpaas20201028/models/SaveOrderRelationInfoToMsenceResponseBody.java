// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveOrderRelationInfoToMsenceResponseBody extends TeaModel {
    @NameInMap("MpaasSaveOrderRelationResponse")
    public SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ResultMsg")
    public String resultMsg;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SaveOrderRelationInfoToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOrderRelationInfoToMsenceResponseBody self = new SaveOrderRelationInfoToMsenceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOrderRelationInfoToMsenceResponseBody setMpaasSaveOrderRelationResponse(SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse) {
        this.mpaasSaveOrderRelationResponse = mpaasSaveOrderRelationResponse;
        return this;
    }
    public SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse getMpaasSaveOrderRelationResponse() {
        return this.mpaasSaveOrderRelationResponse;
    }

    public SaveOrderRelationInfoToMsenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveOrderRelationInfoToMsenceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveOrderRelationInfoToMsenceResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveOrderRelationInfoToMsenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse build(java.util.Map<String, ?> map) throws Exception {
            SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse self = new SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse();
            return TeaModel.build(map, self);
        }

        public SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
