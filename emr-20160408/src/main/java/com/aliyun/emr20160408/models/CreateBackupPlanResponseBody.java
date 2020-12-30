// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateBackupPlanResponseBody extends TeaModel {
    @NameInMap("RootPath")
    public String rootPath;

    @NameInMap("Description")
    public String description;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static CreateBackupPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupPlanResponseBody self = new CreateBackupPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBackupPlanResponseBody setRootPath(String rootPath) {
        this.rootPath = rootPath;
        return this;
    }
    public String getRootPath() {
        return this.rootPath;
    }

    public CreateBackupPlanResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBackupPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBackupPlanResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateBackupPlanResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateBackupPlanResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
