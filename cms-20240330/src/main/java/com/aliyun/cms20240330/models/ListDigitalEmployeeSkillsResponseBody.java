// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListDigitalEmployeeSkillsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>sjC5rekx93Ew7K7VcmI3wkBZBYQ-GphB2ilQu3zJCGxoZuicwyJznfo2riTjr-lq</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("skills")
    public java.util.List<ListDigitalEmployeeSkillsResponseBodySkills> skills;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListDigitalEmployeeSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalEmployeeSkillsResponseBody self = new ListDigitalEmployeeSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDigitalEmployeeSkillsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDigitalEmployeeSkillsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDigitalEmployeeSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDigitalEmployeeSkillsResponseBody setSkills(java.util.List<ListDigitalEmployeeSkillsResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<ListDigitalEmployeeSkillsResponseBodySkills> getSkills() {
        return this.skills;
    }

    public ListDigitalEmployeeSkillsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListDigitalEmployeeSkillsResponseBodySkills extends TeaModel {
        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("skillName")
        public String skillName;

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-06T14:09:11Z</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        public static ListDigitalEmployeeSkillsResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            ListDigitalEmployeeSkillsResponseBodySkills self = new ListDigitalEmployeeSkillsResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public ListDigitalEmployeeSkillsResponseBodySkills setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDigitalEmployeeSkillsResponseBodySkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDigitalEmployeeSkillsResponseBodySkills setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListDigitalEmployeeSkillsResponseBodySkills setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListDigitalEmployeeSkillsResponseBodySkills setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public ListDigitalEmployeeSkillsResponseBodySkills setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
