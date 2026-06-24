// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationResultsRequest extends TeaModel {
    /**
     * <p>Member account ID. This parameter is only applicable to multi-account evaluation mode.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("EvaluationDomain")
    public String evaluationDomain;

    /**
     * <p>Filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListEvaluationResultsRequestFilters> filters;

    /**
     * <p>Special evaluation code. Valid values:</p>
     * <ul>
     * <li>basic (default): Basic model (governance maturity) evaluation.</li>
     * <li>ack: Container construction special evaluation.</li>
     * <li>ai: Machine learning special evaluation.</li>
     * <li>nis: Network service special evaluation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("LensCode")
    public String lensCode;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Governance maturity evaluation scope. Valid values:</p>
     * <ul>
     * <li>Account (default): Performs single-account governance maturity evaluation, evaluating only the current account.</li>
     * <li>ResourceDirectory: Performs multi-account governance maturity evaluation, evaluating all member accounts in the resource directory. Before performing this operation, you must first upgrade to multi-account governance maturity evaluation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ResourceDirectory</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Evaluation snapshot ID.</p>
     * 
     * <strong>example:</strong>
     * <p>es-bp1r**************</p>
     */
    @NameInMap("SnapshotId")
    public String snapshotId;

    /**
     * <p>Governance topic code.</p>
     * 
     * <strong>example:</strong>
     * <p>IdentityAndAccessManagement</p>
     */
    @NameInMap("TopicCode")
    public String topicCode;

    public static ListEvaluationResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluationResultsRequest self = new ListEvaluationResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListEvaluationResultsRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ListEvaluationResultsRequest setEvaluationDomain(String evaluationDomain) {
        this.evaluationDomain = evaluationDomain;
        return this;
    }
    public String getEvaluationDomain() {
        return this.evaluationDomain;
    }

    public ListEvaluationResultsRequest setFilters(java.util.List<ListEvaluationResultsRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListEvaluationResultsRequestFilters> getFilters() {
        return this.filters;
    }

    public ListEvaluationResultsRequest setLensCode(String lensCode) {
        this.lensCode = lensCode;
        return this;
    }
    public String getLensCode() {
        return this.lensCode;
    }

    public ListEvaluationResultsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListEvaluationResultsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListEvaluationResultsRequest setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public ListEvaluationResultsRequest setTopicCode(String topicCode) {
        this.topicCode = topicCode;
        return this;
    }
    public String getTopicCode() {
        return this.topicCode;
    }

    public static class ListEvaluationResultsRequestFilters extends TeaModel {
        /**
         * <p>Filter condition key. Valid values:</p>
         * <ul>
         * <li>ResourceId: Resource ID.</li>
         * <li>ResourceName: Resource name.</li>
         * <li>ResourceType: Resource type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>List of filter condition values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static ListEvaluationResultsRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluationResultsRequestFilters self = new ListEvaluationResultsRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListEvaluationResultsRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListEvaluationResultsRequestFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

}
