// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateMergeFaceGroupsJobResponseBody extends TeaModel {
    @NameInMap("GroupIdFrom")
    public String groupIdFrom;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("GroupIdTo")
    public String groupIdTo;

    @NameInMap("JobId")
    public String jobId;

    public static CreateMergeFaceGroupsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeFaceGroupsJobResponseBody self = new CreateMergeFaceGroupsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMergeFaceGroupsJobResponseBody setGroupIdFrom(String groupIdFrom) {
        this.groupIdFrom = groupIdFrom;
        return this;
    }
    public String getGroupIdFrom() {
        return this.groupIdFrom;
    }

    public CreateMergeFaceGroupsJobResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateMergeFaceGroupsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMergeFaceGroupsJobResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public CreateMergeFaceGroupsJobResponseBody setGroupIdTo(String groupIdTo) {
        this.groupIdTo = groupIdTo;
        return this;
    }
    public String getGroupIdTo() {
        return this.groupIdTo;
    }

    public CreateMergeFaceGroupsJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
