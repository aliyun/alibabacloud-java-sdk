// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryAgentSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5B0F201F-DCDA-45C2-AA92-1AE177F94991</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryAgentSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentSkillResponseBody self = new CloudQueryAgentSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryAgentSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryAgentSkillResponseBody setData(CloudQueryAgentSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryAgentSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryAgentSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryAgentSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryAgentSkillResponseBodyDataList extends TeaModel {
        /**
         * <p>座席id</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>queueSkill关系表中id</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>skill的id</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("SkillId")
        public Long skillId;

        /**
         * <p>技能值</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("SkillLevel")
        public Long skillLevel;

        /**
         * <p>技能名称</p>
         * 
         * <strong>example:</strong>
         * <p>skillname</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        public static CloudQueryAgentSkillResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentSkillResponseBodyDataList self = new CloudQueryAgentSkillResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentSkillResponseBodyDataList setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public CloudQueryAgentSkillResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudQueryAgentSkillResponseBodyDataList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudQueryAgentSkillResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudQueryAgentSkillResponseBodyDataList setSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }
        public Long getSkillId() {
            return this.skillId;
        }

        public CloudQueryAgentSkillResponseBodyDataList setSkillLevel(Long skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Long getSkillLevel() {
            return this.skillLevel;
        }

        public CloudQueryAgentSkillResponseBodyDataList setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

    }

    public static class CloudQueryAgentSkillResponseBodyData extends TeaModel {
        /**
         * <p>座席技能列表</p>
         */
        @NameInMap("List")
        public java.util.List<CloudQueryAgentSkillResponseBodyDataList> list;

        public static CloudQueryAgentSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentSkillResponseBodyData self = new CloudQueryAgentSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentSkillResponseBodyData setList(java.util.List<CloudQueryAgentSkillResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryAgentSkillResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
