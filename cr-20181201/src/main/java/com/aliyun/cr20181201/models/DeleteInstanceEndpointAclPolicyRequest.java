// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceEndpointAclPolicyRequest extends TeaModel {
    /**
     * <p>The type of the endpoint. Set the value to Internet.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The CIDR block.</p>
     */
    @NameInMap("Entry")
    public String entry;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the module that you want to access. Valid values:</p>
     * <br>
     * <p>*   `Registry`: the image repository.</p>
     * <p>*   `Chart`: a Helm chart.</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    public static DeleteInstanceEndpointAclPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceEndpointAclPolicyRequest self = new DeleteInstanceEndpointAclPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceEndpointAclPolicyRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public DeleteInstanceEndpointAclPolicyRequest setEntry(String entry) {
        this.entry = entry;
        return this;
    }
    public String getEntry() {
        return this.entry;
    }

    public DeleteInstanceEndpointAclPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceEndpointAclPolicyRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
