// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemWorkFlowStatusResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("statuses")
    public java.util.List<ListWorkItemWorkFlowStatusResponseBodyStatuses> statuses;

    @NameInMap("success")
    public Boolean success;

    public static ListWorkItemWorkFlowStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemWorkFlowStatusResponseBody self = new ListWorkItemWorkFlowStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkItemWorkFlowStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListWorkItemWorkFlowStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListWorkItemWorkFlowStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkItemWorkFlowStatusResponseBody setStatuses(java.util.List<ListWorkItemWorkFlowStatusResponseBodyStatuses> statuses) {
        this.statuses = statuses;
        return this;
    }
    public java.util.List<ListWorkItemWorkFlowStatusResponseBodyStatuses> getStatuses() {
        return this.statuses;
    }

    public ListWorkItemWorkFlowStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkItemWorkFlowStatusResponseBodyStatuses extends TeaModel {
        @NameInMap("creator")
        public String creator;

        @NameInMap("description")
        public String description;

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

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("source")
        public String source;

        @NameInMap("workflowStageIdentifier")
        public String workflowStageIdentifier;

        @NameInMap("workflowStageName")
        public String workflowStageName;

        public static ListWorkItemWorkFlowStatusResponseBodyStatuses build(java.util.Map<String, ?> map) throws Exception {
            ListWorkItemWorkFlowStatusResponseBodyStatuses self = new ListWorkItemWorkFlowStatusResponseBodyStatuses();
            return TeaModel.build(map, self);
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setWorkflowStageIdentifier(String workflowStageIdentifier) {
            this.workflowStageIdentifier = workflowStageIdentifier;
            return this;
        }
        public String getWorkflowStageIdentifier() {
            return this.workflowStageIdentifier;
        }

        public ListWorkItemWorkFlowStatusResponseBodyStatuses setWorkflowStageName(String workflowStageName) {
            this.workflowStageName = workflowStageName;
            return this;
        }
        public String getWorkflowStageName() {
            return this.workflowStageName;
        }

    }

}
