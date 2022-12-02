// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSetupProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetupProjectId")
    public String setupProjectId;

    @NameInMap("SetupProjectName")
    public String setupProjectName;

    @NameInMap("SetupProjectSpecification")
    public String setupProjectSpecification;

    public static UpdateSetupProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetupProjectResponseBody self = new UpdateSetupProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSetupProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSetupProjectResponseBody setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateSetupProjectResponseBody setSetupProjectName(String setupProjectName) {
        this.setupProjectName = setupProjectName;
        return this;
    }
    public String getSetupProjectName() {
        return this.setupProjectName;
    }

    public UpdateSetupProjectResponseBody setSetupProjectSpecification(String setupProjectSpecification) {
        this.setupProjectSpecification = setupProjectSpecification;
        return this;
    }
    public String getSetupProjectSpecification() {
        return this.setupProjectSpecification;
    }

}
