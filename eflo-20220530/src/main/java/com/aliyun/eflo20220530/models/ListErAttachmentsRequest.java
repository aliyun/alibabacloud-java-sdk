// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListErAttachmentsRequest extends TeaModel {
    @NameInMap("AutoReceiveAllRoute")
    public Boolean autoReceiveAllRoute;

    @NameInMap("EnablePage")
    public Boolean enablePage;

    @NameInMap("ErAttachmentId")
    public String erAttachmentId;

    @NameInMap("ErAttachmentName")
    public String erAttachmentName;

    @NameInMap("ErId")
    public String erId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceTenantId")
    public String resourceTenantId;

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
