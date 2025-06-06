// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class ListEvaluationResultsRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud account ID of the member. This parameter takes effect only when a multi-account governance maturity check is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>176618589410****</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListEvaluationResultsRequestFilters> filters;

    @NameInMap("LensCode")
    public String lensCode;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("SnapshotId")
    public String snapshotId;

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

    public static class ListEvaluationResultsRequestFilters extends TeaModel {
        /**
         * <p>The key of the filter condition. Valid values:</p>
         * <ul>
         * <li>ResourceId: the resource ID.</li>
         * <li>ResourceName: the name of the resource.</li>
         * <li>ResourceType: the resource type.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ResourceId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The list of filter condition values.</p>
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
