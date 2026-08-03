// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachTaskPageResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("taskList")
    public java.util.List<ListAICoachTaskPageResponseBodyTaskList> taskList;

    @NameInMap("total")
    public Long total;

    public static ListAICoachTaskPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachTaskPageResponseBody self = new ListAICoachTaskPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAICoachTaskPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAICoachTaskPageResponseBody setTaskList(java.util.List<ListAICoachTaskPageResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<ListAICoachTaskPageResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public ListAICoachTaskPageResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListAICoachTaskPageResponseBodyTaskList extends TeaModel {
        @NameInMap("finishTime")
        public String finishTime;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("status")
        public String status;

        @NameInMap("studentId")
        public String studentId;

        @NameInMap("taskId")
        public String taskId;

        public static ListAICoachTaskPageResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListAICoachTaskPageResponseBodyTaskList self = new ListAICoachTaskPageResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public ListAICoachTaskPageResponseBodyTaskList setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListAICoachTaskPageResponseBodyTaskList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAICoachTaskPageResponseBodyTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListAICoachTaskPageResponseBodyTaskList setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public String getStudentId() {
            return this.studentId;
        }

        public ListAICoachTaskPageResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
