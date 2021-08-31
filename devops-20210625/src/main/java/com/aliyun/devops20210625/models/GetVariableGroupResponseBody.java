// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetVariableGroupResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 变量组
    @NameInMap("variableGroup")
    public GetVariableGroupResponseBodyVariableGroup variableGroup;

    public static GetVariableGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVariableGroupResponseBody self = new GetVariableGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVariableGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVariableGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetVariableGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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
        // 关联的流水线Id
        @NameInMap("id")
        public Long id;

        // 关联的流水线名称
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
        // 变量值
        @NameInMap("value")
        public String value;

        // 变量名
        @NameInMap("name")
        public String name;

        // 是否加密
        @NameInMap("isEncrypted")
        public Boolean isEncrypted;

        public static GetVariableGroupResponseBodyVariableGroupVariables build(java.util.Map<String, ?> map) throws Exception {
            GetVariableGroupResponseBodyVariableGroupVariables self = new GetVariableGroupResponseBodyVariableGroupVariables();
            return TeaModel.build(map, self);
        }

        public GetVariableGroupResponseBodyVariableGroupVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetVariableGroupResponseBodyVariableGroupVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVariableGroupResponseBodyVariableGroupVariables setIsEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

    }

    public static class GetVariableGroupResponseBodyVariableGroup extends TeaModel {
        // 创建人阿里云账号id
        @NameInMap("ccreatorAccountId")
        public String ccreatorAccountId;

        // 变量组描述
        @NameInMap("description")
        public String description;

        // 更新时间
        @NameInMap("updateTime")
        public Long updateTime;

        // 变量组id
        @NameInMap("id")
        public Long id;

        // 更新人阿里云账号id
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        // 变量组名称
        @NameInMap("name")
        public String name;

        // 关联的流水线
        @NameInMap("relatedPipelines")
        public java.util.List<GetVariableGroupResponseBodyVariableGroupRelatedPipelines> relatedPipelines;

        // 变量
        @NameInMap("variables")
        public java.util.List<GetVariableGroupResponseBodyVariableGroupVariables> variables;

        // 创建时间
        @NameInMap("createTime")
        public Long createTime;

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

        public GetVariableGroupResponseBodyVariableGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVariableGroupResponseBodyVariableGroup setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
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

        public GetVariableGroupResponseBodyVariableGroup setVariables(java.util.List<GetVariableGroupResponseBodyVariableGroupVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetVariableGroupResponseBodyVariableGroupVariables> getVariables() {
            return this.variables;
        }

        public GetVariableGroupResponseBodyVariableGroup setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
