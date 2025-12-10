// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateReportInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <your-job-name>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuntimeId")
    public Integer runtimeId;

    /**
     * <strong>example:</strong>
     * <your-job-version>
     */
    @NameInMap("Version")
    public String version;

    public static CreateReportInfo build(java.util.Map<String, ?> map) throws Exception {
        CreateReportInfo self = new CreateReportInfo();
        return TeaModel.build(map, self);
    }

    public CreateReportInfo setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public CreateReportInfo setRuntimeId(Integer runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }
    public Integer getRuntimeId() {
        return this.runtimeId;
    }

    public CreateReportInfo setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
