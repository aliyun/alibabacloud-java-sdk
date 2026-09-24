// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDiagnosisItemsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListDiagnosisItemsResponseBodyResult> result;

    public static ListDiagnosisItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDiagnosisItemsResponseBody self = new ListDiagnosisItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDiagnosisItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDiagnosisItemsResponseBody setResult(java.util.List<ListDiagnosisItemsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDiagnosisItemsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDiagnosisItemsResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether billable tokens are consumed. The value is true when level is ADVANCED.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("billable")
        public Boolean billable;

        /**
         * <p>The category code. You can use this value to group diagnostic items by category.</p>
         * 
         * <strong>example:</strong>
         * <p>CLUSTER_HEALTH</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The diagnostic item description.</p>
         * 
         * <strong>example:</strong>
         * <p>Diagnoses whether data write operations are backlogged in the cluster. When data write operations are backlogged, BulkReject exceptions occur, which may cause data loss and severe system resource consumption</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the cluster API is accessed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("esApiRequired")
        public Boolean esApiRequired;

        /**
         * <p>The diagnostic item identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>ClusterBulkRejectDiagnostic</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The diagnostic item level. Valid values:</p>
         * <ul>
         * <li>BASIC: basic inspection item (free).</li>
         * <li>ADVANCED: advanced inspection item (consumes billable tokens).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <p>The diagnostic item name.</p>
         * 
         * <strong>example:</strong>
         * <p>Index Write BulkReject Diagnostics</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The sort order number for display.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sortOrder")
        public Integer sortOrder;

        /**
         * <p>The supported execution modes. Basic items support RULE and AGENT. Advanced items support only AGENT.</p>
         */
        @NameInMap("supportedModes")
        public java.util.List<String> supportedModes;

        public static ListDiagnosisItemsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDiagnosisItemsResponseBodyResult self = new ListDiagnosisItemsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDiagnosisItemsResponseBodyResult setBillable(Boolean billable) {
            this.billable = billable;
            return this;
        }
        public Boolean getBillable() {
            return this.billable;
        }

        public ListDiagnosisItemsResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDiagnosisItemsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDiagnosisItemsResponseBodyResult setEsApiRequired(Boolean esApiRequired) {
            this.esApiRequired = esApiRequired;
            return this;
        }
        public Boolean getEsApiRequired() {
            return this.esApiRequired;
        }

        public ListDiagnosisItemsResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListDiagnosisItemsResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListDiagnosisItemsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDiagnosisItemsResponseBodyResult setSortOrder(Integer sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        public ListDiagnosisItemsResponseBodyResult setSupportedModes(java.util.List<String> supportedModes) {
            this.supportedModes = supportedModes;
            return this;
        }
        public java.util.List<String> getSupportedModes() {
            return this.supportedModes;
        }

    }

}
