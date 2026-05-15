// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesResponseBody extends TeaModel {
    @NameInMap("basicInfo")
    public MeetingFlashMinutesResponseBodyBasicInfo basicInfo;

    /**
     * <strong>example:</strong>
     * <p><a href="https://shanji.dingtalk.com/app/transcribes/76XXX">https://shanji.dingtalk.com/app/transcribes/76XXX</a></p>
     */
    @NameInMap("flashMinutesUrl")
    public String flashMinutesUrl;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("fullSummary")
    public String fullSummary;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("todos")
    public MeetingFlashMinutesResponseBodyTodos todos;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static MeetingFlashMinutesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesResponseBody self = new MeetingFlashMinutesResponseBody();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesResponseBody setBasicInfo(MeetingFlashMinutesResponseBodyBasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }
    public MeetingFlashMinutesResponseBodyBasicInfo getBasicInfo() {
        return this.basicInfo;
    }

    public MeetingFlashMinutesResponseBody setFlashMinutesUrl(String flashMinutesUrl) {
        this.flashMinutesUrl = flashMinutesUrl;
        return this;
    }
    public String getFlashMinutesUrl() {
        return this.flashMinutesUrl;
    }

    public MeetingFlashMinutesResponseBody setFullSummary(String fullSummary) {
        this.fullSummary = fullSummary;
        return this;
    }
    public String getFullSummary() {
        return this.fullSummary;
    }

    public MeetingFlashMinutesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MeetingFlashMinutesResponseBody setTodos(MeetingFlashMinutesResponseBodyTodos todos) {
        this.todos = todos;
        return this;
    }
    public MeetingFlashMinutesResponseBodyTodos getTodos() {
        return this.todos;
    }

    public MeetingFlashMinutesResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public MeetingFlashMinutesResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class MeetingFlashMinutesResponseBodyBasicInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500529</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>1778490089000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1778490089000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>u0VGeOiPUBSVMypV3Hylp7wXXX</p>
         */
        @NameInMap("taskCreator")
        public String taskCreator;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://shanji.dingtalk.com/app/transcribes/76XXX">https://shanji.dingtalk.com/app/transcribes/76XXX</a></p>
         */
        @NameInMap("url")
        public String url;

        public static MeetingFlashMinutesResponseBodyBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesResponseBodyBasicInfo self = new MeetingFlashMinutesResponseBodyBasicInfo();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesResponseBodyBasicInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public MeetingFlashMinutesResponseBodyBasicInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MeetingFlashMinutesResponseBodyBasicInfo setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MeetingFlashMinutesResponseBodyBasicInfo setTaskCreator(String taskCreator) {
            this.taskCreator = taskCreator;
            return this;
        }
        public String getTaskCreator() {
            return this.taskCreator;
        }

        public MeetingFlashMinutesResponseBodyBasicInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public MeetingFlashMinutesResponseBodyBasicInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://XXX221rNAbjNAbg_440_440.png">https://XXX221rNAbjNAbg_440_440.png</a></p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("nick")
        public String nick;

        /**
         * <strong>example:</strong>
         * <p>u0VGeOiPUBSVMypV3Hylp7wXXX</p>
         */
        @NameInMap("unionId")
        public String unionId;

        public static MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList self = new MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList setUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }
        public String getUnionId() {
            return this.unionId;
        }

    }

    public static class MeetingFlashMinutesResponseBodyTodosDingtalkTodoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1778490089000</p>
         */
        @NameInMap("createdTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>u0VGeOiPUBSVMypV3Hylp7wXXX</p>
         */
        @NameInMap("creatorUnionId")
        public String creatorUnionId;

        /**
         * <strong>example:</strong>
         * <p>deadline</p>
         */
        @NameInMap("deadline")
        public String deadline;

        /**
         * <strong>example:</strong>
         * <p>dingtalkTodoId</p>
         */
        @NameInMap("dingtalkTodoId")
        public String dingtalkTodoId;

        @NameInMap("executorList")
        public java.util.List<MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList> executorList;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isDone")
        public Boolean isDone;

        /**
         * <strong>example:</strong>
         * <p>minutesTodoId</p>
         */
        @NameInMap("minutesTodoId")
        public String minutesTodoId;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("title")
        public String title;

        public static MeetingFlashMinutesResponseBodyTodosDingtalkTodoList build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesResponseBodyTodosDingtalkTodoList self = new MeetingFlashMinutesResponseBodyTodosDingtalkTodoList();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setCreatorUnionId(String creatorUnionId) {
            this.creatorUnionId = creatorUnionId;
            return this;
        }
        public String getCreatorUnionId() {
            return this.creatorUnionId;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setDeadline(String deadline) {
            this.deadline = deadline;
            return this;
        }
        public String getDeadline() {
            return this.deadline;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setDingtalkTodoId(String dingtalkTodoId) {
            this.dingtalkTodoId = dingtalkTodoId;
            return this;
        }
        public String getDingtalkTodoId() {
            return this.dingtalkTodoId;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setExecutorList(java.util.List<MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList> executorList) {
            this.executorList = executorList;
            return this;
        }
        public java.util.List<MeetingFlashMinutesResponseBodyTodosDingtalkTodoListExecutorList> getExecutorList() {
            return this.executorList;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setIsDone(Boolean isDone) {
            this.isDone = isDone;
            return this;
        }
        public Boolean getIsDone() {
            return this.isDone;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setMinutesTodoId(String minutesTodoId) {
            this.minutesTodoId = minutesTodoId;
            return this;
        }
        public String getMinutesTodoId() {
            return this.minutesTodoId;
        }

        public MeetingFlashMinutesResponseBodyTodosDingtalkTodoList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class MeetingFlashMinutesResponseBodyTodos extends TeaModel {
        @NameInMap("actions")
        public java.util.List<String> actions;

        @NameInMap("dingtalkTodoList")
        public java.util.List<MeetingFlashMinutesResponseBodyTodosDingtalkTodoList> dingtalkTodoList;

        public static MeetingFlashMinutesResponseBodyTodos build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesResponseBodyTodos self = new MeetingFlashMinutesResponseBodyTodos();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesResponseBodyTodos setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public MeetingFlashMinutesResponseBodyTodos setDingtalkTodoList(java.util.List<MeetingFlashMinutesResponseBodyTodosDingtalkTodoList> dingtalkTodoList) {
            this.dingtalkTodoList = dingtalkTodoList;
            return this;
        }
        public java.util.List<MeetingFlashMinutesResponseBodyTodosDingtalkTodoList> getDingtalkTodoList() {
            return this.dingtalkTodoList;
        }

    }

}
