// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GetJournalResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Journal")
    public GetJournalResponseBodyJournal journal;

    public static GetJournalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJournalResponseBody self = new GetJournalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJournalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetJournalResponseBody setJournal(GetJournalResponseBodyJournal journal) {
        this.journal = journal;
        return this;
    }
    public GetJournalResponseBodyJournal getJournal() {
        return this.journal;
    }

    public static class GetJournalResponseBodyJournal extends TeaModel {
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

        public static GetJournalResponseBodyJournal build(java.util.Map<String, ?> map) throws Exception {
            GetJournalResponseBodyJournal self = new GetJournalResponseBodyJournal();
            return TeaModel.build(map, self);
        }

        public GetJournalResponseBodyJournal setJournalId(String journalId) {
            this.journalId = journalId;
            return this;
        }
        public String getJournalId() {
            return this.journalId;
        }

        public GetJournalResponseBodyJournal setClues(java.util.List<String> clues) {
            this.clues = clues;
            return this;
        }
        public java.util.List<String> getClues() {
            return this.clues;
        }

        public GetJournalResponseBodyJournal setPayloadJsonString(String payloadJsonString) {
            this.payloadJsonString = payloadJsonString;
            return this;
        }
        public String getPayloadJsonString() {
            return this.payloadJsonString;
        }

        public GetJournalResponseBodyJournal setJournalHash(String journalHash) {
            this.journalHash = journalHash;
            return this;
        }
        public String getJournalHash() {
            return this.journalHash;
        }

        public GetJournalResponseBodyJournal setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetJournalResponseBodyJournal setLedgerId(String ledgerId) {
            this.ledgerId = ledgerId;
            return this;
        }
        public String getLedgerId() {
            return this.ledgerId;
        }

        public GetJournalResponseBodyJournal setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public GetJournalResponseBodyJournal setPayloadType(String payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        public String getPayloadType() {
            return this.payloadType;
        }

        public GetJournalResponseBodyJournal setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

}
