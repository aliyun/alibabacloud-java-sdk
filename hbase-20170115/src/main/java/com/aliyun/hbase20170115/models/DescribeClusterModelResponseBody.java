// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterModelResponseBody extends TeaModel {
    @NameInMap("AutoRenew")
    public String autoRenew;

    @NameInMap("BackupStatus")
    public String backupStatus;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ClusterType")
    public String clusterType;

    @NameInMap("ColdStorageStatus")
    public String coldStorageStatus;

    @NameInMap("CoreDiskQuantity")
    public Integer coreDiskQuantity;

    @NameInMap("CoreDiskSize")
    public String coreDiskSize;

    @NameInMap("CoreDiskType")
    public String coreDiskType;

    @NameInMap("CoreInstanceQuantity")
    public Integer coreInstanceQuantity;

    @NameInMap("CoreInstanceType")
    public String coreInstanceType;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("DbType")
    public String dbType;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("HaType")
    public String haType;

    @NameInMap("HasUser")
    public String hasUser;

    @NameInMap("IsMultimod")
    public String isMultimod;

    @NameInMap("LockMode")
    public String lockMode;

    @NameInMap("MainVersion")
    public String mainVersion;

    @NameInMap("MasterDiskSize")
    public Integer masterDiskSize;

    @NameInMap("MasterDiskType")
    public String masterDiskType;

    @NameInMap("MasterInstanceType")
    public String masterInstanceType;

    @NameInMap("MinorVersion")
    public String minorVersion;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public DescribeClusterModelResponseBodyTags tags;

    @NameInMap("UpdateStatus")
    public String updateStatus;

    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeClusterModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterModelResponseBody self = new DescribeClusterModelResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterModelResponseBody setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public DescribeClusterModelResponseBody setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }
    public String getBackupStatus() {
        return this.backupStatus;
    }

    public DescribeClusterModelResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterModelResponseBody setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeClusterModelResponseBody setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeClusterModelResponseBody setColdStorageStatus(String coldStorageStatus) {
        this.coldStorageStatus = coldStorageStatus;
        return this;
    }
    public String getColdStorageStatus() {
        return this.coldStorageStatus;
    }

    public DescribeClusterModelResponseBody setCoreDiskQuantity(Integer coreDiskQuantity) {
        this.coreDiskQuantity = coreDiskQuantity;
        return this;
    }
    public Integer getCoreDiskQuantity() {
        return this.coreDiskQuantity;
    }

    public DescribeClusterModelResponseBody setCoreDiskSize(String coreDiskSize) {
        this.coreDiskSize = coreDiskSize;
        return this;
    }
    public String getCoreDiskSize() {
        return this.coreDiskSize;
    }

    public DescribeClusterModelResponseBody setCoreDiskType(String coreDiskType) {
        this.coreDiskType = coreDiskType;
        return this;
    }
    public String getCoreDiskType() {
        return this.coreDiskType;
    }

    public DescribeClusterModelResponseBody setCoreInstanceQuantity(Integer coreInstanceQuantity) {
        this.coreInstanceQuantity = coreInstanceQuantity;
        return this;
    }
    public Integer getCoreInstanceQuantity() {
        return this.coreInstanceQuantity;
    }

    public DescribeClusterModelResponseBody setCoreInstanceType(String coreInstanceType) {
        this.coreInstanceType = coreInstanceType;
        return this;
    }
    public String getCoreInstanceType() {
        return this.coreInstanceType;
    }

    public DescribeClusterModelResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeClusterModelResponseBody setDbType(String dbType) {
        this.dbType = dbType;
        return this;
    }
    public String getDbType() {
        return this.dbType;
    }

    public DescribeClusterModelResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeClusterModelResponseBody setHaType(String haType) {
        this.haType = haType;
        return this;
    }
    public String getHaType() {
        return this.haType;
    }

    public DescribeClusterModelResponseBody setHasUser(String hasUser) {
        this.hasUser = hasUser;
        return this;
    }
    public String getHasUser() {
        return this.hasUser;
    }

    public DescribeClusterModelResponseBody setIsMultimod(String isMultimod) {
        this.isMultimod = isMultimod;
        return this;
    }
    public String getIsMultimod() {
        return this.isMultimod;
    }

    public DescribeClusterModelResponseBody setLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }
    public String getLockMode() {
        return this.lockMode;
    }

    public DescribeClusterModelResponseBody setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public DescribeClusterModelResponseBody setMasterDiskSize(Integer masterDiskSize) {
        this.masterDiskSize = masterDiskSize;
        return this;
    }
    public Integer getMasterDiskSize() {
        return this.masterDiskSize;
    }

    public DescribeClusterModelResponseBody setMasterDiskType(String masterDiskType) {
        this.masterDiskType = masterDiskType;
        return this;
    }
    public String getMasterDiskType() {
        return this.masterDiskType;
    }

    public DescribeClusterModelResponseBody setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
        return this;
    }
    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    public DescribeClusterModelResponseBody setMinorVersion(String minorVersion) {
        this.minorVersion = minorVersion;
        return this;
    }
    public String getMinorVersion() {
        return this.minorVersion;
    }

    public DescribeClusterModelResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeClusterModelResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterModelResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeClusterModelResponseBody setTags(DescribeClusterModelResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public DescribeClusterModelResponseBodyTags getTags() {
        return this.tags;
    }

    public DescribeClusterModelResponseBody setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }
    public String getUpdateStatus() {
        return this.updateStatus;
    }

    public DescribeClusterModelResponseBody setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeClusterModelResponseBodyTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeClusterModelResponseBodyTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterModelResponseBodyTagsTag self = new DescribeClusterModelResponseBodyTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeClusterModelResponseBodyTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeClusterModelResponseBodyTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeClusterModelResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeClusterModelResponseBodyTagsTag> tag;

        public static DescribeClusterModelResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterModelResponseBodyTags self = new DescribeClusterModelResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public DescribeClusterModelResponseBodyTags setTag(java.util.List<DescribeClusterModelResponseBodyTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeClusterModelResponseBodyTagsTag> getTag() {
            return this.tag;
        }

    }

}
