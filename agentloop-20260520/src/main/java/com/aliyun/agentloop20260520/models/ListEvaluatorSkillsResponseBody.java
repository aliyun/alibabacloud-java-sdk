// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class ListEvaluatorSkillsResponseBody extends TeaModel {
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
     * <p>eyJuZXh0IjoiNDAifQ==</p>
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
     * <p>The list of skill summaries.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;skillName&quot;:&quot;trace_context_loader&quot;,&quot;displayName&quot;:&quot;Trace 上下文读取&quot;,&quot;enable&quot;:true}]</p>
     */
    @NameInMap("skills")
    public java.util.List<ListEvaluatorSkillsResponseBodySkills> skills;

    /**
     * <p>The total number of skills.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListEvaluatorSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEvaluatorSkillsResponseBody self = new ListEvaluatorSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEvaluatorSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEvaluatorSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEvaluatorSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEvaluatorSkillsResponseBody setSkills(java.util.List<ListEvaluatorSkillsResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<ListEvaluatorSkillsResponseBodySkills> getSkills() {
        return this.skills;
    }

    public ListEvaluatorSkillsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListEvaluatorSkillsResponseBodySkills extends TeaModel {
        /**
         * <p>The creation time. This field is declared as int64 in CloudSpec, but the backend currently returns the StarOps <code>createTime</code> string field.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The skill description.</p>
         * 
         * <strong>example:</strong>
         * <p>读取链路上下文辅助评估</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Trace 上下文读取</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>Indicates whether the skill is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The latest version. This field is declared in CloudSpec but is not currently populated in the backend response.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816000000</p>
         */
        @NameInMap("latestVersion")
        public String latestVersion;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>trace_context_loader</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>The update time. This field is declared as int64 in CloudSpec, but the backend currently returns the StarOps <code>updateTime</code> string field.</p>
         * 
         * <strong>example:</strong>
         * <p>1782816600</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static ListEvaluatorSkillsResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            ListEvaluatorSkillsResponseBodySkills self = new ListEvaluatorSkillsResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public ListEvaluatorSkillsResponseBodySkills setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListEvaluatorSkillsResponseBodySkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListEvaluatorSkillsResponseBodySkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListEvaluatorSkillsResponseBodySkills setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListEvaluatorSkillsResponseBodySkills setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListEvaluatorSkillsResponseBodySkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListEvaluatorSkillsResponseBodySkills setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
