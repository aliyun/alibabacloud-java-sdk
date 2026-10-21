// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourceTemplatesRequest extends TeaModel {
    /**
     * <p>The list of data source template IDs.</p>
     */
    @NameInMap("DataSourceTemplateIds")
    public java.util.List<String> dataSourceTemplateIds;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * This parameter is required in practice. If you do not specify this parameter, the API returns a 400 error (The specified Lang can not be empty.). Valid values: zh and en.</li>
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
     * <p>The region where the data management center of the threat analysis feature resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Chinese mainland. Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Outside China. Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataSourceTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceTemplatesRequest self = new ListDataSourceTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceTemplatesRequest setDataSourceTemplateIds(java.util.List<String> dataSourceTemplateIds) {
        this.dataSourceTemplateIds = dataSourceTemplateIds;
        return this;
    }
    public java.util.List<String> getDataSourceTemplateIds() {
        return this.dataSourceTemplateIds;
    }

    public ListDataSourceTemplatesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataSourceTemplatesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListDataSourceTemplatesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListDataSourceTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataSourceTemplatesRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
