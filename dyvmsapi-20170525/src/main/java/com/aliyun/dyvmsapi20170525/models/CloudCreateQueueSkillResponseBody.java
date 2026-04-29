// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateQueueSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9927CD06-C33A-50CC-A9BB-A3427967A66F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudCreateQueueSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueSkillResponseBody self = new CloudCreateQueueSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateQueueSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateQueueSkillResponseBody setData(CloudCreateQueueSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateQueueSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateQueueSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateQueueSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateQueueSkillResponseBodyData extends TeaModel {
        /**
         * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-30 06:12:34</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7122600</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>54475</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Qno")
        public Long qno;

        /**
         * <p>队列id</p>
         * 
         * <strong>example:</strong>
         * <p>51937</p>
         */
        @NameInMap("QueueId")
        public Long queueId;

        /**
         * <p>skill的id</p>
         * 
         * <strong>example:</strong>
         * <p>48735</p>
         */
        @NameInMap("SkillId")
        public Long skillId;

        /**
         * <p>技能值</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SkillLevel")
        public Long skillLevel;

        public static CloudCreateQueueSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateQueueSkillResponseBodyData self = new CloudCreateQueueSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateQueueSkillResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateQueueSkillResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateQueueSkillResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudCreateQueueSkillResponseBodyData setQno(Long qno) {
            this.qno = qno;
            return this;
        }
        public Long getQno() {
            return this.qno;
        }

        public CloudCreateQueueSkillResponseBodyData setQueueId(Long queueId) {
            this.queueId = queueId;
            return this;
        }
        public Long getQueueId() {
            return this.queueId;
        }

        public CloudCreateQueueSkillResponseBodyData setSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }
        public Long getSkillId() {
            return this.skillId;
        }

        public CloudCreateQueueSkillResponseBodyData setSkillLevel(Long skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Long getSkillLevel() {
            return this.skillLevel;
        }

    }

}
