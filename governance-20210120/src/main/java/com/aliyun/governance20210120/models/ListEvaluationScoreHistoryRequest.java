// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationScoreHistoryRequest extends TeaModel {
    /**
     * <p>The ID of the member accounts. This parameter is applicable only to the multi-account detection pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The end date of the query. Format: YYYY-MM-DD.</p>
     * <p>By default, the historical scores from the last 7 days are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-11</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("EvaluationDomain")
    public String evaluationDomain;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The start date of the query. Format: YYYY-MM-DD.</p>
     * <p>You can query records from the last 180 days.</p>
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

    public ListEvaluationScoreHistoryRequest setEvaluationDomain(String evaluationDomain) {
        this.evaluationDomain = evaluationDomain;
        return this;
    }
    public String getEvaluationDomain() {
        return this.evaluationDomain;
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
