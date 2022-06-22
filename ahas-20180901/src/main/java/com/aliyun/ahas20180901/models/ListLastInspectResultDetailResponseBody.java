// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListLastInspectResultDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListLastInspectResultDetailResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListLastInspectResultDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLastInspectResultDetailResponseBody self = new ListLastInspectResultDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLastInspectResultDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLastInspectResultDetailResponseBody setData(java.util.List<ListLastInspectResultDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListLastInspectResultDetailResponseBodyData> getData() {
        return this.data;
    }

    public ListLastInspectResultDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLastInspectResultDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLastInspectResultDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLastInspectResultDetailResponseBodyDataList extends TeaModel {
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

        public static ListLastInspectResultDetailResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListLastInspectResultDetailResponseBodyDataList self = new ListLastInspectResultDetailResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListLastInspectResultDetailResponseBodyDataList setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public ListLastInspectResultDetailResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLastInspectResultDetailResponseBodyDataList setFunctionCode(String functionCode) {
            this.functionCode = functionCode;
            return this;
        }
        public String getFunctionCode() {
            return this.functionCode;
        }

        public ListLastInspectResultDetailResponseBodyDataList setFunctionId(Long functionId) {
            this.functionId = functionId;
            return this;
        }
        public Long getFunctionId() {
            return this.functionId;
        }

        public ListLastInspectResultDetailResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListLastInspectResultDetailResponseBodyDataList setInspectId(Long inspectId) {
            this.inspectId = inspectId;
            return this;
        }
        public Long getInspectId() {
            return this.inspectId;
        }

        public ListLastInspectResultDetailResponseBodyDataList setInspectStatus(String inspectStatus) {
            this.inspectStatus = inspectStatus;
            return this;
        }
        public String getInspectStatus() {
            return this.inspectStatus;
        }

        public ListLastInspectResultDetailResponseBodyDataList setLastCheckTime(String lastCheckTime) {
            this.lastCheckTime = lastCheckTime;
            return this;
        }
        public String getLastCheckTime() {
            return this.lastCheckTime;
        }

        public ListLastInspectResultDetailResponseBodyDataList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListLastInspectResultDetailResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLastInspectResultDetailResponseBodyDataList setRunStatus(String runStatus) {
            this.runStatus = runStatus;
            return this;
        }
        public String getRunStatus() {
            return this.runStatus;
        }

        public ListLastInspectResultDetailResponseBodyDataList setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public ListLastInspectResultDetailResponseBodyDataList setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class ListLastInspectResultDetailResponseBodyData extends TeaModel {
        @NameInMap("Complete")
        public Boolean complete;

        @NameInMap("List")
        public java.util.List<ListLastInspectResultDetailResponseBodyDataList> list;

        @NameInMap("Schedule")
        public Integer schedule;

        public static ListLastInspectResultDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLastInspectResultDetailResponseBodyData self = new ListLastInspectResultDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLastInspectResultDetailResponseBodyData setComplete(Boolean complete) {
            this.complete = complete;
            return this;
        }
        public Boolean getComplete() {
            return this.complete;
        }

        public ListLastInspectResultDetailResponseBodyData setList(java.util.List<ListLastInspectResultDetailResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListLastInspectResultDetailResponseBodyDataList> getList() {
            return this.list;
        }

        public ListLastInspectResultDetailResponseBodyData setSchedule(Integer schedule) {
            this.schedule = schedule;
            return this;
        }
        public Integer getSchedule() {
            return this.schedule;
        }

    }

}
