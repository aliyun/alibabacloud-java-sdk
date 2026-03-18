// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectBasicMetaRequest extends TeaModel {
    /**
     * <p>The description of the project.</p>
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
         * <p>The encryption algorithm. The key supports algorithms such as AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Specifies whether to enable data encryption for the project. For more information about data encryption, see
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The type of key used for data encryption. This can be the default MaxCompute key or a Bring-Your-Own-Key (BYOK). The default MaxCompute key is created within MaxCompute.</p>
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
         * <li><p><strong>mandatory</strong>: The Lifecycle clause is required. You must set a lifecycle for the table.</p>
         * </li>
         * <li><p><strong>optional</strong>: The Lifecycle clause is optional when you create a table. If you do not set a lifecycle for the table, the table never expires.</p>
         * </li>
         * <li><p><strong>inherit</strong>: If you do not set a lifecycle for the table when you create it, the lifecycle of the table is the value of odps.table.lifecycle.value.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The lifecycle of the table in days. The value must be an integer from 1 to 37231. The default value is 37231.</p>
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
         * <p>Specifies whether to allow full table scans in the project. A full table scan consumes a large amount of resources. To improve processing efficiency, this feature is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        /**
         * <p>Specifies whether to enable the Decimal data type of MaxCompute V2.0 for the project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        @NameInMap("enableDr")
        public Boolean enableDr;

        /**
         * <p>Specifies whether to enable resource group-based routing for Data Transmission Service.</p>
         * <ul>
         * <li><p>true: Data transmission tasks submitted in the project use the attached Data Transmission Service resource group by default.</p>
         * </li>
         * <li><p>false: Data transmission tasks submitted in the project use the shared Data Transmission Service resource group by default.</p>
         * </li>
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
         * <p>The number of days to retain backup data. During this period, you can restore the current version to any backup version.
         * The value must be an integer from 0 to 30. The default value is 1. A value of 0 disables the backup feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("retentionDays")
        public Long retentionDays;

        /**
         * <p>The maximum consumption threshold for a single SQL job.
         * Unit: Scanned data (GB) × Complexity.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The lifecycle properties of the table.</p>
         */
        @NameInMap("tableLifecycle")
        public UpdateProjectBasicMetaRequestPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The time zone of the project. This is the <code>odps.sql.timezone</code> property.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Data Transmission Service</a> resource group attached to the project.</p>
         * <ul>
         * <li><p>Default (shared Data Transmission Service resource group): The project is not allowed to use a subscription Data Transmission Service resource group. Regardless of the value of the default Data Transmission Service resource group, data transmission tasks submitted in the project automatically use the Default resource group.</p>
         * </li>
         * <li><p>Subscription Data Transmission Service resource group: The project is allowed to use a subscription Data Transmission Service resource group.</p>
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
         * <li><p><strong>1</strong>: Edition 1.0</p>
         * </li>
         * <li><p><strong>2</strong>: Edition 2.0</p>
         * </li>
         * <li><p><strong>hive</strong>: Hive-compatible edition</p>
         * </li>
         * </ul>
         * <p>For more information about the differences between the data type editions, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type editions</a>.</p>
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
