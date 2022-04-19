// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ListDSEntityResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDSEntityResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDSEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDSEntityResponseBody self = new ListDSEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDSEntityResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDSEntityResponseBody setData(ListDSEntityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDSEntityResponseBodyData getData() {
        return this.data;
    }

    public ListDSEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDSEntityResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDSEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDSEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDSEntityResponseBodyDataEntities extends TeaModel {
        @NameInMap("Action")
        public String action;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("CallerBid")
        public String callerBid;

        @NameInMap("CallerBidLoginEmail")
        public String callerBidLoginEmail;

        @NameInMap("CallerUid")
        public Long callerUid;

        @NameInMap("CallerUidLoginEmail")
        public String callerUidLoginEmail;

        @NameInMap("Channel")
        public String channel;

        @NameInMap("ClientIP")
        public String clientIP;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserId")
        public String createUserId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("Enable")
        public Boolean enable;

        // 实体ID
        @NameInMap("EntityId")
        public Long entityId;

        // 实体名称，仅支持中文、大小写字母、数字、下划线
        @NameInMap("EntityName")
        public String entityName;

        // 实体类型：详见:,EntityTypeEnum[synonyms(同义词),regex(正则)]
        @NameInMap("EntityType")
        public String entityType;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("ModifyUserId")
        public String modifyUserId;

        @NameInMap("ModifyUserName")
        public String modifyUserName;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("OwnerAccount")
        public String ownerAccount;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("OwnerIdLoginEmail")
        public String ownerIdLoginEmail;

        @NameInMap("ProxyId")
        public String proxyId;

        @NameInMap("RequestContent")
        public String requestContent;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResourceOwnerAccount")
        public String resourceOwnerAccount;

        @NameInMap("ResourceOwnerId")
        public Long resourceOwnerId;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("Token")
        public String token;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserNick")
        public String userNick;

        public static ListDSEntityResponseBodyDataEntities build(java.util.Map<String, ?> map) throws Exception {
            ListDSEntityResponseBodyDataEntities self = new ListDSEntityResponseBodyDataEntities();
            return TeaModel.build(map, self);
        }

        public ListDSEntityResponseBodyDataEntities setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListDSEntityResponseBodyDataEntities setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public ListDSEntityResponseBodyDataEntities setCallerBid(String callerBid) {
            this.callerBid = callerBid;
            return this;
        }
        public String getCallerBid() {
            return this.callerBid;
        }

        public ListDSEntityResponseBodyDataEntities setCallerBidLoginEmail(String callerBidLoginEmail) {
            this.callerBidLoginEmail = callerBidLoginEmail;
            return this;
        }
        public String getCallerBidLoginEmail() {
            return this.callerBidLoginEmail;
        }

        public ListDSEntityResponseBodyDataEntities setCallerUid(Long callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public Long getCallerUid() {
            return this.callerUid;
        }

        public ListDSEntityResponseBodyDataEntities setCallerUidLoginEmail(String callerUidLoginEmail) {
            this.callerUidLoginEmail = callerUidLoginEmail;
            return this;
        }
        public String getCallerUidLoginEmail() {
            return this.callerUidLoginEmail;
        }

        public ListDSEntityResponseBodyDataEntities setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListDSEntityResponseBodyDataEntities setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public ListDSEntityResponseBodyDataEntities setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListDSEntityResponseBodyDataEntities setCreateUserId(String createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public String getCreateUserId() {
            return this.createUserId;
        }

        public ListDSEntityResponseBodyDataEntities setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListDSEntityResponseBodyDataEntities setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListDSEntityResponseBodyDataEntities setEntityId(Long entityId) {
            this.entityId = entityId;
            return this;
        }
        public Long getEntityId() {
            return this.entityId;
        }

        public ListDSEntityResponseBodyDataEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ListDSEntityResponseBodyDataEntities setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }
        public String getEntityType() {
            return this.entityType;
        }

        public ListDSEntityResponseBodyDataEntities setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public ListDSEntityResponseBodyDataEntities setModifyUserId(String modifyUserId) {
            this.modifyUserId = modifyUserId;
            return this;
        }
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        public ListDSEntityResponseBodyDataEntities setModifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        public ListDSEntityResponseBodyDataEntities setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListDSEntityResponseBodyDataEntities setOwnerAccount(String ownerAccount) {
            this.ownerAccount = ownerAccount;
            return this;
        }
        public String getOwnerAccount() {
            return this.ownerAccount;
        }

        public ListDSEntityResponseBodyDataEntities setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public ListDSEntityResponseBodyDataEntities setOwnerIdLoginEmail(String ownerIdLoginEmail) {
            this.ownerIdLoginEmail = ownerIdLoginEmail;
            return this;
        }
        public String getOwnerIdLoginEmail() {
            return this.ownerIdLoginEmail;
        }

        public ListDSEntityResponseBodyDataEntities setProxyId(String proxyId) {
            this.proxyId = proxyId;
            return this;
        }
        public String getProxyId() {
            return this.proxyId;
        }

        public ListDSEntityResponseBodyDataEntities setRequestContent(String requestContent) {
            this.requestContent = requestContent;
            return this;
        }
        public String getRequestContent() {
            return this.requestContent;
        }

        public ListDSEntityResponseBodyDataEntities setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListDSEntityResponseBodyDataEntities setResourceOwnerAccount(String resourceOwnerAccount) {
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }
        public String getResourceOwnerAccount() {
            return this.resourceOwnerAccount;
        }

        public ListDSEntityResponseBodyDataEntities setResourceOwnerId(Long resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public Long getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListDSEntityResponseBodyDataEntities setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public ListDSEntityResponseBodyDataEntities setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListDSEntityResponseBodyDataEntities setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public ListDSEntityResponseBodyDataEntities setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

    public static class ListDSEntityResponseBodyData extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<ListDSEntityResponseBodyDataEntities> entities;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDSEntityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDSEntityResponseBodyData self = new ListDSEntityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDSEntityResponseBodyData setEntities(java.util.List<ListDSEntityResponseBodyDataEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<ListDSEntityResponseBodyDataEntities> getEntities() {
            return this.entities;
        }

        public ListDSEntityResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDSEntityResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDSEntityResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
