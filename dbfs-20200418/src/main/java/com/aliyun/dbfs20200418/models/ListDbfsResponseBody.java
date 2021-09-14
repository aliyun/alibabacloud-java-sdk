// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListDbfsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("DBFSInfo")
    public java.util.List<ListDbfsResponseBodyDBFSInfo> DBFSInfo;

    public static ListDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDbfsResponseBody self = new ListDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDbfsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDbfsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDbfsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDbfsResponseBody setDBFSInfo(java.util.List<ListDbfsResponseBodyDBFSInfo> DBFSInfo) {
        this.DBFSInfo = DBFSInfo;
        return this;
    }
    public java.util.List<ListDbfsResponseBodyDBFSInfo> getDBFSInfo() {
        return this.DBFSInfo;
    }

    public static class ListDbfsResponseBodyDBFSInfoTags extends TeaModel {
        @NameInMap("TagValue")
        public String tagValue;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TagKey")
        public String tagKey;

        public static ListDbfsResponseBodyDBFSInfoTags build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsResponseBodyDBFSInfoTags self = new ListDbfsResponseBodyDBFSInfoTags();
            return TeaModel.build(map, self);
        }

        public ListDbfsResponseBodyDBFSInfoTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

        public ListDbfsResponseBodyDBFSInfoTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDbfsResponseBodyDBFSInfoTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

    public static class ListDbfsResponseBodyDBFSInfoEcsList extends TeaModel {
        @NameInMap("EcsId")
        public String ecsId;

        public static ListDbfsResponseBodyDBFSInfoEcsList build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsResponseBodyDBFSInfoEcsList self = new ListDbfsResponseBodyDBFSInfoEcsList();
            return TeaModel.build(map, self);
        }

        public ListDbfsResponseBodyDBFSInfoEcsList setEcsId(String ecsId) {
            this.ecsId = ecsId;
            return this;
        }
        public String getEcsId() {
            return this.ecsId;
        }

    }

    public static class ListDbfsResponseBodyDBFSInfoEbsList extends TeaModel {
        @NameInMap("EbsId")
        public String ebsId;

        @NameInMap("SizeG")
        public Integer sizeG;

        public static ListDbfsResponseBodyDBFSInfoEbsList build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsResponseBodyDBFSInfoEbsList self = new ListDbfsResponseBodyDBFSInfoEbsList();
            return TeaModel.build(map, self);
        }

        public ListDbfsResponseBodyDBFSInfoEbsList setEbsId(String ebsId) {
            this.ebsId = ebsId;
            return this;
        }
        public String getEbsId() {
            return this.ebsId;
        }

        public ListDbfsResponseBodyDBFSInfoEbsList setSizeG(Integer sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Integer getSizeG() {
            return this.sizeG;
        }

    }

    public static class ListDbfsResponseBodyDBFSInfo extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Encryption")
        public Boolean encryption;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("FsId")
        public String fsId;

        @NameInMap("Tags")
        public java.util.List<ListDbfsResponseBodyDBFSInfoTags> tags;

        @NameInMap("SizeG")
        public Integer sizeG;

        @NameInMap("EcsList")
        public java.util.List<ListDbfsResponseBodyDBFSInfoEcsList> ecsList;

        @NameInMap("EbsList")
        public java.util.List<ListDbfsResponseBodyDBFSInfoEbsList> ebsList;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("DBFSClusterId")
        public String DBFSClusterId;

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

        public static ListDbfsResponseBodyDBFSInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDbfsResponseBodyDBFSInfo self = new ListDbfsResponseBodyDBFSInfo();
            return TeaModel.build(map, self);
        }

        public ListDbfsResponseBodyDBFSInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDbfsResponseBodyDBFSInfo setEncryption(Boolean encryption) {
            this.encryption = encryption;
            return this;
        }
        public Boolean getEncryption() {
            return this.encryption;
        }

        public ListDbfsResponseBodyDBFSInfo setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListDbfsResponseBodyDBFSInfo setFsId(String fsId) {
            this.fsId = fsId;
            return this;
        }
        public String getFsId() {
            return this.fsId;
        }

        public ListDbfsResponseBodyDBFSInfo setTags(java.util.List<ListDbfsResponseBodyDBFSInfoTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListDbfsResponseBodyDBFSInfoTags> getTags() {
            return this.tags;
        }

        public ListDbfsResponseBodyDBFSInfo setSizeG(Integer sizeG) {
            this.sizeG = sizeG;
            return this;
        }
        public Integer getSizeG() {
            return this.sizeG;
        }

        public ListDbfsResponseBodyDBFSInfo setEcsList(java.util.List<ListDbfsResponseBodyDBFSInfoEcsList> ecsList) {
            this.ecsList = ecsList;
            return this;
        }
        public java.util.List<ListDbfsResponseBodyDBFSInfoEcsList> getEcsList() {
            return this.ecsList;
        }

        public ListDbfsResponseBodyDBFSInfo setEbsList(java.util.List<ListDbfsResponseBodyDBFSInfoEbsList> ebsList) {
            this.ebsList = ebsList;
            return this;
        }
        public java.util.List<ListDbfsResponseBodyDBFSInfoEbsList> getEbsList() {
            return this.ebsList;
        }

        public ListDbfsResponseBodyDBFSInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListDbfsResponseBodyDBFSInfo setDBFSClusterId(String DBFSClusterId) {
            this.DBFSClusterId = DBFSClusterId;
            return this;
        }
        public String getDBFSClusterId() {
            return this.DBFSClusterId;
        }

        public ListDbfsResponseBodyDBFSInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListDbfsResponseBodyDBFSInfo setFsName(String fsName) {
            this.fsName = fsName;
            return this;
        }
        public String getFsName() {
            return this.fsName;
        }

        public ListDbfsResponseBodyDBFSInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListDbfsResponseBodyDBFSInfo setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDbfsResponseBodyDBFSInfo setAttachNodeNumber(Integer attachNodeNumber) {
            this.attachNodeNumber = attachNodeNumber;
            return this;
        }
        public Integer getAttachNodeNumber() {
            return this.attachNodeNumber;
        }

        public ListDbfsResponseBodyDBFSInfo setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

        public ListDbfsResponseBodyDBFSInfo setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        public ListDbfsResponseBodyDBFSInfo setUsedScene(String usedScene) {
            this.usedScene = usedScene;
            return this;
        }
        public String getUsedScene() {
            return this.usedScene;
        }

        public ListDbfsResponseBodyDBFSInfo setLastMountTime(String lastMountTime) {
            this.lastMountTime = lastMountTime;
            return this;
        }
        public String getLastMountTime() {
            return this.lastMountTime;
        }

        public ListDbfsResponseBodyDBFSInfo setLastUmountTime(String lastUmountTime) {
            this.lastUmountTime = lastUmountTime;
            return this;
        }
        public String getLastUmountTime() {
            return this.lastUmountTime;
        }

        public ListDbfsResponseBodyDBFSInfo setEnableRaid(Boolean enableRaid) {
            this.enableRaid = enableRaid;
            return this;
        }
        public Boolean getEnableRaid() {
            return this.enableRaid;
        }

        public ListDbfsResponseBodyDBFSInfo setRaidStrip(Integer raidStrip) {
            this.raidStrip = raidStrip;
            return this;
        }
        public Integer getRaidStrip() {
            return this.raidStrip;
        }

    }

}
