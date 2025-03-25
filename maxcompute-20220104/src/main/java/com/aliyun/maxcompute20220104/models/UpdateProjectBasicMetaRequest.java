// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectBasicMetaRequest extends TeaModel {
    /**
     * <p>The project description.</p>
     * 
     * <strong>example:</strong>
     * <p>BI_Analysis</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The basic properties of the project.</p>
     */
    @NameInMap("properties")
    public UpdateProjectBasicMetaRequestProperties properties;

    public static UpdateProjectBasicMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectBasicMetaRequest self = new UpdateProjectBasicMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProjectBasicMetaRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateProjectBasicMetaRequest setProperties(UpdateProjectBasicMetaRequestProperties properties) {
        this.properties = properties;
        return this;
    }
    public UpdateProjectBasicMetaRequestProperties getProperties() {
        return this.properties;
    }

    public static class UpdateProjectBasicMetaRequestPropertiesEncryption extends TeaModel {
        /**
         * <p>The data encryption algorithm that is supported by the key. Valid values: AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Indicates whether the data encryption feature needs to be enabled for the project. For more information about data encryption, see
         * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The type of key that is used for data encryption. You can select MaxCompute Default Key or Bring Your Own Key (BYOK) as the key type. If you select MaxCompute Default Key, the default key that is created by MaxCompute is used.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("key")
        public String key;

        public static UpdateProjectBasicMetaRequestPropertiesEncryption build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectBasicMetaRequestPropertiesEncryption self = new UpdateProjectBasicMetaRequestPropertiesEncryption();
            return TeaModel.build(map, self);
        }

        public UpdateProjectBasicMetaRequestPropertiesEncryption setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public UpdateProjectBasicMetaRequestPropertiesEncryption setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public UpdateProjectBasicMetaRequestPropertiesEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class UpdateProjectBasicMetaRequestPropertiesTableLifecycle extends TeaModel {
        /**
         * <p>The lifecycle type. Valid values:</p>
         * <ul>
         * <li><em>mandatory</em>: The lifecycle clause is required in a table creation statement.</li>
         * <li><em>optional</em>: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire.</li>
         * <li><em>inherit</em>: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used as the table lifecycle by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The table lifecycle. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
         * 
         * <strong>example:</strong>
         * <p>37231</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateProjectBasicMetaRequestPropertiesTableLifecycle build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectBasicMetaRequestPropertiesTableLifecycle self = new UpdateProjectBasicMetaRequestPropertiesTableLifecycle();
            return TeaModel.build(map, self);
        }

        public UpdateProjectBasicMetaRequestPropertiesTableLifecycle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateProjectBasicMetaRequestPropertiesTableLifecycle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateProjectBasicMetaRequestProperties extends TeaModel {
        /**
         * <p>Indicates whether a full table scan is allowed in the project. A full table scan occupies a large number of resources, which reduces data processing efficiency. By default, the full table scan feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Indicates whether the DECIMAL type of the MaxCompute V2.0 data type edition is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        @NameInMap("enableDr")
        public Boolean enableDr;

        /**
         * <p>Indicates whether the routing of the Tunnel resource group is enabled.</p>
         * <ul>
         * <li>true: The data transfer tasks that are submitted by the project by default use the Tunnel resource group that is bound to the project.</li>
         * <li>false: The data transfer tasks that are submitted by the project by default use the Tunnel shared resource group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableTunnelQuotaRoute")
        public Boolean enableTunnelQuotaRoute;

        /**
         * <p>The storage encryption properties.</p>
         */
        @NameInMap("encryption")
        public UpdateProjectBasicMetaRequestPropertiesEncryption encryption;

        /**
         * <p>The retention period for backup data. Unit: days. During the retention period, you can restore data of the version in use to the backup data of any version. Valid values: [0,30]. Default value: 1. The value 0 indicates that the backup feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The maximum consumption threshold of a single SQL statement. Formula: Amount of scanned data (GB) × Complexity.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The table lifecycle properties.</p>
         */
        @NameInMap("tableLifecycle")
        public UpdateProjectBasicMetaRequestPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone that is used by your project. The time zone is the same as the time zone specified by <code>odps.sql.timezone</code> .</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/overview-of-dts">Data Transmission Service</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Data Transmission Service</a> resource group that is bound to the project.</p>
         * <ul>
         * <li>Default resource group: The Tunnel shared resource group is used. You cannot use the subscription-based Tunnel resource group for the project. The default resource group is automatically used by the Tunnel service of your project, regardless of the parameter setting.</li>
         * <li>Subscription-based Tunnel resource group: You can use the subscription-based Tunnel resource group for the project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        /**
         * <p>The data type edition. Valid values:</p>
         * <ul>
         * <li><em>1</em>: MaxCompute V1.0 data type edition</li>
         * <li><em>2</em>: MaxCompute V2.0 data type edition</li>
         * <li><em>hive</em>: Hive-compatible data type edition
         * For more information about the differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/data-type-editions">Data Type Versions</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data Type Versions</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("typeSystem")
        public String typeSystem;

        public static UpdateProjectBasicMetaRequestProperties build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectBasicMetaRequestProperties self = new UpdateProjectBasicMetaRequestProperties();
            return TeaModel.build(map, self);
        }

        public UpdateProjectBasicMetaRequestProperties setAllowFullScan(Boolean allowFullScan) {
            this.allowFullScan = allowFullScan;
            return this;
        }
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        public UpdateProjectBasicMetaRequestProperties setEnableDecimal2(Boolean enableDecimal2) {
            this.enableDecimal2 = enableDecimal2;
            return this;
        }
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        public UpdateProjectBasicMetaRequestProperties setEnableDr(Boolean enableDr) {
            this.enableDr = enableDr;
            return this;
        }
        public Boolean getEnableDr() {
            return this.enableDr;
        }

        public UpdateProjectBasicMetaRequestProperties setEnableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
            this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
            return this;
        }
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        public UpdateProjectBasicMetaRequestProperties setEncryption(UpdateProjectBasicMetaRequestPropertiesEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public UpdateProjectBasicMetaRequestPropertiesEncryption getEncryption() {
            return this.encryption;
        }

        public UpdateProjectBasicMetaRequestProperties setRetentionDays(Long retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        public UpdateProjectBasicMetaRequestProperties setSqlMeteringMax(String sqlMeteringMax) {
            this.sqlMeteringMax = sqlMeteringMax;
            return this;
        }
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        public UpdateProjectBasicMetaRequestProperties setTableLifecycle(UpdateProjectBasicMetaRequestPropertiesTableLifecycle tableLifecycle) {
            this.tableLifecycle = tableLifecycle;
            return this;
        }
        public UpdateProjectBasicMetaRequestPropertiesTableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        public UpdateProjectBasicMetaRequestProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public UpdateProjectBasicMetaRequestProperties setTunnelQuota(String tunnelQuota) {
            this.tunnelQuota = tunnelQuota;
            return this;
        }
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        public UpdateProjectBasicMetaRequestProperties setTypeSystem(String typeSystem) {
            this.typeSystem = typeSystem;
            return this;
        }
        public String getTypeSystem() {
            return this.typeSystem;
        }

    }

}
