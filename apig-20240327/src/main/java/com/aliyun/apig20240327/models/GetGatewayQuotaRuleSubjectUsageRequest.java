// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetGatewayQuotaRuleSubjectUsageRequest extends TeaModel {
    /**
     * <p>The end time for querying consumption record details, in UNIX timestamp format (seconds). If only this parameter is specified, the system automatically calculates startTime based on the rule cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1788425220</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>Specifies whether to filter out zero values.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("filterFailedRequests")
    public Boolean filterFailedRequests;

    /**
     * <p>The page number of the detailed consumption (request) records of the subject within the cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of detailed consumption (request) records per page for the subject within the cycle. Maximum value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The start time for querying consumption record details, in UNIX timestamp format (seconds). If only this parameter is specified, the system automatically calculates endTime based on the rule cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>1788338820</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static GetGatewayQuotaRuleSubjectUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayQuotaRuleSubjectUsageRequest self = new GetGatewayQuotaRuleSubjectUsageRequest();
        return TeaModel.build(map, self);
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setFilterFailedRequests(Boolean filterFailedRequests) {
        this.filterFailedRequests = filterFailedRequests;
        return this;
    }
    public Boolean getFilterFailedRequests() {
        return this.filterFailedRequests;
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetGatewayQuotaRuleSubjectUsageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
