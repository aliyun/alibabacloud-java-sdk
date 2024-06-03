// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>Verify whether the zone node can be migrated. true indicates that the data is only verified and the migration task is not executed. false indicates that the migration task is executed after the verification is successful.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static MigrateToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneRequest self = new MigrateToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public MigrateToOtherZoneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
