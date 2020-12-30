// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListTimeAnchorsResponseBody extends TeaModel {
    @NameInMap("TimeAnchors")
    public java.util.List<ListTimeAnchorsResponseBodyTimeAnchors> timeAnchors;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListTimeAnchorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTimeAnchorsResponseBody self = new ListTimeAnchorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTimeAnchorsResponseBody setTimeAnchors(java.util.List<ListTimeAnchorsResponseBodyTimeAnchors> timeAnchors) {
        this.timeAnchors = timeAnchors;
        return this;
    }
    public java.util.List<ListTimeAnchorsResponseBodyTimeAnchors> getTimeAnchors() {
        return this.timeAnchors;
    }

    public ListTimeAnchorsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTimeAnchorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTimeAnchorsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class ListTimeAnchorsResponseBodyTimeAnchors extends TeaModel {
        @NameInMap("JournalId")
        public Long journalId;

        @NameInMap("LedgerVersion")
        public Long ledgerVersion;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        @NameInMap("LedgerDigest")
        public String ledgerDigest;

        @NameInMap("LedgerDigestType")
        public String ledgerDigestType;

        @NameInMap("Proof")
        public String proof;

        public static ListTimeAnchorsResponseBodyTimeAnchors build(java.util.Map<String, ?> map) throws Exception {
            ListTimeAnchorsResponseBodyTimeAnchors self = new ListTimeAnchorsResponseBodyTimeAnchors();
            return TeaModel.build(map, self);
        }

        public ListTimeAnchorsResponseBodyTimeAnchors setJournalId(Long journalId) {
            this.journalId = journalId;
            return this;
        }
        public Long getJournalId() {
            return this.journalId;
        }

        public ListTimeAnchorsResponseBodyTimeAnchors setLedgerVersion(Long ledgerVersion) {
            this.ledgerVersion = ledgerVersion;
            return this;
        }
        public Long getLedgerVersion() {
            return this.ledgerVersion;
        }

        public ListTimeAnchorsResponseBodyTimeAnchors setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public ListTimeAnchorsResponseBodyTimeAnchors setLedgerDigest(String ledgerDigest) {
            this.ledgerDigest = ledgerDigest;
            return this;
        }
        public String getLedgerDigest() {
            return this.ledgerDigest;
        }

        public ListTimeAnchorsResponseBodyTimeAnchors setLedgerDigestType(String ledgerDigestType) {
            this.ledgerDigestType = ledgerDigestType;
            return this;
        }
        public String getLedgerDigestType() {
            return this.ledgerDigestType;
        }

        public ListTimeAnchorsResponseBodyTimeAnchors setProof(String proof) {
            this.proof = proof;
            return this;
        }
        public String getProof() {
            return this.proof;
        }

    }

}
