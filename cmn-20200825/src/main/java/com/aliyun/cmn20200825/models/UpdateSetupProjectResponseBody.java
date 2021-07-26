// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateSetupProjectResponseBody extends TeaModel {
    // 实例的名称
    @NameInMap("SetupProjectName")
    public String setupProjectName;

    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("SetupProjectId")
    public String setupProjectId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 实例的规格。
    @NameInMap("SetupProjectSpecification")
    public String setupProjectSpecification;

    public static UpdateSetupProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSetupProjectResponseBody self = new UpdateSetupProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSetupProjectResponseBody setSetupProjectName(String setupProjectName) {
        this.setupProjectName = setupProjectName;
        return this;
    }
    public String getSetupProjectName() {
        return this.setupProjectName;
    }

    public UpdateSetupProjectResponseBody setSetupProjectId(String setupProjectId) {
        this.setupProjectId = setupProjectId;
        return this;
    }
    public String getSetupProjectId() {
        return this.setupProjectId;
    }

    public UpdateSetupProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSetupProjectResponseBody setSetupProjectSpecification(String setupProjectSpecification) {
        this.setupProjectSpecification = setupProjectSpecification;
        return this;
    }
    public String getSetupProjectSpecification() {
        return this.setupProjectSpecification;
    }

}
