// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ListMdsCubeTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public ListMdsCubeTasksResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static ListMdsCubeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMdsCubeTasksResponseBody self = new ListMdsCubeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMdsCubeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMdsCubeTasksResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMdsCubeTasksResponseBody setResultContent(ListMdsCubeTasksResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public ListMdsCubeTasksResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public ListMdsCubeTasksResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class ListMdsCubeTasksResponseBodyResultContentDataContent extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GreyConfigInfo")
        public String greyConfigInfo;

        @NameInMap("GreyEndtimeData")
        public String greyEndtimeData;

        @NameInMap("GreyNum")
        public Integer greyNum;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("PublishMode")
        public Integer publishMode;

        @NameInMap("PublishType")
        public Integer publishType;

        @NameInMap("ResourceVersion")
        public String resourceVersion;

        @NameInMap("TaskDesc")
        public String taskDesc;

        @NameInMap("TaskStatus")
        public Integer taskStatus;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateResourceId")
        public Long templateResourceId;

        @NameInMap("WhitelistIds")
        public String whitelistIds;

        public static ListMdsCubeTasksResponseBodyResultContentDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTasksResponseBodyResultContentDataContent self = new ListMdsCubeTasksResponseBodyResultContentDataContent();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setGreyConfigInfo(String greyConfigInfo) {
            this.greyConfigInfo = greyConfigInfo;
            return this;
        }
        public String getGreyConfigInfo() {
            return this.greyConfigInfo;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setGreyEndtimeData(String greyEndtimeData) {
            this.greyEndtimeData = greyEndtimeData;
            return this;
        }
        public String getGreyEndtimeData() {
            return this.greyEndtimeData;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setGreyNum(Integer greyNum) {
            this.greyNum = greyNum;
            return this;
        }
        public Integer getGreyNum() {
            return this.greyNum;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setPublishMode(Integer publishMode) {
            this.publishMode = publishMode;
            return this;
        }
        public Integer getPublishMode() {
            return this.publishMode;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setPublishType(Integer publishType) {
            this.publishType = publishType;
            return this;
        }
        public Integer getPublishType() {
            return this.publishType;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setResourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }
        public String getResourceVersion() {
            return this.resourceVersion;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setTaskDesc(String taskDesc) {
            this.taskDesc = taskDesc;
            return this;
        }
        public String getTaskDesc() {
            return this.taskDesc;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setTemplateResourceId(Long templateResourceId) {
            this.templateResourceId = templateResourceId;
            return this;
        }
        public Long getTemplateResourceId() {
            return this.templateResourceId;
        }

        public ListMdsCubeTasksResponseBodyResultContentDataContent setWhitelistIds(String whitelistIds) {
            this.whitelistIds = whitelistIds;
            return this;
        }
        public String getWhitelistIds() {
            return this.whitelistIds;
        }

    }

    public static class ListMdsCubeTasksResponseBodyResultContentData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListMdsCubeTasksResponseBodyResultContentDataContent> content;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ResultMsg")
        public String resultMsg;

        @NameInMap("Success")
        public Boolean success;

        public static ListMdsCubeTasksResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTasksResponseBodyResultContentData self = new ListMdsCubeTasksResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTasksResponseBodyResultContentData setContent(java.util.List<ListMdsCubeTasksResponseBodyResultContentDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListMdsCubeTasksResponseBodyResultContentDataContent> getContent() {
            return this.content;
        }

        public ListMdsCubeTasksResponseBodyResultContentData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListMdsCubeTasksResponseBodyResultContentData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMdsCubeTasksResponseBodyResultContentData setResultMsg(String resultMsg) {
            this.resultMsg = resultMsg;
            return this;
        }
        public String getResultMsg() {
            return this.resultMsg;
        }

        public ListMdsCubeTasksResponseBodyResultContentData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ListMdsCubeTasksResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public ListMdsCubeTasksResponseBodyResultContentData data;

        @NameInMap("RequestId")
        public String requestId;

        public static ListMdsCubeTasksResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListMdsCubeTasksResponseBodyResultContent self = new ListMdsCubeTasksResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListMdsCubeTasksResponseBodyResultContent setData(ListMdsCubeTasksResponseBodyResultContentData data) {
            this.data = data;
            return this;
        }
        public ListMdsCubeTasksResponseBodyResultContentData getData() {
            return this.data;
        }

        public ListMdsCubeTasksResponseBodyResultContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
