// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetVariableGroupResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("variableGroup")
    public GetVariableGroupResponseBodyVariableGroup variableGroup;

    public static GetVariableGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVariableGroupResponseBody self = new GetVariableGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVariableGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetVariableGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetVariableGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVariableGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetVariableGroupResponseBody setVariableGroup(GetVariableGroupResponseBodyVariableGroup variableGroup) {
        this.variableGroup = variableGroup;
        return this;
    }
    public GetVariableGroupResponseBodyVariableGroup getVariableGroup() {
        return this.variableGroup;
    }

    public static class GetVariableGroupResponseBodyVariableGroupRelatedPipelines extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        public static GetVariableGroupResponseBodyVariableGroupRelatedPipelines build(java.util.Map<String, ?> map) throws Exception {
            GetVariableGroupResponseBodyVariableGroupRelatedPipelines self = new GetVariableGroupResponseBodyVariableGroupRelatedPipelines();
            return TeaModel.build(map, self);
        }

        public GetVariableGroupResponseBodyVariableGroupRelatedPipelines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetVariableGroupResponseBodyVariableGroupRelatedPipelines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetVariableGroupResponseBodyVariableGroupVariables extends TeaModel {
        @NameInMap("isEncrypted")
        public Boolean isEncrypted;

        @NameInMap("name")
        public String name;

        @NameInMap("value")
        public String value;

        public static GetVariableGroupResponseBodyVariableGroupVariables build(java.util.Map<String, ?> map) throws Exception {
            GetVariableGroupResponseBodyVariableGroupVariables self = new GetVariableGroupResponseBodyVariableGroupVariables();
            return TeaModel.build(map, self);
        }

        public GetVariableGroupResponseBodyVariableGroupVariables setIsEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        public GetVariableGroupResponseBodyVariableGroupVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVariableGroupResponseBodyVariableGroupVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetVariableGroupResponseBodyVariableGroup extends TeaModel {
        @NameInMap("ccreatorAccountId")
        public String ccreatorAccountId;

        @NameInMap("createTime")
        public Long createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public Long id;

        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        @NameInMap("name")
        public String name;

        @NameInMap("relatedPipelines")
        public java.util.List<GetVariableGroupResponseBodyVariableGroupRelatedPipelines> relatedPipelines;

        @NameInMap("updateTime")
        public Long updateTime;

        @NameInMap("variables")
        public java.util.List<GetVariableGroupResponseBodyVariableGroupVariables> variables;

        public static GetVariableGroupResponseBodyVariableGroup build(java.util.Map<String, ?> map) throws Exception {
            GetVariableGroupResponseBodyVariableGroup self = new GetVariableGroupResponseBodyVariableGroup();
            return TeaModel.build(map, self);
        }

        public GetVariableGroupResponseBodyVariableGroup setCcreatorAccountId(String ccreatorAccountId) {
            this.ccreatorAccountId = ccreatorAccountId;
            return this;
        }
        public String getCcreatorAccountId() {
            return this.ccreatorAccountId;
        }

        public GetVariableGroupResponseBodyVariableGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetVariableGroupResponseBodyVariableGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVariableGroupResponseBodyVariableGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetVariableGroupResponseBodyVariableGroup setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public GetVariableGroupResponseBodyVariableGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVariableGroupResponseBodyVariableGroup setRelatedPipelines(java.util.List<GetVariableGroupResponseBodyVariableGroupRelatedPipelines> relatedPipelines) {
            this.relatedPipelines = relatedPipelines;
            return this;
        }
        public java.util.List<GetVariableGroupResponseBodyVariableGroupRelatedPipelines> getRelatedPipelines() {
            return this.relatedPipelines;
        }

        public GetVariableGroupResponseBodyVariableGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetVariableGroupResponseBodyVariableGroup setVariables(java.util.List<GetVariableGroupResponseBodyVariableGroupVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetVariableGroupResponseBodyVariableGroupVariables> getVariables() {
            return this.variables;
        }

    }

}
