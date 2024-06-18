// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class QueryMinutesSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("summary")
    public QueryMinutesSummaryResponseBodySummary summary;

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

    public static QueryMinutesSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMinutesSummaryResponseBody self = new QueryMinutesSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMinutesSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMinutesSummaryResponseBody setSummary(QueryMinutesSummaryResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }
    public QueryMinutesSummaryResponseBodySummary getSummary() {
        return this.summary;
    }

    public QueryMinutesSummaryResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public QueryMinutesSummaryResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

    public static class QueryMinutesSummaryResponseBodySummaryActions extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SentenceId")
        public Long sentenceId;

        /**
         * <strong>example:</strong>
         * <p>7901100</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <strong>example:</strong>
         * <p>内容</p>
         */
        @NameInMap("Text")
        public String text;

        public static QueryMinutesSummaryResponseBodySummaryActions build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryResponseBodySummaryActions self = new QueryMinutesSummaryResponseBodySummaryActions();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryResponseBodySummaryActions setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public QueryMinutesSummaryResponseBodySummaryActions setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMinutesSummaryResponseBodySummaryActions setSentenceId(Long sentenceId) {
            this.sentenceId = sentenceId;
            return this;
        }
        public Long getSentenceId() {
            return this.sentenceId;
        }

        public QueryMinutesSummaryResponseBodySummaryActions setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public QueryMinutesSummaryResponseBodySummaryActions setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMinutesSummaryResponseBodySummaryAutoChapters extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>章节的一句话标题</p>
         */
        @NameInMap("Headline")
        public String headline;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>7901100</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <strong>example:</strong>
         * <p>章节总结</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static QueryMinutesSummaryResponseBodySummaryAutoChapters build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryResponseBodySummaryAutoChapters self = new QueryMinutesSummaryResponseBodySummaryAutoChapters();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryResponseBodySummaryAutoChapters setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public QueryMinutesSummaryResponseBodySummaryAutoChapters setHeadline(String headline) {
            this.headline = headline;
            return this;
        }
        public String getHeadline() {
            return this.headline;
        }

        public QueryMinutesSummaryResponseBodySummaryAutoChapters setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMinutesSummaryResponseBodySummaryAutoChapters setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public QueryMinutesSummaryResponseBodySummaryAutoChapters setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class QueryMinutesSummaryResponseBodySummaryConversationalSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>012345</p>
         */
        @NameInMap("SpeakerId")
        public String speakerId;

        /**
         * <strong>example:</strong>
         * <p>发言人姓名</p>
         */
        @NameInMap("SpeakerName")
        public String speakerName;

        /**
         * <strong>example:</strong>
         * <p>发言人对应的总结</p>
         */
        @NameInMap("Summary")
        public String summary;

        public static QueryMinutesSummaryResponseBodySummaryConversationalSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryResponseBodySummaryConversationalSummary self = new QueryMinutesSummaryResponseBodySummaryConversationalSummary();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryResponseBodySummaryConversationalSummary setSpeakerId(String speakerId) {
            this.speakerId = speakerId;
            return this;
        }
        public String getSpeakerId() {
            return this.speakerId;
        }

        public QueryMinutesSummaryResponseBodySummaryConversationalSummary setSpeakerName(String speakerName) {
            this.speakerName = speakerName;
            return this;
        }
        public String getSpeakerName() {
            return this.speakerName;
        }

        public QueryMinutesSummaryResponseBodySummaryConversationalSummary setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class QueryMinutesSummaryResponseBodySummaryKeySentences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7910000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SentenceId")
        public Long sentenceId;

        /**
         * <strong>example:</strong>
         * <p>7901100</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <strong>example:</strong>
         * <p>内容</p>
         */
        @NameInMap("Text")
        public String text;

        public static QueryMinutesSummaryResponseBodySummaryKeySentences build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryResponseBodySummaryKeySentences self = new QueryMinutesSummaryResponseBodySummaryKeySentences();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryResponseBodySummaryKeySentences setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public QueryMinutesSummaryResponseBodySummaryKeySentences setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryMinutesSummaryResponseBodySummaryKeySentences setSentenceId(Long sentenceId) {
            this.sentenceId = sentenceId;
            return this;
        }
        public Long getSentenceId() {
            return this.sentenceId;
        }

        public QueryMinutesSummaryResponseBodySummaryKeySentences setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public QueryMinutesSummaryResponseBodySummaryKeySentences setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>问题</p>
         */
        @NameInMap("Answer")
        public String answer;

        /**
         * <strong>example:</strong>
         * <p>回答</p>
         */
        @NameInMap("Question")
        public String question;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("SentenceIdsOfAnswer")
        public java.util.List<Long> sentenceIdsOfAnswer;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("SentenceIdsOfQuestion")
        public java.util.List<Long> sentenceIdsOfQuestion;

        public static QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary self = new QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary setSentenceIdsOfAnswer(java.util.List<Long> sentenceIdsOfAnswer) {
            this.sentenceIdsOfAnswer = sentenceIdsOfAnswer;
            return this;
        }
        public java.util.List<Long> getSentenceIdsOfAnswer() {
            return this.sentenceIdsOfAnswer;
        }

        public QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary setSentenceIdsOfQuestion(java.util.List<Long> sentenceIdsOfQuestion) {
            this.sentenceIdsOfQuestion = sentenceIdsOfQuestion;
            return this;
        }
        public java.util.List<Long> getSentenceIdsOfQuestion() {
            return this.sentenceIdsOfQuestion;
        }

    }

    public static class QueryMinutesSummaryResponseBodySummary extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Actions")
        public QueryMinutesSummaryResponseBodySummaryActions actions;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("AutoChapters")
        public java.util.List<QueryMinutesSummaryResponseBodySummaryAutoChapters> autoChapters;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("ConversationalSummary")
        public java.util.List<QueryMinutesSummaryResponseBodySummaryConversationalSummary> conversationalSummary;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("KeySentences")
        public QueryMinutesSummaryResponseBodySummaryKeySentences keySentences;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        /**
         * <strong>example:</strong>
         * <p>全文摘要结果，全文摘要通过两三百字的篇幅将最重要的信息呈现出来，用于快速了解记录内容与主旨</p>
         */
        @NameInMap("ParagraphSummary")
        public String paragraphSummary;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("QuestionsAnsweringSummary")
        public java.util.List<QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary> questionsAnsweringSummary;

        public static QueryMinutesSummaryResponseBodySummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMinutesSummaryResponseBodySummary self = new QueryMinutesSummaryResponseBodySummary();
            return TeaModel.build(map, self);
        }

        public QueryMinutesSummaryResponseBodySummary setActions(QueryMinutesSummaryResponseBodySummaryActions actions) {
            this.actions = actions;
            return this;
        }
        public QueryMinutesSummaryResponseBodySummaryActions getActions() {
            return this.actions;
        }

        public QueryMinutesSummaryResponseBodySummary setAutoChapters(java.util.List<QueryMinutesSummaryResponseBodySummaryAutoChapters> autoChapters) {
            this.autoChapters = autoChapters;
            return this;
        }
        public java.util.List<QueryMinutesSummaryResponseBodySummaryAutoChapters> getAutoChapters() {
            return this.autoChapters;
        }

        public QueryMinutesSummaryResponseBodySummary setConversationalSummary(java.util.List<QueryMinutesSummaryResponseBodySummaryConversationalSummary> conversationalSummary) {
            this.conversationalSummary = conversationalSummary;
            return this;
        }
        public java.util.List<QueryMinutesSummaryResponseBodySummaryConversationalSummary> getConversationalSummary() {
            return this.conversationalSummary;
        }

        public QueryMinutesSummaryResponseBodySummary setKeySentences(QueryMinutesSummaryResponseBodySummaryKeySentences keySentences) {
            this.keySentences = keySentences;
            return this;
        }
        public QueryMinutesSummaryResponseBodySummaryKeySentences getKeySentences() {
            return this.keySentences;
        }

        public QueryMinutesSummaryResponseBodySummary setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public QueryMinutesSummaryResponseBodySummary setParagraphSummary(String paragraphSummary) {
            this.paragraphSummary = paragraphSummary;
            return this;
        }
        public String getParagraphSummary() {
            return this.paragraphSummary;
        }

        public QueryMinutesSummaryResponseBodySummary setQuestionsAnsweringSummary(java.util.List<QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary> questionsAnsweringSummary) {
            this.questionsAnsweringSummary = questionsAnsweringSummary;
            return this;
        }
        public java.util.List<QueryMinutesSummaryResponseBodySummaryQuestionsAnsweringSummary> getQuestionsAnsweringSummary() {
            return this.questionsAnsweringSummary;
        }

    }

}
