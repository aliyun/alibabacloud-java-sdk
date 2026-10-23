// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    /**
     * <p>The zone migration configuration, including the source zone, destination zone, and destination vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;fromZoneId&quot;:&quot;cn-hangzhou-e&quot;,&quot;toZoneId&quot;:&quot;cn-hangzhou-f&quot;,&quot;toVswitchId&quot;:&quot;vsw-bp16t5hpc689dgkgc****&quot;}</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>Specifies whether to precheck the node migration across zones. A value of true indicates that only a precheck is performed and the migration task is not executed. A value of false indicates that the migration task is executed after the precheck succeeds.</p>
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
