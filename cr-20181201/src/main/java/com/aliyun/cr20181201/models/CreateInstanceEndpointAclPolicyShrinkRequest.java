// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class CreateInstanceEndpointAclPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    @Deprecated
    public String comment;

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
     * <p>The IP address range that is allowed to access the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.1/32</p>
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
     * <p>The module for which you want to set the access policy. Valid values:</p>
     * <ul>
     * <li><p><code>Registry</code>: access the image repository</p>
     * </li>
     * <li><p><code>Chart</code>: access Helm Chart</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Registry</p>
     */
    @NameInMap("ModuleName")
    public String moduleName;

    public static CreateInstanceEndpointAclPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceEndpointAclPolicyShrinkRequest self = new CreateInstanceEndpointAclPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public CreateInstanceEndpointAclPolicyShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateInstanceEndpointAclPolicyShrinkRequest setEndpointType(String endpointType) {
        this.endpointType = endpointType;
        return this;
    }
    public String getEndpointType() {
        return this.endpointType;
    }

    public CreateInstanceEndpointAclPolicyShrinkRequest setEntriesShrink(String entriesShrink) {
        this.entriesShrink = entriesShrink;
        return this;
    }
    public String getEntriesShrink() {
        return this.entriesShrink;
    }

    @Deprecated
    public CreateInstanceEndpointAclPolicyShrinkRequest setEntry(String entry) {
        this.entry = entry;
        return this;
    }
    public String getEntry() {
        return this.entry;
    }

    public CreateInstanceEndpointAclPolicyShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateInstanceEndpointAclPolicyShrinkRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

}
