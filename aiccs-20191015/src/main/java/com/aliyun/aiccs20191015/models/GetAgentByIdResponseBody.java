// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAgentByIdResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of Success indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The agent information.</p>
     */
    @NameInMap("Data")
    public GetAgentByIdResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("AgentId")
        public Integer agentId;

        /**
         * <p>The name of the user who created the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The external key.</p>
         * 
         * <strong>example:</strong>
         * <p>43990666****</p>
         */
        @NameInMap("ForeignKey")
        public String foreignKey;

        /**
         * <p>The logon name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:123@123.com">123@123.com</a></p>
         */
        @NameInMap("ForeignNick")
        public String foreignNick;

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Liu Ceshi</p>
         */
        @NameInMap("RealName")
        public String realName;

        /**
         * <p>The service type. Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ServicerType")
        public Integer servicerType;

        /**
         * <p>The display name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Liu Ceshi</p>
         */
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
