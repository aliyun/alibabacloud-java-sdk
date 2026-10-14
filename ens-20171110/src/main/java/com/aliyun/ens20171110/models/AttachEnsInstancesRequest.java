// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachEnsInstancesRequest extends TeaModel {
    /**
     * <p>The instance ID. Only one ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testInstacneId</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The command to run on the instance, encoded in Base64 using UTF-8.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>wget d2dldCBodHRwOi8vYWxpYWNzLWs4cy1jbxxxx</p>
     */
    @NameInMap("Scripts")
    public String scripts;

    public static AttachEnsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEnsInstancesRequest self = new AttachEnsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public AttachEnsInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachEnsInstancesRequest setScripts(String scripts) {
        this.scripts = scripts;
        return this;
    }
    public String getScripts() {
        return this.scripts;
    }

}
