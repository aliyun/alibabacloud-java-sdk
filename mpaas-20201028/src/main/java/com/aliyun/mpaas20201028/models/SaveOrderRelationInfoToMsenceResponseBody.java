// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SaveOrderRelationInfoToMsenceResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("MpaasSaveOrderRelationResponse")
    public SaveOrderRelationInfoToMsenceResponseBodyMpaasSaveOrderRelationResponse mpaasSaveOrderRelationResponse;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMsg")
    public String resultMsg;

    @NameInMap("Success")
    public Boolean success;

    public static SaveOrderRelationInfoToMsenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveOrderRelationInfoToMsenceResponseBody self = new SaveOrderRelationInfoToMsenceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveOrderRelationInfoToMsenceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
