// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAiRtcAuthCodeListResponseBody extends TeaModel {
    @NameInMap("AuthCodeList")
    public java.util.List<AiRtcAuthCodeDTO> authCodeList;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetAiRtcAuthCodeListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiRtcAuthCodeListResponseBody self = new GetAiRtcAuthCodeListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiRtcAuthCodeListResponseBody setAuthCodeList(java.util.List<AiRtcAuthCodeDTO> authCodeList) {
        this.authCodeList = authCodeList;
        return this;
    }
    public java.util.List<AiRtcAuthCodeDTO> getAuthCodeList() {
        return this.authCodeList;
    }

    public GetAiRtcAuthCodeListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiRtcAuthCodeListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAiRtcAuthCodeListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiRtcAuthCodeListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiRtcAuthCodeListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAiRtcAuthCodeListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
