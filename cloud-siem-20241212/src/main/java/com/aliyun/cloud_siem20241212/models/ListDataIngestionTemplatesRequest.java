// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionTemplatesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>running。</p>
     */
    @NameInMap("DataIngestionTemplateStatus")
    public String dataIngestionTemplateStatus;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas_account_snapshot_log_173326*******。</p>
     */
    @NameInMap("DataSourceTemplateIds")
    public String dataSourceTemplateIds;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10。</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas。</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
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
