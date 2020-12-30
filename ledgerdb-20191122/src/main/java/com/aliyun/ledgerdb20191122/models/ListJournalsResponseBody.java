// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class ListJournalsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Journals")
    public java.util.List<ListJournalsResponseBodyJournals> journals;

    public static ListJournalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJournalsResponseBody self = new ListJournalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJournalsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListJournalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJournalsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListJournalsResponseBody setJournals(java.util.List<ListJournalsResponseBodyJournals> journals) {
        this.journals = journals;
        return this;
    }
    public java.util.List<ListJournalsResponseBodyJournals> getJournals() {
        return this.journals;
    }

    public static class ListJournalsResponseBodyJournals extends TeaModel {
        @NameInMap("JournalId")
        public String journalId;

        @NameInMap("Clues")
        public java.util.List<String> clues;

        @NameInMap("PayloadJsonString")
        public String payloadJsonString;

        @NameInMap("JournalHash")
        public String journalHash;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("LedgerId")
        public String ledgerId;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("PayloadType")
        public String payloadType;

        @NameInMap("ClientId")
        public String clientId;

        public static ListJournalsResponseBodyJournals build(java.util.Map<String, ?> map) throws Exception {
            ListJournalsResponseBodyJournals self = new ListJournalsResponseBodyJournals();
            return TeaModel.build(map, self);
        }

        public ListJournalsResponseBodyJournals setJournalId(String journalId) {
            this.journalId = journalId;
            return this;
        }
        public String getJournalId() {
            return this.journalId;
        }

        public ListJournalsResponseBodyJournals setClues(java.util.List<String> clues) {
            this.clues = clues;
            return this;
        }
        public java.util.List<String> getClues() {
            return this.clues;
        }

        public ListJournalsResponseBodyJournals setPayloadJsonString(String payloadJsonString) {
            this.payloadJsonString = payloadJsonString;
            return this;
        }
        public String getPayloadJsonString() {
            return this.payloadJsonString;
        }

        public ListJournalsResponseBodyJournals setJournalHash(String journalHash) {
            this.journalHash = journalHash;
            return this;
        }
        public String getJournalHash() {
            return this.journalHash;
        }

        public ListJournalsResponseBodyJournals setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListJournalsResponseBodyJournals setLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }
        public String getLedgerId() {
            return this.ledgerId;
        }

        public ListJournalsResponseBodyJournals setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListJournalsResponseBodyJournals setPayloadType(String payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        public String getPayloadType() {
            return this.payloadType;
        }

        public ListJournalsResponseBodyJournals setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
