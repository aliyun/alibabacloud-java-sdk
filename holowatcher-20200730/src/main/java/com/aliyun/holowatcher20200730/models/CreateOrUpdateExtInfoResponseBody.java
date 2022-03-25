// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateOrUpdateExtInfoResponseBody extends TeaModel {
    @NameInMap("OssSts")
    public String ossSts;

    @NameInMap("PipelineStatus")
    public String pipelineStatus;

    @NameInMap("ProjectId")
    public Long projectId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateExtInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateExtInfoResponseBody self = new CreateOrUpdateExtInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateExtInfoResponseBody setOssSts(String ossSts) {
        this.ossSts = ossSts;
        return this;
    }
    public String getOssSts() {
        return this.ossSts;
    }

    public CreateOrUpdateExtInfoResponseBody setPipelineStatus(String pipelineStatus) {
        this.pipelineStatus = pipelineStatus;
        return this;
    }
    public String getPipelineStatus() {
        return this.pipelineStatus;
    }

    public CreateOrUpdateExtInfoResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateOrUpdateExtInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
