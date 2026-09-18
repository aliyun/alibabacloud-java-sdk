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
         * <p>The data encryption algorithm. The supported encryption algorithms include AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Specifies whether to enable data encryption for the project. For more information about data encryption, see
         * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The type of key used for data encryption, including the default key (MaxCompute Default Key) and Bring Your Own Key (BYOK). The default key (MaxCompute Default Key) is a default key created internally by MaxCompute.</p>
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
         * <li><strong>mandatory</strong>: The Lifecycle clause is required. You must configure the lifecycle of a table.</li>
         * <li><strong>optional</strong>: The Lifecycle clause is optional when you create a table. If the lifecycle of a table is not configured, the table is permanently valid.</li>
         * <li><strong>inherit</strong>: If the lifecycle of a table is not configured when you create a table, the lifecycle of the table is set to the value of odps.table.lifecycle.value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The lifecycle of a table. Unit: days. Valid values: 1 to 37231. Default value: 37231.</p>
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
         * <p>Specifies whether to allow full table scans in the project. Full table scans consume a large amount of resources. To improve processing efficiency, this feature is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        @NameInMap("enableDataMasking")
        public Boolean enableDataMasking;

        /**
         * <p>Specifies whether to enable the Decimal data type of MaxCompute 2.0 for the project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        @NameInMap("enableDr")
        public Boolean enableDr;

        /**
         * <p>Specifies whether to enable resource group routing for the data transfer service.</p>
         * <ul>
         * <li>true: The data transfer tasks submitted by this project use the bound data transfer service resource group by default.</li>
         * <li>false: The data transfer tasks submitted by this project use the shared data transfer service resource group by default.</li>
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
         * <p>The number of days to retain backup data. During this period, you can restore the current version to any backed-up data version.
         * Valid values: [0, 30]. Default value: 1. A value of 0 indicates that the backup feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The maximum threshold for a single SQL statement consumption.
         * Unit: scan volume (GB) × complexity.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The lifecycle properties of tables.</p>
         */
        @NameInMap("tableLifecycle")
        public UpdateProjectBasicMetaRequestPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone of the project, which is the <code>odps.sql.timezone</code> property.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/overview-of-dts">Data Transfer Service</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Data Transfer Service</a> resource group bound to the project.</p>
         * <ul>
         * <li><p>Default (shared data transfer service resource group): The project is not allowed to use subscription-based data transfer service resource groups. Regardless of the default data transfer service resource group setting, data transfer tasks submitted by this project automatically use the Default resource group.</p>
         * </li>
         * <li><p>Subscription-based data transfer service resource group: The project is allowed to use subscription-based data transfer service resource groups.</p>
         * </li>
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
         * <li><strong>1</strong>: Edition 1.0</li>
         * <li><strong>2</strong>: Edition 2.0</li>
         * <li><strong>hive</strong>: Hive-compatible type</li>
         * </ul>
         * <p>For more information about the differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>.</p>
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

        public UpdateProjectBasicMetaRequestProperties setEnableDataMasking(Boolean enableDataMasking) {
            this.enableDataMasking = enableDataMasking;
            return this;
        }
        public Boolean getEnableDataMasking() {
            return this.enableDataMasking;
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
