// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>myrayjob</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>rj-xxxxxxxxxxx</p>
     */
    @NameInMap("submissionId")
    public String submissionId;

    @NameInMap("submitTime")
    public ListRayJobRequestSubmitTime submitTime;

    /**
     * <strong>example:</strong>
     * <p>TSK-db8b870d901e443ba0aebba40c923e02</p>
     */
    @NameInMap("taskBizId")
    public String taskBizId;

    public static ListRayJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRayJobRequest self = new ListRayJobRequest();
        return TeaModel.build(map, self);
    }

    public ListRayJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRayJobRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListRayJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRayJobRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public ListRayJobRequest setSubmitTime(ListRayJobRequestSubmitTime submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public ListRayJobRequestSubmitTime getSubmitTime() {
        return this.submitTime;
    }

    public ListRayJobRequest setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

    public static class ListRayJobRequestSubmitTime extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1780018822000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1780017822000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        public static ListRayJobRequestSubmitTime build(java.util.Map<String, ?> map) throws Exception {
            ListRayJobRequestSubmitTime self = new ListRayJobRequestSubmitTime();
            return TeaModel.build(map, self);
        }

        public ListRayJobRequestSubmitTime setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListRayJobRequestSubmitTime setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
