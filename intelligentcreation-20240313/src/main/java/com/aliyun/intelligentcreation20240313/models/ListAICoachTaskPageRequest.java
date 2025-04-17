// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAICoachTaskPageRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>111</p>
     */
    @NameInMap("studentId")
    public String studentId;

    /**
     * <strong>example:</strong>
     * <p>313123123</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static ListAICoachTaskPageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAICoachTaskPageRequest self = new ListAICoachTaskPageRequest();
        return TeaModel.build(map, self);
    }

    public ListAICoachTaskPageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListAICoachTaskPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAICoachTaskPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAICoachTaskPageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListAICoachTaskPageRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAICoachTaskPageRequest setStudentId(String studentId) {
        this.studentId = studentId;
        return this;
    }
    public String getStudentId() {
        return this.studentId;
    }

    public ListAICoachTaskPageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
