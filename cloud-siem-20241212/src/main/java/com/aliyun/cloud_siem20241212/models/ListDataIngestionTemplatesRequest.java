// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionTemplatesRequest extends TeaModel {
    /**
     * <p>The status of the data ingestion template. Valid values:</p>
     * <ul>
     * <li><p>pending</p>
     * </li>
     * <li><p>running</p>
     * </li>
     * <li><p>success</p>
     * </li>
     * <li><p>failed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("DataIngestionTemplateStatus")
    public String dataIngestionTemplateStatus;

    /**
     * <p>A list of data source template IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas_account_snapshot_log_173326*******</p>
     */
    @NameInMap("DataSourceTemplateIds")
    public String dataSourceTemplateIds;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The product ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <p>The region where the Data Management center of threat analysis is located. You must select a region based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose perspective you want to use. This parameter is available only for administrators.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
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
