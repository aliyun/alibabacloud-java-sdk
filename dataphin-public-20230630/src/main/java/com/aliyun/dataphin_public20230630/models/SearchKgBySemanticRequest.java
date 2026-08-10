// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SearchKgBySemanticRequest extends TeaModel {
    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The search command.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SearchCommand")
    public SearchKgBySemanticRequestSearchCommand searchCommand;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SearchKgBySemanticRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchKgBySemanticRequest self = new SearchKgBySemanticRequest();
        return TeaModel.build(map, self);
    }

    public SearchKgBySemanticRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SearchKgBySemanticRequest setSearchCommand(SearchKgBySemanticRequestSearchCommand searchCommand) {
        this.searchCommand = searchCommand;
        return this;
    }
    public SearchKgBySemanticRequestSearchCommand getSearchCommand() {
        return this.searchCommand;
    }

    public SearchKgBySemanticRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SearchKgBySemanticRequestSearchCommand extends TeaModel {
        /**
         * <p>The entity type codes used for filtering. If this parameter is not specified, all entity types are searched.</p>
         */
        @NameInMap("EntityTypeCodes")
        public java.util.List<String> entityTypeCodes;

        /**
         * <p>The minimum similarity threshold. Valid values: 0.0 to 1.0. Default value: 0.0 (no filtering). This parameter takes effect only for the semantic search path.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("MinSimilarity")
        public Float minSimilarity;

        /**
         * <p>The property code for semantic search. If this parameter is not specified, all properties with semantic search enabled are searched.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("PropertyCode")
        public String propertyCode;

        /**
         * <p>The natural language query text. The value can be 0 to 500 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Query students in Beijing</p>
         */
        @NameInMap("QueryText")
        public String queryText;

        /**
         * <p>The maximum number of results to return. Default value: 20. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TopK")
        public Integer topK;

        public static SearchKgBySemanticRequestSearchCommand build(java.util.Map<String, ?> map) throws Exception {
            SearchKgBySemanticRequestSearchCommand self = new SearchKgBySemanticRequestSearchCommand();
            return TeaModel.build(map, self);
        }

        public SearchKgBySemanticRequestSearchCommand setEntityTypeCodes(java.util.List<String> entityTypeCodes) {
            this.entityTypeCodes = entityTypeCodes;
            return this;
        }
        public java.util.List<String> getEntityTypeCodes() {
            return this.entityTypeCodes;
        }

        public SearchKgBySemanticRequestSearchCommand setMinSimilarity(Float minSimilarity) {
            this.minSimilarity = minSimilarity;
            return this;
        }
        public Float getMinSimilarity() {
            return this.minSimilarity;
        }

        public SearchKgBySemanticRequestSearchCommand setPropertyCode(String propertyCode) {
            this.propertyCode = propertyCode;
            return this;
        }
        public String getPropertyCode() {
            return this.propertyCode;
        }

        public SearchKgBySemanticRequestSearchCommand setQueryText(String queryText) {
            this.queryText = queryText;
            return this;
        }
        public String getQueryText() {
            return this.queryText;
        }

        public SearchKgBySemanticRequestSearchCommand setTopK(Integer topK) {
            this.topK = topK;
            return this;
        }
        public Integer getTopK() {
            return this.topK;
        }

    }

}
