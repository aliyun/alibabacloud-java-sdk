// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantSceneDetailsResponseBody extends TeaModel {
    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("data")
    public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyData> data;

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
     * <p>Indicates whether the API call is successful. Valid values:</p>
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

    public static ListTextbookAssistantSceneDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantSceneDetailsResponseBody self = new ListTextbookAssistantSceneDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantSceneDetailsResponseBody setData(java.util.List<ListTextbookAssistantSceneDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyData> getData() {
        return this.data;
    }

    public ListTextbookAssistantSceneDetailsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListTextbookAssistantSceneDetailsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListTextbookAssistantSceneDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTextbookAssistantSceneDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTextbookAssistantSceneDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyDataRoleList extends TeaModel {
        /**
         * <p>The role introduction.</p>
         * 
         * <strong>example:</strong>
         * <p>Carl, a curious boy</p>
         */
        @NameInMap("introduction")
        public String introduction;

        /**
         * <p>The translation of the role introduction.</p>
         * 
         * <strong>example:</strong>
         * <p>Carl, a curious boy</p>
         */
        @NameInMap("introductionTranslate")
        public String introductionTranslate;

        /**
         * <p>The role prompt text.</p>
         * 
         * <strong>example:</strong>
         * <p>Hi Noah, who is that in the photo?</p>
         */
        @NameInMap("promoting")
        public String promoting;

        /**
         * <p>The translation of the role prompt text.</p>
         * 
         * <strong>example:</strong>
         * <p>Hi Noah, who is the person in the photo?</p>
         */
        @NameInMap("promotingTranslate")
        public String promotingTranslate;

        /**
         * <p>The role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Carl</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <p>The translation of the role name.</p>
         * 
         * <strong>example:</strong>
         * <p>Carl</p>
         */
        @NameInMap("roleNameTranslate")
        public String roleNameTranslate;

        /**
         * <p>The role type. A value of 0 indicates the AI questioner, and a value of 1 indicates the responder.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("roleType")
        public String roleType;

        public static ListTextbookAssistantSceneDetailsResponseBodyDataRoleList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyDataRoleList self = new ListTextbookAssistantSceneDetailsResponseBodyDataRoleList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setIntroductionTranslate(String introductionTranslate) {
            this.introductionTranslate = introductionTranslate;
            return this;
        }
        public String getIntroductionTranslate() {
            return this.introductionTranslate;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setPromoting(String promoting) {
            this.promoting = promoting;
            return this;
        }
        public String getPromoting() {
            return this.promoting;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setPromotingTranslate(String promotingTranslate) {
            this.promotingTranslate = promotingTranslate;
            return this;
        }
        public String getPromotingTranslate() {
            return this.promotingTranslate;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setRoleNameTranslate(String roleNameTranslate) {
            this.roleNameTranslate = roleNameTranslate;
            return this;
        }
        public String getRoleNameTranslate() {
            return this.roleNameTranslate;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataRoleList setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList extends TeaModel {
        /**
         * <p>The scene task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Say that this is your dad\&quot;s brother.</p>
         */
        @NameInMap("sceneTask")
        public String sceneTask;

        /**
         * <p>The translation of the scene task description.</p>
         * 
         * <strong>example:</strong>
         * <p>Say this is your father\&quot;s brother</p>
         */
        @NameInMap("sceneTaskTranslate")
        public String sceneTaskTranslate;

        public static ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList self = new ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList setSceneTask(String sceneTask) {
            this.sceneTask = sceneTask;
            return this;
        }
        public String getSceneTask() {
            return this.sceneTask;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList setSceneTaskTranslate(String sceneTaskTranslate) {
            this.sceneTaskTranslate = sceneTaskTranslate;
            return this;
        }
        public String getSceneTaskTranslate() {
            return this.sceneTaskTranslate;
        }

    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList extends TeaModel {
        /**
         * <p>The sentence analysis and explanation.</p>
         * 
         * <strong>example:</strong>
         * <p>Is + this + your + family member?</p>
         */
        @NameInMap("sentenceAnalysis")
        public String sentenceAnalysis;

        /**
         * <p>The sentence ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a774c6d09c4511eebe6e0c42a106bb02</p>
         */
        @NameInMap("sentenceId")
        public String sentenceId;

        /**
         * <p>The sentence text.</p>
         * 
         * <strong>example:</strong>
         * <p>Is this your sister?</p>
         */
        @NameInMap("sentenceText")
        public String sentenceText;

        public static ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList self = new ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList setSentenceAnalysis(String sentenceAnalysis) {
            this.sentenceAnalysis = sentenceAnalysis;
            return this;
        }
        public String getSentenceAnalysis() {
            return this.sentenceAnalysis;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList setSentenceId(String sentenceId) {
            this.sentenceId = sentenceId;
            return this;
        }
        public String getSentenceId() {
            return this.sentenceId;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList setSentenceText(String sentenceText) {
            this.sentenceText = sentenceText;
            return this;
        }
        public String getSentenceText() {
            return this.sentenceText;
        }

    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyDataTheme extends TeaModel {
        /**
         * <p>The images related to the current theme.</p>
         */
        @NameInMap("themeImageList")
        public java.util.List<String> themeImageList;

        /**
         * <p>The theme name.</p>
         * 
         * <strong>example:</strong>
         * <p>Family life</p>
         */
        @NameInMap("themeName")
        public String themeName;

        /**
         * <p>The translation of the theme name.</p>
         * 
         * <strong>example:</strong>
         * <p>Family and family life</p>
         */
        @NameInMap("themeTranslate")
        public String themeTranslate;

        public static ListTextbookAssistantSceneDetailsResponseBodyDataTheme build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyDataTheme self = new ListTextbookAssistantSceneDetailsResponseBodyDataTheme();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataTheme setThemeImageList(java.util.List<String> themeImageList) {
            this.themeImageList = themeImageList;
            return this;
        }
        public java.util.List<String> getThemeImageList() {
            return this.themeImageList;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataTheme setThemeName(String themeName) {
            this.themeName = themeName;
            return this;
        }
        public String getThemeName() {
            return this.themeName;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataTheme setThemeTranslate(String themeTranslate) {
            this.themeTranslate = themeTranslate;
            return this;
        }
        public String getThemeTranslate() {
            return this.themeTranslate;
        }

    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyDataTopic extends TeaModel {
        /**
         * <p>The images related to the current topic.</p>
         */
        @NameInMap("topicImageList")
        public java.util.List<String> topicImageList;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>Introducing family members</p>
         */
        @NameInMap("topicName")
        public String topicName;

        /**
         * <p>The translation of the topic content.</p>
         * 
         * <strong>example:</strong>
         * <p>Introducing family members</p>
         */
        @NameInMap("topicTranslate")
        public String topicTranslate;

        public static ListTextbookAssistantSceneDetailsResponseBodyDataTopic build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyDataTopic self = new ListTextbookAssistantSceneDetailsResponseBodyDataTopic();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataTopic setTopicImageList(java.util.List<String> topicImageList) {
            this.topicImageList = topicImageList;
            return this;
        }
        public java.util.List<String> getTopicImageList() {
            return this.topicImageList;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataTopic setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataTopic setTopicTranslate(String topicTranslate) {
            this.topicTranslate = topicTranslate;
            return this;
        }
        public String getTopicTranslate() {
            return this.topicTranslate;
        }

    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyDataWordList extends TeaModel {
        /**
         * <p>The word definition.</p>
         * 
         * <strong>example:</strong>
         * <p>Home; family</p>
         */
        @NameInMap("wordAnalysis")
        public String wordAnalysis;

        /**
         * <p>The word ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a94c3337ed8c11eebe6e0c42a106bb02</p>
         */
        @NameInMap("wordId")
        public String wordId;

        /**
         * <p>The word text.</p>
         * 
         * <strong>example:</strong>
         * <p>family</p>
         */
        @NameInMap("wordText")
        public String wordText;

        public static ListTextbookAssistantSceneDetailsResponseBodyDataWordList build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyDataWordList self = new ListTextbookAssistantSceneDetailsResponseBodyDataWordList();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataWordList setWordAnalysis(String wordAnalysis) {
            this.wordAnalysis = wordAnalysis;
            return this;
        }
        public String getWordAnalysis() {
            return this.wordAnalysis;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataWordList setWordId(String wordId) {
            this.wordId = wordId;
            return this;
        }
        public String getWordId() {
            return this.wordId;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyDataWordList setWordText(String wordText) {
            this.wordText = wordText;
            return this;
        }
        public String getWordText() {
            return this.wordText;
        }

    }

    public static class ListTextbookAssistantSceneDetailsResponseBodyData extends TeaModel {
        /**
         * <p>The list of roles.</p>
         */
        @NameInMap("roleList")
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataRoleList> roleList;

        /**
         * <p>The scene description.</p>
         * 
         * <strong>example:</strong>
         * <p>At school, Carl sees a photo and asks you about your family.</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38c41b7b509911efbe6e0c42a106bb02</p>
         */
        @NameInMap("sceneId")
        public String sceneId;

        /**
         * <p>The images related to the current scene.</p>
         */
        @NameInMap("sceneImageList")
        public java.util.List<String> sceneImageList;

        /**
         * <p>The list of scene tasks.</p>
         */
        @NameInMap("sceneTaskList")
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList> sceneTaskList;

        @NameInMap("sceneTranslate")
        public String sceneTranslate;

        /**
         * <p>The list of sentences.</p>
         */
        @NameInMap("sentenceList")
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList> sentenceList;

        /**
         * <p>The practice objective.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("target")
        public String target;

        /**
         * <p>The theme information.</p>
         */
        @NameInMap("theme")
        public ListTextbookAssistantSceneDetailsResponseBodyDataTheme theme;

        /**
         * <p>The topic information.</p>
         */
        @NameInMap("topic")
        public ListTextbookAssistantSceneDetailsResponseBodyDataTopic topic;

        /**
         * <p>The list of words.</p>
         */
        @NameInMap("wordList")
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataWordList> wordList;

        public static ListTextbookAssistantSceneDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantSceneDetailsResponseBodyData self = new ListTextbookAssistantSceneDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setRoleList(java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataRoleList> roleList) {
            this.roleList = roleList;
            return this;
        }
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataRoleList> getRoleList() {
            return this.roleList;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setSceneImageList(java.util.List<String> sceneImageList) {
            this.sceneImageList = sceneImageList;
            return this;
        }
        public java.util.List<String> getSceneImageList() {
            return this.sceneImageList;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setSceneTaskList(java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList> sceneTaskList) {
            this.sceneTaskList = sceneTaskList;
            return this;
        }
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataSceneTaskList> getSceneTaskList() {
            return this.sceneTaskList;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setSceneTranslate(String sceneTranslate) {
            this.sceneTranslate = sceneTranslate;
            return this;
        }
        public String getSceneTranslate() {
            return this.sceneTranslate;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setSentenceList(java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList> sentenceList) {
            this.sentenceList = sentenceList;
            return this;
        }
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataSentenceList> getSentenceList() {
            return this.sentenceList;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setTheme(ListTextbookAssistantSceneDetailsResponseBodyDataTheme theme) {
            this.theme = theme;
            return this;
        }
        public ListTextbookAssistantSceneDetailsResponseBodyDataTheme getTheme() {
            return this.theme;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setTopic(ListTextbookAssistantSceneDetailsResponseBodyDataTopic topic) {
            this.topic = topic;
            return this;
        }
        public ListTextbookAssistantSceneDetailsResponseBodyDataTopic getTopic() {
            return this.topic;
        }

        public ListTextbookAssistantSceneDetailsResponseBodyData setWordList(java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataWordList> wordList) {
            this.wordList = wordList;
            return this;
        }
        public java.util.List<ListTextbookAssistantSceneDetailsResponseBodyDataWordList> getWordList() {
            return this.wordList;
        }

    }

}
