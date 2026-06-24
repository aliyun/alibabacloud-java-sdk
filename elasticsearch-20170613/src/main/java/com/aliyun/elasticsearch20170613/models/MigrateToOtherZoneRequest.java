// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>Specifies whether to perform a dry run to check whether zone node migration is feasible. Valid values:</p>
     * <ul>
     * <li>true: performs only a validation check without executing the migration task.</li>
     * <li>false: executes the migration task after the validation check succeeds.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
