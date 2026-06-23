// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    /**
     * <p>Details about the cluster.</p>
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
         * <p>The data migration progress, as a percentage.</p>
         * <blockquote>
         * <p>This parameter is returned only when the cluster is in the <code>SCALING_OUT</code> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The data migration progress, displayed as <code>Amount of data migrated/Total data amount</code>.</p>
         * <blockquote>
         * <p>This parameter is returned only when the cluster is in the <code>SCALING_OUT</code> state.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>140692647406****</p>
         */
        @NameInMap("AliUid")
        public String aliUid;

        /**
         * <p>Specifies whether to stop write operations during a primary/secondary switchover. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Write operations are stopped for the instance during the switchover.</p>
         * </li>
         * <li><p><code>false</code>: Write operations are not stopped for the instance during the switchover.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AppointmentElectZookeeperDisableWrite")
        public Boolean appointmentElectZookeeperDisableWrite;

        /**
         * <p>The scheduled time for a primary/secondary switchover. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-06T12:00:00Z</p>
         */
        @NameInMap("AppointmentElectZookeeperTime")
        public String appointmentElectZookeeperTime;

        /**
         * <p>A list of nodes that are scheduled for a restart.</p>
         * 
         * <strong>example:</strong>
         * <p>ck-k1a976p3n********-<strong><strong>-clickhouse-s-0-r-0,ck-k1a976p3n</strong></strong><strong><strong>-</strong></strong>-clickhouse-s-0-r-1</p>
         */
        @NameInMap("AppointmentRestartNodeList")
        public String appointmentRestartNodeList;

        /**
         * <p>The scheduled time to restart specific nodes. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-06T12:00:00Z</p>
         */
        @NameInMap("AppointmentRestartNodeTime")
        public String appointmentRestartNodeTime;

        /**
         * <p>The scheduled restart time. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-06T12:00:00Z</p>
         */
        @NameInMap("AppointmentRestartTime")
        public String appointmentRestartTime;

        /**
         * <p>The available major versions to which the cluster can be upgraded, and their latest minor versions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MajorVersion&quot;:&quot;MinorVersion&quot;}</p>
         */
        @NameInMap("AvailableUpgradeMajorVersion")
        public java.util.Map<String, ?> availableUpgradeMajorVersion;

        /**
         * <p>The site ID. Valid values:</p>
         * <ul>
         * <li><p><code>26842</code>: China site (aliyun.com).</p>
         * </li>
         * <li><p><code>26888</code>: international site (alibabacloud.com).</p>
         * </li>
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
         * <li><p><code>Basic</code>: single-replica edition.</p>
         * </li>
         * <li><p><code>HighAvailability</code>: dual-replica edition.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>clickhouse_go_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The VPC endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp1qx68m06981****.ads.rds.aliyuncs.com</p>
         */
        @NameInMap("ConnectionString")
        public String connectionString;

        /**
         * <p>The version of the backend management system. Valid values:</p>
         * <ul>
         * <li><p><code>v1</code></p>
         * </li>
         * <li><p><code>v2</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("ControlVersion")
        public String controlVersion;

        /**
         * <p>The creation time of the cluster, in <code>yyyy-MM-ddTHH:mm:ssZ</code> format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-13T11:33:11Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The cluster description.</p>
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
         * <p>The network type. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        @NameInMap("DBClusterNetworkType")
        public String DBClusterNetworkType;

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><p><code>Preparing</code>: The cluster is being prepared.</p>
         * </li>
         * <li><p><code>Creating</code>: The cluster is being created.</p>
         * </li>
         * <li><p><code>Running</code>: The cluster is running.</p>
         * </li>
         * <li><p><code>Deleting</code>: The cluster is being deleted.</p>
         * </li>
         * <li><p><code>SCALING_OUT</code>: The cluster is being scaled out.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBClusterStatus")
        public String DBClusterStatus;

        /**
         * <p>The cluster type. Valid values:</p>
         * <ul>
         * <li><p><code>Common</code>: a standard cluster.</p>
         * </li>
         * <li><p><code>Readonly</code>: a read-only cluster.</p>
         * </li>
         * <li><p><code>Guard</code>: a disaster recovery cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Common</p>
         */
        @NameInMap("DBClusterType")
        public String DBClusterType;

        /**
         * <p>The instance type of the cluster nodes.</p>
         * <ul>
         * <li><p>Valid values for a single-replica edition:</p>
         * <ul>
         * <li><p><code>S4-NEW</code></p>
         * </li>
         * <li><p><code>S8</code></p>
         * </li>
         * <li><p><code>S16</code></p>
         * </li>
         * <li><p><code>S32</code></p>
         * </li>
         * <li><p><code>S64</code></p>
         * </li>
         * <li><p><code>S104</code></p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Valid values for a dual-replica edition:</p>
         * <ul>
         * <li><p><code>C4-NEW</code></p>
         * </li>
         * <li><p><code>C8</code></p>
         * </li>
         * <li><p><code>C16</code></p>
         * </li>
         * <li><p><code>C32</code></p>
         * </li>
         * <li><p><code>C64</code></p>
         * </li>
         * <li><p><code>C104</code></p>
         * </li>
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
         * <p>The number of nodes in the cluster.</p>
         * <ul>
         * <li><p>For a single-replica edition, the value range is 1 to 48.</p>
         * </li>
         * <li><p>For a dual-replica edition, the value range is 1 to 24.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DBNodeCount")
        public Long DBNodeCount;

        /**
         * <p>The storage capacity per node, in GB.</p>
         * <p>The value can range from 100 to 32000.</p>
         * <blockquote>
         * <p>The value must be a multiple of 100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DBNodeStorage")
        public Long DBNodeStorage;

        /**
         * <p>The Key Management Service (KMS) key ID.</p>
         * <blockquote>
         * <p>This parameter is empty if <code>EncryptionType</code> is set to <code>off</code>.</p>
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
         * <li><p><code>CloudDisk</code>: disk encryption.</p>
         * </li>
         * <li><p><code>off</code>: Encryption is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudDisk</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ClickHouse</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The latest minor version to which the cluster can be upgraded.</p>
         * 
         * <strong>example:</strong>
         * <p>1.34.0</p>
         */
        @NameInMap("EngineLatestMinorVersion")
        public String engineLatestMinorVersion;

        /**
         * <p>The engine\&quot;s current minor version.</p>
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
         * <p>The expiration time of the cluster, in <code>yyyy-MM-ddTHH:mm:ssZ</code> format (UTC).</p>
         * <blockquote>
         * <p>This parameter is empty for pay-as-you-go clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-11-11T16:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The extended storage capacity, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("ExtStorageSize")
        public Integer extStorageSize;

        /**
         * <p>The extended storage type. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p><code>CloudESSD_PL0</code>: ESSD PL0 disk.</p>
         * </li>
         * <li><p><code>CloudESSD</code>: ESSD PL1 disk.</p>
         * </li>
         * <li><p><code>CloudESSD_PL2</code>: ESSD PL2 disk.</p>
         * </li>
         * <li><p><code>CloudESSD_PL3</code>: ESSD PL3 disk.</p>
         * </li>
         * <li><p><code>CloudEfficiency</code>: Ultra disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudESSD</p>
         */
        @NameInMap("ExtStorageType")
        public String extStorageType;

        /**
         * <p>Whether the cluster has expired. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The cluster has expired.</p>
         * </li>
         * <li><p><code>false</code>: The cluster has not expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsExpired")
        public String isExpired;

        /**
         * <p>The type of the load balancer.</p>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        @NameInMap("LbKind")
        public String lbKind;

        /**
         * <p>The lock mode of the cluster. Valid values:</p>
         * <ul>
         * <li><p><code>Unlock</code>: The cluster is not locked.</p>
         * </li>
         * <li><p><code>ManualLock</code>: The cluster is manually locked.</p>
         * </li>
         * <li><p><code>LockByExpiration</code>: The cluster is automatically locked upon expiration.</p>
         * </li>
         * <li><p><code>LockByRestoration</code>: The cluster is automatically locked before a rollback.</p>
         * </li>
         * <li><p><code>LockByDiskQuota</code>: The cluster is automatically locked because the storage is full.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        @NameInMap("LockMode")
        public String lockMode;

        /**
         * <p>The reason the cluster was locked.</p>
         * <blockquote>
         * <p>This parameter is empty if <code>LockMode</code> is set to <code>Unlock</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DISK_FULL</p>
         */
        @NameInMap("LockReason")
        public String lockReason;

        /**
         * <p>The upgrade method. A value of <code>false</code> indicates that upgrades must be performed manually.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("MaintainAutoType")
        public Boolean maintainAutoType;

        /**
         * <p>The maintenance window of the cluster. The time is in the <code>HH:mmZ-HH:mmZ</code> format and is in UTC.</p>
         * <p>For example, <code>00:00Z-01:00Z</code> indicates that the maintenance window is from 00:00 to 01:00 (UTC), which corresponds to 08:00 to 09:00 in Beijing time (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>00:00Z-01:00Z</p>
         */
        @NameInMap("MaintainTime")
        public String maintainTime;

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><code>Postpaid</code>: pay-as-you-go.</p>
         * </li>
         * <li><p><code>Prepaid</code>: subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The HTTP port.</p>
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
         * <p>The IP address of the public endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>121.40.xx.xx</p>
         */
        @NameInMap("PublicIpAddr")
        public String publicIpAddr;

        /**
         * <p>The public TCP port.</p>
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
         * <p>The data migration status.</p>
         */
        @NameInMap("ScaleOutStatus")
        public DescribeDBClusterAttributeResponseBodyDBClusterScaleOutStatus scaleOutStatus;

        /**
         * <p>The storage type. Valid values:</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li><p><code>CloudESSD_PL0</code>: ESSD PL0 disk.</p>
         * </li>
         * <li><p><code>CloudESSD</code>: ESSD PL1 disk.</p>
         * </li>
         * <li><p><code>CloudESSD_PL2</code>: ESSD PL2 disk.</p>
         * </li>
         * <li><p><code>CloudESSD_PL3</code>: ESSD PL3 disk.</p>
         * </li>
         * <li><p><code>CloudEfficiency</code>: Ultra disk.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CloudESSD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>Whether the cluster supports data backup. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: Supported.</p>
         * </li>
         * <li><p><code>2</code>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportBackup")
        public Integer supportBackup;

        /**
         * <p>Whether the HTTPS port is supported. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Supported.</p>
         * </li>
         * <li><p><code>false</code>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportHttpsPort")
        public Boolean supportHttpsPort;

        /**
         * <p>Whether the MySQL port is supported. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Supported.</p>
         * </li>
         * <li><p><code>false</code>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportMysqlPort")
        public Boolean supportMysqlPort;

        /**
         * <p>Whether the cluster supports tiered storage for hot and cold data. Valid values:</p>
         * <ul>
         * <li><p><code>1</code>: Supported.</p>
         * </li>
         * <li><p><code>2</code>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SupportOss")
        public Integer supportOss;

        /**
         * <p>The tags of the cluster.</p>
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
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10tr8k9qasioaty****</p>
         */
        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp10tr8k9qasioaty****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The IP address of the VPC endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        @NameInMap("VpcIpAddr")
        public String vpcIpAddr;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("WebUISnatStatus")
        public String webUISnatStatus;

        /**
         * <strong>example:</strong>
         * <p>active</p>
         */
        @NameInMap("WebUIStatus")
        public String webUIStatus;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        /**
         * <p>A map of zone IDs to vSwitch IDs for a multi-zone cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f: vsw-zm0n42d5vvuo****</p>
         */
        @NameInMap("ZoneIdVswitchMap")
        public java.util.Map<String, ?> zoneIdVswitchMap;

        /**
         * <p>The specifications of the ZooKeeper nodes.</p>
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

        public DescribeDBClusterAttributeResponseBodyDBCluster setWebUISnatStatus(String webUISnatStatus) {
            this.webUISnatStatus = webUISnatStatus;
            return this;
        }
        public String getWebUISnatStatus() {
            return this.webUISnatStatus;
        }

        public DescribeDBClusterAttributeResponseBodyDBCluster setWebUIStatus(String webUIStatus) {
            this.webUIStatus = webUIStatus;
            return this;
        }
        public String getWebUIStatus() {
            return this.webUIStatus;
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
