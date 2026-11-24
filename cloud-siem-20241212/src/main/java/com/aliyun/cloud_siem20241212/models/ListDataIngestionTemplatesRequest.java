// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionTemplatesRequest extends TeaModel {
    @NameInMap("DataIngestionTemplateStatus")
    public String dataIngestionTemplateStatus;

    @NameInMap("DataSourceTemplateIds")
    public String dataSourceTemplateIds;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataIngestionTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionTemplatesRequest self = new ListDataIngestionTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionTemplatesRequest setDataIngestionTemplateStatus(String dataIngestionTemplateStatus) {
        this.dataIngestionTemplateStatus = dataIngestionTemplateStatus;
        return this;
    }
    public String getDataIngestionTemplateStatus() {
        return this.dataIngestionTemplateStatus;
    }

    public ListDataIngestionTemplatesRequest setDataSourceTemplateIds(String dataSourceTemplateIds) {
        this.dataSourceTemplateIds = dataSourceTemplateIds;
        return this;
    }
    public String getDataSourceTemplateIds() {
        return this.dataSourceTemplateIds;
    }

    public ListDataIngestionTemplatesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataIngestionTemplatesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataIngestionTemplatesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataIngestionTemplatesRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListDataIngestionTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataIngestionTemplatesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
