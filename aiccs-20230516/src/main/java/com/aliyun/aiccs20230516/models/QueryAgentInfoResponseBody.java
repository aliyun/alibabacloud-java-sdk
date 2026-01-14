// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class QueryAgentInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryAgentInfoResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static QueryAgentInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentInfoResponseBody self = new QueryAgentInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgentInfoResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryAgentInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryAgentInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgentInfoResponseBody setModel(QueryAgentInfoResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryAgentInfoResponseBodyModel getModel() {
        return this.model;
    }

    public QueryAgentInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAgentInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAgentInfoResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class QueryAgentInfoResponseBodyModelAgentGroupList extends TeaModel {
        /**
         * <p>坐席组ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GroupId")
        public Long groupId;

        /**
         * <p>坐席组名称</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static QueryAgentInfoResponseBodyModelAgentGroupList build(java.util.Map<String, ?> map) throws Exception {
            QueryAgentInfoResponseBodyModelAgentGroupList self = new QueryAgentInfoResponseBodyModelAgentGroupList();
            return TeaModel.build(map, self);
        }

        public QueryAgentInfoResponseBodyModelAgentGroupList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryAgentInfoResponseBodyModelAgentGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QueryAgentInfoResponseBodyModel extends TeaModel {
        /**
         * <p>坐席账号</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>账号启用状态，0-停用，1-启用，默认1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>坐席分机号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentExtension")
        public Long agentExtension;

        /**
         * <p>坐席组ID列表</p>
         */
        @NameInMap("AgentGroupIds")
        public java.util.List<Long> agentGroupIds;

        /**
         * <p>坐席组列表</p>
         */
        @NameInMap("AgentGroupList")
        public java.util.List<QueryAgentInfoResponseBodyModelAgentGroupList> agentGroupList;

        /**
         * <p>坐席ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentId")
        public Long agentId;

        /**
         * <p>坐席状态，1:在线；2:忙碌；3:小休；4:离线</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentStatus")
        public Long agentStatus;

        /**
         * <p>坐席标签</p>
         * 
         * <strong>example:</strong>
         * <p>c</p>
         */
        @NameInMap("AgentTag")
        public String agentTag;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-11 11:11:11</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>分机密码</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("ExtensionPwd")
        public String extensionPwd;

        /**
         * <p>分机注册地址</p>
         * 
         * <strong>example:</strong>
         * <p>b</p>
         */
        @NameInMap("ExtensionServer")
        public String extensionServer;

        /**
         * <p>坐席名称</p>
         * 
         * <strong>example:</strong>
         * <p>b</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>WebSocket分机注册协议</p>
         * 
         * <strong>example:</strong>
         * <p>b</p>
         */
        @NameInMap("WsProtocol")
        public String wsProtocol;

        /**
         * <p>WebSocket分机注册地址</p>
         * 
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("WsRegisterAddress")
        public String wsRegisterAddress;

        public static QueryAgentInfoResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryAgentInfoResponseBodyModel self = new QueryAgentInfoResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryAgentInfoResponseBodyModel setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public QueryAgentInfoResponseBodyModel setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public QueryAgentInfoResponseBodyModel setAgentExtension(Long agentExtension) {
            this.agentExtension = agentExtension;
            return this;
        }
        public Long getAgentExtension() {
            return this.agentExtension;
        }

        public QueryAgentInfoResponseBodyModel setAgentGroupIds(java.util.List<Long> agentGroupIds) {
            this.agentGroupIds = agentGroupIds;
            return this;
        }
        public java.util.List<Long> getAgentGroupIds() {
            return this.agentGroupIds;
        }

        public QueryAgentInfoResponseBodyModel setAgentGroupList(java.util.List<QueryAgentInfoResponseBodyModelAgentGroupList> agentGroupList) {
            this.agentGroupList = agentGroupList;
            return this;
        }
        public java.util.List<QueryAgentInfoResponseBodyModelAgentGroupList> getAgentGroupList() {
            return this.agentGroupList;
        }

        public QueryAgentInfoResponseBodyModel setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public QueryAgentInfoResponseBodyModel setAgentStatus(Long agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public Long getAgentStatus() {
            return this.agentStatus;
        }

        public QueryAgentInfoResponseBodyModel setAgentTag(String agentTag) {
            this.agentTag = agentTag;
            return this;
        }
        public String getAgentTag() {
            return this.agentTag;
        }

        public QueryAgentInfoResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAgentInfoResponseBodyModel setExtensionPwd(String extensionPwd) {
            this.extensionPwd = extensionPwd;
            return this;
        }
        public String getExtensionPwd() {
            return this.extensionPwd;
        }

        public QueryAgentInfoResponseBodyModel setExtensionServer(String extensionServer) {
            this.extensionServer = extensionServer;
            return this;
        }
        public String getExtensionServer() {
            return this.extensionServer;
        }

        public QueryAgentInfoResponseBodyModel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAgentInfoResponseBodyModel setWsProtocol(String wsProtocol) {
            this.wsProtocol = wsProtocol;
            return this;
        }
        public String getWsProtocol() {
            return this.wsProtocol;
        }

        public QueryAgentInfoResponseBodyModel setWsRegisterAddress(String wsRegisterAddress) {
            this.wsRegisterAddress = wsRegisterAddress;
            return this;
        }
        public String getWsRegisterAddress() {
            return this.wsRegisterAddress;
        }

    }

}
