// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCustomQAShrinkRequest extends TeaModel {
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

    public static AddCustomQAShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomQAShrinkRequest self = new AddCustomQAShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomQAShrinkRequest setAnswersShrink(String answersShrink) {
        this.answersShrink = answersShrink;
        return this;
    }
    public String getAnswersShrink() {
        return this.answersShrink;
    }

    public AddCustomQAShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public AddCustomQAShrinkRequest setKeyWordsShrink(String keyWordsShrink) {
        this.keyWordsShrink = keyWordsShrink;
        return this;
    }
    public String getKeyWordsShrink() {
        return this.keyWordsShrink;
    }

    public AddCustomQAShrinkRequest setMajorQuestion(String majorQuestion) {
        this.majorQuestion = majorQuestion;
        return this;
    }
    public String getMajorQuestion() {
        return this.majorQuestion;
    }

    public AddCustomQAShrinkRequest setSupplementaryQuestionsShrink(String supplementaryQuestionsShrink) {
        this.supplementaryQuestionsShrink = supplementaryQuestionsShrink;
        return this;
    }
    public String getSupplementaryQuestionsShrink() {
        return this.supplementaryQuestionsShrink;
    }

}
