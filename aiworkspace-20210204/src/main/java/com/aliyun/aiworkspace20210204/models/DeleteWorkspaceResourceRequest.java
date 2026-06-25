// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResourceRequest extends TeaModel {
    /**
     * <p>The resource group name. To get the resource group name, see <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>A comma-separated list of labels.</p>
     * 
     * <strong>example:</strong>
     * <p>system.supported.eas=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The deletion behavior. Valid values:</p>
     * <ul>
     * <li><p><code>DetachAndDelete</code> (default): Detaches the resource from the workspace and deletes the resource.</p>
     * </li>
     * <li><p><code>Detach</code>: Detaches the resource from the workspace.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DetachAndDelete</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p><strong>This parameter is deprecated and will be removed. Use the <code>ResourceType</code> parameter instead.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>DLC</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>A comma-separated list of resource IDs. All specified resources must belong to the same <code>GroupName</code>. You must specify a value for at least one of the <code>GroupName</code> or <code>ResourceIds</code> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource-dks<strong><strong><strong>jkf,Resource-adf</strong></strong></strong>dss</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p><code>ECS</code>: general-purpose computing resources</p>
     * </li>
     * <li><p><code>Lingjun</code>: Lingjun intelligent computing resources</p>
     * </li>
     * <li><p><code>ACS</code>: ACS computing resources</p>
     * </li>
     * <li><p><code>Flink</code>: Flink resources.</p>
     * </li>
     * <li><p><code>MaxCompute</code>: MaxCompute resources. For this resource type, the <code>Option</code> parameter can only be set to <code>Detach</code>.</p>
     * </li>
     * <li><p><code>SelfManagedAckPro</code>: AckPro unified management cluster resources</p>
     * </li>
     * <li><p><code>SelfManagedAckLingjun</code>: AckLinjun unified management cluster resources</p>
     * </li>
     * <li><p><code>SelfManagedASI</code>: ASI unified management cluster resources (third-party cloud)</p>
     * </li>
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
