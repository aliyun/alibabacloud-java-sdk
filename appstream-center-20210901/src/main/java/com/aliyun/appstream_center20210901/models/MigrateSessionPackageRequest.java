// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class MigrateSessionPackageRequest extends TeaModel {
    @NameInMap("DestProjectId")
    public String destProjectId;

    @NameInMap("SessionPackageId")
    public String sessionPackageId;

    @NameInMap("SourceProjectId")
    public String sourceProjectId;

    public static MigrateSessionPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateSessionPackageRequest self = new MigrateSessionPackageRequest();
        return TeaModel.build(map, self);
    }

    public MigrateSessionPackageRequest setDestProjectId(String destProjectId) {
        this.destProjectId = destProjectId;
        return this;
    }
    public String getDestProjectId() {
        return this.destProjectId;
    }

    public MigrateSessionPackageRequest setSessionPackageId(String sessionPackageId) {
        this.sessionPackageId = sessionPackageId;
        return this;
    }
    public String getSessionPackageId() {
        return this.sessionPackageId;
    }

    public MigrateSessionPackageRequest setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }
    public String getSourceProjectId() {
        return this.sourceProjectId;
    }

}
