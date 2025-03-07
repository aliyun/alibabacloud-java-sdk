// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("data")
    public GetProjectResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>040002</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>error message.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>1xx: informational response. The request is received and is being processed.</li>
     * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
     * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
     * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
     * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
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
         * <p>The IP address whitelist for access over the Internet or the network for interconnecting with other Alibaba Cloud services.</p>
         * <blockquote>
         * <p> If you configure only the IP address whitelist for access over the Internet or the network for interconnecting with other Alibaba Cloud services, the access over the Internet or the network for interconnecting with other Alibaba Cloud services is subject to configurations, and access over a virtual private cloud (VPC) is not allowed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.88.111.3</p>
         */
        @NameInMap("ipList")
        public String ipList;

        /**
         * <p>The IP address whitelist for access over a VPC.</p>
         * <blockquote>
         * <p> If you configure only the IP address whitelist for access over a VPC, the access over a VPC is subject to configurations, and the access over the Internet or the network for interconnecting with other Alibaba Cloud services is not allowed.</p>
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
         * <p>The data encryption algorithm that is supported by the key. Valid values: AES256, AESCTR, and RC4.</p>
         * 
         * <strong>example:</strong>
         * <p>SHA1</p>
         */
        @NameInMap("algorithm")
        public String algorithm;

        /**
         * <p>Indicates whether the data encryption feature needs to be enabled for the project. For more information about data encryption, see</p>
         * <p><a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/storage-encryption">Storage encryption</a>.</p>
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
        /**
         * <p>Indicates whether the external project is an external project for <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/lake-warehouse-integrated-2-0-use-guide">data lakehouse solution 2.0</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isExternalCatalogBound")
        public String isExternalCatalogBound;

        public static GetProjectResponseBodyDataPropertiesExternalProjectProperties build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataPropertiesExternalProjectProperties self = new GetProjectResponseBodyDataPropertiesExternalProjectProperties();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataPropertiesExternalProjectProperties setIsExternalCatalogBound(String isExternalCatalogBound) {
            this.isExternalCatalogBound = isExternalCatalogBound;
            return this;
        }
        public String getIsExternalCatalogBound() {
            return this.isExternalCatalogBound;
        }

    }

    public static class GetProjectResponseBodyDataPropertiesStorageTierInfoStorageTierSize extends TeaModel {
        /**
         * <p>The storage usage at the long-term storage tier.</p>
         * 
         * <strong>example:</strong>
         * <p>21764917</p>
         */
        @NameInMap("longTermSize")
        public Long longTermSize;

        /**
         * <p>The storage usage at the Infrequent Access (IA) layer.</p>
         * 
         * <strong>example:</strong>
         * <p>767693</p>
         */
        @NameInMap("lowFrequencySize")
        public Long lowFrequencySize;

        /**
         * <p>The storage usage at the standard storage tier.</p>
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
         * <p>The backup storage usage.</p>
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
         * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">storage tier</a> information.</p>
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
         * <li><strong>mandatory</strong>: The lifecycle clause is required in a table creation statement.</li>
         * <li><strong>optional</strong>: The lifecycle clause is optional in a table creation statement. If you do not configure a lifecycle for a table, the table does not expire.</li>
         * <li><strong>inherit</strong>: If you do not configure a lifecycle for a table when you create the table, the value of the odps.table.lifecycle.value parameter is used as the table lifecycle by default.</li>
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
         * <p>The system triggers an automatic storage tier change N days after the last access time of data. N is specified by this parameter and corresponds to <code>LastAccessTime</code> that is configured for the table or partition.</p>
         * <blockquote>
         * <p> If LastAccessTime of a table or partition is left empty, the following rules are applied:</p>
         * </blockquote>
         * <ul>
         * <li><p>For tables or partitions that you created before October 1, 2023, 2023.10.01 00:00:00 in UTC+0 is considered as the last access time.</p>
         * </li>
         * <li><p>For tables or partitions that you created on or after October 1, 2023, if no data is accessed, the table or partition creation time is considered as the last access time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DaysAfterLastAccessGreaterThan")
        public Long daysAfterLastAccessGreaterThan;

        /**
         * <p>The system triggers an automatic storage tier change N days after the last modification time of data. N is specified by this parameter and corresponds to <code>LastModifiedTime</code> that is configured for the table or partition.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DaysAfterLastModificationGreaterThan")
        public Long daysAfterLastModificationGreaterThan;

        /**
         * <p>The period after the previous storage tier change time.</p>
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
         * <p>The system triggers an automatic storage tier change N days after the last access time of data. N is specified by this parameter and corresponds to <code>LastAccessTime</code> that is configured for the table or partition.</p>
         * <blockquote>
         * <p> If LastAccessTime of a table or partition is left empty, the following rules are applied:</p>
         * </blockquote>
         * <ul>
         * <li><p>For tables or partitions that you created before October 1, 2023, 2023.10.01 00:00:00 in UTC+0 is considered as the last access time.</p>
         * </li>
         * <li><p>For tables or partitions that you created on or after October 1, 2023, if no data is accessed, the table or partition creation time is considered as the last access time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DaysAfterLastAccessGreaterThan")
        public Long daysAfterLastAccessGreaterThan;

        /**
         * <p>The system triggers an automatic storage tier change N days after the last modification time of data. N is specified by this parameter and corresponds to <code>LastModifiedTime</code> that is configured for the table or partition.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("DaysAfterLastModificationGreaterThan")
        public Long daysAfterLastModificationGreaterThan;

        /**
         * <p>The period after the previous storage tier change time.</p>
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
         * <p>The information about the long-term storage tier.</p>
         */
        @NameInMap("TierToLongterm")
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfigTierToLongterm tierToLongterm;

        /**
         * <p>The information about the IA storage tier.</p>
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
         * <p>Indicates whether a full table scan is allowed in the project. A full table scan occupies a large number of resources, which reduces data processing efficiency. By default, the full table scan feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("allowFullScan")
        public Boolean allowFullScan;

        @NameInMap("autoMvQuotaGb")
        public Long autoMvQuotaGb;

        /**
         * <p>The Tunnel parent resource group that is bound to the project. You do not need to pay attention to this group.</p>
         * 
         * <strong>example:</strong>
         * <p>No value</p>
         */
        @NameInMap("elderTunnelQuota")
        public String elderTunnelQuota;

        @NameInMap("enableAutoMv")
        public Boolean enableAutoMv;

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
         * <p>Indicates whether external table caching is forcefully enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableFdcCacheForce")
        public Boolean enableFdcCacheForce;

        /**
         * <p>Indicates whether <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">tiered storage</a> is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enableTieredStorage")
        public Boolean enableTieredStorage;

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
        public GetProjectResponseBodyDataPropertiesEncryption encryption;

        /**
         * <p>The properties of the external project.</p>
         */
        @NameInMap("externalProjectProperties")
        public GetProjectResponseBodyDataPropertiesExternalProjectProperties externalProjectProperties;

        /**
         * <p>The quota for external table caching.</p>
         * 
         * <strong>example:</strong>
         * <p>fdc_quota</p>
         */
        @NameInMap("fdcQuota")
        public String fdcQuota;

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
         * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage">storage tier</a> information.</p>
         */
        @NameInMap("storageTierInfo")
        public GetProjectResponseBodyDataPropertiesStorageTierInfo storageTierInfo;

        /**
         * <p>The table lifecycle properties.</p>
         */
        @NameInMap("tableLifecycle")
        public GetProjectResponseBodyDataPropertiesTableLifecycle tableLifecycle;

        /**
         * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/tiered-storage#f61fc9db76nna">properties of tiered storage lifecycle rules</a>. After you configure the properties, the system triggers automatic switching of storage tiers based on the rules.</p>
         */
        @NameInMap("tableLifecycleConfig")
        public GetProjectResponseBodyDataPropertiesTableLifecycleConfig tableLifecycleConfig;

        /**
         * <p>The time zone that is used by your project. The time zone is the same as the time zone specified by <code>odps.sql.timezone</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        @NameInMap("timezone")
        public String timezone;

        /**
         * <p>The <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/overview-of-dts">Tunnel</a> resource group that is bound to the project.</p>
         * <ul>
         * <li>Default resource group: The Tunnel shared resource group is used. You cannot use the subscription-based Tunnel resource group for the project. The default resource group is automatically used by the Tunnel service of your project, regardless of the parameter setting.</li>
         * <li>Subscription-based Tunnel resource group: You can use the subscription-based Tunnel resource group for the project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quota</p>
         */
        @NameInMap("tunnelQuota")
        public String tunnelQuota;

        /**
         * <p>The data type edition. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute V1.0 data type edition</li>
         * <li><strong>2</strong>: MaxCompute V2.0 data type edition</li>
         * <li><strong>hive</strong>: Hive-compatible data type edition</li>
         * </ul>
         * <p>For more information about the differences among the three data type editions, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/data-type-editions">Data type editions</a>.</p>
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
         * <p>project_name</p>
         */
        @NameInMap("resourceId")
        public String resourceId;

        /**
         * <p>The billing method of the default computing quota.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
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
         * <p>If you enable the project data protection mechanism, you can configure exception or trusted projects. This allows specified users to transfer data of a specified object to a specified project. The project data protection mechanism does not take effect in all the situations that are specified in the exception policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Version&quot;: &quot;1&quot;,
         *     &quot;Statement&quot;:
         *     [{
         *         &quot;Effect&quot;:&quot;Allow&quot;,
         *         &quot;Principal&quot;:&quot;<Principal>&quot;,
         *         &quot;Action&quot;:[&quot;odps:<Action1>[, <Action2>, ...]&quot;],
         *         &quot;Resource&quot;:&quot;acs:odps:*:<Resource>&quot;,
         *         &quot;Condition&quot;:{
         *             &quot;StringEquals&quot;: {
         *                 &quot;odps:TaskType&quot;:[&quot;<Tasktype>&quot;]
         *             }
         *         }
         *     }]
         *     }</p>
         */
        @NameInMap("exceptionPolicy")
        public String exceptionPolicy;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a> is enabled for the project. This allows or denies data transfer across projects. By default, the data protection mechanism is disabled.</p>
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
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">download control</a> feature is enabled. By default, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enableDownloadPrivilege")
        public Boolean enableDownloadPrivilege;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/label-based-access-control">label-based access control</a> feature is enabled. By default, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("labelSecurity")
        public Boolean labelSecurity;

        /**
         * <p>Indicates whether to allow the object creator to have the access permissions on the object. The default value is true, which indicates that the object creator has the access permissions on the object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasAccessPermission")
        public Boolean objectCreatorHasAccessPermission;

        /**
         * <p>Indicates whether the object creator has the authorization permissions on the object. The default value is true, which indicates that the object creator has the authorization permissions on the object.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("objectCreatorHasGrantPermission")
        public Boolean objectCreatorHasGrantPermission;

        /**
         * <p>The properties of the <a href="https://www.alibabacloud.com/help/zh/maxcompute/security-and-compliance/project-data-protection">data protection mechanism</a>.</p>
         */
        @NameInMap("projectProtection")
        public GetProjectResponseBodyDataSecurityPropertiesProjectProtection projectProtection;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/acl-based-access-control">ACL-based access control</a> feature is enabled. By default, this feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("usingAcl")
        public Boolean usingAcl;

        /**
         * <p>Indicates whether the <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/policy-based-access-control-1">policy-based access control</a> feature is enabled. By default, this feature is enabled.</p>
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
         * <p>maxcompute project</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The total storage usage. The storage space that is occupied by your project, which is the logical storage space after your project data is collected and compressed.</p>
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
         * <p>The default computing quota that is used to allocate computing resources. If you do not specify a computing quota for your project, the jobs that are initiated by your project consume the computing resources in the default quota. For more information about how to use computing resources, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/use-of-computing-resources">Use quota groups for computing resources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>quota_a</p>
         */
        @NameInMap("defaultQuota")
        public String defaultQuota;

        /**
         * <p>The information about the IP address whitelist.</p>
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
         * <p>1565950907343451</p>
         */
        @NameInMap("owner")
        public String owner;

        /**
         * <p>The billing method of the default computing quota.</p>
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
         * <p>The instance ID and billing method of the default computing quota.</p>
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
         * <li><strong>AVAILABLE</strong></li>
         * <li><strong>READONLY</strong></li>
         * <li><strong>FROZEN</strong></li>
         * <li><strong>DELETING</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of <code>Super_Administrator</code> role members of the project.</p>
         */
        @NameInMap("superAdmins")
        public java.util.List<String> superAdmins;

        /**
         * <p>Indicates whether data storage by schema is supported. MaxCompute supports the schema feature. This feature allows you to classify objects such as tables, resources, and user-defined functions (UDFs) in a project by schema. You can create multiple schemas in a project. For more information, see <a href="https://www.alibabacloud.com/help/zh/maxcompute/user-guide/schema-related-operations">Schema-related operations</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("threeTierModel")
        public Boolean threeTierModel;

        /**
         * <p>The project type. Valid values:</p>
         * <ul>
         * <li><strong>managed</strong>: internal project</li>
         * <li><strong>external</strong>: external project</li>
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
