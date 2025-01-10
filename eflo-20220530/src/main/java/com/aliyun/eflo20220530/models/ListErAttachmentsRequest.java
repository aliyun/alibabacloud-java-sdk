// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErAttachmentsRequest extends TeaModel {
    /**
     * <p>Whether to automatically receive all routes from all instances under this Lingjun HUB. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: received automatically.</li>
     * <li><strong>false</strong>: Not received.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoReceiveAllRoute")
    public Boolean autoReceiveAllRoute;

    /**
     * <p>Specifies whether to enable paged query. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables paged query.</li>
     * <li><strong>false</strong>: Paged query is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePage")
    public Boolean enablePage;

    /**
     * <p>The ID of the network instance connection</p>
     * 
     * <strong>example:</strong>
     * <p>er-attachment-i1ioibyf</p>
     */
    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    /**
     * <p>The name of the network instance connection.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-209300qha01</p>
     */
    @NameInMap("ErAttachmentName")
    public String erAttachmentName;

    /**
     * <p>The ID of the Lingjun HUB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>er-kkopgtne</p>
     */
    @NameInMap("ErId")
    public String erId;

    /**
     * <p>The ID of the network instance. Valid values: <strong>VPD</strong> and <strong>VCC</strong>.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/444430.html">What is Lingjun?</a></p>
     * <p>You can query <strong>Lingjun CIDR blocks</strong> and <strong>Lingjun connections</strong> by <a href="https://help.aliyun.com/document_detail/2331077.html">ListVpds</a> and <a href="https://help.aliyun.com/document_detail/2399526.html?">ListVccs</a> respectively.</p>
     * 
     * <strong>example:</strong>
     * <p>vcc-cn-209300qha01</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The mitigation plan of the instance. Valid values:</p>
     * <ul>
     * <li><strong>VPD</strong>: indicates the Lingjun CIDR block.</li>
     * <li><strong>VCC</strong>: indicates a Lingjun connection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VCC</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The page number to return. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wulanchabu</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekzb3n5lgk2ieq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The ID of the tenant to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>1111156667137893</p>
     */
    @NameInMap("ResourceTenantId")
    public String resourceTenantId;

    /**
     * <p>The status of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>Available</strong>: Normal.</li>
     * <li><strong>Not Available</strong>: Not available.</li>
     * <li><strong>Executing</strong>: The task is being executed.</li>
     * <li><strong>Deleting</strong>: The account is being deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListErAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListErAttachmentsRequest self = new ListErAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListErAttachmentsRequest setAutoReceiveAllRoute(Boolean autoReceiveAllRoute) {
        this.autoReceiveAllRoute = autoReceiveAllRoute;
        return this;
    }
    public Boolean getAutoReceiveAllRoute() {
        return this.autoReceiveAllRoute;
    }

    public ListErAttachmentsRequest setEnablePage(Boolean enablePage) {
        this.enablePage = enablePage;
        return this;
    }
    public Boolean getEnablePage() {
        return this.enablePage;
    }

    public ListErAttachmentsRequest setErAttachmentId(String erAttachmentId) {
        this.erAttachmentId = erAttachmentId;
        return this;
    }
    public String getErAttachmentId() {
        return this.erAttachmentId;
    }

    public ListErAttachmentsRequest setErAttachmentName(String erAttachmentName) {
        this.erAttachmentName = erAttachmentName;
        return this;
    }
    public String getErAttachmentName() {
        return this.erAttachmentName;
    }

    public ListErAttachmentsRequest setErId(String erId) {
        this.erId = erId;
        return this;
    }
    public String getErId() {
        return this.erId;
    }

    public ListErAttachmentsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListErAttachmentsRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ListErAttachmentsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListErAttachmentsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListErAttachmentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListErAttachmentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListErAttachmentsRequest setResourceTenantId(String resourceTenantId) {
        this.resourceTenantId = resourceTenantId;
        return this;
    }
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }

    public ListErAttachmentsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
