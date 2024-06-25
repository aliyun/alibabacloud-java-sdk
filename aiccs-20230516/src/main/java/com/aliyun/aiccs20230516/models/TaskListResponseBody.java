// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class TaskListResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<TaskListResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>8EFC6D10-307B-1ECA-A8C6-7CBDF776AAD2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static TaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TaskListResponseBody self = new TaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public TaskListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public TaskListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public TaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TaskListResponseBody setModel(java.util.List<TaskListResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<TaskListResponseBodyModel> getModel() {
        return this.model;
    }

    public TaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TaskListResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class TaskListResponseBodyModelIntentTags extends TeaModel {
        /**
         * <p>意向标签描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("IntentDescription")
        public String intentDescription;

        /**
         * <p>意向标签ID</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("IntentTag")
        public String intentTag;

        public static TaskListResponseBodyModelIntentTags build(java.util.Map<String, ?> map) throws Exception {
            TaskListResponseBodyModelIntentTags self = new TaskListResponseBodyModelIntentTags();
            return TeaModel.build(map, self);
        }

        public TaskListResponseBodyModelIntentTags setIntentDescription(String intentDescription) {
            this.intentDescription = intentDescription;
            return this;
        }
        public String getIntentDescription() {
            return this.intentDescription;
        }

        public TaskListResponseBodyModelIntentTags setIntentTag(String intentTag) {
            this.intentTag = intentTag;
            return this;
        }
        public String getIntentTag() {
            return this.intentTag;
        }

    }

    public static class TaskListResponseBodyModel extends TeaModel {
        /**
         * <p>外呼时间段</p>
         * 
         * <strong>example:</strong>
         * <p>“8:00~20:30”</p>
         */
        @NameInMap("AllowCallTime")
        public String allowCallTime;

        /**
         * <p>外呼时间段格式化</p>
         * 
         * <strong>example:</strong>
         * <p>“8:00 ~ 20:00”</p>
         */
        @NameInMap("AllowCallTimeFormat")
        public String allowCallTimeFormat;

        /**
         * <p>外呼时间</p>
         * 
         * <strong>example:</strong>
         * <p>“1,2,3”</p>
         */
        @NameInMap("AllowDayOfWeek")
        public String allowDayOfWeek;

        /**
         * <p>外呼类型</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("CallType")
        public Long callType;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-05 12:11:11</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>最近导入时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-05 12:11:11</p>
         */
        @NameInMap("ImportTime")
        public String importTime;

        /**
         * <p>意向标签列表</p>
         */
        @NameInMap("IntentTags")
        public java.util.List<TaskListResponseBodyModelIntentTags> intentTags;

        /**
         * <p>接通重呼次数</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("InvalidReCall")
        public Long invalidReCall;

        /**
         * <p>最后外呼时间</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-05 12:11:11</p>
         */
        @NameInMap("LastCallTime")
        public String lastCallTime;

        /**
         * <p>最大并发数</p>
         * 
         * <strong>example:</strong>
         * <p>95</p>
         */
        @NameInMap("MaxConcurrency")
        public Long maxConcurrency;

        /**
         * <p>个性标签列表</p>
         */
        @NameInMap("PersonalityTags")
        public java.util.List<String> personalityTags;

        /**
         * <p>优先任务</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("Priority")
        public Long priority;

        /**
         * <p>任务所需参数</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Properties")
        public String properties;

        /**
         * <p>自动重呼</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RecallType")
        public Long recallType;

        /**
         * <p>发送短信</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("SendSms")
        public Long sendSms;

        /**
         * <p>短信模板</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SmsName")
        public String smsName;

        /**
         * <p>任务状态</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>话术模板Id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>话术模板名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        public static TaskListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            TaskListResponseBodyModel self = new TaskListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public TaskListResponseBodyModel setAllowCallTime(String allowCallTime) {
            this.allowCallTime = allowCallTime;
            return this;
        }
        public String getAllowCallTime() {
            return this.allowCallTime;
        }

        public TaskListResponseBodyModel setAllowCallTimeFormat(String allowCallTimeFormat) {
            this.allowCallTimeFormat = allowCallTimeFormat;
            return this;
        }
        public String getAllowCallTimeFormat() {
            return this.allowCallTimeFormat;
        }

        public TaskListResponseBodyModel setAllowDayOfWeek(String allowDayOfWeek) {
            this.allowDayOfWeek = allowDayOfWeek;
            return this;
        }
        public String getAllowDayOfWeek() {
            return this.allowDayOfWeek;
        }

        public TaskListResponseBodyModel setCallType(Long callType) {
            this.callType = callType;
            return this;
        }
        public Long getCallType() {
            return this.callType;
        }

        public TaskListResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public TaskListResponseBodyModel setImportTime(String importTime) {
            this.importTime = importTime;
            return this;
        }
        public String getImportTime() {
            return this.importTime;
        }

        public TaskListResponseBodyModel setIntentTags(java.util.List<TaskListResponseBodyModelIntentTags> intentTags) {
            this.intentTags = intentTags;
            return this;
        }
        public java.util.List<TaskListResponseBodyModelIntentTags> getIntentTags() {
            return this.intentTags;
        }

        public TaskListResponseBodyModel setInvalidReCall(Long invalidReCall) {
            this.invalidReCall = invalidReCall;
            return this;
        }
        public Long getInvalidReCall() {
            return this.invalidReCall;
        }

        public TaskListResponseBodyModel setLastCallTime(String lastCallTime) {
            this.lastCallTime = lastCallTime;
            return this;
        }
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        public TaskListResponseBodyModel setMaxConcurrency(Long maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }
        public Long getMaxConcurrency() {
            return this.maxConcurrency;
        }

        public TaskListResponseBodyModel setPersonalityTags(java.util.List<String> personalityTags) {
            this.personalityTags = personalityTags;
            return this;
        }
        public java.util.List<String> getPersonalityTags() {
            return this.personalityTags;
        }

        public TaskListResponseBodyModel setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public TaskListResponseBodyModel setProperties(String properties) {
            this.properties = properties;
            return this;
        }
        public String getProperties() {
            return this.properties;
        }

        public TaskListResponseBodyModel setRecallType(Long recallType) {
            this.recallType = recallType;
            return this;
        }
        public Long getRecallType() {
            return this.recallType;
        }

        public TaskListResponseBodyModel setSendSms(Long sendSms) {
            this.sendSms = sendSms;
            return this;
        }
        public Long getSendSms() {
            return this.sendSms;
        }

        public TaskListResponseBodyModel setSmsName(String smsName) {
            this.smsName = smsName;
            return this;
        }
        public String getSmsName() {
            return this.smsName;
        }

        public TaskListResponseBodyModel setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public TaskListResponseBodyModel setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public TaskListResponseBodyModel setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public TaskListResponseBodyModel setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public TaskListResponseBodyModel setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
