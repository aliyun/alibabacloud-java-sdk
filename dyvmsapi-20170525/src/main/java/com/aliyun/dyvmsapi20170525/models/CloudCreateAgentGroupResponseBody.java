// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAgentGroupResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateAgentGroupResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudCreateAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAgentGroupResponseBody self = new CloudCreateAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateAgentGroupResponseBody setData(CloudCreateAgentGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateAgentGroupResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateAgentGroupResponseBodyData extends TeaModel {
        /**
         * <p>描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>comment3</p>
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
         * <p>WH12</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>外呼组名称</p>
         * 
         * <strong>example:</strong>
         * <p>gpname1</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>外呼组类型 1：外呼总组 2：外呼组</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Type")
        public Long type;

        public static CloudCreateAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateAgentGroupResponseBodyData self = new CloudCreateAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateAgentGroupResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CloudCreateAgentGroupResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateAgentGroupResponseBodyData setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateAgentGroupResponseBodyData setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudCreateAgentGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CloudCreateAgentGroupResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
