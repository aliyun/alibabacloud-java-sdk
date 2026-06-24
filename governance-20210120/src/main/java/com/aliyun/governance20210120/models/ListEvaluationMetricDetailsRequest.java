// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationMetricDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the member account. This parameter is applicable only to the multi-account check pattern.</p>
     * 
     * <strong>example:</strong>
     * <p>103144549568****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The date to query.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-01</p>
     */
    @NameInMap("Date")
    public String date;

    @NameInMap("EvaluationDomain")
    public String evaluationDomain;

    /**
     * <p>The ID of the check item for which you want to retrieve non-compliant resources.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2841889.html">ListEvaluationMetadata</a> operation to obtain the check item ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xfyve5****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The maximum number of entries to return in a single request. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGEaXR18y1rqykZHIqRuBejOqED4S3Xne33c7zbn****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scope of the governance maturity check. Valid values:</p>
     * <ul>
     * <li>Account (default): queries the check item details for the current account.</li>
     * <li>ResourceDirectory: queries the check item details for all member accounts in the resource directory. Before using this value, upgrade to multi-account governance maturity check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Account</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The check snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>es-bp1r**************</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    public static ListEvaluationMetricDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationMetricDetailsRequest self = new ListEvaluationMetricDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationMetricDetailsRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ListEvaluationMetricDetailsRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public ListEvaluationMetricDetailsRequest setEvaluationDomain(String evaluationDomain) {
        this.evaluationDomain = evaluationDomain;
        return this;
    }
    public String getEvaluationDomain() {
        return this.evaluationDomain;
    }

    public ListEvaluationMetricDetailsRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ListEvaluationMetricDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluationMetricDetailsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluationMetricDetailsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEvaluationMetricDetailsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListEvaluationMetricDetailsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

}
