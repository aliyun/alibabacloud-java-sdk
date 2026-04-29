// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudCreateSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateSkillResponseBody self = new CloudCreateSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateSkillResponseBody setData(CloudCreateSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateSkillResponseBodyData extends TeaModel {
        /**
         * <p>描述</p>
         * 
         * <strong>example:</strong>
         * <p>Comment3</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>创建时间,精确到秒</p>
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
         * <p>技能id</p>
         * 
         * <strong>example:</strong>
         * <p>49</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>技能名称</p>
         * 
         * <strong>example:</strong>
         * <p>skillName</p>
         */
        @NameInMap("Name")
        public String name;

        public static CloudCreateSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateSkillResponseBodyData self = new CloudCreateSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateSkillResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CloudCreateSkillResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateSkillResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateSkillResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudCreateSkillResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
