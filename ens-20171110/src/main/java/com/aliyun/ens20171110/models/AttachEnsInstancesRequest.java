// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachEnsInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can specify only one instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testInstacneId</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The command that you want to execute on the instance. The command must be encoded in Base64 or UTF-8.</p>
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
