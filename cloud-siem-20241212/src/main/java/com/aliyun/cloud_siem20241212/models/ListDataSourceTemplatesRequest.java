// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataSourceTemplatesRequest extends TeaModel {
    @NameInMap("DataSourceTemplateIds")
    public java.util.List<String> dataSourceTemplateIds;

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
