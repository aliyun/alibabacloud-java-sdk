// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListVariableGroupsResponseBody extends TeaModel {
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
    @NameInMap("variableGroups")
    public java.util.List<ListVariableGroupsResponseBodyVariableGroups> variableGroups;

    // 变量组总数
    @NameInMap("totalCount")
    public Long totalCount;

    // 下一次查询的token，为空表示最后一页
    @NameInMap("nextToken")
    public String nextToken;

    public static ListVariableGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVariableGroupsResponseBody self = new ListVariableGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVariableGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVariableGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListVariableGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListVariableGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListVariableGroupsResponseBody setVariableGroups(java.util.List<ListVariableGroupsResponseBodyVariableGroups> variableGroups) {
        this.variableGroups = variableGroups;
        return this;
    }
    public java.util.List<ListVariableGroupsResponseBodyVariableGroups> getVariableGroups() {
        return this.variableGroups;
    }

    public ListVariableGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVariableGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines extends TeaModel {
        // 关联的流水线Id
        @NameInMap("id")
        public Long id;

        // 关联的流水线名称
        @NameInMap("name")
        public String name;

        public static ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines build(java.util.Map<String, ?> map) throws Exception {
            ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines self = new ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines();
            return TeaModel.build(map, self);
        }

        public ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListVariableGroupsResponseBodyVariableGroupsVariables extends TeaModel {
        // 变量值
        @NameInMap("value")
        public String value;

        // 变量名
        @NameInMap("name")
        public String name;

        // 是否加密
        @NameInMap("isEncrypted")
        public Boolean isEncrypted;

        public static ListVariableGroupsResponseBodyVariableGroupsVariables build(java.util.Map<String, ?> map) throws Exception {
            ListVariableGroupsResponseBodyVariableGroupsVariables self = new ListVariableGroupsResponseBodyVariableGroupsVariables();
            return TeaModel.build(map, self);
        }

        public ListVariableGroupsResponseBodyVariableGroupsVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListVariableGroupsResponseBodyVariableGroupsVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVariableGroupsResponseBodyVariableGroupsVariables setIsEncrypted(Boolean isEncrypted) {
            this.isEncrypted = isEncrypted;
            return this;
        }
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

    }

    public static class ListVariableGroupsResponseBodyVariableGroups extends TeaModel {
        // 创建人阿里云账号id
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        // 更新时间
        @NameInMap("updateTime")
        public Long updateTime;

        // 更新人阿里云账号id
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        // 变量组描述
        @NameInMap("description")
        public String description;

        // 变量组名称
        @NameInMap("name")
        public String name;

        // 变量组id
        @NameInMap("id")
        public Long id;

        // 关联的流水线
        @NameInMap("relatedPipelines")
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines> relatedPipelines;

        // 变量
        @NameInMap("variables")
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsVariables> variables;

        // 创建时间
        @NameInMap("createTime")
        public Long createTime;

        public static ListVariableGroupsResponseBodyVariableGroups build(java.util.Map<String, ?> map) throws Exception {
            ListVariableGroupsResponseBodyVariableGroups self = new ListVariableGroupsResponseBodyVariableGroups();
            return TeaModel.build(map, self);
        }

        public ListVariableGroupsResponseBodyVariableGroups setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListVariableGroupsResponseBodyVariableGroups setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListVariableGroupsResponseBodyVariableGroups setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public ListVariableGroupsResponseBodyVariableGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVariableGroupsResponseBodyVariableGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVariableGroupsResponseBodyVariableGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListVariableGroupsResponseBodyVariableGroups setRelatedPipelines(java.util.List<ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines> relatedPipelines) {
            this.relatedPipelines = relatedPipelines;
            return this;
        }
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsRelatedPipelines> getRelatedPipelines() {
            return this.relatedPipelines;
        }

        public ListVariableGroupsResponseBodyVariableGroups setVariables(java.util.List<ListVariableGroupsResponseBodyVariableGroupsVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListVariableGroupsResponseBodyVariableGroupsVariables> getVariables() {
            return this.variables;
        }

        public ListVariableGroupsResponseBodyVariableGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

    }

}
