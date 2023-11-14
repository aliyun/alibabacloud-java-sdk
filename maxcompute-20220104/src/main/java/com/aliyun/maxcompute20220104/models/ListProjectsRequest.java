// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    @NameInMap("listSystemCatalog")
    public Boolean listSystemCatalog;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     */
    @NameInMap("marker")
    public String marker;

    /**
     * <p>The maximum number of entries returned per page.</p>
     */
    @NameInMap("maxItem")
    public Integer maxItem;

    /**
     * <p>Specifies the marker after which the returned list begins.</p>
     */
    @NameInMap("prefix")
    public String prefix;

    /**
     * <p>The name of the quota. The value of this parameter is the identifier of the quota in MaxCompute, which differs from the quotaNickname parameter. You can configure the quotaNickname parameter. The system automatically generates a value for the quotaName parameter. This parameter is only used to describe the tunnel quota.</p>
     */
    @NameInMap("quotaName")
    public String quotaName;

    /**
     * <p>The name of the quota.</p>
     */
    @NameInMap("quotaNickName")
    public String quotaNickName;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("region")
    public String region;

    /**
     * <p>The identifier of an object in a MaxCompute quota. This identifier is the same as the identifier in the sales bill of Alibaba Cloud. This parameter is used for tags.</p>
     */
    @NameInMap("saleTags")
    public String saleTags;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The project type. Valid values: external and managed. The value external indicates an external project, which is used in the data lakehouse solution. The value managed indicates an internal project.</p>
     */
    @NameInMap("type")
    public String type;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setListSystemCatalog(Boolean listSystemCatalog) {
        this.listSystemCatalog = listSystemCatalog;
        return this;
    }
    public Boolean getListSystemCatalog() {
        return this.listSystemCatalog;
    }

    public ListProjectsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public ListProjectsRequest setMaxItem(Integer maxItem) {
        this.maxItem = maxItem;
        return this;
    }
    public Integer getMaxItem() {
        return this.maxItem;
    }

    public ListProjectsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

    public ListProjectsRequest setQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }
    public String getQuotaName() {
        return this.quotaName;
    }

    public ListProjectsRequest setQuotaNickName(String quotaNickName) {
        this.quotaNickName = quotaNickName;
        return this;
    }
    public String getQuotaNickName() {
        return this.quotaNickName;
    }

    public ListProjectsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListProjectsRequest setSaleTags(String saleTags) {
        this.saleTags = saleTags;
        return this;
    }
    public String getSaleTags() {
        return this.saleTags;
    }

    public ListProjectsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ListProjectsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
