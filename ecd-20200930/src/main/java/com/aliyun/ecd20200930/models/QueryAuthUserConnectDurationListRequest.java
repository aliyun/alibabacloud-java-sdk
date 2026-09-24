// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryAuthUserConnectDurationListRequest extends TeaModel {
    /**
     * <p>The comparison operator for connection duration. This parameter is used together with Threshold to filter users by a threshold. Valid values:</p>
     * <ul>
     * <li>GreaterThanThreshold: greater than the threshold.</li>
     * <li>LessThanThreshold: less than the threshold.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GreaterThanThreshold</p>
     */
    @NameInMap("ComparisonOperator")
    public String comparisonOperator;

    /**
     * <p>The date for the statistics, in the yyyy-MM-dd format. If this parameter is left empty, statistics from the previous day are returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-24</p>
     */
    @NameInMap("DataDate")
    public String dataDate;

    /**
     * <p>Specifies whether to query only Active Directory (AD) users. This parameter is required when UserName or WithDetail is specified.</p>
     */
    @NameInMap("IsAdUser")
    public Boolean isAdUser;

    /**
     * <p>The paging token. This parameter is used only when statistics are collected by individual session details (StatisticType=SingleSession). You do not need to specify this parameter for the first request. For subsequent requests, set this parameter to the NextToken value returned in the previous response to retrieve the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>d129c6c0e8c04c8a9f0e2b7c1a3f5e6d</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number, starting from 1. Default value: 1. This parameter takes effect only when statistics are collected by daily cumulative duration (StatisticType=Daily).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 100. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The statistics type. Valid values:</p>
     * <ul>
     * <li>Daily: collects statistics by daily cumulative connection duration. This is the default value.</li>
     * <li>SingleSession: collects statistics by individual session details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Daily</p>
     */
    @NameInMap("StatisticType")
    public String statisticType;

    /**
     * <p>The connection duration threshold, in seconds. This parameter must be used together with ComparisonOperator.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Threshold")
    public Integer threshold;

    /**
     * <p>The name of the end user. Fuzzy match is supported. When you use this parameter, you must also specify IsAdUser.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>Specifies whether to backfill user details such as display name and nickname. This parameter supports both AD users and convenience users. When you use this parameter, you must also specify IsAdUser.</p>
     */
    @NameInMap("WithDetail")
    public Boolean withDetail;

    public static QueryAuthUserConnectDurationListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthUserConnectDurationListRequest self = new QueryAuthUserConnectDurationListRequest();
        return TeaModel.build(map, self);
    }

    public QueryAuthUserConnectDurationListRequest setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }

    public QueryAuthUserConnectDurationListRequest setDataDate(String dataDate) {
        this.dataDate = dataDate;
        return this;
    }
    public String getDataDate() {
        return this.dataDate;
    }

    public QueryAuthUserConnectDurationListRequest setIsAdUser(Boolean isAdUser) {
        this.isAdUser = isAdUser;
        return this;
    }
    public Boolean getIsAdUser() {
        return this.isAdUser;
    }

    public QueryAuthUserConnectDurationListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryAuthUserConnectDurationListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryAuthUserConnectDurationListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryAuthUserConnectDurationListRequest setStatisticType(String statisticType) {
        this.statisticType = statisticType;
        return this;
    }
    public String getStatisticType() {
        return this.statisticType;
    }

    public QueryAuthUserConnectDurationListRequest setThreshold(Integer threshold) {
        this.threshold = threshold;
        return this;
    }
    public Integer getThreshold() {
        return this.threshold;
    }

    public QueryAuthUserConnectDurationListRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryAuthUserConnectDurationListRequest setWithDetail(Boolean withDetail) {
        this.withDetail = withDetail;
        return this;
    }
    public Boolean getWithDetail() {
        return this.withDetail;
    }

}
