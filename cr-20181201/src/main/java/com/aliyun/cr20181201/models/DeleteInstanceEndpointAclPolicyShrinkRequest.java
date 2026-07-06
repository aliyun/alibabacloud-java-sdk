// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteInstanceEndpointAclPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The endpoint type. Only Internet is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>internet</p>
     */
    @NameInMap("EndpointType")
    public String endpointType;

    @NameInMap("Entries")
    public String entriesShrink;

    /**
     * <p>The IP CIDR block.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1/32</p>
     */
    @NameInMap("Entry")
    @Deprecated
    public String entry;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-xkx6vujuhay0****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The module for which the access policy is set. Valid values:</p>
     * <ul>
     * <li><p><code>Registry</code>: access to the image repository</p>
     * </li>
     * <li><p><code>Chart</code>: access to Helm Chart</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Chart</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    public static DeleteInstanceEndpointAclPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceEndpointAclPolicyShrinkRequest self = new DeleteInstanceEndpointAclPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceEndpointAclPolicyShrinkRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public DeleteInstanceEndpointAclPolicyShrinkRequest setEntriesShrink(String entriesShrink) {
        this.entriesShrink = entriesShrink;
        return this;
    }
    public String getEntriesShrink() {
        return this.entriesShrink;
    }

    @Deprecated
    public DeleteInstanceEndpointAclPolicyShrinkRequest setEntry(String entry) {
        this.entry = entry;
        return this;
    }
    public String getEntry() {
        return this.entry;
    }

    public DeleteInstanceEndpointAclPolicyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteInstanceEndpointAclPolicyShrinkRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
