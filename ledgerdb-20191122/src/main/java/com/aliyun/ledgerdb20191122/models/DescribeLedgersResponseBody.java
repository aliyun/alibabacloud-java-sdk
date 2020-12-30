// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class DescribeLedgersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Ledgers")
    public java.util.List<DescribeLedgersResponseBodyLedgers> ledgers;

    public static DescribeLedgersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLedgersResponseBody self = new DescribeLedgersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLedgersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeLedgersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLedgersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeLedgersResponseBody setLedgers(java.util.List<DescribeLedgersResponseBodyLedgers> ledgers) {
        this.ledgers = ledgers;
        return this;
    }
    public java.util.List<DescribeLedgersResponseBodyLedgers> getLedgers() {
        return this.ledgers;
    }

    public static class DescribeLedgersResponseBodyLedgersLastTimeAnchor extends TeaModel {
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

        public static DescribeLedgersResponseBodyLedgersLastTimeAnchor build(java.util.Map<String, ?> map) throws Exception {
            DescribeLedgersResponseBodyLedgersLastTimeAnchor self = new DescribeLedgersResponseBodyLedgersLastTimeAnchor();
            return TeaModel.build(map, self);
        }

        public DescribeLedgersResponseBodyLedgersLastTimeAnchor setJournalId(String journalId) {
            this.journalId = journalId;
            return this;
        }
        public String getJournalId() {
            return this.journalId;
        }

        public DescribeLedgersResponseBodyLedgersLastTimeAnchor setLedgerVersion(String ledgerVersion) {
            this.ledgerVersion = ledgerVersion;
            return this;
        }
        public String getLedgerVersion() {
            return this.ledgerVersion;
        }

        public DescribeLedgersResponseBodyLedgersLastTimeAnchor setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeLedgersResponseBodyLedgersLastTimeAnchor setLedgerDigest(String ledgerDigest) {
            this.ledgerDigest = ledgerDigest;
            return this;
        }
        public String getLedgerDigest() {
            return this.ledgerDigest;
        }

        public DescribeLedgersResponseBodyLedgersLastTimeAnchor setLedgerDigestType(String ledgerDigestType) {
            this.ledgerDigestType = ledgerDigestType;
            return this;
        }
        public String getLedgerDigestType() {
            return this.ledgerDigestType;
        }

        public DescribeLedgersResponseBodyLedgersLastTimeAnchor setProof(String proof) {
            this.proof = proof;
            return this;
        }
        public String getProof() {
            return this.proof;
        }

    }

    public static class DescribeLedgersResponseBodyLedgers extends TeaModel {
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
        public DescribeLedgersResponseBodyLedgersLastTimeAnchor lastTimeAnchor;

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

        public static DescribeLedgersResponseBodyLedgers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLedgersResponseBodyLedgers self = new DescribeLedgersResponseBodyLedgers();
            return TeaModel.build(map, self);
        }

        public DescribeLedgersResponseBodyLedgers setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeLedgersResponseBodyLedgers setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public DescribeLedgersResponseBodyLedgers setJournalCount(Long journalCount) {
            this.journalCount = journalCount;
            return this;
        }
        public Long getJournalCount() {
            return this.journalCount;
        }

        public DescribeLedgersResponseBodyLedgers setLedgerDescription(String ledgerDescription) {
            this.ledgerDescription = ledgerDescription;
            return this;
        }
        public String getLedgerDescription() {
            return this.ledgerDescription;
        }

        public DescribeLedgersResponseBodyLedgers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLedgersResponseBodyLedgers setLedgerType(String ledgerType) {
            this.ledgerType = ledgerType;
            return this;
        }
        public String getLedgerType() {
            return this.ledgerType;
        }

        public DescribeLedgersResponseBodyLedgers setLastTimeAnchor(DescribeLedgersResponseBodyLedgersLastTimeAnchor lastTimeAnchor) {
            this.lastTimeAnchor = lastTimeAnchor;
            return this;
        }
        public DescribeLedgersResponseBodyLedgersLastTimeAnchor getLastTimeAnchor() {
            return this.lastTimeAnchor;
        }

        public DescribeLedgersResponseBodyLedgers setLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }
        public String getLedgerId() {
            return this.ledgerId;
        }

        public DescribeLedgersResponseBodyLedgers setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeLedgersResponseBodyLedgers setMemberCount(Long memberCount) {
            this.memberCount = memberCount;
            return this;
        }
        public Long getMemberCount() {
            return this.memberCount;
        }

        public DescribeLedgersResponseBodyLedgers setLedgerStatus(String ledgerStatus) {
            this.ledgerStatus = ledgerStatus;
            return this;
        }
        public String getLedgerStatus() {
            return this.ledgerStatus;
        }

        public DescribeLedgersResponseBodyLedgers setTimeAnchorCount(Long timeAnchorCount) {
            this.timeAnchorCount = timeAnchorCount;
            return this;
        }
        public Long getTimeAnchorCount() {
            return this.timeAnchorCount;
        }

        public DescribeLedgersResponseBodyLedgers setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeLedgersResponseBodyLedgers setLedgerName(String ledgerName) {
            this.ledgerName = ledgerName;
            return this;
        }
        public String getLedgerName() {
            return this.ledgerName;
        }

        public DescribeLedgersResponseBodyLedgers setOwnerAliUid(String ownerAliUid) {
            this.ownerAliUid = ownerAliUid;
            return this;
        }
        public String getOwnerAliUid() {
            return this.ownerAliUid;
        }

    }

}
