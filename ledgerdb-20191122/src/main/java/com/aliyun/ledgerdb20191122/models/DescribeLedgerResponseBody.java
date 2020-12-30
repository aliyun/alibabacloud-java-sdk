// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeLedgerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Ledger")
    public DescribeLedgerResponseBodyLedger ledger;

    public static DescribeLedgerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLedgerResponseBody self = new DescribeLedgerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLedgerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLedgerResponseBody setLedger(DescribeLedgerResponseBodyLedger ledger) {
        this.ledger = ledger;
        return this;
    }
    public DescribeLedgerResponseBodyLedger getLedger() {
        return this.ledger;
    }

    public static class DescribeLedgerResponseBodyLedgerLastTimeAnchor extends TeaModel {
        @NameInMap("JournalId")
        public String journalId;

        @NameInMap("LedgerVersion")
        public String ledgerVersion;

        @NameInMap("TimeStamp")
        public String timeStamp;

        @NameInMap("LedgerDigest")
        public String ledgerDigest;

        @NameInMap("LedgerDigestType")
        public String ledgerDigestType;

        @NameInMap("Proof")
        public String proof;

        public static DescribeLedgerResponseBodyLedgerLastTimeAnchor build(java.util.Map<String, ?> map) throws Exception {
            DescribeLedgerResponseBodyLedgerLastTimeAnchor self = new DescribeLedgerResponseBodyLedgerLastTimeAnchor();
            return TeaModel.build(map, self);
        }

        public DescribeLedgerResponseBodyLedgerLastTimeAnchor setJournalId(String journalId) {
            this.journalId = journalId;
            return this;
        }
        public String getJournalId() {
            return this.journalId;
        }

        public DescribeLedgerResponseBodyLedgerLastTimeAnchor setLedgerVersion(String ledgerVersion) {
            this.ledgerVersion = ledgerVersion;
            return this;
        }
        public String getLedgerVersion() {
            return this.ledgerVersion;
        }

        public DescribeLedgerResponseBodyLedgerLastTimeAnchor setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLedgerResponseBodyLedgerLastTimeAnchor setLedgerDigest(String ledgerDigest) {
            this.ledgerDigest = ledgerDigest;
            return this;
        }
        public String getLedgerDigest() {
            return this.ledgerDigest;
        }

        public DescribeLedgerResponseBodyLedgerLastTimeAnchor setLedgerDigestType(String ledgerDigestType) {
            this.ledgerDigestType = ledgerDigestType;
            return this;
        }
        public String getLedgerDigestType() {
            return this.ledgerDigestType;
        }

        public DescribeLedgerResponseBodyLedgerLastTimeAnchor setProof(String proof) {
            this.proof = proof;
            return this;
        }
        public String getProof() {
            return this.proof;
        }

    }

    public static class DescribeLedgerResponseBodyLedger extends TeaModel {
        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("JournalCount")
        public Long journalCount;

        @NameInMap("LedgerDescription")
        public String ledgerDescription;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("LedgerType")
        public String ledgerType;

        @NameInMap("LastTimeAnchor")
        public DescribeLedgerResponseBodyLedgerLastTimeAnchor lastTimeAnchor;

        @NameInMap("LedgerId")
        public String ledgerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("MemberCount")
        public Long memberCount;

        @NameInMap("LedgerStatus")
        public String ledgerStatus;

        @NameInMap("TimeAnchorCount")
        public Long timeAnchorCount;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("LedgerName")
        public String ledgerName;

        @NameInMap("OwnerAliUid")
        public String ownerAliUid;

        public static DescribeLedgerResponseBodyLedger build(java.util.Map<String, ?> map) throws Exception {
            DescribeLedgerResponseBodyLedger self = new DescribeLedgerResponseBodyLedger();
            return TeaModel.build(map, self);
        }

        public DescribeLedgerResponseBodyLedger setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeLedgerResponseBodyLedger setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeLedgerResponseBodyLedger setJournalCount(Long journalCount) {
            this.journalCount = journalCount;
            return this;
        }
        public Long getJournalCount() {
            return this.journalCount;
        }

        public DescribeLedgerResponseBodyLedger setLedgerDescription(String ledgerDescription) {
            this.ledgerDescription = ledgerDescription;
            return this;
        }
        public String getLedgerDescription() {
            return this.ledgerDescription;
        }

        public DescribeLedgerResponseBodyLedger setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLedgerResponseBodyLedger setLedgerType(String ledgerType) {
            this.ledgerType = ledgerType;
            return this;
        }
        public String getLedgerType() {
            return this.ledgerType;
        }

        public DescribeLedgerResponseBodyLedger setLastTimeAnchor(DescribeLedgerResponseBodyLedgerLastTimeAnchor lastTimeAnchor) {
            this.lastTimeAnchor = lastTimeAnchor;
            return this;
        }
        public DescribeLedgerResponseBodyLedgerLastTimeAnchor getLastTimeAnchor() {
            return this.lastTimeAnchor;
        }

        public DescribeLedgerResponseBodyLedger setLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }
        public String getLedgerId() {
            return this.ledgerId;
        }

        public DescribeLedgerResponseBodyLedger setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLedgerResponseBodyLedger setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public DescribeLedgerResponseBodyLedger setLedgerStatus(String ledgerStatus) {
            this.ledgerStatus = ledgerStatus;
            return this;
        }
        public String getLedgerStatus() {
            return this.ledgerStatus;
        }

        public DescribeLedgerResponseBodyLedger setTimeAnchorCount(Long timeAnchorCount) {
            this.timeAnchorCount = timeAnchorCount;
            return this;
        }
        public Long getTimeAnchorCount() {
            return this.timeAnchorCount;
        }

        public DescribeLedgerResponseBodyLedger setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLedgerResponseBodyLedger setLedgerName(String ledgerName) {
            this.ledgerName = ledgerName;
            return this;
        }
        public String getLedgerName() {
            return this.ledgerName;
        }

        public DescribeLedgerResponseBodyLedger setOwnerAliUid(String ownerAliUid) {
            this.ownerAliUid = ownerAliUid;
            return this;
        }
        public String getOwnerAliUid() {
            return this.ownerAliUid;
        }

    }

}
