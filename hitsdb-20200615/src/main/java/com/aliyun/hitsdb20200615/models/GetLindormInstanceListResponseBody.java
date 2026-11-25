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
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CA1FAFD-E8DC-51C2-AA7E-CA6E2D049BA0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances returned.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <p>The 16-character AliUid of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>164901546557****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The cause of the creation failure.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource is not enough</p>
         */
        @NameInMap("CreateErrorCode")
        public String createErrorCode;

        /**
         * <p>The number of milliseconds between the instance creation time and 00:00:00 on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1631772842000</p>
         */
        @NameInMap("CreateMilliseconds")
        public Long createMilliseconds;

        /**
         * <p>The creation time of the instance. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-16 14:13:13</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the column store engine is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
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
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCompute")
        public Boolean enableCompute;

        /**
         * <p>Indicates whether Lindorm Tunnel Service (LTS) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLts")
        public Boolean enableLts;

        /**
         * <p>Indicates whether the message engine is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableMessage")
        public Boolean enableMessage;

        /**
         * <p>Indicates whether LindormTable 3.0 is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRow")
        public Boolean enableRow;

        /**
         * <p>Indicates whether the streaming engine is enabled for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The streaming engine is enabled.</li>
         * <li><strong>false</strong>: The streaming engine is not enabled.</li>
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
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVector")
        public Boolean enableVector;

        /**
         * <p>The engine types supported by the instance. The return value is the sum of the following engine type values:</p>
         * <ul>
         * <li><strong>1</strong>: Search engine</li>
         * <li><strong>2</strong>: LindormTSDB</li>
         * <li><strong>4</strong>: LindormTable</li>
         * <li><strong>8</strong>: File engine</li>
         * </ul>
         * <blockquote>
         * <p>For example, if the value is 15 (15 = 8 + 4 + 2 + 1), the instance supports the search engine, LindormTSDB, LindormTable, and file engine. If the value is 6 (6 = 4 + 2), the instance supports LindormTSDB and LindormTable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The expiration time of the instance. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
         * <blockquote>
         * <p>This parameter is returned only when the billing method of the instance is subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The number of milliseconds between the time when the instance expires and 00:00:00 on January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1650902400000</p>
         */
        @NameInMap("ExpiredMilliseconds")
        public Long expiredMilliseconds;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp17pwu1541ia****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance status. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: Creating.</li>
         * <li><strong>ACTIVATION</strong>: Running.</li>
         * <li><strong>COLD_EXPANDING</strong>: Performing storage expansion for storage-optimized cloud storage.</li>
         * <li><strong>MINOR_VERSION_TRANSING</strong>: Upgrading the minor version.</li>
         * <li><strong>RESIZING</strong>: Scaling out nodes.</li>
         * <li><strong>SHRINKING</strong>: Scaling in nodes.</li>
         * <li><strong>CLASS_CHANGING</strong>: Upgrading or downgrading specifications.</li>
         * <li><strong>SSL_SWITCHING</strong>: Modifying SSL configurations.</li>
         * <li><strong>CDC_OPENING</strong>: Enabling the data subscription feature.</li>
         * <li><strong>TRANSFER</strong>: Migrating data.</li>
         * <li><strong>DATABASE_TRANSFER</strong>: Migrating data to the database.</li>
         * <li><strong>GUARD_CREATING</strong>: Creating a disaster recovery instance.</li>
         * <li><strong>BACKUP_RECOVERING</strong>: Restoring from a backup.</li>
         * <li><strong>DATABASE_IMPORTING</strong>: Importing data.</li>
         * <li><strong>NET_MODIFYING</strong>: Modifying network configurations.</li>
         * <li><strong>NET_SWITCHING</strong>: Switching between the internal network and the Internet.</li>
         * <li><strong>NET_CREATING</strong>: Creating a network connection.</li>
         * <li><strong>NET_DELETING</strong>: Performing a delete operation on the network connection.</li>
         * <li><strong>DELETING</strong>: Performing a delete operation.</li>
         * <li><strong>RESTARTING</strong>: Restarting.</li>
         * <li><strong>LOCKED</strong>: Locked because the instance has expired.</li>
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
         * <li><strong>PREPAY</strong>: Subscription</li>
         * <li><strong>POSTPAY</strong>: Pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzledqeat****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>lindorm</strong>: Lindorm instance</li>
         * <li><strong>serverless_lindorm</strong>: Lindorm Serverless instance</li>
         * <li><strong>lindorm_standalone</strong>: Lindorm single-node instance</li>
         * <li><strong>lts</strong>: Lindorm Tunnel Service</li>
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
         * <p>The VPC ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1n3i15v90el48nx****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The zone ID.</p>
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
