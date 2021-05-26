// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetAgentByOuterInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetAgentByOuterInfoResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetAgentByOuterInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentByOuterInfoResponseBody self = new GetAgentByOuterInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentByOuterInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentByOuterInfoResponseBody setData(GetAgentByOuterInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAgentByOuterInfoResponseBodyData getData() {
        return this.data;
    }

    public GetAgentByOuterInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentByOuterInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAgentByOuterInfoResponseBodyData extends TeaModel {
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

        public static GetAgentByOuterInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAgentByOuterInfoResponseBodyData self = new GetAgentByOuterInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAgentByOuterInfoResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAgentByOuterInfoResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetAgentByOuterInfoResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetAgentByOuterInfoResponseBodyData setAgentId(Long agentId) {
            this.agentId = agentId;
            return this;
        }
        public Long getAgentId() {
            return this.agentId;
        }

        public GetAgentByOuterInfoResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetAgentByOuterInfoResponseBodyData setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GetAgentByOuterInfoResponseBodyData setAgentType(Integer agentType) {
            this.agentType = agentType;
            return this;
        }
        public Integer getAgentType() {
            return this.agentType;
        }

    }

}
