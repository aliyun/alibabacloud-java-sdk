// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetDbfsResponseBody extends TeaModel {
    @NameInMap("DBFSInfo")
    public GetDbfsResponseBodyDBFSInfo DBFSInfo;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsResponseBody self = new GetDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDbfsResponseBody setDBFSInfo(GetDbfsResponseBodyDBFSInfo DBFSInfo) {
        this.DBFSInfo = DBFSInfo;
        return this;
    }
    public GetDbfsResponseBodyDBFSInfo getDBFSInfo() {
        return this.DBFSInfo;
    }

    public GetDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDbfsResponseBodyDBFSInfoEbsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>d-bp1hq4******qi7gy1th</p>
         */
        @NameInMap("EbsId")
        public String ebsId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SizeG")
        public Integer sizeG;

        public static GetDbfsResponseBodyDBFSInfoEbsList build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfoEbsList self = new GetDbfsResponseBodyDBFSInfoEbsList();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfoEbsList setEbsId(String ebsId) {
            this.ebsId = ebsId;
            return this;
        }
        public String getEbsId() {
            return this.ebsId;
        }

        public GetDbfsResponseBodyDBFSInfoEbsList setSizeG(Integer sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Integer getSizeG() {
            return this.sizeG;
        }

    }

    public static class GetDbfsResponseBodyDBFSInfoEcsList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>i-y2vZ3********vvMilZ2hQ</p>
         */
        @NameInMap("EcsId")
        public String ecsId;

        public static GetDbfsResponseBodyDBFSInfoEcsList build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfoEcsList self = new GetDbfsResponseBodyDBFSInfoEcsList();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfoEcsList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

    }

    public static class GetDbfsResponseBodyDBFSInfoSnapshotInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>sl-9zskwvgoqqqvzxa*******</p>
         */
        @NameInMap("LinkId")
        public String linkId;

        /**
         * <strong>example:</strong>
         * <p>sp-ehuhzlfetb2jiwz*******</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SnapshotCount")
        public Integer snapshotCount;

        /**
         * <strong>example:</strong>
         * <p>50331648</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static GetDbfsResponseBodyDBFSInfoSnapshotInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfoSnapshotInfo self = new GetDbfsResponseBodyDBFSInfoSnapshotInfo();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfoSnapshotInfo setLinkId(String linkId) {
            this.linkId = linkId;
            return this;
        }
        public String getLinkId() {
            return this.linkId;
        }

        public GetDbfsResponseBodyDBFSInfoSnapshotInfo setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetDbfsResponseBodyDBFSInfoSnapshotInfo setSnapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }
        public Integer getSnapshotCount() {
            return this.snapshotCount;
        }

        public GetDbfsResponseBodyDBFSInfoSnapshotInfo setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

    public static class GetDbfsResponseBodyDBFSInfoTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>TestTagKey1</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>TestTagValue1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetDbfsResponseBodyDBFSInfoTags build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfoTags self = new GetDbfsResponseBodyDBFSInfoTags();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfoTags setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetDbfsResponseBodyDBFSInfoTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetDbfsResponseBodyDBFSInfoTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetDbfsResponseBodyDBFSInfo extends TeaModel {
        @NameInMap("AdvancedFeatures")
        public String advancedFeatures;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AttachNodeNumber")
        public Integer attachNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>1609330367000</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>c39EcDBf-2Ecb-C3C6-6526-018d4Dcf63eD</p>
         */
        @NameInMap("DBFSClusterId")
        public String DBFSClusterId;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EbsList")
        public java.util.List<GetDbfsResponseBodyDBFSInfoEbsList> ebsList;

        @NameInMap("EcsList")
        public java.util.List<GetDbfsResponseBodyDBFSInfoEcsList> ecsList;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableRaid")
        public Boolean enableRaid;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encryption")
        public Boolean encryption;

        /**
         * <strong>example:</strong>
         * <p>dbfs-GOrr********Yd0VLOyBpg</p>
         */
        @NameInMap("FsId")
        public String fsId;

        /**
         * <strong>example:</strong>
         * <p>dbfs-test-01</p>
         */
        @NameInMap("FsName")
        public String fsName;

        /**
         * <strong>example:</strong>
         * <p>dbfs.small</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>c39EcDBf-2Ecb-C3C6-6526-018d4D******</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        /**
         * <strong>example:</strong>
         * <p>TargetIsBusy.DBFS</p>
         */
        @NameInMap("LastFailed")
        public String lastFailed;

        /**
         * <strong>example:</strong>
         * <p>1644915400000</p>
         */
        @NameInMap("LastMountTime")
        public String lastMountTime;

        /**
         * <strong>example:</strong>
         * <p>1644915319000</p>
         */
        @NameInMap("LastUmountTime")
        public String lastUmountTime;

        /**
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>PL1</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RaidStrip")
        public Integer raidStrip;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("SizeG")
        public Integer sizeG;

        @NameInMap("SnapshotId")
        public String snapshotId;

        @NameInMap("SnapshotInfo")
        public GetDbfsResponseBodyDBFSInfoSnapshotInfo snapshotInfo;

        /**
         * <strong>example:</strong>
         * <p>attached</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetDbfsResponseBodyDBFSInfoTags> tags;

        /**
         * <strong>example:</strong>
         * <p>MySQL 5.7</p>
         */
        @NameInMap("UsedScene")
        public String usedScene;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetDbfsResponseBodyDBFSInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfo self = new GetDbfsResponseBodyDBFSInfo();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfo setAdvancedFeatures(String advancedFeatures) {
            this.advancedFeatures = advancedFeatures;
            return this;
        }
        public String getAdvancedFeatures() {
            return this.advancedFeatures;
        }

        public GetDbfsResponseBodyDBFSInfo setAttachNodeNumber(Integer attachNodeNumber) {
            this.attachNodeNumber = attachNodeNumber;
            return this;
        }
        public Integer getAttachNodeNumber() {
            return this.attachNodeNumber;
        }

        public GetDbfsResponseBodyDBFSInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetDbfsResponseBodyDBFSInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public GetDbfsResponseBodyDBFSInfo setDBFSClusterId(String DBFSClusterId) {
            this.DBFSClusterId = DBFSClusterId;
            return this;
        }
        public String getDBFSClusterId() {
            return this.DBFSClusterId;
        }

        public GetDbfsResponseBodyDBFSInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDbfsResponseBodyDBFSInfo setEbsList(java.util.List<GetDbfsResponseBodyDBFSInfoEbsList> ebsList) {
            this.ebsList = ebsList;
            return this;
        }
        public java.util.List<GetDbfsResponseBodyDBFSInfoEbsList> getEbsList() {
            return this.ebsList;
        }

        public GetDbfsResponseBodyDBFSInfo setEcsList(java.util.List<GetDbfsResponseBodyDBFSInfoEcsList> ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public java.util.List<GetDbfsResponseBodyDBFSInfoEcsList> getEcsList() {
            return this.ecsList;
        }

        public GetDbfsResponseBodyDBFSInfo setEnableRaid(Boolean enableRaid) {
            this.enableRaid = enableRaid;
            return this;
        }
        public Boolean getEnableRaid() {
            return this.enableRaid;
        }

        public GetDbfsResponseBodyDBFSInfo setEncryption(Boolean encryption) {
            this.encryption = encryption;
            return this;
        }
        public Boolean getEncryption() {
            return this.encryption;
        }

        public GetDbfsResponseBodyDBFSInfo setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public GetDbfsResponseBodyDBFSInfo setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public GetDbfsResponseBodyDBFSInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetDbfsResponseBodyDBFSInfo setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public GetDbfsResponseBodyDBFSInfo setLastFailed(String lastFailed) {
            this.lastFailed = lastFailed;
            return this;
        }
        public String getLastFailed() {
            return this.lastFailed;
        }

        public GetDbfsResponseBodyDBFSInfo setLastMountTime(String lastMountTime) {
            this.lastMountTime = lastMountTime;
            return this;
        }
        public String getLastMountTime() {
            return this.lastMountTime;
        }

        public GetDbfsResponseBodyDBFSInfo setLastUmountTime(String lastUmountTime) {
            this.lastUmountTime = lastUmountTime;
            return this;
        }
        public String getLastUmountTime() {
            return this.lastUmountTime;
        }

        public GetDbfsResponseBodyDBFSInfo setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetDbfsResponseBodyDBFSInfo setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public GetDbfsResponseBodyDBFSInfo setRaidStrip(Integer raidStrip) {
            this.raidStrip = raidStrip;
            return this;
        }
        public Integer getRaidStrip() {
            return this.raidStrip;
        }

        public GetDbfsResponseBodyDBFSInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetDbfsResponseBodyDBFSInfo setSizeG(Integer sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Integer getSizeG() {
            return this.sizeG;
        }

        public GetDbfsResponseBodyDBFSInfo setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

        public GetDbfsResponseBodyDBFSInfo setSnapshotInfo(GetDbfsResponseBodyDBFSInfoSnapshotInfo snapshotInfo) {
            this.snapshotInfo = snapshotInfo;
            return this;
        }
        public GetDbfsResponseBodyDBFSInfoSnapshotInfo getSnapshotInfo() {
            return this.snapshotInfo;
        }

        public GetDbfsResponseBodyDBFSInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDbfsResponseBodyDBFSInfo setTags(java.util.List<GetDbfsResponseBodyDBFSInfoTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetDbfsResponseBodyDBFSInfoTags> getTags() {
            return this.tags;
        }

        public GetDbfsResponseBodyDBFSInfo setUsedScene(String usedScene) {
            this.usedScene = usedScene;
            return this;
        }
        public String getUsedScene() {
            return this.usedScene;
        }

        public GetDbfsResponseBodyDBFSInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
