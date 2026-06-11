// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListRayJobShrinkRequest extends TeaModel {
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
    public String submitTimeShrink;

    /**
     * <strong>example:</strong>
     * <p>TSK-db8b870d901e443ba0aebba40c923e02</p>
     */
    @NameInMap("taskBizId")
    public String taskBizId;

    public static ListRayJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRayJobShrinkRequest self = new ListRayJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListRayJobShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListRayJobShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListRayJobShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRayJobShrinkRequest setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

    public ListRayJobShrinkRequest setSubmitTimeShrink(String submitTimeShrink) {
        this.submitTimeShrink = submitTimeShrink;
        return this;
    }
    public String getSubmitTimeShrink() {
        return this.submitTimeShrink;
    }

    public ListRayJobShrinkRequest setTaskBizId(String taskBizId) {
        this.taskBizId = taskBizId;
        return this;
    }
    public String getTaskBizId() {
        return this.taskBizId;
    }

}
