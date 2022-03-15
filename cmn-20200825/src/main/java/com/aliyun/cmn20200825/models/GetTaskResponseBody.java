// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 任务信息
    @NameInMap("Task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        // 模板类别
        @NameInMap("Category")
        public String category;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 任务参数
        @NameInMap("Params")
        public String params;

        // 任务错误码
        @NameInMap("ResponseCode")
        public String responseCode;

        // 任务返回
        @NameInMap("Result")
        public String result;

        // 任务状态
        @NameInMap("Status")
        public String status;

        // 任务id
        @NameInMap("TaskId")
        public String taskId;

        // 模板id
        @NameInMap("TemplateId")
        public String templateId;

        // 模板名称
        @NameInMap("TemplateName")
        public String templateName;

        // 修改时间
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetTaskResponseBodyTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTaskResponseBodyTask setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public GetTaskResponseBodyTask setResponseCode(String responseCode) {
            this.responseCode = responseCode;
            return this;
        }
        public String getResponseCode() {
            return this.responseCode;
        }

        public GetTaskResponseBodyTask setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetTaskResponseBodyTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTaskResponseBodyTask setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTaskResponseBodyTask setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public GetTaskResponseBodyTask setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
