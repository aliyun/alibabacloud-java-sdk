// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>The information about the cluster.</p>
     */
    @NameInMap("DBCluster")
    public DescribeDBClusterAttributeResponseBodyDBCluster DBCluster;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05321590-BB65-4720-8CB6-8218E041CDD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBClusterAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAttributeResponseBody self = new DescribeDBClusterAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAttributeResponseBody setDBCluster(DescribeDBClusterAttributeResponseBodyDBCluster DBCluster) {
        this.DBCluster = DBCluster;
        return this;
    }
    public DescribeDBClusterAttributeResponseBodyDBCluster getDBCluster() {
        return this.DBCluster;
    }

    public DescribeDBClusterAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus extends TeaModel {
        /**
         * <p>The progress of the data migration task in percentage.</p>
         * <blockquote>
         * <p> This parameter is returned only when the cluster is in the SCALING_OUT state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The progress of the data migration task. This value is displayed in the following format: Data volume that has been migrated/Total data volume.</p>
         * <blockquote>
         * <p> This parameter is returned only when the cluster is in the SCALING_OUT state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0MB/60469MB</p>
         */
        @NameInMap("Ratio")
        public String ratio;

        public static DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus self = new DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBClusterTagsTag extends TeaModel {
        /**
         * <p>The tag name.</p>
         * 
         * <strong>example:</strong>
         * <p>department</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>it</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeDBClusterAttributeResponseBodyDBClusterTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBClusterTagsTag self = new DescribeDBClusterAttributeResponseBodyDBClusterTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBClusterTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeDBClusterAttributeResponseBodyDBClusterTagsTag> tag;

        public static DescribeDBClusterAttributeResponseBodyDBClusterTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBClusterTags self = new DescribeDBClusterAttributeResponseBodyDBClusterTags();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBClusterTags setTag(java.util.List<DescribeDBClusterAttributeResponseBodyDBClusterTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeDBClusterAttributeResponseBodyDBClusterTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeDBClusterAttributeResponseBodyDBCluster extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        @NameInMap("AppointmentElectZookeeperDisableWrite")
        public Boolean appointmentElectZookeeperDisableWrite;

        @NameInMap("AppointmentElectZookeeperTime")
        public String appointmentElectZookeeperTime;

        @NameInMap("AppointmentRestartNodeList")
        public String appointmentRestartNodeList;

        @NameInMap("AppointmentRestartNodeTime")
        public String appointmentRestartNodeTime;

        /**
         * <p>The scheduled restart time. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-06T12:00:00Z</p>
         */
        @NameInMap("AppointmentRestartTime")
        public String appointmentRestartTime;

        /**
         * <p>The major engine versions available for upgrades.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MajorVersion&quot;:&quot;MinorVersion&quot;}</p>
         */
        @NameInMap("AvailableUpgradeMajorVersion")
        public java.util.Map<String, ?> availableUpgradeMajorVersion;

        /**
         * <p>The site ID. Valid values:</p>
         * <ul>
         * <li><strong>26842</strong>: the China site (aliyun.com)</li>
         * <li><strong>26888</strong>: the international site (alibabacloud.com)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: Single-replica Edition</li>
         * <li><strong>HighAvailability</strong>: Double-replica Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The commodity code of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>clickhouse_go_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The VPC endpoint of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1qx68m06981****.ads.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The version of the ApsaraDB for ClickHouse console that is used to manage the cluster. Valid values:</p>
         * <ul>
         * <li><strong>v1</strong></li>
         * <li><strong>v2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("ControlVersion")
        public String controlVersion;

        /**
         * <p>The time when the cluster was created. The value is in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-13T11:33:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        @NameInMap("DBClusterDescription")
        public String DBClusterDescription;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        @NameInMap("DBClusterId")
        public String DBClusterId;

        /**
         * <p>The network type of the cluster. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The cluster state. Valid values:</p>
         * <ul>
         * <li><strong>Preparing</strong>: The cluster is being prepared.</li>
         * <li><strong>Creating</strong>: The cluster is being created.</li>
         * <li><strong>Running</strong>: The cluster is running.</li>
         * <li><strong>Deleting</strong>: The cluster is being deleted.</li>
         * <li><strong>SCALING_OUT</strong>: The storage capacity of the cluster is being expanded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Common</strong>: a common cluster</li>
         * <li><strong>Readonly</strong>: a read-only cluster</li>
         * <li><strong>Guard</strong>: a disaster recovery cluster</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("DBClusterType")
        public String DBClusterType;

        /**
         * <p>The specifications of the cluster.</p>
         * <ul>
         * <li><p>Valid values when the cluster is of Single-replica Edition:</p>
         * <ul>
         * <li><strong>S4-NEW</strong></li>
         * <li><strong>S8</strong></li>
         * <li><strong>S16</strong></li>
         * <li><strong>S32</strong></li>
         * <li><strong>S64</strong></li>
         * <li><strong>S104</strong></li>
         * </ul>
         * </li>
         * <li><p>Valid values when the cluster is of Double-replica Edition:</p>
         * <ul>
         * <li><strong>C4-NEW</strong></li>
         * <li><strong>C8</strong></li>
         * <li><strong>C16</strong></li>
         * <li><strong>C32</strong></li>
         * <li><strong>C64</strong></li>
         * <li><strong>C104</strong></li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>C8</p>
         */
        @NameInMap("DBNodeClass")
        public String DBNodeClass;

        /**
         * <p>The number of nodes.</p>
         * <ul>
         * <li>Valid values when the cluster is of Single-replica Edition: 1 to 48.</li>
         * <li>Valid values when the cluster is of Double-replica Edition: 1 to 24.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        /**
         * <p>The storage capacity of a single node of the cluster. Unit: GB.</p>
         * <p>Valid values: 100 to 32000.</p>
         * <blockquote>
         * <p> This value is a multiple of 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The Key Management Service (KMS) key that is used to encrypt data.</p>
         * <blockquote>
         * <p> If the value of the EncryptionType parameter is off, an empty string is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>685f416f-87c9-4554-8d3a-75b6ce25****</p>
         */
        @NameInMap("EncryptionKey")
        public String encryptionKey;

        /**
         * <p>The encryption type. Valid values:</p>
         * <ul>
         * <li><strong>CloudDisk</strong>: Disk encryption is enabled.</li>
         * <li><strong>off</strong>: Data is not encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudDisk</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The type of the database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ClickHouse</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The latest minor version to which the cluster can be updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1.34.0</p>
         */
        @NameInMap("EngineLatestMinorVersion")
        public String engineLatestMinorVersion;

        /**
         * <p>The current minor version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.0</p>
         */
        @NameInMap("EngineMinorVersion")
        public String engineMinorVersion;

        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>21.8.10.19</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The time when the cluster expired. The time is in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <blockquote>
         * <p> Pay-as-you-go clusters never expire. If the cluster is a pay-as-you-go cluster, an empty string is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-11-11T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The extended storage space. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ExtStorageSize")
        public Integer extStorageSize;

        /**
         * <p>The extended storage type. Valid values:</p>
         * <ul>
         * <li><strong>CloudESSD</strong>: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.</li>
         * <li><strong>CloudESSD_PL2</strong>: The cluster uses an ESSD of PL 2.</li>
         * <li><strong>CloudESSD_PL3</strong>: The cluster uses an ESSD of PL 3.</li>
         * <li><strong>CloudEfficiency</strong>: The cluster uses an ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudESSD</p>
         */
        @NameInMap("ExtStorageType")
        public String extStorageType;

        /**
         * <p>Indicates whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsExpired")
        public String isExpired;

        @NameInMap("LbKind")
        public String lbKind;

        /**
         * <p>The lock mode of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Unlock</strong>: The cluster is not locked.</li>
         * <li><strong>ManualLock</strong>: The cluster is manually locked.</li>
         * <li><strong>LockByExpiration</strong>: The cluster is automatically locked due to cluster expiration.</li>
         * <li><strong>LockByRestoration</strong>: The cluster is automatically locked because the cluster is about to be rolled back.</li>
         * <li><strong>LockByDiskQuota</strong>: The cluster is automatically locked because the disk space is exhausted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The cause why the cluster was locked.</p>
         * <blockquote>
         * <p> If the value of the LockMode parameter is Unlock, an empty string is returned for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DISK_FULL</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The update type. If the value of the parameter is <strong>false</strong>, it indicates a manual update.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MaintainAutoType")
        public Boolean maintainAutoType;

        /**
         * <p>The maintenance window of the cluster. The value is in the HH:mmZ-HH:mmZ format. The time is displayed in UTC.</p>
         * <p>For example, if you set the maintenance window to 00:00Z-01:00Z, the cluster can be maintained from 08:00 (UTC+8) to 09:00 (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>00:00Z-01:00Z</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The billing method of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: indicates the pay-as-you-go billing method.</li>
         * <li><strong>Prepaid</strong>: indicates the subscription billing method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The HTTP port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8123</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1199ya710s7****.public.clickhouse.ads.aliyuncs.com</p>
         */
        @NameInMap("PublicConnectionString")
        public String publicConnectionString;

        /**
         * <p>The IP address that is used to connect to the cluster over the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>121.40.xx.xx</p>
         */
        @NameInMap("PublicIpAddr")
        public String publicIpAddr;

        /**
         * <p>The TCP port number in the public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("PublicPort")
        public String publicPort;

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
         * <p>rg-acfmyf65je6****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the data migration task.</p>
         */
        @NameInMap("ScaleOutStatus")
        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus scaleOutStatus;

        /**
         * <p>The storage type of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>CloudESSD</strong>: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.</li>
         * <li><strong>CloudESSD_PL2</strong>: The cluster uses an ESSD of PL 2.</li>
         * <li><strong>CloudESSD_PL3</strong>: The cluster uses an ESSD of PL 3.</li>
         * <li><strong>CloudEfficiency</strong>: The cluster uses an ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudESSD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>Indicates whether data backup is supported. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Data backup is supported.</li>
         * <li><strong>2</strong>: Data backup is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportBackup")
        public Integer supportBackup;

        /**
         * <p>Indicates whether HTTPS ports are supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportHttpsPort")
        public Boolean supportHttpsPort;

        /**
         * <p>Indicates whether the cluster supports a MySQL port. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A MySQL port is supported.</li>
         * <li><strong>false</strong>: A MySQL port is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportMysqlPort")
        public Boolean supportMysqlPort;

        /**
         * <p>Indicates whether tiered storage of hot data and cold data is supported. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Tiered storage of hot data and cold data is supported.</li>
         * <li><strong>2</strong>: Tiered storage of hot data and cold data is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportOss")
        public Integer supportOss;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public DescribeDBClusterAttributeResponseBodyDBClusterTags tags;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1n874li1t5y57wi****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC in which the cluster is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10tr8k9qasioaty****</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10tr8k9qasioaty****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IP address that is used to connect to the cluster over the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("VpcIpAddr")
        public String vpcIpAddr;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>The list of vSwitch IDs in multi-zone clusters.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f: vsw-zm0n42d5vvuo****</p>
         */
        @NameInMap("ZoneIdVswitchMap")
        public java.util.Map<String, ?> zoneIdVswitchMap;

        /**
         * <p>The ZooKeeper specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>4 Core 8 GB</p>
         */
        @NameInMap("ZookeeperClass")
        public String zookeeperClass;

        public static DescribeDBClusterAttributeResponseBodyDBCluster build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterAttributeResponseBodyDBCluster self = new DescribeDBClusterAttributeResponseBodyDBCluster();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public String getAliUid() {
            return this.aliUid;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAppointmentElectZookeeperDisableWrite(Boolean appointmentElectZookeeperDisableWrite) {
            this.appointmentElectZookeeperDisableWrite = appointmentElectZookeeperDisableWrite;
            return this;
        }
        public Boolean getAppointmentElectZookeeperDisableWrite() {
            return this.appointmentElectZookeeperDisableWrite;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAppointmentElectZookeeperTime(String appointmentElectZookeeperTime) {
            this.appointmentElectZookeeperTime = appointmentElectZookeeperTime;
            return this;
        }
        public String getAppointmentElectZookeeperTime() {
            return this.appointmentElectZookeeperTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAppointmentRestartNodeList(String appointmentRestartNodeList) {
            this.appointmentRestartNodeList = appointmentRestartNodeList;
            return this;
        }
        public String getAppointmentRestartNodeList() {
            return this.appointmentRestartNodeList;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAppointmentRestartNodeTime(String appointmentRestartNodeTime) {
            this.appointmentRestartNodeTime = appointmentRestartNodeTime;
            return this;
        }
        public String getAppointmentRestartNodeTime() {
            return this.appointmentRestartNodeTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAppointmentRestartTime(String appointmentRestartTime) {
            this.appointmentRestartTime = appointmentRestartTime;
            return this;
        }
        public String getAppointmentRestartTime() {
            return this.appointmentRestartTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setAvailableUpgradeMajorVersion(java.util.Map<String, ?> availableUpgradeMajorVersion) {
            this.availableUpgradeMajorVersion = availableUpgradeMajorVersion;
            return this;
        }
        public java.util.Map<String, ?> getAvailableUpgradeMajorVersion() {
            return this.availableUpgradeMajorVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setConnectionString(String connectionString) {
            this.connectionString = connectionString;
            return this;
        }
        public String getConnectionString() {
            return this.connectionString;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setControlVersion(String controlVersion) {
            this.controlVersion = controlVersion;
            return this;
        }
        public String getControlVersion() {
            return this.controlVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }
        public String getDBClusterNetworkType() {
            return this.DBClusterNetworkType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBClusterType(String DBClusterType) {
            this.DBClusterType = DBClusterType;
            return this;
        }
        public String getDBClusterType() {
            return this.DBClusterType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBNodeClass(String DBNodeClass) {
            this.DBNodeClass = DBNodeClass;
            return this;
        }
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBNodeCount(Long DBNodeCount) {
            this.DBNodeCount = DBNodeCount;
            return this;
        }
        public Long getDBNodeCount() {
            return this.DBNodeCount;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setDBNodeStorage(Long DBNodeStorage) {
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }
        public Long getDBNodeStorage() {
            return this.DBNodeStorage;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEncryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public String getEncryptionKey() {
            return this.encryptionKey;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngineLatestMinorVersion(String engineLatestMinorVersion) {
            this.engineLatestMinorVersion = engineLatestMinorVersion;
            return this;
        }
        public String getEngineLatestMinorVersion() {
            return this.engineLatestMinorVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngineMinorVersion(String engineMinorVersion) {
            this.engineMinorVersion = engineMinorVersion;
            return this;
        }
        public String getEngineMinorVersion() {
            return this.engineMinorVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setExtStorageSize(Integer extStorageSize) {
            this.extStorageSize = extStorageSize;
            return this;
        }
        public Integer getExtStorageSize() {
            return this.extStorageSize;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setExtStorageType(String extStorageType) {
            this.extStorageType = extStorageType;
            return this;
        }
        public String getExtStorageType() {
            return this.extStorageType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setIsExpired(String isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public String getIsExpired() {
            return this.isExpired;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setLbKind(String lbKind) {
            this.lbKind = lbKind;
            return this;
        }
        public String getLbKind() {
            return this.lbKind;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setLockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }
        public String getLockMode() {
            return this.lockMode;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setLockReason(String lockReason) {
            this.lockReason = lockReason;
            return this;
        }
        public String getLockReason() {
            return this.lockReason;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setMaintainAutoType(Boolean maintainAutoType) {
            this.maintainAutoType = maintainAutoType;
            return this;
        }
        public Boolean getMaintainAutoType() {
            return this.maintainAutoType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setMaintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }
        public String getMaintainTime() {
            return this.maintainTime;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPublicConnectionString(String publicConnectionString) {
            this.publicConnectionString = publicConnectionString;
            return this;
        }
        public String getPublicConnectionString() {
            return this.publicConnectionString;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPublicIpAddr(String publicIpAddr) {
            this.publicIpAddr = publicIpAddr;
            return this;
        }
        public String getPublicIpAddr() {
            return this.publicIpAddr;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setPublicPort(String publicPort) {
            this.publicPort = publicPort;
            return this;
        }
        public String getPublicPort() {
            return this.publicPort;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setScaleOutStatus(DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus scaleOutStatus) {
            this.scaleOutStatus = scaleOutStatus;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus getScaleOutStatus() {
            return this.scaleOutStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportBackup(Integer supportBackup) {
            this.supportBackup = supportBackup;
            return this;
        }
        public Integer getSupportBackup() {
            return this.supportBackup;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportHttpsPort(Boolean supportHttpsPort) {
            this.supportHttpsPort = supportHttpsPort;
            return this;
        }
        public Boolean getSupportHttpsPort() {
            return this.supportHttpsPort;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportMysqlPort(Boolean supportMysqlPort) {
            this.supportMysqlPort = supportMysqlPort;
            return this;
        }
        public Boolean getSupportMysqlPort() {
            return this.supportMysqlPort;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setSupportOss(Integer supportOss) {
            this.supportOss = supportOss;
            return this;
        }
        public Integer getSupportOss() {
            return this.supportOss;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setTags(DescribeDBClusterAttributeResponseBodyDBClusterTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeDBClusterAttributeResponseBodyDBClusterTags getTags() {
            return this.tags;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setVpcIpAddr(String vpcIpAddr) {
            this.vpcIpAddr = vpcIpAddr;
            return this;
        }
        public String getVpcIpAddr() {
            return this.vpcIpAddr;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setZoneIdVswitchMap(java.util.Map<String, ?> zoneIdVswitchMap) {
            this.zoneIdVswitchMap = zoneIdVswitchMap;
            return this;
        }
        public java.util.Map<String, ?> getZoneIdVswitchMap() {
            return this.zoneIdVswitchMap;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setZookeeperClass(String zookeeperClass) {
            this.zookeeperClass = zookeeperClass;
            return this;
        }
        public String getZookeeperClass() {
            return this.zookeeperClass;
        }

    }

}
