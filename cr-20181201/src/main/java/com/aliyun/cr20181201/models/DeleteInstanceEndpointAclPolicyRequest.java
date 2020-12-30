// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceEndpointAclPolicyRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Entry")
    public String entry;

    @NameInMap("ModuleName")
    public String moduleName;

    public static DeleteInstanceEndpointAclPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceEndpointAclPolicyRequest self = new DeleteInstanceEndpointAclPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceEndpointAclPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public DeleteInstanceEndpointAclPolicyRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
