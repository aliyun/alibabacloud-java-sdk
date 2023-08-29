// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryCloudRecordTextResponseBody extends TeaModel {
    @NameInMap("hasMore")
    public Boolean hasMore;

    @NameInMap("paragraphList")
    public java.util.List<QueryCloudRecordTextResponseBodyParagraphList> paragraphList;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static QueryCloudRecordTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCloudRecordTextResponseBody self = new QueryCloudRecordTextResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCloudRecordTextResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryCloudRecordTextResponseBody setParagraphList(java.util.List<QueryCloudRecordTextResponseBodyParagraphList> paragraphList) {
        this.paragraphList = paragraphList;
        return this;
    }
    public java.util.List<QueryCloudRecordTextResponseBodyParagraphList> getParagraphList() {
        return this.paragraphList;
    }

    public QueryCloudRecordTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Word")
        public String word;

        @NameInMap("WordId")
        public String wordId;

        public static QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList self = new QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList setWordId(String wordId) {
            this.wordId = wordId;
            return this;
        }
        public String getWordId() {
            return this.wordId;
        }

    }

    public static class QueryCloudRecordTextResponseBodyParagraphListSentenceList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Sentence")
        public String sentence;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("WordList")
        public java.util.List<QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList> wordList;

        public static QueryCloudRecordTextResponseBodyParagraphListSentenceList build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordTextResponseBodyParagraphListSentenceList self = new QueryCloudRecordTextResponseBodyParagraphListSentenceList();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceList setSentence(String sentence) {
            this.sentence = sentence;
            return this;
        }
        public String getSentence() {
            return this.sentence;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryCloudRecordTextResponseBodyParagraphListSentenceList setWordList(java.util.List<QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList> wordList) {
            this.wordList = wordList;
            return this;
        }
        public java.util.List<QueryCloudRecordTextResponseBodyParagraphListSentenceListWordList> getWordList() {
            return this.wordList;
        }

    }

    public static class QueryCloudRecordTextResponseBodyParagraphList extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("NextTtoken")
        public Long nextTtoken;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Paragraph")
        public String paragraph;

        @NameInMap("RecordId")
        public Long recordId;

        @NameInMap("SentenceList")
        public java.util.List<QueryCloudRecordTextResponseBodyParagraphListSentenceList> sentenceList;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Long status;

        @NameInMap("UserId")
        public String userId;

        public static QueryCloudRecordTextResponseBodyParagraphList build(java.util.Map<String, ?> map) throws Exception {
            QueryCloudRecordTextResponseBodyParagraphList self = new QueryCloudRecordTextResponseBodyParagraphList();
            return TeaModel.build(map, self);
        }

        public QueryCloudRecordTextResponseBodyParagraphList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setNextTtoken(Long nextTtoken) {
            this.nextTtoken = nextTtoken;
            return this;
        }
        public Long getNextTtoken() {
            return this.nextTtoken;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setParagraph(String paragraph) {
            this.paragraph = paragraph;
            return this;
        }
        public String getParagraph() {
            return this.paragraph;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setSentenceList(java.util.List<QueryCloudRecordTextResponseBodyParagraphListSentenceList> sentenceList) {
            this.sentenceList = sentenceList;
            return this;
        }
        public java.util.List<QueryCloudRecordTextResponseBodyParagraphListSentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public QueryCloudRecordTextResponseBodyParagraphList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
