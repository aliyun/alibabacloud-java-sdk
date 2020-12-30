// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListJobsByGroupRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobGroupId")
    public String jobGroupId;

    @NameInMap("JobStatus")
    public String jobStatus;

    @NameInMap("JobFailureReason")
    public String jobFailureReason;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListJobsByGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobsByGroupRequest self = new ListJobsByGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListJobsByGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListJobsByGroupRequest setJobGroupId(String jobGroupId) {
        this.jobGroupId = jobGroupId;
        return this;
    }
    public String getJobGroupId() {
        return this.jobGroupId;
    }

    public ListJobsByGroupRequest setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }
    public String getJobStatus() {
        return this.jobStatus;
    }

    public ListJobsByGroupRequest setJobFailureReason(String jobFailureReason) {
        this.jobFailureReason = jobFailureReason;
        return this;
    }
    public String getJobFailureReason() {
        return this.jobFailureReason;
    }

    public ListJobsByGroupRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJobsByGroupRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
