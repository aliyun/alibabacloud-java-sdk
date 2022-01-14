// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class QueryPushAnalysisTaskListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public QueryPushAnalysisTaskListResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static QueryPushAnalysisTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPushAnalysisTaskListResponseBody self = new QueryPushAnalysisTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPushAnalysisTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPushAnalysisTaskListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPushAnalysisTaskListResponseBody setResultContent(QueryPushAnalysisTaskListResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public QueryPushAnalysisTaskListResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public QueryPushAnalysisTaskListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class QueryPushAnalysisTaskListResponseBodyResultContentDataList extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Type")
        public Long type;

        public static QueryPushAnalysisTaskListResponseBodyResultContentDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisTaskListResponseBodyResultContentDataList self = new QueryPushAnalysisTaskListResponseBodyResultContentDataList();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentDataList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentDataList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentDataList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentDataList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentDataList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class QueryPushAnalysisTaskListResponseBodyResultContentData extends TeaModel {
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("List")
        public java.util.List<QueryPushAnalysisTaskListResponseBodyResultContentDataList> list;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("Type")
        public Long type;

        public static QueryPushAnalysisTaskListResponseBodyResultContentData build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisTaskListResponseBodyResultContentData self = new QueryPushAnalysisTaskListResponseBodyResultContentData();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setList(java.util.List<QueryPushAnalysisTaskListResponseBodyResultContentDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryPushAnalysisTaskListResponseBodyResultContentDataList> getList() {
            return this.list;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryPushAnalysisTaskListResponseBodyResultContentData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class QueryPushAnalysisTaskListResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryPushAnalysisTaskListResponseBodyResultContentData> data;

        public static QueryPushAnalysisTaskListResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            QueryPushAnalysisTaskListResponseBodyResultContent self = new QueryPushAnalysisTaskListResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public QueryPushAnalysisTaskListResponseBodyResultContent setData(java.util.List<QueryPushAnalysisTaskListResponseBodyResultContentData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryPushAnalysisTaskListResponseBodyResultContentData> getData() {
            return this.data;
        }

    }

}
