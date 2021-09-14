// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GetDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBFSInfo")
    public GetDbfsResponseBodyDBFSInfo DBFSInfo;

    public static GetDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDbfsResponseBody self = new GetDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDbfsResponseBody setDBFSInfo(GetDbfsResponseBodyDBFSInfo DBFSInfo) {
        this.DBFSInfo = DBFSInfo;
        return this;
    }
    public GetDbfsResponseBodyDBFSInfo getDBFSInfo() {
        return this.DBFSInfo;
    }

    public static class GetDbfsResponseBodyDBFSInfoTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("TagKey")
        public String tagKey;

        public static GetDbfsResponseBodyDBFSInfoTags build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfoTags self = new GetDbfsResponseBodyDBFSInfoTags();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfoTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
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

    }

    public static class GetDbfsResponseBodyDBFSInfoEcsList extends TeaModel {
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

    public static class GetDbfsResponseBodyDBFSInfoEbsList extends TeaModel {
        @NameInMap("EbsId")
        public String ebsId;

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

    public static class GetDbfsResponseBodyDBFSInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("FsId")
        public String fsId;

        @NameInMap("Tags")
        public java.util.List<GetDbfsResponseBodyDBFSInfoTags> tags;

        @NameInMap("SizeG")
        public Integer sizeG;

        @NameInMap("EcsList")
        public java.util.List<GetDbfsResponseBodyDBFSInfoEcsList> ecsList;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DBFSClusterId")
        public String DBFSClusterId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("FsName")
        public String fsName;

        @NameInMap("Category")
        public String category;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("AttachNodeNumber")
        public Integer attachNodeNumber;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        @NameInMap("Encryption")
        public Boolean encryption;

        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        @NameInMap("UsedScene")
        public String usedScene;

        @NameInMap("LastMountTime")
        public String lastMountTime;

        @NameInMap("LastUmountTime")
        public String lastUmountTime;

        @NameInMap("EnableRaid")
        public Boolean enableRaid;

        @NameInMap("RaidStrip")
        public Integer raidStrip;

        @NameInMap("EbsList")
        public java.util.List<GetDbfsResponseBodyDBFSInfoEbsList> ebsList;

        public static GetDbfsResponseBodyDBFSInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDbfsResponseBodyDBFSInfo self = new GetDbfsResponseBodyDBFSInfo();
            return TeaModel.build(map, self);
        }

        public GetDbfsResponseBodyDBFSInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDbfsResponseBodyDBFSInfo setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetDbfsResponseBodyDBFSInfo setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public GetDbfsResponseBodyDBFSInfo setTags(java.util.List<GetDbfsResponseBodyDBFSInfoTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetDbfsResponseBodyDBFSInfoTags> getTags() {
            return this.tags;
        }

        public GetDbfsResponseBodyDBFSInfo setSizeG(Integer sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Integer getSizeG() {
            return this.sizeG;
        }

        public GetDbfsResponseBodyDBFSInfo setEcsList(java.util.List<GetDbfsResponseBodyDBFSInfoEcsList> ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public java.util.List<GetDbfsResponseBodyDBFSInfoEcsList> getEcsList() {
            return this.ecsList;
        }

        public GetDbfsResponseBodyDBFSInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

        public GetDbfsResponseBodyDBFSInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public GetDbfsResponseBodyDBFSInfo setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
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

        public GetDbfsResponseBodyDBFSInfo setAttachNodeNumber(Integer attachNodeNumber) {
            this.attachNodeNumber = attachNodeNumber;
            return this;
        }
        public Integer getAttachNodeNumber() {
            return this.attachNodeNumber;
        }

        public GetDbfsResponseBodyDBFSInfo setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public GetDbfsResponseBodyDBFSInfo setEncryption(Boolean encryption) {
            this.encryption = encryption;
            return this;
        }
        public Boolean getEncryption() {
            return this.encryption;
        }

        public GetDbfsResponseBodyDBFSInfo setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public GetDbfsResponseBodyDBFSInfo setUsedScene(String usedScene) {
            this.usedScene = usedScene;
            return this;
        }
        public String getUsedScene() {
            return this.usedScene;
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

        public GetDbfsResponseBodyDBFSInfo setEnableRaid(Boolean enableRaid) {
            this.enableRaid = enableRaid;
            return this;
        }
        public Boolean getEnableRaid() {
            return this.enableRaid;
        }

        public GetDbfsResponseBodyDBFSInfo setRaidStrip(Integer raidStrip) {
            this.raidStrip = raidStrip;
            return this;
        }
        public Integer getRaidStrip() {
            return this.raidStrip;
        }

        public GetDbfsResponseBodyDBFSInfo setEbsList(java.util.List<GetDbfsResponseBodyDBFSInfoEbsList> ebsList) {
            this.ebsList = ebsList;
            return this;
        }
        public java.util.List<GetDbfsResponseBodyDBFSInfoEbsList> getEbsList() {
            return this.ebsList;
        }

    }

}
