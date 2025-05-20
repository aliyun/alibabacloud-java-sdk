// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListResponseBody extends TeaModel {
    /**
     * <p>The instances.</p>
     */
    @NameInMap("InstanceList")
    public java.util.List<GetLindormInstanceListResponseBodyInstanceList> instanceList;

    /**
     * <p>The number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances that are returned on each page.</p>
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
     * <p>The total number of returned instances.</p>
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
         * <p>The 16-digit AliUid of the Alibaba Cloud account that owns the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>164901546557****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The time when the instance is created. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1631772842000</p>
         */
        @NameInMap("CreateMilliseconds")
        public Long createMilliseconds;

        /**
         * <p>The time when the instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-16 14:13:13</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the column storage engine is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableColumn")
        public Boolean enableColumn;

        /**
         * <p>Indicates whether LDPS is activated for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: LDPS is activated for the instance.</li>
         * <li><strong>false</strong>: LDPS is not activated for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableCompute")
        public Boolean enableCompute;

        /**
         * <p>Indicates whether the LTS engine is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableLts")
        public Boolean enableLts;

        /**
         * <p>Indicates whether the message engine is enabled, returning:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableMessage")
        public Boolean enableMessage;

        /**
         * <p>Indicates whether the table 3.0 storage engine is enabled, returning:</p>
         * <p>true: Enabled. - false: Not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableRow")
        public Boolean enableRow;

        /**
         * <p>Indicates whether the Lindorm streaming engine is activated for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The Lindorm streaming engine is activated for the instance.</li>
         * <li><strong>false</strong>: The Lindorm streaming engine is not activated for the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStream")
        public Boolean enableStream;

        /**
         * <p>Whether the vector engine is enabled, returns:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled. - <strong>false</strong>: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVector")
        public Boolean enableVector;

        /**
         * <p>The engine supported by the instance. The engines are indicated by different numbers:</p>
         * <ul>
         * <li><strong>1</strong>: LindormSearch.</li>
         * <li><strong>2</strong>: LindormTSDB.</li>
         * <li><strong>4</strong>: LindormTable.</li>
         * <li><strong>8</strong>: LindormDFS.</li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter is the sum of all numbers that indicate the engines supported by the instance. For example, if the value of this parameter is 15, which is the sum of 1, 2, 4, and 8, the instance supports all four engines. If the value of this parameter is 6, which is the sum of 2 and 4, the instance supports LindormTSDB and LindormTable.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The time when the instance expires.</p>
         * <blockquote>
         * <p>This parameter is returned only if the billing method of the instance is subscription.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-04-26 00:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The time when the instance expires. This value is a UNIX timestamp that indicates the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1650902400000</p>
         */
        @NameInMap("ExpiredMilliseconds")
        public Long expiredMilliseconds;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceAlias")
        public String instanceAlias;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp17pwu1541ia****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the instance. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The instance is being created.</li>
         * <li><strong>ACTIVATION</strong>: The instance is running.</li>
         * <li><strong>COLD_EXPANDING</strong>: The Capacity storage of the instance is being scaled up.</li>
         * <li><strong>MINOR_VERSION_TRANSING</strong>: The minor version of the instance is being updated.</li>
         * <li><strong>RESIZING</strong>: The nodes in the instance are being scaled up.</li>
         * <li><strong>SHRINKING</strong>: The nodes in the instance are being scaled down.</li>
         * <li><strong>CLASS_CHANGING</strong>: The specification of the instance is being changed.</li>
         * <li><strong>SSL_SWITCHING: SSL</strong>: The SSL configurations of the instance are being changed.</li>
         * <li><strong>CDC_OPENING</strong>: Data subscription is being enabled for the instance.</li>
         * <li><strong>TRANSFER</strong>: The data of the instance is being transferred.</li>
         * <li><strong>DATABASE_TRANSFER</strong>: The data of the instance is being transferred to databases.</li>
         * <li><strong>GUARD_CREATING</strong>: A disaster recovery instance is being created.</li>
         * <li><strong>BACKUP_RECOVERING</strong>: The data of the instance is being restored from a backup.</li>
         * <li><strong>DATABASE_IMPORTING</strong>: Data is being imported to the instance.</li>
         * <li><strong>NET_MODIFYING</strong>: The network configurations of the instance are being changed.</li>
         * <li><strong>NET_SWITCHING</strong>: The network of the instance is being switched between a virtual private cloud (VPC) and the Internet.</li>
         * <li><strong>NET_CREATING</strong>: The connection to the instance is being created.</li>
         * <li><strong>NET_DELETING</strong>: The connection to the instance is being deleted.</li>
         * <li><strong>DELETING</strong>: The instance is being deleted.</li>
         * <li><strong>RESTARTING</strong>: The instance is restarting.</li>
         * <li><strong>LOCKED</strong>: The instance is locked because it expires.</li>
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
         * <li><strong>PREPAY</strong>: subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzledqeat****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The series of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm</strong>: The instance is a Lindorm instance.</li>
         * <li><strong>serverless_lindorm</strong>: The instance is a Lindorm Serverless instance.</li>
         * <li><strong>lindorm_standalone</strong>: The instance is a single-node Lindorm instance.</li>
         * <li><strong>lts</strong>: The instance is an LTS instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The list of tags associated with the specified instances.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetLindormInstanceListResponseBodyInstanceListTags> tags;

        /**
         * <p>The ID of the VPC in which the instance is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1n3i15v90el48nx****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the zone in which the instance is created.</p>
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
