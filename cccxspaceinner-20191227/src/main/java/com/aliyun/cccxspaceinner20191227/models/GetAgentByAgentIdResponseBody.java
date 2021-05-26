// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentByAgentIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetAgentByAgentIdResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentByAgentIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByAgentIdResponseBody self = new GetAgentByAgentIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentByAgentIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentByAgentIdResponseBody setData(GetAgentByAgentIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentByAgentIdResponseBodyData getData() {
        return this.data;
    }

    public GetAgentByAgentIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentByAgentIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentByAgentIdResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("AgentId")
        public Long agentId;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AgentType")
        public Integer agentType;

        public static GetAgentByAgentIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentByAgentIdResponseBodyData self = new GetAgentByAgentIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentByAgentIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAgentByAgentIdResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetAgentByAgentIdResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetAgentByAgentIdResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentByAgentIdResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetAgentByAgentIdResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GetAgentByAgentIdResponseBodyData setAgentType(Integer agentType) {
            this.agentType = agentType;
            return this;
        }
        public Integer getAgentType() {
            return this.agentType;
        }

    }

}
