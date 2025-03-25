// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListPromptTemplatesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start position of the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>dc270401186b433f975d7e1faaa34e0e</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The templates.</p>
     */
    @NameInMap("promptTemplates")
    public java.util.List<ListPromptTemplatesResponseBodyPromptTemplates> promptTemplates;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9B6CBF-47E6-5D76-9C5D-B814DD5AB071</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-us9hjmt32nysdxxx</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    public static ListPromptTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPromptTemplatesResponseBody self = new ListPromptTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPromptTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPromptTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPromptTemplatesResponseBody setPromptTemplates(java.util.List<ListPromptTemplatesResponseBodyPromptTemplates> promptTemplates) {
        this.promptTemplates = promptTemplates;
        return this;
    }
    public java.util.List<ListPromptTemplatesResponseBodyPromptTemplates> getPromptTemplates() {
        return this.promptTemplates;
    }

    public ListPromptTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPromptTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListPromptTemplatesResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListPromptTemplatesResponseBodyPromptTemplates extends TeaModel {
        /**
         * <p>The template content</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The template name.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d6935b7efbe34d11b13df9307151cf8c</p>
         */
        @NameInMap("promptTemplateId")
        public String promptTemplateId;

        /**
         * <p>The template type.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;System&quot;</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The variables of the template.</p>
         */
        @NameInMap("variables")
        public java.util.List<String> variables;

        public static ListPromptTemplatesResponseBodyPromptTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListPromptTemplatesResponseBodyPromptTemplates self = new ListPromptTemplatesResponseBodyPromptTemplates();
            return TeaModel.build(map, self);
        }

        public ListPromptTemplatesResponseBodyPromptTemplates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListPromptTemplatesResponseBodyPromptTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPromptTemplatesResponseBodyPromptTemplates setPromptTemplateId(String promptTemplateId) {
            this.promptTemplateId = promptTemplateId;
            return this;
        }
        public String getPromptTemplateId() {
            return this.promptTemplateId;
        }

        public ListPromptTemplatesResponseBodyPromptTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPromptTemplatesResponseBodyPromptTemplates setVariables(java.util.List<String> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<String> getVariables() {
            return this.variables;
        }

    }

}
