// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListResponseBody extends TeaModel {
    /**
     * <p>The list of instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<GetLindormInstanceListResponseBodyInstanceList> instanceList;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on the page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CA1FAFD-E8DC-51C2-AA7E-CA6E2D049BA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances found.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static GetLindormInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceListResponseBody self = new GetLindormInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceListResponseBody setInstanceList(java.util.List<GetLindormInstanceListResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<GetLindormInstanceListResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public GetLindormInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLindormInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLindormInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLindormInstanceListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class GetLindormInstanceListResponseBodyInstanceListTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.18</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetLindormInstanceListResponseBodyInstanceListTags build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceListResponseBodyInstanceListTags self = new GetLindormInstanceListResponseBodyInstanceListTags();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceListResponseBodyInstanceListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLindormInstanceListResponseBodyInstanceListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetLindormInstanceListResponseBodyInstanceList extends TeaModel {
        /**
         * <p>The 16-digit ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>164901546557****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The reason why the instance failed to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource is not enough</p>
         */
        @NameInMap("CreateErrorCode")
        public String createErrorCode;

        /**
         * <p>The timestamp of when the instance was created. The value is the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1631772842000</p>
         */
        @NameInMap("CreateMilliseconds")
        public Long createMilliseconds;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-16 14:13:13</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the column store engine is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableColumn")
        public Boolean enableColumn;

        /**
         * <p>Indicates whether the compute engine is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCompute")
        public Boolean enableCompute;

        /**
         * <p>Indicates whether the LTS engine is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLts")
        public Boolean enableLts;

        /**
         * <p>Indicates whether the messaging engine is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableMessage")
        public Boolean enableMessage;

        /**
         * <p>Indicates whether the LindormTable 3.0 engine is enabled. Valid values:</p>
         * <p>true: Enabled.
         * false: Not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRow")
        public Boolean enableRow;

        /**
         * <p>Indicates whether the stream engine is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The stream engine is enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: The stream engine is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStream")
        public Boolean enableStream;

        /**
         * <p>Indicates whether the vector engine is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong>: Not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVector")
        public Boolean enableVector;

        /**
         * <p>The types of engines supported by the instance. The value of this parameter is the sum of the values of the supported engines.</p>
         * <ul>
         * <li><p><strong>1</strong>: search engine.</p>
         * </li>
         * <li><p><strong>2</strong>: LindormTSDB.</p>
         * </li>
         * <li><p><strong>4</strong>: LindormTable.</p>
         * </li>
         * <li><p><strong>8</strong>: file engine.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For example, a value of 15 (8 + 4 + 2 + 1) indicates that the instance supports the file engine, LindormTable, LindormTSDB, and the search engine. A value of 6 (4 + 2) indicates that the instance supports LindormTSDB and LindormTable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The expiration time of the instance.</p>
         * <blockquote>
         * <p>This parameter is returned only for subscription instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The timestamp of when the instance expires. The value is the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1650902400000</p>
         */
        @NameInMap("ExpiredMilliseconds")
        public Long expiredMilliseconds;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp17pwu1541ia****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>CREATING</strong>: The instance is being created.</p>
         * </li>
         * <li><p><strong>ACTIVATION</strong>: The instance is running.</p>
         * </li>
         * <li><p><strong>COLD_EXPANDING</strong>: The capacity of the storage-optimized instance is being expanded.</p>
         * </li>
         * <li><p><strong>MINOR_VERSION_TRANSING</strong>: The minor version of the instance is being upgraded.</p>
         * </li>
         * <li><p><strong>RESIZING</strong>: The instance is scaling up.</p>
         * </li>
         * <li><p><strong>SHRINKING</strong>: The instance is scaling down.</p>
         * </li>
         * <li><p><strong>CLASS_CHANGING</strong>: The instance class is being changed.</p>
         * </li>
         * <li><p><strong>SSL_SWITCHING</strong>: The SSL certificate is being changed.</p>
         * </li>
         * <li><p><strong>CDC_OPENING</strong>: The data subscription feature is being enabled.</p>
         * </li>
         * <li><p><strong>TRANSFER</strong>: Data migration is in progress.</p>
         * </li>
         * <li><p><strong>DATABASE_TRANSFER</strong>: Data is being migrated to the database.</p>
         * </li>
         * <li><p><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</p>
         * </li>
         * <li><p><strong>BACKUP_RECOVERING</strong>: A backup is being restored.</p>
         * </li>
         * <li><p><strong>DATABASE_IMPORTING</strong>: Data is being imported.</p>
         * </li>
         * <li><p><strong>NET_MODIFYING</strong>: The network settings are being modified.</p>
         * </li>
         * <li><p><strong>NET_SWITCHING</strong>: The network type is being switched.</p>
         * </li>
         * <li><p><strong>NET_CREATING</strong>: A network connection is being created.</p>
         * </li>
         * <li><p><strong>NET_DELETING</strong>: A network connection is being deleted.</p>
         * </li>
         * <li><p><strong>DELETING</strong>: The instance is being deleted.</p>
         * </li>
         * <li><p><strong>RESTARTING</strong>: The instance is being restarted.</p>
         * </li>
         * <li><p><strong>LOCKED</strong>: The instance has expired and is locked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVATION</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The storage capacity of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>960</p>
         */
        @NameInMap("InstanceStorage")
        public String instanceStorage;

        /**
         * <p>The network type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>PREPAY</strong>: subscription.</p>
         * </li>
         * <li><p><strong>POSTPAY</strong>: pay-as-you-go.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzledqeat****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li><p><strong>lindorm</strong>: a Lindorm instance.</p>
         * </li>
         * <li><p><strong>serverless_lindorm</strong>: a Lindorm Serverless instance.</p>
         * </li>
         * <li><p><strong>lindorm_standalone</strong>: a Lindorm standalone instance.</p>
         * </li>
         * <li><p><strong>lts</strong>: the Lindorm Tunnel Service type.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetLindormInstanceListResponseBodyInstanceListTags> tags;

        /**
         * <p>The ID of the virtual private cloud (VPC) in which the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1n3i15v90el48nx****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetLindormInstanceListResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceListResponseBodyInstanceList self = new GetLindormInstanceListResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceListResponseBodyInstanceList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetLindormInstanceListResponseBodyInstanceList setCreateErrorCode(String createErrorCode) {
            this.createErrorCode = createErrorCode;
            return this;
        }
        public String getCreateErrorCode() {
            return this.createErrorCode;
        }

        public GetLindormInstanceListResponseBodyInstanceList setCreateMilliseconds(Long createMilliseconds) {
            this.createMilliseconds = createMilliseconds;
            return this;
        }
        public Long getCreateMilliseconds() {
            return this.createMilliseconds;
        }

        public GetLindormInstanceListResponseBodyInstanceList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableColumn(Boolean enableColumn) {
            this.enableColumn = enableColumn;
            return this;
        }
        public Boolean getEnableColumn() {
            return this.enableColumn;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableCompute(Boolean enableCompute) {
            this.enableCompute = enableCompute;
            return this;
        }
        public Boolean getEnableCompute() {
            return this.enableCompute;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableLts(Boolean enableLts) {
            this.enableLts = enableLts;
            return this;
        }
        public Boolean getEnableLts() {
            return this.enableLts;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableMessage(Boolean enableMessage) {
            this.enableMessage = enableMessage;
            return this;
        }
        public Boolean getEnableMessage() {
            return this.enableMessage;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableRow(Boolean enableRow) {
            this.enableRow = enableRow;
            return this;
        }
        public Boolean getEnableRow() {
            return this.enableRow;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableStream(Boolean enableStream) {
            this.enableStream = enableStream;
            return this;
        }
        public Boolean getEnableStream() {
            return this.enableStream;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEnableVector(Boolean enableVector) {
            this.enableVector = enableVector;
            return this;
        }
        public Boolean getEnableVector() {
            return this.enableVector;
        }

        public GetLindormInstanceListResponseBodyInstanceList setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public GetLindormInstanceListResponseBodyInstanceList setExpiredMilliseconds(Long expiredMilliseconds) {
            this.expiredMilliseconds = expiredMilliseconds;
            return this;
        }
        public Long getExpiredMilliseconds() {
            return this.expiredMilliseconds;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceAlias(String instanceAlias) {
            this.instanceAlias = instanceAlias;
            return this;
        }
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetLindormInstanceListResponseBodyInstanceList setInstanceStorage(String instanceStorage) {
            this.instanceStorage = instanceStorage;
            return this;
        }
        public String getInstanceStorage() {
            return this.instanceStorage;
        }

        public GetLindormInstanceListResponseBodyInstanceList setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetLindormInstanceListResponseBodyInstanceList setTags(java.util.List<GetLindormInstanceListResponseBodyInstanceListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetLindormInstanceListResponseBodyInstanceListTags> getTags() {
            return this.tags;
        }

        public GetLindormInstanceListResponseBodyInstanceList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetLindormInstanceListResponseBodyInstanceList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
