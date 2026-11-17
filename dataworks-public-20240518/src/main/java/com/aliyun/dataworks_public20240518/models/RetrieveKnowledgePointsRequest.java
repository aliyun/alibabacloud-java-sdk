// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RetrieveKnowledgePointsRequest extends TeaModel {
    /**
     * <p>The graph objects to focus the search on. You can specify up to 2 unique objects. The objects must be within the current authorized search scope and do not expand permissions.</p>
     */
    @NameInMap("FocusObjects")
    public java.util.List<RetrieveKnowledgePointsRequestFocusObjects> focusObjects;

    /**
     * <p>A list of 1 to 50 unique knowledge base IDs that restricts the search. If you omit this parameter, the operation discovers knowledge bases within the caller’s authorized scope. If you provide IDs, the operation checks access to each knowledge base and the entire request fails if the caller lacks access to any of them.</p>
     */
    @NameInMap("KnowledgeBaseIds")
    public java.util.List<String> knowledgeBaseIds;

    /**
     * <p>The maximum number of hits across all knowledge bases. Default value: 10. Valid values: 1 to 50. This parameter does not specify the quota for each knowledge base or the page size.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The natural language question. The length cannot exceed 256 Unicode code points after leading and trailing whitespaces are removed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>How is sales revenue calculated, and which tables does it come from?</p>
     */
    @NameInMap("Query")
    public String query;

    public static RetrieveKnowledgePointsRequest build(java.util.Map<String, ?> map) throws Exception {
        RetrieveKnowledgePointsRequest self = new RetrieveKnowledgePointsRequest();
        return TeaModel.build(map, self);
    }

    public RetrieveKnowledgePointsRequest setFocusObjects(java.util.List<RetrieveKnowledgePointsRequestFocusObjects> focusObjects) {
        this.focusObjects = focusObjects;
        return this;
    }
    public java.util.List<RetrieveKnowledgePointsRequestFocusObjects> getFocusObjects() {
        return this.focusObjects;
    }

    public RetrieveKnowledgePointsRequest setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        return this;
    }
    public java.util.List<String> getKnowledgeBaseIds() {
        return this.knowledgeBaseIds;
    }

    public RetrieveKnowledgePointsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public RetrieveKnowledgePointsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public static class RetrieveKnowledgePointsRequestFocusObjects extends TeaModel {
        /**
         * <p>The location ID of the knowledge point. Copy this value exactly as it appears in the search results and use it together with the corresponding KnowledgeBaseId and Type. Do not parse or convert this value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This parameter is used together with Type and Id to locate the knowledge point.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The read category of the knowledge point. Use GRAPH for the current focus objects and graph nodes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        @NameInMap("Type")
        public String type;

        public static RetrieveKnowledgePointsRequestFocusObjects build(java.util.Map<String, ?> map) throws Exception {
            RetrieveKnowledgePointsRequestFocusObjects self = new RetrieveKnowledgePointsRequestFocusObjects();
            return TeaModel.build(map, self);
        }

        public RetrieveKnowledgePointsRequestFocusObjects setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public RetrieveKnowledgePointsRequestFocusObjects setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public RetrieveKnowledgePointsRequestFocusObjects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
