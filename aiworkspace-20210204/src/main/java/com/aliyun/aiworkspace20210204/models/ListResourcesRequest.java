// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListResourcesRequest extends TeaModel {
    /**
     * <p>The name of the resource group. You can call <a href="https://help.aliyun.com/document_detail/449143.html">ListResources</a> to obtain the name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>group</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Tag-based filter conditions. Multiple conditions are separated by commas (,). Only resources that meet all the specified tag-based filter conditions are returned.</p>
     * <p>This parameter is available only for resources whose ProductType is ACS.</p>
     * 
     * <strong>example:</strong>
     * <p>system.supported.dsw=true,system.supported.dlc=true</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The operation to perform. Valid values:</p>
     * <ul>
     * <li>ListResourceByWorkspace: obtains the resources in the workspace. This is the default value.</li>
     * <li>ListResource: obtains the resources of the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ListResourceByWorkspace</p>
     */
    @NameInMap("Option")
    public String option;

    /**
     * <p>The page number. The pages start from page 1. Default value: 1.</p>
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
     * <p>**This field is no longer used and will be removed. Use the ResourceType field instead.</p>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ProductTypes")
    public String productTypes;

    /**
     * <p>The quota IDs, which are separated by commas (,). Only resources that contain all the specified quotas are returned.</p>
     * <blockquote>
     * <p> This parameter is available only for resources whose ResourceTypes is ACS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>quota-k<strong><strong><strong>da,quota-cd</strong></strong></strong>w</p>
     */
    @NameInMap("QuotaIds")
    public String quotaIds;

    /**
     * <p>The resource name. The value must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 3 to 28 characters in length.</li>
     * <li>The name is unique in the region.</li>
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
     * <li>MaxCompute</li>
     * <li>ECS</li>
     * <li>Lingjun</li>
     * <li>ACS</li>
     * <li>FLINK</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxCompute</p>
     */
    @NameInMap("ResourceTypes")
    public String resourceTypes;

    /**
     * <p>Specifies whether to show detailed information, which includes the Quotas field. Valid values:</p>
     * <ul>
     * <li>true (default)</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public Boolean verbose;

    /**
     * <p>The fields to return. Multiple fields are separated by commas (,). Valid values:</p>
     * <ul>
     * <li>Quota</li>
     * <li>Label</li>
     * <li>IsDefault</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Quota,IsDefault</p>
     */
    @NameInMap("VerboseFields")
    public String verboseFields;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * <ul>
     * <li>This parameter is required when the Option parameter is set to ListResourceByWorkspace.</li>
     * <li>You do not need to configure this parameter when the Option parameter is set to ListResource.</li>
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
