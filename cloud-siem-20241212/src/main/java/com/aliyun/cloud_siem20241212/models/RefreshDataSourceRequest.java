// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class RefreshDataSourceRequest extends TeaModel {
    /**
     * <p>The data source ID. This parameter is required in actual API calls. If it is not provided, the service returns a 400 error.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-jl67vixpe1scwysgyu3x</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The language of the received messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error: &quot;The specified Lang can not be empty.&quot; Pass the language code explicitly.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center for threat analysis is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: assets in the Chinese mainland and Hong Kong (China)</li>
     * <li>ap-southeast-1: assets in regions outside China</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID that the administrator uses to switch to the view of another member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static RefreshDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshDataSourceRequest self = new RefreshDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public RefreshDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public RefreshDataSourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public RefreshDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RefreshDataSourceRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
