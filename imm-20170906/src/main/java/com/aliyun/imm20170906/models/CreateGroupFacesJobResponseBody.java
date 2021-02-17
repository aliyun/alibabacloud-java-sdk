// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateGroupFacesJobResponseBody extends TeaModel {
    @NameInMap("JobType")
    public String jobType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("JobId")
    public String jobId;

    public static CreateGroupFacesJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGroupFacesJobResponseBody self = new CreateGroupFacesJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGroupFacesJobResponseBody setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public CreateGroupFacesJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGroupFacesJobResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public CreateGroupFacesJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
