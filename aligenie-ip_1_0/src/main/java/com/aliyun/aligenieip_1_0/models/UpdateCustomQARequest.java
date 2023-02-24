// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateCustomQARequest extends TeaModel {
    @NameInMap("Answers")
    public java.util.List<String> answers;

    @NameInMap("CustomQAId")
    public String customQAId;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    @NameInMap("MajorQuestion")
    public String majorQuestion;

    @NameInMap("SupplementaryQuestions")
    public java.util.List<String> supplementaryQuestions;

    public static UpdateCustomQARequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomQARequest self = new UpdateCustomQARequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomQARequest setAnswers(java.util.List<String> answers) {
        this.answers = answers;
        return this;
    }
    public java.util.List<String> getAnswers() {
        return this.answers;
    }

    public UpdateCustomQARequest setCustomQAId(String customQAId) {
        this.customQAId = customQAId;
        return this;
    }
    public String getCustomQAId() {
        return this.customQAId;
    }

    public UpdateCustomQARequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateCustomQARequest setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public UpdateCustomQARequest setMajorQuestion(String majorQuestion) {
        this.majorQuestion = majorQuestion;
        return this;
    }
    public String getMajorQuestion() {
        return this.majorQuestion;
    }

    public UpdateCustomQARequest setSupplementaryQuestions(java.util.List<String> supplementaryQuestions) {
        this.supplementaryQuestions = supplementaryQuestions;
        return this;
    }
    public java.util.List<String> getSupplementaryQuestions() {
        return this.supplementaryQuestions;
    }

}
