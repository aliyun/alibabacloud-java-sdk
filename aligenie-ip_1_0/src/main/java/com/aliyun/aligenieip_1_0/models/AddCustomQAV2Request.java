// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCustomQAV2Request extends TeaModel {
    @NameInMap("Answers")
    public java.util.List<String> answers;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("KeyWords")
    public java.util.List<String> keyWords;

    @NameInMap("MajorQuestion")
    public String majorQuestion;

    @NameInMap("SupplementaryQuestions")
    public java.util.List<String> supplementaryQuestions;

    public static AddCustomQAV2Request build(java.util.Map<String, ?> map) throws Exception {
        AddCustomQAV2Request self = new AddCustomQAV2Request();
        return TeaModel.build(map, self);
    }

    public AddCustomQAV2Request setAnswers(java.util.List<String> answers) {
        this.answers = answers;
        return this;
    }
    public java.util.List<String> getAnswers() {
        return this.answers;
    }

    public AddCustomQAV2Request setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddCustomQAV2Request setKeyWords(java.util.List<String> keyWords) {
        this.keyWords = keyWords;
        return this;
    }
    public java.util.List<String> getKeyWords() {
        return this.keyWords;
    }

    public AddCustomQAV2Request setMajorQuestion(String majorQuestion) {
        this.majorQuestion = majorQuestion;
        return this;
    }
    public String getMajorQuestion() {
        return this.majorQuestion;
    }

    public AddCustomQAV2Request setSupplementaryQuestions(java.util.List<String> supplementaryQuestions) {
        this.supplementaryQuestions = supplementaryQuestions;
        return this;
    }
    public java.util.List<String> getSupplementaryQuestions() {
        return this.supplementaryQuestions;
    }

}
