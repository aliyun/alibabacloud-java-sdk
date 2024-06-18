// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesTextResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasMore")
    public Boolean hasMore;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("paragraphList")
    public java.util.List<QueryMinutesTextResponseBodyParagraphList> paragraphList;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static QueryMinutesTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesTextResponseBody self = new QueryMinutesTextResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMinutesTextResponseBody setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }
    public Boolean getHasMore() {
        return this.hasMore;
    }

    public QueryMinutesTextResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryMinutesTextResponseBody setParagraphList(java.util.List<QueryMinutesTextResponseBodyParagraphList> paragraphList) {
        this.paragraphList = paragraphList;
        return this;
    }
    public java.util.List<QueryMinutesTextResponseBodyParagraphList> getParagraphList() {
        return this.paragraphList;
    }

    public QueryMinutesTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMinutesTextResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryMinutesTextResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryMinutesTextResponseBodyParagraphListSentenceListWordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>单词</p>
         */
        @NameInMap("Word")
        public String word;

        /**
         * <strong>example:</strong>
         * <p>172</p>
         */
        @NameInMap("WordId")
        public String wordId;

        public static QueryMinutesTextResponseBodyParagraphListSentenceListWordList build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesTextResponseBodyParagraphListSentenceListWordList self = new QueryMinutesTextResponseBodyParagraphListSentenceListWordList();
            return TeaModel.build(map, self);
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceListWordList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceListWordList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceListWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceListWordList setWordId(String wordId) {
            this.wordId = wordId;
            return this;
        }
        public String getWordId() {
            return this.wordId;
        }

    }

    public static class QueryMinutesTextResponseBodyParagraphListSentenceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>这里是小钉</p>
         */
        @NameInMap("Sentence")
        public String sentence;

        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("WordList")
        public java.util.List<QueryMinutesTextResponseBodyParagraphListSentenceListWordList> wordList;

        public static QueryMinutesTextResponseBodyParagraphListSentenceList build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesTextResponseBodyParagraphListSentenceList self = new QueryMinutesTextResponseBodyParagraphListSentenceList();
            return TeaModel.build(map, self);
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceList setSentence(String sentence) {
            this.sentence = sentence;
            return this;
        }
        public String getSentence() {
            return this.sentence;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QueryMinutesTextResponseBodyParagraphListSentenceList setWordList(java.util.List<QueryMinutesTextResponseBodyParagraphListSentenceListWordList> wordList) {
            this.wordList = wordList;
            return this;
        }
        public java.util.List<QueryMinutesTextResponseBodyParagraphListSentenceListWordList> getWordList() {
            return this.wordList;
        }

    }

    public static class QueryMinutesTextResponseBodyParagraphList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>小钉</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Paragraph")
        public String paragraph;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ParagraphId")
        public Long paragraphId;

        /**
         * <strong>example:</strong>
         * <p>44444</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("SentenceList")
        public java.util.List<QueryMinutesTextResponseBodyParagraphListSentenceList> sentenceList;

        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static QueryMinutesTextResponseBodyParagraphList build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesTextResponseBodyParagraphList self = new QueryMinutesTextResponseBodyParagraphList();
            return TeaModel.build(map, self);
        }

        public QueryMinutesTextResponseBodyParagraphList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public QueryMinutesTextResponseBodyParagraphList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryMinutesTextResponseBodyParagraphList setParagraph(String paragraph) {
            this.paragraph = paragraph;
            return this;
        }
        public String getParagraph() {
            return this.paragraph;
        }

        public QueryMinutesTextResponseBodyParagraphList setParagraphId(Long paragraphId) {
            this.paragraphId = paragraphId;
            return this;
        }
        public Long getParagraphId() {
            return this.paragraphId;
        }

        public QueryMinutesTextResponseBodyParagraphList setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public QueryMinutesTextResponseBodyParagraphList setSentenceList(java.util.List<QueryMinutesTextResponseBodyParagraphListSentenceList> sentenceList) {
            this.sentenceList = sentenceList;
            return this;
        }
        public java.util.List<QueryMinutesTextResponseBodyParagraphListSentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public QueryMinutesTextResponseBodyParagraphList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public QueryMinutesTextResponseBodyParagraphList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
