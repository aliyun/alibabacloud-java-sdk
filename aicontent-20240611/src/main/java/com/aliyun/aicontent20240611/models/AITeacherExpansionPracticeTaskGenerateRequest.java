// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class AITeacherExpansionPracticeTaskGenerateRequest extends TeaModel {
    /**
     * <p>The grade.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("grade")
    public String grade;

    /**
     * <p>A list of key sentences from the <code>textContent</code> to focus on during task generation.</p>
     */
    @NameInMap("keySentences")
    public java.util.List<String> keySentences;

    /**
     * <p>A list of keywords from the <code>textContent</code> to focus on during task generation.</p>
     */
    @NameInMap("keyWords")
    public java.util.List<String> keyWords;

    /**
     * <p>The learning object to guide task generation.</p>
     * 
     * <strong>example:</strong>
     * <p>Understanding unique professions such as dog walkers, hotel test sleepers, and food tasters, including their job responsibilities and the benefits or challenges associated with each role.</p>
     */
    @NameInMap("learningObject")
    public String learningObject;

    /**
     * <p>The reference article used to generate questions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Dog walker Dog walking, as a profession, originated in the US. Some may think that it\&quot;s a perfect job, because dog walkers won\&quot;t be imprisoned in an office. But it\&quot;s actually manual labour. At their busiest, dog walkers may have more than ten dogs to take care of in a day. Hotel test sleeper A hotel test sleeper, as the name suggests, has to write expert reviews about the facilities, locations, prices, dining and other services of hotels, in order to provide evaluations and guides for travelers. Hotel test sleepers don\&quot;t need to punch in for work and they get about ten thousand yuan as income every month. What a comfortable job! Food taster In ancient times, a food taster was a person who tasted foods (or drinks) to be served to someone else, to confirm that it was safe to eat. But now, those working as food tasters just get to taste various new foods and drinks aimed at specific regions across the world. They then give their opinions on these products to the companies and suggest improvements.</p>
     */
    @NameInMap("textContent")
    public String textContent;

    /**
     * <p>The name of the textbook.</p>
     * 
     * <strong>example:</strong>
     * <p>英语（基础模块）修订版</p>
     */
    @NameInMap("textbook")
    public String textbook;

    /**
     * <p>The conversation topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>talk about your dream job.</p>
     */
    @NameInMap("topic")
    public String topic;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6440xxxxxxxxxx5fafc98c421</p>
     */
    @NameInMap("userId")
    public String userId;

    public static AITeacherExpansionPracticeTaskGenerateRequest build(java.util.Map<String, ?> map) throws Exception {
        AITeacherExpansionPracticeTaskGenerateRequest self = new AITeacherExpansionPracticeTaskGenerateRequest();
        return TeaModel.build(map, self);
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setKeySentences(java.util.List<String> keySentences) {
        this.keySentences = keySentences;
        return this;
    }
    public java.util.List<String> getKeySentences() {
        return this.keySentences;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setLearningObject(String learningObject) {
        this.learningObject = learningObject;
        return this;
    }
    public String getLearningObject() {
        return this.learningObject;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setTextbook(String textbook) {
        this.textbook = textbook;
        return this;
    }
    public String getTextbook() {
        return this.textbook;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public AITeacherExpansionPracticeTaskGenerateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
