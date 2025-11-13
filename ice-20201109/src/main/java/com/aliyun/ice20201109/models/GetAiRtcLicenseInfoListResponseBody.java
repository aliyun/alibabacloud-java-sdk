// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAiRtcLicenseInfoListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>httpStatusCode</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("LicenseInfoList")
    public java.util.List<AiRtcLicenseInfoDTO> licenseInfoList;

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
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetAiRtcLicenseInfoListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiRtcLicenseInfoListResponseBody self = new GetAiRtcLicenseInfoListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiRtcLicenseInfoListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiRtcLicenseInfoListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAiRtcLicenseInfoListResponseBody setLicenseInfoList(java.util.List<AiRtcLicenseInfoDTO> licenseInfoList) {
        this.licenseInfoList = licenseInfoList;
        return this;
    }
    public java.util.List<AiRtcLicenseInfoDTO> getLicenseInfoList() {
        return this.licenseInfoList;
    }

    public GetAiRtcLicenseInfoListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiRtcLicenseInfoListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiRtcLicenseInfoListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAiRtcLicenseInfoListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
