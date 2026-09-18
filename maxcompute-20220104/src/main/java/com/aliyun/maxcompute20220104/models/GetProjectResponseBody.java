// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The response result.</p>
     */
    @NameInMap("data")
    public GetProjectResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>This object does not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: Informational response - The request has been received and is being processed.</li>
     * <li>2xx: Success - The request has been successfully received, understood, and accepted by the server.</li>
     * <li>3xx: Redirection - The request has been redirected. Further action is required to complete the request.</li>
     * <li>4xx: Client error - The request contains incorrect parameters, syntax errors, or specific request conditions cannot be met.</li>
     * <li>5xx: Server error - The server is unable to fulfill the request due to other reasons.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0b87b7b316643495896551555e855b</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setData(GetProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectResponseBodyData getData() {
        return this.data;
    }

    public GetProjectResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProjectResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetProjectResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectResponseBodyDataIpWhiteList extends TeaModel {
        /**
         * <p>The IP whitelist for public network and cloud product interconnection network.</p>
         * <blockquote>
         * <p>If only the public network and cloud product interconnection network IP whitelist is configured, access through the public network and cloud product interconnection network is restricted by the configuration, and all VPC network access is prohibited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
         */
        @NameInMap("ipList")
        public String ipList;

        /**
         * <p>The VPC network IP whitelist.</p>
         * <blockquote>
         * <p>If only the VPC network IP whitelist is configured, VPC network access is restricted by the configuration, and all public network and cloud product interconnection network access is prohibited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
         */
        @NameInMap("vpcIpList")
        public String vpcIpList;

        public static GetProjectResponseBodyDataIpWhiteList build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataIpWhiteList self = new GetProjectResponseBodyDataIpWhiteList();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataIpWhiteList setIpList(String ipList) {
            this.ipList = ipList;
            return this;
        }
        public String getIpList() {
            return this.ipList;
        }

        public GetProjectResponseBodyDataIpWhiteList setVpcIpList(String vpcIpList) {
            this.vpcIpList = vpcIpList;
            return this;
        }
        public String getVpcIpList() {
            return this.vpcIpList;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesEncryption extends TeaModel {
        /**
         * <p>The data encryption algorithm. Supported encryption algorithms include AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>AES256</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Whether data encryption is enabled for the project. For more information about data encryption, see
         * &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage Encryption</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The key type used for data encryption, including the default key (MaxCompute Default Key) and Bring Your Own Key (BYOK). The default key (MaxCompute Default Key) is created internally by MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>dafault</p>
         */
        @NameInMap("key")
        public String key;

        public static GetProjectResponseBodyDataPropertiesEncryption build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesEncryption self = new GetProjectResponseBodyDataPropertiesEncryption();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesEncryption setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public GetProjectResponseBodyDataPropertiesEncryption setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetProjectResponseBodyDataPropertiesEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesExternalProjectProperties extends TeaModel {
        @NameInMap("externalCatalogId")
        public String externalCatalogId;

        @NameInMap("foreignServerName")
        public String foreignServerName;

        @NameInMap("foreignServerType")
        public String foreignServerType;

        /**
         * <p>Whether this is a &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Lakehouse 2.0</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">Lakehouse 2.0</a> external project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isExternalCatalogBound")
        public String isExternalCatalogBound;

        @NameInMap("tableFormat")
        public String tableFormat;

        @NameInMap("warehouse")
        public String warehouse;

        public static GetProjectResponseBodyDataPropertiesExternalProjectProperties build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesExternalProjectProperties self = new GetProjectResponseBodyDataPropertiesExternalProjectProperties();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setExternalCatalogId(String externalCatalogId) {
            this.externalCatalogId = externalCatalogId;
            return this;
        }
        public String getExternalCatalogId() {
            return this.externalCatalogId;
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setForeignServerName(String foreignServerName) {
            this.foreignServerName = foreignServerName;
            return this;
        }
        public String getForeignServerName() {
            return this.foreignServerName;
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setForeignServerType(String foreignServerType) {
            this.foreignServerType = foreignServerType;
            return this;
        }
        public String getForeignServerType() {
            return this.foreignServerType;
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setIsExternalCatalogBound(String isExternalCatalogBound) {
            this.isExternalCatalogBound = isExternalCatalogBound;
            return this;
        }
        public String getIsExternalCatalogBound() {
            return this.isExternalCatalogBound;
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setTableFormat(String tableFormat) {
            this.tableFormat = tableFormat;
            return this;
        }
        public String getTableFormat() {
            return this.tableFormat;
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setWarehouse(String warehouse) {
            this.warehouse = warehouse;
            return this;
        }
        public String getWarehouse() {
            return this.warehouse;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize extends TeaModel {
        /**
         * <p>The long-term storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>21764917</p>
         */
        @NameInMap("longTermSize")
        public Long longTermSize;

        /**
         * <p>The infrequent access storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>767693</p>
         */
        @NameInMap("lowFrequencySize")
        public Long lowFrequencySize;

        /**
         * <p>The standard storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>27649172</p>
         */
        @NameInMap("standardSize")
        public Long standardSize;

        public static GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize self = new GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize setLongTermSize(Long longTermSize) {
            this.longTermSize = longTermSize;
            return this;
        }
        public Long getLongTermSize() {
            return this.longTermSize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize setLowFrequencySize(Long lowFrequencySize) {
            this.lowFrequencySize = lowFrequencySize;
            return this;
        }
        public Long getLowFrequencySize() {
            return this.lowFrequencySize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize setStandardSize(Long standardSize) {
            this.standardSize = standardSize;
            return this;
        }
        public Long getStandardSize() {
            return this.standardSize;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesStorageTierInfo extends TeaModel {
        /**
         * <p>The backup storage size.</p>
         * 
         * <strong>example:</strong>
         * <p>86672917</p>
         */
        @NameInMap("projectBackupSize")
        public Long projectBackupSize;

        /**
         * <p>The total storage usage.</p>
         * 
         * <strong>example:</strong>
         * <p>56066037</p>
         */
        @NameInMap("projectTotalSize")
        public Long projectTotalSize;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage">tiered storage</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> information.</p>
         */
        @NameInMap("storageTierSize")
        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize storageTierSize;

        public static GetProjectResponseBodyDataPropertiesStorageTierInfo build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesStorageTierInfo self = new GetProjectResponseBodyDataPropertiesStorageTierInfo();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfo setProjectBackupSize(Long projectBackupSize) {
            this.projectBackupSize = projectBackupSize;
            return this;
        }
        public Long getProjectBackupSize() {
            return this.projectBackupSize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfo setProjectTotalSize(Long projectTotalSize) {
            this.projectTotalSize = projectTotalSize;
            return this;
        }
        public Long getProjectTotalSize() {
            return this.projectTotalSize;
        }

        public GetProjectResponseBodyDataPropertiesStorageTierInfo setStorageTierSize(GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize storageTierSize) {
            this.storageTierSize = storageTierSize;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize getStorageTierSize() {
            return this.storageTierSize;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesTableLifecycle extends TeaModel {
        /**
         * <p>The lifecycle type. Valid values:</p>
         * <ul>
         * <li><strong>mandatory</strong>: The Lifecycle clause is mandatory. Users must set the table lifecycle.</li>
         * <li><strong>optional</strong>: The Lifecycle clause is optional when creating a table. If the table lifecycle is not set, the table is permanently valid.</li>
         * <li><strong>inherit</strong>: If the table lifecycle is not set when creating a table, the table lifecycle defaults to the value of odps.table.lifecycle.value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The table lifecycle in days. Valid values: 1 to 37231. Default value: 37231.</p>
         * 
         * <strong>example:</strong>
         * <p>37231</p>
         */
        @NameInMap("value")
        public String value;

        public static GetProjectResponseBodyDataPropertiesTableLifecycle build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesTableLifecycle self = new GetProjectResponseBodyDataPropertiesTableLifecycle();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycle setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycle setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm extends TeaModel {
        /**
         * <p>The number of days after the last data access before automatic conversion, corresponding to the <code>LastAccessTime</code> of the table or partition.</p>
         * <blockquote>
         * <p>If the LastAccessTime of the table or partition is empty:</p>
         * <ul>
         * <li>For tables or partitions created before October 1, 2023, the default time is 2023.10.01 00:00:00 in the UTC+0 timezone.</li>
         * <li>For tables or partitions created after October 1, 2023, if the data has not been accessed, the CreateTime is used for calculation.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DaysAfterLastAccessGreaterThan")
        public Long daysAfterLastAccessGreaterThan;

        /**
         * <p>The number of days after the last data modification before automatic conversion, corresponding to the <code>LastModifiedTime</code> of the table or partition.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DaysAfterLastModificationGreaterThan")
        public Long daysAfterLastModificationGreaterThan;

        /**
         * <p>The number of days since the last storage tier conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DaysAfterLastTierModificationGreaterThan")
        public Long daysAfterLastTierModificationGreaterThan;

        public static GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm self = new GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm setDaysAfterLastAccessGreaterThan(Long daysAfterLastAccessGreaterThan) {
            this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
            return this;
        }
        public Long getDaysAfterLastAccessGreaterThan() {
            return this.daysAfterLastAccessGreaterThan;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm setDaysAfterLastModificationGreaterThan(Long daysAfterLastModificationGreaterThan) {
            this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
            return this;
        }
        public Long getDaysAfterLastModificationGreaterThan() {
            return this.daysAfterLastModificationGreaterThan;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm setDaysAfterLastTierModificationGreaterThan(Long daysAfterLastTierModificationGreaterThan) {
            this.daysAfterLastTierModificationGreaterThan = daysAfterLastTierModificationGreaterThan;
            return this;
        }
        public Long getDaysAfterLastTierModificationGreaterThan() {
            return this.daysAfterLastTierModificationGreaterThan;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency extends TeaModel {
        /**
         * <p>The number of days after the last data access before automatic conversion, corresponding to the <code>LastAccessTime</code> of the table or partition.</p>
         * <blockquote>
         * <p>If the LastAccessTime of the table or partition is empty:</p>
         * <ul>
         * <li>For tables or partitions created before October 1, 2023, the default time is 2023.10.01 00:00:00 in the UTC+0 timezone.</li>
         * <li>For tables or partitions created after October 1, 2023, if the data has not been accessed, the CreateTime is used for calculation.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DaysAfterLastAccessGreaterThan")
        public Long daysAfterLastAccessGreaterThan;

        /**
         * <p>The number of days after the last data modification before automatic conversion, corresponding to the <code>LastModifiedTime</code> of the table or partition.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DaysAfterLastModificationGreaterThan")
        public Long daysAfterLastModificationGreaterThan;

        /**
         * <p>The number of days since the last storage tier conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DaysAfterLastTierModificationGreaterThan")
        public Long daysAfterLastTierModificationGreaterThan;

        public static GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency self = new GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency setDaysAfterLastAccessGreaterThan(Long daysAfterLastAccessGreaterThan) {
            this.daysAfterLastAccessGreaterThan = daysAfterLastAccessGreaterThan;
            return this;
        }
        public Long getDaysAfterLastAccessGreaterThan() {
            return this.daysAfterLastAccessGreaterThan;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency setDaysAfterLastModificationGreaterThan(Long daysAfterLastModificationGreaterThan) {
            this.daysAfterLastModificationGreaterThan = daysAfterLastModificationGreaterThan;
            return this;
        }
        public Long getDaysAfterLastModificationGreaterThan() {
            return this.daysAfterLastModificationGreaterThan;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency setDaysAfterLastTierModificationGreaterThan(Long daysAfterLastTierModificationGreaterThan) {
            this.daysAfterLastTierModificationGreaterThan = daysAfterLastTierModificationGreaterThan;
            return this;
        }
        public Long getDaysAfterLastTierModificationGreaterThan() {
            return this.daysAfterLastTierModificationGreaterThan;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesTableLifecycleConfig extends TeaModel {
        /**
         * <p>The long-term storage identifier.</p>
         */
        @NameInMap("TierToLongterm")
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm tierToLongterm;

        /**
         * <p>The infrequent access storage identifier.</p>
         */
        @NameInMap("TierToLowFrequency")
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency tierToLowFrequency;

        public static GetProjectResponseBodyDataPropertiesTableLifecycleConfig build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesTableLifecycleConfig self = new GetProjectResponseBodyDataPropertiesTableLifecycleConfig();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfig setTierToLongterm(GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm tierToLongterm) {
            this.tierToLongterm = tierToLongterm;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm getTierToLongterm() {
            return this.tierToLongterm;
        }

        public GetProjectResponseBodyDataPropertiesTableLifecycleConfig setTierToLowFrequency(GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency tierToLowFrequency) {
            this.tierToLowFrequency = tierToLowFrequency;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLowFrequency getTierToLowFrequency() {
            return this.tierToLowFrequency;
        }

    }

    public static class GetProjectResponseBodyDataProperties extends TeaModel {
        /**
         * <p>Whether full table scans are allowed in the project. Full table scans consume significant resources, so this feature is disabled by default to improve processing efficiency.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        @NameInMap("autoMvQuotaGb")
        public Long autoMvQuotaGb;

        /**
         * <p>The parent group of the Data Transfer Service resource group bound to the project (can be ignored).</p>
         * 
         * <strong>example:</strong>
         * <p>Default_p</p>
         */
        @NameInMap("elderTunnelQuota")
        public String elderTunnelQuota;

        @NameInMap("enableAutoMv")
        public Boolean enableAutoMv;

        @NameInMap("enableDataMasking")
        public Boolean enableDataMasking;

        /**
         * <p>Whether the MaxCompute 2.0 Decimal data type is enabled for the project.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableDecimal2")
        public Boolean enableDecimal2;

        @NameInMap("enableDr")
        public Boolean enableDr;

        /**
         * <p>Whether to force enable external table caching.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableFdcCacheForce")
        public Boolean enableFdcCacheForce;

        /**
         * <p>Whether &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage">tiered storage</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableTieredStorage")
        public Boolean enableTieredStorage;

        /**
         * <p>Whether the Data Transfer Service resource group routing is enabled.</p>
         * <ul>
         * <li>true: Data Transfer Service tasks submitted by this project will use the bound Data Transfer Service resource group by default.</li>
         * <li>false: Data Transfer Service tasks submitted by this project will use the Data Transfer Service shared resource group by default.</li>
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
        public GetProjectResponseBodyDataPropertiesEncryption encryption;

        /**
         * <p>The external project properties.</p>
         */
        @NameInMap("externalProjectProperties")
        public GetProjectResponseBodyDataPropertiesExternalProjectProperties externalProjectProperties;

        /**
         * <p>The external table cache quota.</p>
         * 
         * <strong>example:</strong>
         * <p>fdc_quota</p>
         */
        @NameInMap("fdcQuota")
        public String fdcQuota;

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
         * <p>The maximum threshold for single SQL consumption.
         * Unit: scan volume (GB) × complexity.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("sqlMeteringMax")
        public String sqlMeteringMax;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage">tiered storage</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> information.</p>
         */
        @NameInMap("storageTierInfo")
        public GetProjectResponseBodyDataPropertiesStorageTierInfo storageTierInfo;

        /**
         * <p>The lifecycle properties of tables.</p>
         */
        @NameInMap("tableLifecycle")
        public GetProjectResponseBodyDataPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/tiered-storage#f61fc9db76nna">tiered storage lifecycle rules</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage#f61fc9db76nna">tiered storage lifecycle rules</a> properties. After configuration, the system will trigger automatic storage tier conversion based on these rules.</p>
         */
        @NameInMap("tableLifecycleConfig")
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfig tableLifecycleConfig;

        /**
         * <p>The project timezone, which is the <code>odps.sql.timezone</code> property.</p>
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
         * <li><p>Default (Data Transfer Service shared resource group): This project is not allowed to use the Data Transfer Service (subscription) resource group. Regardless of the default Data Transfer Service resource group setting, Data Transfer Service tasks submitted by this project will automatically use the Default resource group.</p>
         * </li>
         * <li><p>Data Transfer Service (subscription) resource group: This project is allowed to use the Data Transfer Service (subscription) resource group.</p>
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
         * <li><strong>1</strong>: Edition 1.0.</li>
         * <li><strong>2</strong>: Edition 2.0.</li>
         * <li><strong>hive</strong>: Hive-compatible type.</li>
         * </ul>
         * <p>For differences among the three data type editions, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data Type Editions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("typeSystem")
        public String typeSystem;

        public static GetProjectResponseBodyDataProperties build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataProperties self = new GetProjectResponseBodyDataProperties();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataProperties setAllowFullScan(Boolean allowFullScan) {
            this.allowFullScan = allowFullScan;
            return this;
        }
        public Boolean getAllowFullScan() {
            return this.allowFullScan;
        }

        public GetProjectResponseBodyDataProperties setAutoMvQuotaGb(Long autoMvQuotaGb) {
            this.autoMvQuotaGb = autoMvQuotaGb;
            return this;
        }
        public Long getAutoMvQuotaGb() {
            return this.autoMvQuotaGb;
        }

        public GetProjectResponseBodyDataProperties setElderTunnelQuota(String elderTunnelQuota) {
            this.elderTunnelQuota = elderTunnelQuota;
            return this;
        }
        public String getElderTunnelQuota() {
            return this.elderTunnelQuota;
        }

        public GetProjectResponseBodyDataProperties setEnableAutoMv(Boolean enableAutoMv) {
            this.enableAutoMv = enableAutoMv;
            return this;
        }
        public Boolean getEnableAutoMv() {
            return this.enableAutoMv;
        }

        public GetProjectResponseBodyDataProperties setEnableDataMasking(Boolean enableDataMasking) {
            this.enableDataMasking = enableDataMasking;
            return this;
        }
        public Boolean getEnableDataMasking() {
            return this.enableDataMasking;
        }

        public GetProjectResponseBodyDataProperties setEnableDecimal2(Boolean enableDecimal2) {
            this.enableDecimal2 = enableDecimal2;
            return this;
        }
        public Boolean getEnableDecimal2() {
            return this.enableDecimal2;
        }

        public GetProjectResponseBodyDataProperties setEnableDr(Boolean enableDr) {
            this.enableDr = enableDr;
            return this;
        }
        public Boolean getEnableDr() {
            return this.enableDr;
        }

        public GetProjectResponseBodyDataProperties setEnableFdcCacheForce(Boolean enableFdcCacheForce) {
            this.enableFdcCacheForce = enableFdcCacheForce;
            return this;
        }
        public Boolean getEnableFdcCacheForce() {
            return this.enableFdcCacheForce;
        }

        public GetProjectResponseBodyDataProperties setEnableTieredStorage(Boolean enableTieredStorage) {
            this.enableTieredStorage = enableTieredStorage;
            return this;
        }
        public Boolean getEnableTieredStorage() {
            return this.enableTieredStorage;
        }

        public GetProjectResponseBodyDataProperties setEnableTunnelQuotaRoute(Boolean enableTunnelQuotaRoute) {
            this.enableTunnelQuotaRoute = enableTunnelQuotaRoute;
            return this;
        }
        public Boolean getEnableTunnelQuotaRoute() {
            return this.enableTunnelQuotaRoute;
        }

        public GetProjectResponseBodyDataProperties setEncryption(GetProjectResponseBodyDataPropertiesEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesEncryption getEncryption() {
            return this.encryption;
        }

        public GetProjectResponseBodyDataProperties setExternalProjectProperties(GetProjectResponseBodyDataPropertiesExternalProjectProperties externalProjectProperties) {
            this.externalProjectProperties = externalProjectProperties;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesExternalProjectProperties getExternalProjectProperties() {
            return this.externalProjectProperties;
        }

        public GetProjectResponseBodyDataProperties setFdcQuota(String fdcQuota) {
            this.fdcQuota = fdcQuota;
            return this;
        }
        public String getFdcQuota() {
            return this.fdcQuota;
        }

        public GetProjectResponseBodyDataProperties setRetentionDays(Long retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }
        public Long getRetentionDays() {
            return this.retentionDays;
        }

        public GetProjectResponseBodyDataProperties setSqlMeteringMax(String sqlMeteringMax) {
            this.sqlMeteringMax = sqlMeteringMax;
            return this;
        }
        public String getSqlMeteringMax() {
            return this.sqlMeteringMax;
        }

        public GetProjectResponseBodyDataProperties setStorageTierInfo(GetProjectResponseBodyDataPropertiesStorageTierInfo storageTierInfo) {
            this.storageTierInfo = storageTierInfo;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesStorageTierInfo getStorageTierInfo() {
            return this.storageTierInfo;
        }

        public GetProjectResponseBodyDataProperties setTableLifecycle(GetProjectResponseBodyDataPropertiesTableLifecycle tableLifecycle) {
            this.tableLifecycle = tableLifecycle;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesTableLifecycle getTableLifecycle() {
            return this.tableLifecycle;
        }

        public GetProjectResponseBodyDataProperties setTableLifecycleConfig(GetProjectResponseBodyDataPropertiesTableLifecycleConfig tableLifecycleConfig) {
            this.tableLifecycleConfig = tableLifecycleConfig;
            return this;
        }
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfig getTableLifecycleConfig() {
            return this.tableLifecycleConfig;
        }

        public GetProjectResponseBodyDataProperties setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }
        public String getTimezone() {
            return this.timezone;
        }

        public GetProjectResponseBodyDataProperties setTunnelQuota(String tunnelQuota) {
            this.tunnelQuota = tunnelQuota;
            return this;
        }
        public String getTunnelQuota() {
            return this.tunnelQuota;
        }

        public GetProjectResponseBodyDataProperties setTypeSystem(String typeSystem) {
            this.typeSystem = typeSystem;
            return this;
        }
        public String getTypeSystem() {
            return this.typeSystem;
        }

    }

    public static class GetProjectResponseBodyDataSaleTag extends TeaModel {
        /**
         * <p>The instance ID of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>b7afb7d1-<strong><strong>-</strong></strong>-****-c393669c307b</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The billing type of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        public static GetProjectResponseBodyDataSaleTag build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataSaleTag self = new GetProjectResponseBodyDataSaleTag();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataSaleTag setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetProjectResponseBodyDataSaleTag setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetProjectResponseBodyDataSecurityPropertiesProjectProtection extends TeaModel {
        /**
         * <p>If project data protection is enabled, you can set exceptions or trusted projects to allow specified users to export data of specified objects to specified projects. All scenarios described in the Exception Policy can override the data protection mechanism.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;Version&quot;: &quot;1&quot;,
         *       &quot;Statement&quot;: [
         *             {
         *                   &quot;Effect&quot;: &quot;Allow&quot;,
         *                   &quot;Principal&quot;: &quot;&quot;,
         *                   &quot;Action&quot;: [
         *                         &quot;odps:[, , ...]&quot;
         *                   ],
         *                   &quot;Resource&quot;: &quot;acs:odps:*:&quot;,
         *                   &quot;Condition&quot;: {
         *                         &quot;StringEquals&quot;: {
         *                               &quot;odps:TaskType&quot;: [
         *                                     &quot;&quot;
         *                               ]
         *                         }
         *                   }
         *             }
         *       ]
         * }</p>
         */
        @NameInMap("exceptionPolicy")
        public String exceptionPolicy;

        /**
         * <p>Whether the project &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> is enabled to prohibit or allow data to flow out of the project. It is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("protected")
        public Boolean _protected;

        public static GetProjectResponseBodyDataSecurityPropertiesProjectProtection build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataSecurityPropertiesProjectProtection self = new GetProjectResponseBodyDataSecurityPropertiesProjectProtection();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection setExceptionPolicy(String exceptionPolicy) {
            this.exceptionPolicy = exceptionPolicy;
            return this;
        }
        public String getExceptionPolicy() {
            return this.exceptionPolicy;
        }

        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection set_protected(Boolean _protected) {
            this._protected = _protected;
            return this;
        }
        public Boolean get_protected() {
            return this._protected;
        }

    }

    public static class GetProjectResponseBodyDataSecurityProperties extends TeaModel {
        /**
         * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/download-control">download control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a> feature is enabled. It is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        /**
         * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature is enabled. It is disabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        /**
         * <p>Whether the object creator is allowed to have access permissions on the object. This is allowed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        /**
         * <p>Whether the object creator is allowed to have grant permissions on the object. This is allowed by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        /**
         * <p>The &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/security-and-compliance/project-data-protection">data protection</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection</a> properties.</p>
         */
        @NameInMap("projectProtection")
        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection projectProtection;

        /**
         * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature is enabled. It is enabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usingAcl")
        public Boolean usingAcl;

        /**
         * <p>Whether the &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature is enabled. It is enabled by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usingPolicy")
        public Boolean usingPolicy;

        public static GetProjectResponseBodyDataSecurityProperties build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataSecurityProperties self = new GetProjectResponseBodyDataSecurityProperties();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataSecurityProperties setEnableDownloadPrivilege(Boolean enableDownloadPrivilege) {
            this.enableDownloadPrivilege = enableDownloadPrivilege;
            return this;
        }
        public Boolean getEnableDownloadPrivilege() {
            return this.enableDownloadPrivilege;
        }

        public GetProjectResponseBodyDataSecurityProperties setLabelSecurity(Boolean labelSecurity) {
            this.labelSecurity = labelSecurity;
            return this;
        }
        public Boolean getLabelSecurity() {
            return this.labelSecurity;
        }

        public GetProjectResponseBodyDataSecurityProperties setObjectCreatorHasAccessPermission(Boolean objectCreatorHasAccessPermission) {
            this.objectCreatorHasAccessPermission = objectCreatorHasAccessPermission;
            return this;
        }
        public Boolean getObjectCreatorHasAccessPermission() {
            return this.objectCreatorHasAccessPermission;
        }

        public GetProjectResponseBodyDataSecurityProperties setObjectCreatorHasGrantPermission(Boolean objectCreatorHasGrantPermission) {
            this.objectCreatorHasGrantPermission = objectCreatorHasGrantPermission;
            return this;
        }
        public Boolean getObjectCreatorHasGrantPermission() {
            return this.objectCreatorHasGrantPermission;
        }

        public GetProjectResponseBodyDataSecurityProperties setProjectProtection(GetProjectResponseBodyDataSecurityPropertiesProjectProtection projectProtection) {
            this.projectProtection = projectProtection;
            return this;
        }
        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection getProjectProtection() {
            return this.projectProtection;
        }

        public GetProjectResponseBodyDataSecurityProperties setUsingAcl(Boolean usingAcl) {
            this.usingAcl = usingAcl;
            return this;
        }
        public Boolean getUsingAcl() {
            return this.usingAcl;
        }

        public GetProjectResponseBodyDataSecurityProperties setUsingPolicy(Boolean usingPolicy) {
            this.usingPolicy = usingPolicy;
            return this;
        }
        public Boolean getUsingPolicy() {
            return this.usingPolicy;
        }

    }

    public static class GetProjectResponseBodyData extends TeaModel {
        /**
         * <p>The project description.</p>
         * 
         * <strong>example:</strong>
         * <p>BI_Analysis</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The total storage size.
         * Views the current storage size of the project. This storage size is consistent with the metering caliber, which is the logical storage size after compression at the Project level.</p>
         * 
         * <strong>example:</strong>
         * <p>16489027</p>
         */
        @NameInMap("costStorage")
        public String costStorage;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1704380838000</p>
         */
        @NameInMap("createdTime")
        public Long createdTime;

        /**
         * <p>The default computing quota.
         * Used to allocate computing resources. If no computing quota is specified, jobs initiated by this project will consume resources from the default quota. For more information about computing resource usage, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/use-of-computing-resources">Computing Resources - Quota Usage</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Computing Resources - Quota Usage</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>os_PayAsYouGoQuota</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The IP whitelist.</p>
         */
        @NameInMap("ipWhiteList")
        public GetProjectResponseBodyDataIpWhiteList ipWhiteList;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>odps_project</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The account information of the project owner.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN$odps****@aliyunid.com</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The billing mode of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        @NameInMap("productType")
        public String productType;

        /**
         * <p>The basic properties of the project.</p>
         */
        @NameInMap("properties")
        public GetProjectResponseBodyDataProperties properties;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The instance ID and billing type of the default computing quota.</p>
         */
        @NameInMap("saleTag")
        public GetProjectResponseBodyDataSaleTag saleTag;

        /**
         * <p>The permission properties.</p>
         */
        @NameInMap("securityProperties")
        public GetProjectResponseBodyDataSecurityProperties securityProperties;

        /**
         * <p>The project status. Valid values:</p>
         * <ul>
         * <li><strong>AVAILABLE</strong>: normal.</li>
         * <li><strong>READONLY</strong>: read-only.</li>
         * <li><strong>FROZEN</strong>: frozen.</li>
         * <li><strong>DELETING</strong>: being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of members with the <code>Super_Administrator</code> role in the project.</p>
         */
        @NameInMap("superAdmins")
        public java.util.List<String> superAdmins;

        /**
         * <p>Whether schema-based storage is supported.
         * MaxCompute supports Schema, which is an object between Project and Table/Resource/UDF for categorizing Tables, Resources, and UDFs. A Project can contain multiple Schemas. For more information, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/maxcompute/user-guide/schema-related-operations">Schema Operations</a>
         * &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema Operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("threeTierModel")
        public Boolean threeTierModel;

        /**
         * <p>The project type. Valid values:</p>
         * <ul>
         * <li><strong>managed</strong>: internal project.</li>
         * <li><strong>external</strong>: external project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>managed</p>
         */
        @NameInMap("type")
        public String type;

        public static GetProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyData self = new GetProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetProjectResponseBodyData setCostStorage(String costStorage) {
            this.costStorage = costStorage;
            return this;
        }
        public String getCostStorage() {
            return this.costStorage;
        }

        public GetProjectResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetProjectResponseBodyData setDefaultQuota(String defaultQuota) {
            this.defaultQuota = defaultQuota;
            return this;
        }
        public String getDefaultQuota() {
            return this.defaultQuota;
        }

        public GetProjectResponseBodyData setIpWhiteList(GetProjectResponseBodyDataIpWhiteList ipWhiteList) {
            this.ipWhiteList = ipWhiteList;
            return this;
        }
        public GetProjectResponseBodyDataIpWhiteList getIpWhiteList() {
            return this.ipWhiteList;
        }

        public GetProjectResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectResponseBodyData setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetProjectResponseBodyData setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public GetProjectResponseBodyData setProperties(GetProjectResponseBodyDataProperties properties) {
            this.properties = properties;
            return this;
        }
        public GetProjectResponseBodyDataProperties getProperties() {
            return this.properties;
        }

        public GetProjectResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetProjectResponseBodyData setSaleTag(GetProjectResponseBodyDataSaleTag saleTag) {
            this.saleTag = saleTag;
            return this;
        }
        public GetProjectResponseBodyDataSaleTag getSaleTag() {
            return this.saleTag;
        }

        public GetProjectResponseBodyData setSecurityProperties(GetProjectResponseBodyDataSecurityProperties securityProperties) {
            this.securityProperties = securityProperties;
            return this;
        }
        public GetProjectResponseBodyDataSecurityProperties getSecurityProperties() {
            return this.securityProperties;
        }

        public GetProjectResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetProjectResponseBodyData setSuperAdmins(java.util.List<String> superAdmins) {
            this.superAdmins = superAdmins;
            return this;
        }
        public java.util.List<String> getSuperAdmins() {
            return this.superAdmins;
        }

        public GetProjectResponseBodyData setThreeTierModel(Boolean threeTierModel) {
            this.threeTierModel = threeTierModel;
            return this;
        }
        public Boolean getThreeTierModel() {
            return this.threeTierModel;
        }

        public GetProjectResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
