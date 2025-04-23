// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResourceRequest extends TeaModel {
    /**
     * <p>The name of the resource group. You can call <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a> to obtain the name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The tags. Multiple tags are separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>system.supported.eas=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The operation to perform. Valid values:</p>
     * <ul>
     * <li>DetachAndDelete: disassociates a resource from a workspace and deletes the resource in the workspace. This is the default value.</li>
     * <li>Detach: disassociates a resource group from a workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DetachAndDelete</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>**This field is no longer used and will be removed. Use the ResourceType field instead.</p>
     * 
     * <strong>example:</strong>
     * <p>DLC</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The resource IDs. Multiple resource IDs are separated by commas (,). The GroupName values for the specified resources must be the same. You cannot leave both GroupName and ResourceIds empty. You can specify both parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource-dks<strong><strong><strong>jkf,Resource-adf</strong></strong></strong>dss</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>ECS</li>
     * <li>Lingjun</li>
     * <li>ACS</li>
     * <li>FLINK</li>
     * <li>MaxCompute (This resource type is valid only if Option is set to Detach.)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DLC</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteWorkspaceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResourceRequest self = new DeleteWorkspaceResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResourceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteWorkspaceResourceRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public DeleteWorkspaceResourceRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public DeleteWorkspaceResourceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DeleteWorkspaceResourceRequest setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public String getResourceIds() {
        return this.resourceIds;
    }

    public DeleteWorkspaceResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
