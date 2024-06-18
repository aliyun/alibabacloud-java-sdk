// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class MoveResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which you want to move the resource.</p>
     * <blockquote>
     * <p>You can use resource groups to manage resources owned by your Alibaba Cloud account. Resource groups simplify resource and permission management in your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is resource management?</a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-9gLOoK****</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acl-hp34s2h0xx1ht4nwo****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li><strong>loadbalancer</strong>: Application Load Balancer (ALB) instance</li>
     * <li><strong>acl</strong>: access control list (ACL)</li>
     * <li><strong>securitypolicy</strong>: security policy</li>
     * <li><strong>servergroup</strong>: server group</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACL</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static MoveResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceGroupRequest self = new MoveResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public MoveResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public MoveResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
