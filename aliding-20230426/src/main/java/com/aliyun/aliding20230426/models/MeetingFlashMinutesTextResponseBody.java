// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesTextResponseBody extends TeaModel {
    @NameInMap("hasNext")
    public Boolean hasNext;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("paragraphList")
    public java.util.List<MeetingFlashMinutesTextResponseBodyParagraphList> paragraphList;

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

    public static MeetingFlashMinutesTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesTextResponseBody self = new MeetingFlashMinutesTextResponseBody();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesTextResponseBody setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
        return this;
    }
    public Boolean getHasNext() {
        return this.hasNext;
    }

    public MeetingFlashMinutesTextResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public MeetingFlashMinutesTextResponseBody setParagraphList(java.util.List<MeetingFlashMinutesTextResponseBodyParagraphList> paragraphList) {
        this.paragraphList = paragraphList;
        return this;
    }
    public java.util.List<MeetingFlashMinutesTextResponseBodyParagraphList> getParagraphList() {
        return this.paragraphList;
    }

    public MeetingFlashMinutesTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MeetingFlashMinutesTextResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public MeetingFlashMinutesTextResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7920000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>单词</p>
         */
        @NameInMap("word")
        public String word;

        public static MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList self = new MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class MeetingFlashMinutesTextResponseBodyParagraphListSentenceList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7920000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>这里是小钉</p>
         */
        @NameInMap("sentence")
        public String sentence;

        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        @NameInMap("wordList")
        public java.util.List<MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList> wordList;

        public static MeetingFlashMinutesTextResponseBodyParagraphListSentenceList build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesTextResponseBodyParagraphListSentenceList self = new MeetingFlashMinutesTextResponseBodyParagraphListSentenceList();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceList setSentence(String sentence) {
            this.sentence = sentence;
            return this;
        }
        public String getSentence() {
            return this.sentence;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSentenceList setWordList(java.util.List<MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList> wordList) {
            this.wordList = wordList;
            return this;
        }
        public java.util.List<MeetingFlashMinutesTextResponseBodyParagraphListSentenceListWordList> getWordList() {
            return this.wordList;
        }

    }

    public static class MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx">https://xxx</a></p>
         */
        @NameInMap("avatarUrl")
        public String avatarUrl;

        /**
         * <strong>example:</strong>
         * <p>小钉</p>
         */
        @NameInMap("nickName")
        public String nickName;

        public static MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay self = new MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

    }

    public static class MeetingFlashMinutesTextResponseBodyParagraphList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7920000</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>小钉</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>这里是小钉</p>
         */
        @NameInMap("paragraph")
        public String paragraph;

        @NameInMap("sentenceList")
        public java.util.List<MeetingFlashMinutesTextResponseBodyParagraphListSentenceList> sentenceList;

        @NameInMap("speakerDisplay")
        public MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay speakerDisplay;

        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("startTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("userId")
        public String userId;

        public static MeetingFlashMinutesTextResponseBodyParagraphList build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesTextResponseBodyParagraphList self = new MeetingFlashMinutesTextResponseBodyParagraphList();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setParagraph(String paragraph) {
            this.paragraph = paragraph;
            return this;
        }
        public String getParagraph() {
            return this.paragraph;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setSentenceList(java.util.List<MeetingFlashMinutesTextResponseBodyParagraphListSentenceList> sentenceList) {
            this.sentenceList = sentenceList;
            return this;
        }
        public java.util.List<MeetingFlashMinutesTextResponseBodyParagraphListSentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setSpeakerDisplay(MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay speakerDisplay) {
            this.speakerDisplay = speakerDisplay;
            return this;
        }
        public MeetingFlashMinutesTextResponseBodyParagraphListSpeakerDisplay getSpeakerDisplay() {
            return this.speakerDisplay;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public MeetingFlashMinutesTextResponseBodyParagraphList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
