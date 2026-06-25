// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The name of the resource group. To get the resource group name, see <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>A comma-separated list of labels. This operation returns only the resources that have all the specified labels.</p>
     * <p>This parameter is available only for resources whose <code>ResourceTypes</code> is set to <code>ACS</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>system.supported.dsw=true,system.supported.dlc=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The option to query resources. Valid values:</p>
     * <ul>
     * <li><p><code>ListResourceByWorkspace</code> (Default): lists the resources in a workspace.</p>
     * </li>
     * <li><p><code>ListResource</code>: lists the resources of the current user.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ListResourceByWorkspace</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>The page number. The value must be greater than or equal to 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p><strong>Deprecated.</strong> This parameter is deprecated. Use the <code>ResourceType</code> parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductTypes")
    public String productTypes;

    /**
     * <p>A comma-separated list of quota IDs. This operation returns only the resources that are associated with all the specified quota IDs.</p>
     * <blockquote>
     * <p>This parameter is available only for resources whose <code>ResourceTypes</code> is set to <code>ACS</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>quota-k<strong><strong><strong>da,quota-cd</strong></strong></strong>w</p>
     */
    @NameInMap("QuotaIds")
    public String quotaIds;

    /**
     * <p>The resource name. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>The name must be 3 to 28 characters in length.</p>
     * </li>
     * <li><p>The name must be unique within a region.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>resource</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The resource types. Valid values:</p>
     * <ul>
     * <li><p><code>MaxCompute</code>: MaxCompute resources.</p>
     * </li>
     * <li><p><code>ECS</code>: ECS resources.</p>
     * </li>
     * <li><p><code>Lingjun</code>: Lingjun computing resources.</p>
     * </li>
     * <li><p><code>ACS</code>: ACS computing resources.</p>
     * </li>
     * <li><p><code>Flink</code>: Flink resources.</p>
     * </li>
     * <li><p><code>SelfManagedAckPro</code>: self-managed AckPro cluster resources.</p>
     * </li>
     * <li><p><code>SelfManagedAckLingjun</code>: self-managed AckLingjun cluster resources.</p>
     * </li>
     * <li><p><code>SelfManagedASI</code>: self-managed ASI cluster resources from a third-party cloud.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>Specifies whether to return detailed information. The detailed information includes the <code>Quotas</code> field. Valid values:</p>
     * <ul>
     * <li><p><code>true</code> (Default): returns detailed information.</p>
     * </li>
     * <li><p><code>false</code>: does not return detailed information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>A comma-separated list of fields that you want to return. Valid values:</p>
     * <ul>
     * <li><p><code>Quota</code></p>
     * </li>
     * <li><p><code>Label</code></p>
     * </li>
     * <li><p><code>IsDefault</code></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Quota,IsDefault</p>
     */
    @NameInMap("VerboseFields")
    public String verboseFields;

    /**
     * <p>The ID of the workspace. To get the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
     * <ul>
     * <li><p>This parameter is required if <code>Option</code> is set to <code>ListResourceByWorkspace</code>.</p>
     * </li>
     * <li><p>This parameter is not required if <code>Option</code> is set to <code>ListResource</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesRequest self = new ListResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourcesRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListResourcesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListResourcesRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public ListResourcesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListResourcesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourcesRequest setProductTypes(String productTypes) {
        this.productTypes = productTypes;
        return this;
    }
    public String getProductTypes() {
        return this.productTypes;
    }

    public ListResourcesRequest setQuotaIds(String quotaIds) {
        this.quotaIds = quotaIds;
        return this;
    }
    public String getQuotaIds() {
        return this.quotaIds;
    }

    public ListResourcesRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ListResourcesRequest setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public ListResourcesRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

    public ListResourcesRequest setVerboseFields(String verboseFields) {
        this.verboseFields = verboseFields;
        return this;
    }
    public String getVerboseFields() {
        return this.verboseFields;
    }

    public ListResourcesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
