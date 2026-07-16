// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataConnectorRequest extends TeaModel {
    /**
     * <p>The configuration item ID of the collector access object in the multi-cloud configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>Opera20_Salesforce_Prod</p>
     */
    @NameInMap("AuthConfigId")
    public String authConfigId;

    /**
     * <p>The cloud service to which the authentication configuration belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>salesForceRestAPI</p>
     */
    @NameInMap("AuthConfigProduct")
    public String authConfigProduct;

    /**
     * <p>The authentication vendor name.</p>
     * 
     * <strong>example:</strong>
     * <p>SALESFORCE</p>
     */
    @NameInMap("AuthConfigVendor")
    public String authConfigVendor;

    /**
     * <p>The configuration information of the collector.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;regionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;bucket\&quot;:\&quot;actiontrail-logs-1481501495248334-d776c375\&quot;,\&quot;format\&quot;:{\&quot;type\&quot;:\&quot;JSON\&quot;},\&quot;encoding\&quot;:\&quot;UTF-8\&quot;,\&quot;compressFormat\&quot;:\&quot;autoDetect\&quot;,\&quot;interval\&quot;:\&quot;5m\&quot;}</p>
     */
    @NameInMap("DataConnectorConfig")
    public String dataConnectorConfig;

    /**
     * <p>The collector ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dc-07423146117d77db266f78bc41f4fd80</p>
     */
    @NameInMap("DataConnectorId")
    public String dataConnectorId;

    /**
     * <p>The status of the collector. Valid values:</p>
     * <ul>
     * <li>enabled: enabled.</li>
     * <li>disabled: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DataConnectorStatus")
    public String dataConnectorStatus;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets belong to the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member account that the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataConnectorRequest self = new UpdateDataConnectorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataConnectorRequest setAuthConfigId(String authConfigId) {
        this.authConfigId = authConfigId;
        return this;
    }
    public String getAuthConfigId() {
        return this.authConfigId;
    }

    public UpdateDataConnectorRequest setAuthConfigProduct(String authConfigProduct) {
        this.authConfigProduct = authConfigProduct;
        return this;
    }
    public String getAuthConfigProduct() {
        return this.authConfigProduct;
    }

    public UpdateDataConnectorRequest setAuthConfigVendor(String authConfigVendor) {
        this.authConfigVendor = authConfigVendor;
        return this;
    }
    public String getAuthConfigVendor() {
        return this.authConfigVendor;
    }

    public UpdateDataConnectorRequest setDataConnectorConfig(String dataConnectorConfig) {
        this.dataConnectorConfig = dataConnectorConfig;
        return this;
    }
    public String getDataConnectorConfig() {
        return this.dataConnectorConfig;
    }

    public UpdateDataConnectorRequest setDataConnectorId(String dataConnectorId) {
        this.dataConnectorId = dataConnectorId;
        return this;
    }
    public String getDataConnectorId() {
        return this.dataConnectorId;
    }

    public UpdateDataConnectorRequest setDataConnectorStatus(String dataConnectorStatus) {
        this.dataConnectorStatus = dataConnectorStatus;
        return this;
    }
    public String getDataConnectorStatus() {
        return this.dataConnectorStatus;
    }

    public UpdateDataConnectorRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataConnectorRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
