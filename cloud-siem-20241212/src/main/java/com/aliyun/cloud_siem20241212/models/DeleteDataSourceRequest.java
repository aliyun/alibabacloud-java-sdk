// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDataSourceRequest extends TeaModel {
    /**
     * <p>The data source ID.</p>
     * <p>Note: This parameter identifies the target of the delete operation and is required. Only data sources with a DataSourceType of custom can be deleted. Data sources of the preset type cannot be deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-txejfbrh94k5cx58a4qh</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required. If it is not provided, the API returns a parameter validation error: &quot;The specified Lang can not be empty.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center for Cloud Threat Detection and Response (CTDR) is located. Select the management center region based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside China.</li>
     * <li>cn-shanghai: The actual data storage region.</li>
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
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceRequest self = new DeleteDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteDataSourceRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteDataSourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDataSourceRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
