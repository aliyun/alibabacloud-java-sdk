// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResourceRequest extends TeaModel {
    /**
     * <p>The name of the resource group. To obtain the name of the resource group, see <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The list of tags, separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>system.supported.eas=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The deletion behavior. Valid values:</p>
     * <ul>
     * <li>DetachAndDelete: Unbinds the resources from the workspace and deletes the resources. This is the default value.</li>
     * <li>Detach: Unbinds the resources from the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DetachAndDelete</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p><strong>[Deprecated]</strong> This field is deprecated and will be retired. Use the ResourceType field.</p>
     * 
     * <strong>example:</strong>
     * <p>DLC</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The IDs of the resources, separated by commas. The GroupName of these resource IDs must be the same. GroupName and ResourceIds cannot be empty at the same time, but both can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource-dks<strong><strong><strong>jkf,Resource-adf</strong></strong></strong>dss</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIds;

    /**
     * <p>The list of resource types. Valid values:</p>
     * <ul>
     * <li>ECS: general computing resources</li>
     * <li>Lingjun: Lingjun AI computing resources</li>
     * <li>ACS: ACS computing resources</li>
     * <li>FLINK: Flink resources</li>
     * <li>MaxCompute: MaxCompute resources. Only the Detach option is supported. The DetachAndDelete option is not supported.</li>
     * <li>SelfManagedAckPro: ACK Pro unified management cluster resources</li>
     * <li>SelfManagedAckLingjun: ACK Lingjun unified management cluster resources</li>
     * <li>SelfManagedASI: ASI unified management cluster resources (third-party cloud)</li>
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
