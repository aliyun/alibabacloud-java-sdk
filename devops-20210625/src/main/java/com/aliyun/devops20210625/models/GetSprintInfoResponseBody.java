// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSprintInfoResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sprint")
    public GetSprintInfoResponseBodySprint sprint;

    @NameInMap("success")
    public Boolean success;

    public static GetSprintInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSprintInfoResponseBody self = new GetSprintInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSprintInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetSprintInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSprintInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSprintInfoResponseBody setSprint(GetSprintInfoResponseBodySprint sprint) {
        this.sprint = sprint;
        return this;
    }
    public GetSprintInfoResponseBodySprint getSprint() {
        return this.sprint;
    }

    public GetSprintInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSprintInfoResponseBodySprint extends TeaModel {
        @NameInMap("creator")
        public String creator;

        @NameInMap("description")
        public String description;

        @NameInMap("endDate")
        public Long endDate;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("modifier")
        public String modifier;

        @NameInMap("name")
        public String name;

        @NameInMap("scope")
        public String scope;

        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        @NameInMap("startDate")
        public Long startDate;

        @NameInMap("status")
        public String status;

        public static GetSprintInfoResponseBodySprint build(java.util.Map<String, ?> map) throws Exception {
            GetSprintInfoResponseBodySprint self = new GetSprintInfoResponseBodySprint();
            return TeaModel.build(map, self);
        }

        public GetSprintInfoResponseBodySprint setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetSprintInfoResponseBodySprint setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSprintInfoResponseBodySprint setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public GetSprintInfoResponseBodySprint setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSprintInfoResponseBodySprint setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetSprintInfoResponseBodySprint setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public GetSprintInfoResponseBodySprint setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetSprintInfoResponseBodySprint setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSprintInfoResponseBodySprint setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetSprintInfoResponseBodySprint setSpaceIdentifier(String spaceIdentifier) {
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        public GetSprintInfoResponseBodySprint setStartDate(Long startDate) {
            this.startDate = startDate;
            return this;
        }
        public Long getStartDate() {
            return this.startDate;
        }

        public GetSprintInfoResponseBodySprint setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
