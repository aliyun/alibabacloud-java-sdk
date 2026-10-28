// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyDBClusterSSLRequest extends TeaModel {
    /**
     * <p>The internal or public endpoint for which to create or update a server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-***********.ads.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to enable SSL connection encryption. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSSL")
    public Boolean enableSSL;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SSL operation. This parameter and EnableSSL are mutually exclusive. Valid values:</p>
     * <ul>
     * <li>Enable: Enables SSL.</li>
     * <li>Disable: Disables SSL.</li>
     * <li>Update: Updates the validity period of an enabled SSL certificate and retains the current endpoint bound to the certificate. When you set this parameter to Update, do not specify ConnectionString, or specify an endpoint that is the same as the current endpoint bound to the certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Update</p>
     */
    @NameInMap("SSLEnabled")
    public String SSLEnabled;

    public static ModifyDBClusterSSLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterSSLRequest self = new ModifyDBClusterSSLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterSSLRequest setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public ModifyDBClusterSSLRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterSSLRequest setEnableSSL(Boolean enableSSL) {
        this.enableSSL = enableSSL;
        return this;
    }
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    public ModifyDBClusterSSLRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterSSLRequest setSSLEnabled(String SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public String getSSLEnabled() {
        return this.SSLEnabled;
    }

}
