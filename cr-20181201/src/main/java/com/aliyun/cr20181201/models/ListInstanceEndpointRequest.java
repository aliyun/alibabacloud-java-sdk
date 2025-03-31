// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListInstanceEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-kmsiwlxxdcva****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the module that you want to access. Valid values:</p>
     * <ul>
     * <li><code>Registry</code>: image repositories.</li>
     * <li><code>Chart</code>: Helm charts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Chart</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    /**
     * <p>Specify whether to return endpoints in simple mode. If yes, no access control information about the endpoint is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Summary")
    public Boolean summary;

    public static ListInstanceEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceEndpointRequest self = new ListInstanceEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceEndpointRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstanceEndpointRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public ListInstanceEndpointRequest setSummary(Boolean summary) {
        this.summary = summary;
        return this;
    }
    public Boolean getSummary() {
        return this.summary;
    }

}
