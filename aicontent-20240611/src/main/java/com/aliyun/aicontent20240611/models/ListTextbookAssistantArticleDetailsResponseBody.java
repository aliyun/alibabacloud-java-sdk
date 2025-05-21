// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticleDetailsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTextbookAssistantArticleDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantArticleDetailsResponseBody self = new ListTextbookAssistantArticleDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantArticleDetailsResponseBody setData(java.util.List<ListTextbookAssistantArticleDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyData> getData() {
        return this.data;
    }

    public ListTextbookAssistantArticleDetailsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListTextbookAssistantArticleDetailsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListTextbookAssistantArticleDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTextbookAssistantArticleDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTextbookAssistantArticleDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>I\&quot;m Mike Black</p>
         */
        @NameInMap("answer")
        public String answer;

        /**
         * <strong>example:</strong>
         * <p>From the book, how does Mike Black introduce himself?</p>
         */
        @NameInMap("question")
        public String question;

        @NameInMap("questionTranslate")
        public String questionTranslate;

        public static ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList self = new ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList setAnswer(String answer) {
            this.answer = answer;
            return this;
        }
        public String getAnswer() {
            return this.answer;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList setQuestionTranslate(String questionTranslate) {
            this.questionTranslate = questionTranslate;
            return this;
        }
        public String getQuestionTranslate() {
            return this.questionTranslate;
        }

    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyDataSceneList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>In the park, you introduce yourself to John and ask his name.</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <strong>example:</strong>
         * <p>38cddd70509911efbe6e0c42a106bb02</p>
         */
        @NameInMap("sceneId")
        public String sceneId;

        @NameInMap("sceneImageList")
        public java.util.List<String> sceneImageList;

        @NameInMap("sceneTranslate")
        public String sceneTranslate;

        public static ListTextbookAssistantArticleDetailsResponseBodyDataSceneList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyDataSceneList self = new ListTextbookAssistantArticleDetailsResponseBodyDataSceneList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSceneList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSceneList setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSceneList setSceneImageList(java.util.List<String> sceneImageList) {
            this.sceneImageList = sceneImageList;
            return this;
        }
        public java.util.List<String> getSceneImageList() {
            return this.sceneImageList;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSceneList setSceneTranslate(String sceneTranslate) {
            this.sceneTranslate = sceneTranslate;
            return this;
        }
        public String getSceneTranslate() {
            return this.sceneTranslate;
        }

    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList extends TeaModel {
        @NameInMap("sentenceAnalysis")
        public String sentenceAnalysis;

        /**
         * <strong>example:</strong>
         * <p>4de677d2509811efbe6e0c42a106bb02</p>
         */
        @NameInMap("sentenceId")
        public String sentenceId;

        /**
         * <strong>example:</strong>
         * <p>I\&quot;m Mike Black</p>
         */
        @NameInMap("sentenceText")
        public String sentenceText;

        public static ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList self = new ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList setSentenceAnalysis(String sentenceAnalysis) {
            this.sentenceAnalysis = sentenceAnalysis;
            return this;
        }
        public String getSentenceAnalysis() {
            return this.sentenceAnalysis;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList setSentenceId(String sentenceId) {
            this.sentenceId = sentenceId;
            return this;
        }
        public String getSentenceId() {
            return this.sentenceId;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList setSentenceText(String sentenceText) {
            this.sentenceText = sentenceText;
            return this;
        }
        public String getSentenceText() {
            return this.sentenceText;
        }

    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyDataTheme extends TeaModel {
        @NameInMap("themeImageList")
        public java.util.List<String> themeImageList;

        @NameInMap("themeName")
        public String themeName;

        /**
         * <strong>example:</strong>
         * <p>Self-awareness, self-management, self-improvement</p>
         */
        @NameInMap("themeTranslate")
        public String themeTranslate;

        public static ListTextbookAssistantArticleDetailsResponseBodyDataTheme build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyDataTheme self = new ListTextbookAssistantArticleDetailsResponseBodyDataTheme();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataTheme setThemeImageList(java.util.List<String> themeImageList) {
            this.themeImageList = themeImageList;
            return this;
        }
        public java.util.List<String> getThemeImageList() {
            return this.themeImageList;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataTheme setThemeName(String themeName) {
            this.themeName = themeName;
            return this;
        }
        public String getThemeName() {
            return this.themeName;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataTheme setThemeTranslate(String themeTranslate) {
            this.themeTranslate = themeTranslate;
            return this;
        }
        public String getThemeTranslate() {
            return this.themeTranslate;
        }

    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyDataTopic extends TeaModel {
        @NameInMap("topicImageList")
        public java.util.List<String> topicImageList;

        @NameInMap("topicName")
        public String topicName;

        /**
         * <strong>example:</strong>
         * <p>Greetings and self-introduction</p>
         */
        @NameInMap("topicTranslate")
        public String topicTranslate;

        public static ListTextbookAssistantArticleDetailsResponseBodyDataTopic build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyDataTopic self = new ListTextbookAssistantArticleDetailsResponseBodyDataTopic();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataTopic setTopicImageList(java.util.List<String> topicImageList) {
            this.topicImageList = topicImageList;
            return this;
        }
        public java.util.List<String> getTopicImageList() {
            return this.topicImageList;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataTopic setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataTopic setTopicTranslate(String topicTranslate) {
            this.topicTranslate = topicTranslate;
            return this;
        }
        public String getTopicTranslate() {
            return this.topicTranslate;
        }

    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyDataWordList extends TeaModel {
        @NameInMap("wordAnalysis")
        public String wordAnalysis;

        /**
         * <strong>example:</strong>
         * <p>a94df134ed8c11eebe6e0c42a106bb02</p>
         */
        @NameInMap("wordId")
        public String wordId;

        /**
         * <strong>example:</strong>
         * <p>nice</p>
         */
        @NameInMap("wordText")
        public String wordText;

        public static ListTextbookAssistantArticleDetailsResponseBodyDataWordList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyDataWordList self = new ListTextbookAssistantArticleDetailsResponseBodyDataWordList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataWordList setWordAnalysis(String wordAnalysis) {
            this.wordAnalysis = wordAnalysis;
            return this;
        }
        public String getWordAnalysis() {
            return this.wordAnalysis;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataWordList setWordId(String wordId) {
            this.wordId = wordId;
            return this;
        }
        public String getWordId() {
            return this.wordId;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyDataWordList setWordText(String wordText) {
            this.wordText = wordText;
            return this;
        }
        public String getWordText() {
            return this.wordText;
        }

    }

    public static class ListTextbookAssistantArticleDetailsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0c05700d4d9411efbe6e0c42a106bb02</p>
         */
        @NameInMap("articleId")
        public String articleId;

        @NameInMap("questionList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList> questionList;

        @NameInMap("sceneList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSceneList> sceneList;

        @NameInMap("sentenceList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList> sentenceList;

        @NameInMap("target")
        public String target;

        @NameInMap("theme")
        public ListTextbookAssistantArticleDetailsResponseBodyDataTheme theme;

        @NameInMap("topic")
        public ListTextbookAssistantArticleDetailsResponseBodyDataTopic topic;

        @NameInMap("wordList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataWordList> wordList;

        public static ListTextbookAssistantArticleDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantArticleDetailsResponseBodyData self = new ListTextbookAssistantArticleDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setArticleId(String articleId) {
            this.articleId = articleId;
            return this;
        }
        public String getArticleId() {
            return this.articleId;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setQuestionList(java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList> questionList) {
            this.questionList = questionList;
            return this;
        }
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList> getQuestionList() {
            return this.questionList;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setSceneList(java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSceneList> sceneList) {
            this.sceneList = sceneList;
            return this;
        }
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSceneList> getSceneList() {
            return this.sceneList;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setSentenceList(java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList> sentenceList) {
            this.sentenceList = sentenceList;
            return this;
        }
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setTheme(ListTextbookAssistantArticleDetailsResponseBodyDataTheme theme) {
            this.theme = theme;
            return this;
        }
        public ListTextbookAssistantArticleDetailsResponseBodyDataTheme getTheme() {
            return this.theme;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setTopic(ListTextbookAssistantArticleDetailsResponseBodyDataTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListTextbookAssistantArticleDetailsResponseBodyDataTopic getTopic() {
            return this.topic;
        }

        public ListTextbookAssistantArticleDetailsResponseBodyData setWordList(java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataWordList> wordList) {
            this.wordList = wordList;
            return this;
        }
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataWordList> getWordList() {
            return this.wordList;
        }

    }

}
