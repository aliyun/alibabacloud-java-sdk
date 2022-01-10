// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateSprintResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 迭代信息
    @NameInMap("sprint")
    public CreateSprintResponseBodySprint sprint;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    public static CreateSprintResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSprintResponseBody self = new CreateSprintResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSprintResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateSprintResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateSprintResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSprintResponseBody setSprint(CreateSprintResponseBodySprint sprint) {
        this.sprint = sprint;
        return this;
    }
    public CreateSprintResponseBodySprint getSprint() {
        return this.sprint;
    }

    public CreateSprintResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSprintResponseBodySprint extends TeaModel {
        // 创建人id
        @NameInMap("creator")
        public String creator;

        // 描述信息
        @NameInMap("description")
        public String description;

        // 结束时间
        @NameInMap("endDate")
        public Long endDate;

        // 创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 修改时间
        @NameInMap("gmtModified")
        public Long gmtModified;

        // 迭代唯一标识符
        @NameInMap("identifier")
        public String identifier;

        // 修改人
        @NameInMap("modifier")
        public String modifier;

        // 迭代名称
        @NameInMap("name")
        public String name;

        // 可见范围
        @NameInMap("scope")
        public String scope;

        // 项目id
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        // 开始时间
        @NameInMap("startDate")
        public Long startDate;

        // 状态
        @NameInMap("status")
        public String status;

        public static CreateSprintResponseBodySprint build(java.util.Map<String, ?> map) throws Exception {
            CreateSprintResponseBodySprint self = new CreateSprintResponseBodySprint();
            return TeaModel.build(map, self);
        }

        public CreateSprintResponseBodySprint setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateSprintResponseBodySprint setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateSprintResponseBodySprint setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public CreateSprintResponseBodySprint setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateSprintResponseBodySprint setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public CreateSprintResponseBodySprint setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateSprintResponseBodySprint setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public CreateSprintResponseBodySprint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSprintResponseBodySprint setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public CreateSprintResponseBodySprint setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public CreateSprintResponseBodySprint setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public CreateSprintResponseBodySprint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
