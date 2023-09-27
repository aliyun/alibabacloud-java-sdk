// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceEndpointAclPolicyRequest extends TeaModel {
    /**
     * <p>The description.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The type of the endpoint. Set the value to Internet.</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    /**
     * <p>The CIDR block that is accessible.</p>
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
