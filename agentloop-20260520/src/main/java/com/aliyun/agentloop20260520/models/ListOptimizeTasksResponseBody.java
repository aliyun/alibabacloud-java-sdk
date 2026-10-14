// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListOptimizeTasksResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results per page.</p>
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
     * <p>MTIzNDU2Nzg5MA==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The list of optimization tasks.</p>
     */
    @NameInMap("optimizeTasks")
    public java.util.List<ListOptimizeTasksResponseBodyOptimizeTasks> optimizeTasks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total count.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListOptimizeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOptimizeTasksResponseBody self = new ListOptimizeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOptimizeTasksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListOptimizeTasksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOptimizeTasksResponseBody setOptimizeTasks(java.util.List<ListOptimizeTasksResponseBodyOptimizeTasks> optimizeTasks) {
        this.optimizeTasks = optimizeTasks;
        return this;
    }
    public java.util.List<ListOptimizeTasksResponseBodyOptimizeTasks> getOptimizeTasks() {
        return this.optimizeTasks;
    }

    public ListOptimizeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOptimizeTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListOptimizeTasksResponseBodyOptimizeTasks extends TeaModel {
        /**
         * <p>The scheduling checkpoint that stores states such as the general scheduling watermark.</p>
         */
        @NameInMap("checkpoint")
        public java.util.Map<String, ?> checkpoint;

        /**
         * <p>The type-specific configuration. For ExperienceMining and SkillOptimize, optional prompts support only inline Markdown, and the body is stored in inputs.prompt.content (non-empty UTF-8, up to 16 KiB).</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ioVersion&quot;:2,&quot;inputs&quot;:{&quot;experienceLibrary&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experiences&quot;},&quot;trajectory&quot;:{&quot;type&quot;:&quot;sls&quot;,&quot;project&quot;:&quot;my-project&quot;,&quot;logstore&quot;:&quot;agent-trajectory&quot;,&quot;format&quot;:&quot;atif&quot;},&quot;prompt&quot;:{&quot;type&quot;:&quot;inline&quot;,&quot;format&quot;:&quot;markdown&quot;,&quot;content&quot;:&quot;# Guidance\\nExtract evidence-backed tool contracts.&quot;}},&quot;outputs&quot;:{&quot;changePlan&quot;:{&quot;type&quot;:&quot;dataset&quot;,&quot;dataset&quot;:&quot;experience-plans&quot;}},&quot;operators&quot;:[&quot;tool_contract&quot;],&quot;application&quot;:{&quot;mode&quot;:&quot;manual&quot;}}</p>
         */
        @NameInMap("config")
        public java.util.Map<String, ?> config;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The next scheduling trigger time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-13T16:00:00Z</p>
         */
        @NameInMap("nextTriggerTime")
        public String nextTriggerTime;

        /**
         * <p>The name of the optimization task.</p>
         * 
         * <strong>example:</strong>
         * <p>efficiency-analysis</p>
         */
        @NameInMap("optimizeTaskName")
        public String optimizeTaskName;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the optimization task. Valid values: ExperienceMining, SkillOptimize, EfficiencyAnalysis, SOPGeneration, EvalMining, PolicyMining, and AssetMining.</p>
         * 
         * <strong>example:</strong>
         * <p>EfficiencyAnalysis</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-12T10:00:00Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListOptimizeTasksResponseBodyOptimizeTasks build(java.util.Map<String, ?> map) throws Exception {
            ListOptimizeTasksResponseBodyOptimizeTasks self = new ListOptimizeTasksResponseBodyOptimizeTasks();
            return TeaModel.build(map, self);
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setCheckpoint(java.util.Map<String, ?> checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public java.util.Map<String, ?> getCheckpoint() {
            return this.checkpoint;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setConfig(java.util.Map<String, ?> config) {
            this.config = config;
            return this;
        }
        public java.util.Map<String, ?> getConfig() {
            return this.config;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setNextTriggerTime(String nextTriggerTime) {
            this.nextTriggerTime = nextTriggerTime;
            return this;
        }
        public String getNextTriggerTime() {
            return this.nextTriggerTime;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setOptimizeTaskName(String optimizeTaskName) {
            this.optimizeTaskName = optimizeTaskName;
            return this;
        }
        public String getOptimizeTaskName() {
            return this.optimizeTaskName;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListOptimizeTasksResponseBodyOptimizeTasks setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
