// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListQueueSkillResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListQueueSkillResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListQueueSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListQueueSkillResponseBody self = new CloudListQueueSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListQueueSkillResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListQueueSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListQueueSkillResponseBody setData(CloudListQueueSkillResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListQueueSkillResponseBodyData getData() {
        return this.data;
    }

    public CloudListQueueSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListQueueSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListQueueSkillResponseBodyDataList extends TeaModel {
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
         * <p>93</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Qno")
        public Long qno;

        /**
         * <p>队列id</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("QueueId")
        public Long queueId;

        /**
         * <p>skill的id</p>
         * 
         * <strong>example:</strong>
         * <p>44</p>
         */
        @NameInMap("SkillId")
        public Long skillId;

        /**
         * <p>技能值</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SkillLevel")
        public Long skillLevel;

        public static CloudListQueueSkillResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListQueueSkillResponseBodyDataList self = new CloudListQueueSkillResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListQueueSkillResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListQueueSkillResponseBodyDataList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListQueueSkillResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudListQueueSkillResponseBodyDataList setQno(Long qno) {
            this.qno = qno;
            return this;
        }
        public Long getQno() {
            return this.qno;
        }

        public CloudListQueueSkillResponseBodyDataList setQueueId(Long queueId) {
            this.queueId = queueId;
            return this;
        }
        public Long getQueueId() {
            return this.queueId;
        }

        public CloudListQueueSkillResponseBodyDataList setSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }
        public Long getSkillId() {
            return this.skillId;
        }

        public CloudListQueueSkillResponseBodyDataList setSkillLevel(Long skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Long getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class CloudListQueueSkillResponseBodyData extends TeaModel {
        /**
         * <p>返回数据</p>
         */
        @NameInMap("List")
        public java.util.List<CloudListQueueSkillResponseBodyDataList> list;

        public static CloudListQueueSkillResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListQueueSkillResponseBodyData self = new CloudListQueueSkillResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListQueueSkillResponseBodyData setList(java.util.List<CloudListQueueSkillResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListQueueSkillResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
