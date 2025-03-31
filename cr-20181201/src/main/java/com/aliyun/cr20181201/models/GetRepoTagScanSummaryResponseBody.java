// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetRepoTagScanSummaryResponseBody extends TeaModel {
    /**
     * <p>The number of medium-severity vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of low-severity vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("HighSeverity")
    public Integer highSeverity;

    /**
     * <p>The number of high-severity vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <strong>example:</strong>
     * <p>89</p>
     */
    @NameInMap("LowSeverity")
    public Integer lowSeverity;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("MediumSeverity")
    public Integer mediumSeverity;

    /**
     * <p>The total number of vulnerabilities detected on images.</p>
     * 
     * <strong>example:</strong>
     * <p>BC648259-91A7-4502-BED3-EDF64361FA83</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>196</p>
     */
    @NameInMap("TotalSeverity")
    public Integer totalSeverity;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
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
