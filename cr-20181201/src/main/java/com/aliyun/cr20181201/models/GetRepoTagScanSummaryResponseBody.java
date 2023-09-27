// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanSummaryResponseBody extends TeaModel {
    /**
     * <p>The number of medium-severity vulnerabilities.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of low-severity vulnerabilities.</p>
     */
    @NameInMap("HighSeverity")
    public Integer highSeverity;

    /**
     * <p>The number of high-severity vulnerabilities.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("LowSeverity")
    public Integer lowSeverity;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request is successful.</p>
     * <p>*   `false`: The request fails.</p>
     */
    @NameInMap("MediumSeverity")
    public Integer mediumSeverity;

    /**
     * <p>The total number of vulnerabilities detected on images.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return value.</p>
     */
    @NameInMap("TotalSeverity")
    public Integer totalSeverity;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("UnknownSeverity")
    public Integer unknownSeverity;

    public static GetRepoTagScanSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRepoTagScanSummaryResponseBody self = new GetRepoTagScanSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRepoTagScanSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRepoTagScanSummaryResponseBody setHighSeverity(Integer highSeverity) {
        this.highSeverity = highSeverity;
        return this;
    }
    public Integer getHighSeverity() {
        return this.highSeverity;
    }

    public GetRepoTagScanSummaryResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public GetRepoTagScanSummaryResponseBody setLowSeverity(Integer lowSeverity) {
        this.lowSeverity = lowSeverity;
        return this;
    }
    public Integer getLowSeverity() {
        return this.lowSeverity;
    }

    public GetRepoTagScanSummaryResponseBody setMediumSeverity(Integer mediumSeverity) {
        this.mediumSeverity = mediumSeverity;
        return this;
    }
    public Integer getMediumSeverity() {
        return this.mediumSeverity;
    }

    public GetRepoTagScanSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRepoTagScanSummaryResponseBody setTotalSeverity(Integer totalSeverity) {
        this.totalSeverity = totalSeverity;
        return this;
    }
    public Integer getTotalSeverity() {
        return this.totalSeverity;
    }

    public GetRepoTagScanSummaryResponseBody setUnknownSeverity(Integer unknownSeverity) {
        this.unknownSeverity = unknownSeverity;
        return this;
    }
    public Integer getUnknownSeverity() {
        return this.unknownSeverity;
    }

}
