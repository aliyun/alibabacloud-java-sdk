// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class QueryEndUserHistoryUsageRequest extends TeaModel {
    /**
     * <p>The end date of the query. Format: yyyy-MM-dd. The date cannot be later than yesterday or earlier than StartDate. Default value: yesterday.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-15</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>Specifies whether to query Active Directory (AD) domain users. If this parameter is set to true, AD domain users are queried. If this parameter is set to false or not specified, convenience account users are queried.</p>
     */
    @NameInMap("IsAdUser")
    public Boolean isAdUser;

    /**
     * <p>The page number. Minimum value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start date of the query. Format: yyyy-MM-dd. The date cannot be earlier than 32 days ago. Default value: yesterday.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-01-01</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static QueryEndUserHistoryUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEndUserHistoryUsageRequest self = new QueryEndUserHistoryUsageRequest();
        return TeaModel.build(map, self);
    }

    public QueryEndUserHistoryUsageRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryEndUserHistoryUsageRequest setIsAdUser(Boolean isAdUser) {
        this.isAdUser = isAdUser;
        return this;
    }
    public Boolean getIsAdUser() {
        return this.isAdUser;
    }

    public QueryEndUserHistoryUsageRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryEndUserHistoryUsageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEndUserHistoryUsageRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
