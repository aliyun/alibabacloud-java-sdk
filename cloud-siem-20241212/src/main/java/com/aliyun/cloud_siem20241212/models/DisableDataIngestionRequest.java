// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DisableDataIngestionRequest extends TeaModel {
    /**
     * <p>The data ingestion ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas_netstat_ingestion_173326*******</p>
     */
    @NameInMap("DataIngestionId")
    public String dataIngestionId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is actually required. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region in which the threat analysis data management center resides. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
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

    public static DisableDataIngestionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDataIngestionRequest self = new DisableDataIngestionRequest();
        return TeaModel.build(map, self);
    }

    public DisableDataIngestionRequest setDataIngestionId(String dataIngestionId) {
        this.dataIngestionId = dataIngestionId;
        return this;
    }
    public String getDataIngestionId() {
        return this.dataIngestionId;
    }

    public DisableDataIngestionRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DisableDataIngestionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DisableDataIngestionRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
