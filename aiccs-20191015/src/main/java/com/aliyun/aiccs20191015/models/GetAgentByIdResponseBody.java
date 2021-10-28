// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAgentByIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByIdResponseBody self = new GetAgentByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentByIdResponseBody setData(GetAgentByIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentByIdResponseBodyData getData() {
        return this.data;
    }

    public GetAgentByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentByIdResponseBodyData extends TeaModel {
        @NameInMap("AgentId")
        public Integer agentId;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("ForeignKey")
        public String foreignKey;

        @NameInMap("ForeignNick")
        public String foreignNick;

        @NameInMap("RealName")
        public String realName;

        @NameInMap("ServicerType")
        public Integer servicerType;

        @NameInMap("ShowName")
        public String showName;

        public static GetAgentByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentByIdResponseBodyData self = new GetAgentByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentByIdResponseBodyData setAgentId(Integer agentId) {
            this.agentId = agentId;
            return this;
        }
        public Integer getAgentId() {
            return this.agentId;
        }

        public GetAgentByIdResponseBodyData setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public GetAgentByIdResponseBodyData setForeignKey(String foreignKey) {
            this.foreignKey = foreignKey;
            return this;
        }
        public String getForeignKey() {
            return this.foreignKey;
        }

        public GetAgentByIdResponseBodyData setForeignNick(String foreignNick) {
            this.foreignNick = foreignNick;
            return this;
        }
        public String getForeignNick() {
            return this.foreignNick;
        }

        public GetAgentByIdResponseBodyData setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetAgentByIdResponseBodyData setServicerType(Integer servicerType) {
            this.servicerType = servicerType;
            return this;
        }
        public Integer getServicerType() {
            return this.servicerType;
        }

        public GetAgentByIdResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

    }

}
