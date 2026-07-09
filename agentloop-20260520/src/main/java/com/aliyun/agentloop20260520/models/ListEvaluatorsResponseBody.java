// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluatorsResponseBody extends TeaModel {
    /**
     * <p>The list of evaluator summaries.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;trace_task_completion&quot;,&quot;type&quot;:&quot;AGENT&quot;,&quot;latestVersion&quot;:&quot;1.0.0&quot;}]</p>
     */
    @NameInMap("evaluators")
    public java.util.List<ListEvaluatorsResponseBodyEvaluators> evaluators;

    /**
     * <p>The number of entries per page used in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJsYXN0SWQiOjEzM30=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3FE4CD1E-FF41-56BE-B590-7A021D9C1524</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of evaluators that match the filter conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListEvaluatorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluatorsResponseBody self = new ListEvaluatorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluatorsResponseBody setEvaluators(java.util.List<ListEvaluatorsResponseBodyEvaluators> evaluators) {
        this.evaluators = evaluators;
        return this;
    }
    public java.util.List<ListEvaluatorsResponseBodyEvaluators> getEvaluators() {
        return this.evaluators;
    }

    public ListEvaluatorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluatorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluatorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluatorsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListEvaluatorsResponseBodyEvaluators extends TeaModel {
        /**
         * <p>The list of annotations.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;__en&quot;]</p>
         */
        @NameInMap("annotations")
        public java.util.List<String> annotations;

        /**
         * <p>The creation time, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The evaluator description.</p>
         * 
         * <strong>example:</strong>
         * <p>判断 Agent 是否完成用户任务</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>链路任务完成度</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The latest version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The metric name.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_task_completion</p>
         */
        @NameInMap("metricName")
        public String metricName;

        /**
         * <p>The evaluator name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_task_completion</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The evaluator properties.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentEvaluatorMode&quot;:&quot;raw_prompt&quot;}</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>The evaluator type.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The update time, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816600</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static ListEvaluatorsResponseBodyEvaluators build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluatorsResponseBodyEvaluators self = new ListEvaluatorsResponseBodyEvaluators();
            return TeaModel.build(map, self);
        }

        public ListEvaluatorsResponseBodyEvaluators setAnnotations(java.util.List<String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<String> getAnnotations() {
            return this.annotations;
        }

        public ListEvaluatorsResponseBodyEvaluators setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListEvaluatorsResponseBodyEvaluators setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEvaluatorsResponseBodyEvaluators setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEvaluatorsResponseBodyEvaluators setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListEvaluatorsResponseBodyEvaluators setMetricName(String metricName) {
            this.metricName = metricName;
            return this;
        }
        public String getMetricName() {
            return this.metricName;
        }

        public ListEvaluatorsResponseBodyEvaluators setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEvaluatorsResponseBodyEvaluators setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ListEvaluatorsResponseBodyEvaluators setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEvaluatorsResponseBodyEvaluators setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
