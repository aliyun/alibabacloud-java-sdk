// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceEndpointAclPolicyRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Entry")
    public String entry;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ModuleName")
    public String moduleName;

    public static CreateInstanceEndpointAclPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceEndpointAclPolicyRequest self = new CreateInstanceEndpointAclPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceEndpointAclPolicyRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateInstanceEndpointAclPolicyRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateInstanceEndpointAclPolicyRequest setEntry(String entry) {
        this.entry = entry;
        return this;
    }
    public String getEntry() {
        return this.entry;
    }

    public CreateInstanceEndpointAclPolicyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceEndpointAclPolicyRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
