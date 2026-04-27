// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryAgentGroupResponseBodyData data;

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

    public static CloudQueryAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentGroupResponseBody self = new CloudQueryAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryAgentGroupResponseBody setData(CloudQueryAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryAgentGroupResponseBodyData extends TeaModel {
        /**
         * <p>描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Comment")
        public String comment;

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
         * <p>外呼组编号</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>外呼组名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>外呼组id</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>外呼组类型 1：外呼总组 2：外呼组</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Long type;

        public static CloudQueryAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentGroupResponseBodyData self = new CloudQueryAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentGroupResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CloudQueryAgentGroupResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudQueryAgentGroupResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudQueryAgentGroupResponseBodyData setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudQueryAgentGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CloudQueryAgentGroupResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudQueryAgentGroupResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
