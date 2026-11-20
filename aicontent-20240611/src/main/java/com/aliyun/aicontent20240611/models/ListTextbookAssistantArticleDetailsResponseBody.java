// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticleDetailsResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("data")
    public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UNKNOWN_ERROR</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
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
     * <p>Indicates whether the API call is successful.</p>
     * <ul>
     * <li><p><strong>true</strong>: Successful.</p>
     * </li>
     * <li><p><strong>false</strong>: Failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The answer to the question.</p>
         * 
         * <strong>example:</strong>
         * <p>I\&quot;m Mike Black</p>
         */
        @NameInMap("answer")
        public String answer;

        /**
         * <p>The question content.</p>
         * 
         * <strong>example:</strong>
         * <p>From the book, how does Mike Black introduce himself?</p>
         */
        @NameInMap("question")
        public String question;

        /**
         * <p>The translation of the question content.</p>
         * 
         * <strong>example:</strong>
         * <p>According to the article, how does Mike Black introduce himself?</p>
         */
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
         * <p>The scene description.</p>
         * 
         * <strong>example:</strong>
         * <p>In the park, you introduce yourself to John and ask his name.</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38cddd70509911efbe6e0c42a106bb02</p>
         */
        @NameInMap("sceneId")
        public String sceneId;

        /**
         * <p>The images related to the current scene.</p>
         */
        @NameInMap("sceneImageList")
        public java.util.List<String> sceneImageList;

        /**
         * <p>The translation of the scene description.</p>
         * 
         * <strong>example:</strong>
         * <p>At a cafe, share the story of how you met your friends</p>
         */
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
        /**
         * <p>The sentence analysis and explanation.</p>
         * 
         * <strong>example:</strong>
         * <p>Subject + be verb (am/is/are) + name</p>
         */
        @NameInMap("sentenceAnalysis")
        public String sentenceAnalysis;

        /**
         * <p>The sentence ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4de677d2509811efbe6e0c42a106bb02</p>
         */
        @NameInMap("sentenceId")
        public String sentenceId;

        /**
         * <p>The sentence text.</p>
         * 
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
        /**
         * <p>The images related to the current theme.</p>
         */
        @NameInMap("themeImageList")
        public java.util.List<String> themeImageList;

        /**
         * <p>The theme name.</p>
         * 
         * <strong>example:</strong>
         * <p>Self-awareness and improvement</p>
         */
        @NameInMap("themeName")
        public String themeName;

        /**
         * <p>The translation of the theme name.</p>
         * 
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
        /**
         * <p>The images related to the current topic.</p>
         */
        @NameInMap("topicImageList")
        public java.util.List<String> topicImageList;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Greetings and self-introductions</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <p>The translation of the topic content.</p>
         * 
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
        /**
         * <p>The word definition.</p>
         * 
         * <strong>example:</strong>
         * <p>Pleasant; friendly</p>
         */
        @NameInMap("wordAnalysis")
        public String wordAnalysis;

        /**
         * <p>The word ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a94df134ed8c11eebe6e0c42a106bb02</p>
         */
        @NameInMap("wordId")
        public String wordId;

        /**
         * <p>The word text.</p>
         * 
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
         * <p>The article ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0c05700d4d9411efbe6e0c42a106bb02</p>
         */
        @NameInMap("articleId")
        public String articleId;

        /**
         * <p>The question and answer data.</p>
         */
        @NameInMap("questionList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataQuestionList> questionList;

        /**
         * <p>The scene list.</p>
         */
        @NameInMap("sceneList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSceneList> sceneList;

        /**
         * <p>The sentence list.</p>
         */
        @NameInMap("sentenceList")
        public java.util.List<ListTextbookAssistantArticleDetailsResponseBodyDataSentenceList> sentenceList;

        /**
         * <p>The practice objective.</p>
         * 
         * <strong>example:</strong>
         * <ol>
         * <li>Be able to use the sentence pattern &quot;What\&quot;s your name? My name is/I\&quot;m...&quot; to ask and answer during self-introductions.\n2. Be able to use the sentence pattern &quot;Nice to meet you (too).&quot; to greet new friends</li>
         * </ol>
         */
        @NameInMap("target")
        public String target;

        /**
         * <p>The theme information.</p>
         */
        @NameInMap("theme")
        public ListTextbookAssistantArticleDetailsResponseBodyDataTheme theme;

        /**
         * <p>The topic information.</p>
         */
        @NameInMap("topic")
        public ListTextbookAssistantArticleDetailsResponseBodyDataTopic topic;

        /**
         * <p>The word list.</p>
         */
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
