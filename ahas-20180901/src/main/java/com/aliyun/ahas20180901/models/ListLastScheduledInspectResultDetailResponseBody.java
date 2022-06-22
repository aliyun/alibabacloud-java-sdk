// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListLastScheduledInspectResultDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListLastScheduledInspectResultDetailResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLastScheduledInspectResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLastScheduledInspectResultDetailResponseBody self = new ListLastScheduledInspectResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLastScheduledInspectResultDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLastScheduledInspectResultDetailResponseBody setData(java.util.List<ListLastScheduledInspectResultDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLastScheduledInspectResultDetailResponseBodyData> getData() {
        return this.data;
    }

    public ListLastScheduledInspectResultDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLastScheduledInspectResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLastScheduledInspectResultDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLastScheduledInspectResultDetailResponseBodyDataList extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Description")
        public String description;

        @NameInMap("FunctionCode")
        public String functionCode;

        @NameInMap("FunctionId")
        public Long functionId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InspectId")
        public Long inspectId;

        @NameInMap("InspectStatus")
        public String inspectStatus;

        @NameInMap("LastCheckTime")
        public String lastCheckTime;

        @NameInMap("Level")
        public String level;

        @NameInMap("Name")
        public String name;

        @NameInMap("RunStatus")
        public String runStatus;

        @NameInMap("Score")
        public String score;

        @NameInMap("Success")
        public String success;

        public static ListLastScheduledInspectResultDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLastScheduledInspectResultDetailResponseBodyDataList self = new ListLastScheduledInspectResultDetailResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setFunctionCode(String functionCode) {
            this.functionCode = functionCode;
            return this;
        }
        public String getFunctionCode() {
            return this.functionCode;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setFunctionId(Long functionId) {
            this.functionId = functionId;
            return this;
        }
        public Long getFunctionId() {
            return this.functionId;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setInspectId(Long inspectId) {
            this.inspectId = inspectId;
            return this;
        }
        public Long getInspectId() {
            return this.inspectId;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setInspectStatus(String inspectStatus) {
            this.inspectStatus = inspectStatus;
            return this;
        }
        public String getInspectStatus() {
            return this.inspectStatus;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setRunStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public String getRunStatus() {
            return this.runStatus;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public ListLastScheduledInspectResultDetailResponseBodyDataList setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class ListLastScheduledInspectResultDetailResponseBodyData extends TeaModel {
        @NameInMap("Complete")
        public Boolean complete;

        @NameInMap("List")
        public java.util.List<ListLastScheduledInspectResultDetailResponseBodyDataList> list;

        @NameInMap("Schedule")
        public Integer schedule;

        public static ListLastScheduledInspectResultDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLastScheduledInspectResultDetailResponseBodyData self = new ListLastScheduledInspectResultDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLastScheduledInspectResultDetailResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public ListLastScheduledInspectResultDetailResponseBodyData setList(java.util.List<ListLastScheduledInspectResultDetailResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLastScheduledInspectResultDetailResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLastScheduledInspectResultDetailResponseBodyData setSchedule(Integer schedule) {
            this.schedule = schedule;
            return this;
        }
        public Integer getSchedule() {
            return this.schedule;
        }

    }

}
