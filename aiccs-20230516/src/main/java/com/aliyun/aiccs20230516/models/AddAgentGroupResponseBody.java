// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddAgentGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AddAgentGroupResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static AddAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAgentGroupResponseBody self = new AddAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAgentGroupResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AddAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAgentGroupResponseBody setModel(AddAgentGroupResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AddAgentGroupResponseBodyModel getModel() {
        return this.model;
    }

    public AddAgentGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAgentGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddAgentGroupResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AddAgentGroupResponseBodyModel extends TeaModel {
        /**
         * <p>坐席组ID</p>
         * 
         * <strong>example:</strong>
         * <p>48</p>
         */
        @NameInMap("AgentGroupId")
        public Long agentGroupId;

        /**
         * <p>坐席组名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("AgentGroupName")
        public String agentGroupName;

        /**
         * <p>创建坐席组的时间</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        public static AddAgentGroupResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AddAgentGroupResponseBodyModel self = new AddAgentGroupResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AddAgentGroupResponseBodyModel setAgentGroupId(Long agentGroupId) {
            this.agentGroupId = agentGroupId;
            return this;
        }
        public Long getAgentGroupId() {
            return this.agentGroupId;
        }

        public AddAgentGroupResponseBodyModel setAgentGroupName(String agentGroupName) {
            this.agentGroupName = agentGroupName;
            return this;
        }
        public String getAgentGroupName() {
            return this.agentGroupName;
        }

        public AddAgentGroupResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
