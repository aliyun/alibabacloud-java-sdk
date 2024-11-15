// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationScoreHistoryRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
     * <p>By default, the historical scores that were generated in the seven days before the current date are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-11</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
     * <p>You can query the historical scores within the previous 180 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-06-11</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static ListEvaluationScoreHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationScoreHistoryRequest self = new ListEvaluationScoreHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationScoreHistoryRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ListEvaluationScoreHistoryRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListEvaluationScoreHistoryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEvaluationScoreHistoryRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
