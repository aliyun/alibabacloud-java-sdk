// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetSprintInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("sprint")
    public GetSprintInfoResponseBodySprint sprint;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("endDate")
        public Long endDate;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1623916393000</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>e8bxxxxxxxxxxxxxxxx23</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>19xx7043xxxxxxx914</p>
         */
        @NameInMap("modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>demo示例项目</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("owners")
        public java.util.List<String> owners;

        /**
         * <strong>example:</strong>
         * <p>public</p>
         */
        @NameInMap("scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>5e70xxxxxxcd000xxxxe96</p>
         */
        @NameInMap("spaceIdentifier")
        public String spaceIdentifier;

        /**
         * <strong>example:</strong>
         * <p>1638403200000</p>
         */
        @NameInMap("startDate")
        public Long startDate;

        /**
         * <strong>example:</strong>
         * <p>Todo</p>
         */
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

        public GetSprintInfoResponseBodySprint setOwners(java.util.List<String> owners) {
            this.owners = owners;
            return this;
        }
        public java.util.List<String> getOwners() {
            return this.owners;
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
