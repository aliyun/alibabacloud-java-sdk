// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCustomQAV2ShrinkRequest extends TeaModel {
    @NameInMap("Answers")
    public String answersShrink;

    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("KeyWords")
    public String keyWordsShrink;

    @NameInMap("MajorQuestion")
    public String majorQuestion;

    @NameInMap("SupplementaryQuestions")
    public String supplementaryQuestionsShrink;

    public static AddCustomQAV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomQAV2ShrinkRequest self = new AddCustomQAV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomQAV2ShrinkRequest setAnswersShrink(String answersShrink) {
        this.answersShrink = answersShrink;
        return this;
    }
    public String getAnswersShrink() {
        return this.answersShrink;
    }

    public AddCustomQAV2ShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddCustomQAV2ShrinkRequest setKeyWordsShrink(String keyWordsShrink) {
        this.keyWordsShrink = keyWordsShrink;
        return this;
    }
    public String getKeyWordsShrink() {
        return this.keyWordsShrink;
    }

    public AddCustomQAV2ShrinkRequest setMajorQuestion(String majorQuestion) {
        this.majorQuestion = majorQuestion;
        return this;
    }
    public String getMajorQuestion() {
        return this.majorQuestion;
    }

    public AddCustomQAV2ShrinkRequest setSupplementaryQuestionsShrink(String supplementaryQuestionsShrink) {
        this.supplementaryQuestionsShrink = supplementaryQuestionsShrink;
        return this;
    }
    public String getSupplementaryQuestionsShrink() {
        return this.supplementaryQuestionsShrink;
    }

}
