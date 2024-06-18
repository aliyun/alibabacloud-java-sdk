// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateTodoTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>isv_dingtalkTodo</p>
     */
    @NameInMap("bizTag")
    public String bizTag;

    @NameInMap("contentFieldList")
    public java.util.List<CreateTodoTaskResponseBodyContentFieldList> contentFieldList;

    /**
     * <strong>example:</strong>
     * <p>1617675200000</p>
     */
    @NameInMap("createdTime")
    public Long createdTime;

    /**
     * <strong>example:</strong>
     * <p>PUoiinWIpa2yH2ymhiiGiP6g</p>
     */
    @NameInMap("creatorId")
    public String creatorId;

    /**
     * <strong>example:</strong>
     * <p>应用可以调用该接口发起一个钉钉待办任务，该待办事项会出现在钉钉客户端“待办”页面，需要注意的是，通过开放接口发起的待办，目前仅支持直接跳转ISV应用详情页（ISV在调该接口时需传入自身应用详情页链接）。</p>
     */
    @NameInMap("description")
    public String description;

    @NameInMap("detailUrl")
    public CreateTodoTaskResponseBodyDetailUrl detailUrl;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("done")
    public Boolean done;

    /**
     * <strong>example:</strong>
     * <p>1617675100000</p>
     */
    @NameInMap("dueTime")
    public Long dueTime;

    @NameInMap("executorIds")
    public java.util.List<String> executorIds;

    /**
     * <strong>example:</strong>
     * <p>1617675200000</p>
     */
    @NameInMap("finishTime")
    public Long finishTime;

    /**
     * <strong>example:</strong>
     * <p>OPJpwtwPVNGIFKURjrzd</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isOnlyShowExecutor")
    public Boolean isOnlyShowExecutor;

    /**
     * <strong>example:</strong>
     * <p>1617675200000</p>
     */
    @NameInMap("modifiedTime")
    public Long modifiedTime;

    /**
     * <strong>example:</strong>
     * <p>PUoiinWIpa2yH2ymhiiGiP6g</p>
     */
    @NameInMap("modifierId")
    public String modifierId;

    @NameInMap("notifyConfigs")
    public CreateTodoTaskResponseBodyNotifyConfigs notifyConfigs;

    @NameInMap("participantIds")
    public java.util.List<String> participantIds;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("priority")
    public Integer priority;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>isv_dingtalkTodo</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <strong>example:</strong>
     * <p>isv_dingtalkTodo1</p>
     */
    @NameInMap("sourceId")
    public String sourceId;

    /**
     * <strong>example:</strong>
     * <p>1617675000000</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>接入钉钉待办</p>
     */
    @NameInMap("subject")
    public String subject;

    public static CreateTodoTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTodoTaskResponseBody self = new CreateTodoTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTodoTaskResponseBody setBizTag(String bizTag) {
        this.bizTag = bizTag;
        return this;
    }
    public String getBizTag() {
        return this.bizTag;
    }

    public CreateTodoTaskResponseBody setContentFieldList(java.util.List<CreateTodoTaskResponseBodyContentFieldList> contentFieldList) {
        this.contentFieldList = contentFieldList;
        return this;
    }
    public java.util.List<CreateTodoTaskResponseBodyContentFieldList> getContentFieldList() {
        return this.contentFieldList;
    }

    public CreateTodoTaskResponseBody setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public Long getCreatedTime() {
        return this.createdTime;
    }

    public CreateTodoTaskResponseBody setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public CreateTodoTaskResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTodoTaskResponseBody setDetailUrl(CreateTodoTaskResponseBodyDetailUrl detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }
    public CreateTodoTaskResponseBodyDetailUrl getDetailUrl() {
        return this.detailUrl;
    }

    public CreateTodoTaskResponseBody setDone(Boolean done) {
        this.done = done;
        return this;
    }
    public Boolean getDone() {
        return this.done;
    }

    public CreateTodoTaskResponseBody setDueTime(Long dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public Long getDueTime() {
        return this.dueTime;
    }

    public CreateTodoTaskResponseBody setExecutorIds(java.util.List<String> executorIds) {
        this.executorIds = executorIds;
        return this;
    }
    public java.util.List<String> getExecutorIds() {
        return this.executorIds;
    }

    public CreateTodoTaskResponseBody setFinishTime(Long finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public Long getFinishTime() {
        return this.finishTime;
    }

    public CreateTodoTaskResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateTodoTaskResponseBody setIsOnlyShowExecutor(Boolean isOnlyShowExecutor) {
        this.isOnlyShowExecutor = isOnlyShowExecutor;
        return this;
    }
    public Boolean getIsOnlyShowExecutor() {
        return this.isOnlyShowExecutor;
    }

    public CreateTodoTaskResponseBody setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public CreateTodoTaskResponseBody setModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }
    public String getModifierId() {
        return this.modifierId;
    }

    public CreateTodoTaskResponseBody setNotifyConfigs(CreateTodoTaskResponseBodyNotifyConfigs notifyConfigs) {
        this.notifyConfigs = notifyConfigs;
        return this;
    }
    public CreateTodoTaskResponseBodyNotifyConfigs getNotifyConfigs() {
        return this.notifyConfigs;
    }

    public CreateTodoTaskResponseBody setParticipantIds(java.util.List<String> participantIds) {
        this.participantIds = participantIds;
        return this;
    }
    public java.util.List<String> getParticipantIds() {
        return this.participantIds;
    }

    public CreateTodoTaskResponseBody setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTodoTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTodoTaskResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateTodoTaskResponseBody setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public CreateTodoTaskResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateTodoTaskResponseBody setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public static class CreateTodoTaskResponseBodyContentFieldList extends TeaModel {
        /**
         * <p>fieldKey</p>
         * 
         * <strong>example:</strong>
         * <p>fieldKey</p>
         */
        @NameInMap("fieldKey")
        public String fieldKey;

        /**
         * <p>fieldValue</p>
         * 
         * <strong>example:</strong>
         * <p>fieldValue</p>
         */
        @NameInMap("fieldValue")
        public String fieldValue;

        public static CreateTodoTaskResponseBodyContentFieldList build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskResponseBodyContentFieldList self = new CreateTodoTaskResponseBodyContentFieldList();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskResponseBodyContentFieldList setFieldKey(String fieldKey) {
            this.fieldKey = fieldKey;
            return this;
        }
        public String getFieldKey() {
            return this.fieldKey;
        }

        public CreateTodoTaskResponseBodyContentFieldList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

    }

    public static class CreateTodoTaskResponseBodyDetailUrl extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://www.dingtalk.com">https://www.dingtalk.com</a></p>
         */
        @NameInMap("appUrl")
        public String appUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.dingtalk.com">https://www.dingtalk.com</a></p>
         */
        @NameInMap("pcUrl")
        public String pcUrl;

        public static CreateTodoTaskResponseBodyDetailUrl build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskResponseBodyDetailUrl self = new CreateTodoTaskResponseBodyDetailUrl();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskResponseBodyDetailUrl setAppUrl(String appUrl) {
            this.appUrl = appUrl;
            return this;
        }
        public String getAppUrl() {
            return this.appUrl;
        }

        public CreateTodoTaskResponseBodyDetailUrl setPcUrl(String pcUrl) {
            this.pcUrl = pcUrl;
            return this;
        }
        public String getPcUrl() {
            return this.pcUrl;
        }

    }

    public static class CreateTodoTaskResponseBodyNotifyConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("dingNotify")
        public String dingNotify;

        public static CreateTodoTaskResponseBodyNotifyConfigs build(java.util.Map<String, ?> map) throws Exception {
            CreateTodoTaskResponseBodyNotifyConfigs self = new CreateTodoTaskResponseBodyNotifyConfigs();
            return TeaModel.build(map, self);
        }

        public CreateTodoTaskResponseBodyNotifyConfigs setDingNotify(String dingNotify) {
            this.dingNotify = dingNotify;
            return this;
        }
        public String getDingNotify() {
            return this.dingNotify;
        }

    }

}
