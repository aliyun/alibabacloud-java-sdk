// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateCustomQAShrinkRequest extends TeaModel {
    @NameInMap("Answers")
    public String answersShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomQAId")
    public String customQAId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af7***536</p>
     */
    @NameInMap("HotelId")
    public String hotelId;

    @NameInMap("KeyWords")
    public String keyWordsShrink;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("MajorQuestion")
    public String majorQuestion;

    @NameInMap("SupplementaryQuestions")
    public String supplementaryQuestionsShrink;

    public static UpdateCustomQAShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomQAShrinkRequest self = new UpdateCustomQAShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomQAShrinkRequest setAnswersShrink(String answersShrink) {
        this.answersShrink = answersShrink;
        return this;
    }
    public String getAnswersShrink() {
        return this.answersShrink;
    }

    public UpdateCustomQAShrinkRequest setCustomQAId(String customQAId) {
        this.customQAId = customQAId;
        return this;
    }
    public String getCustomQAId() {
        return this.customQAId;
    }

    public UpdateCustomQAShrinkRequest setHotelId(String hotelId) {
        this.hotelId = hotelId;
        return this;
    }
    public String getHotelId() {
        return this.hotelId;
    }

    public UpdateCustomQAShrinkRequest setKeyWordsShrink(String keyWordsShrink) {
        this.keyWordsShrink = keyWordsShrink;
        return this;
    }
    public String getKeyWordsShrink() {
        return this.keyWordsShrink;
    }

    public UpdateCustomQAShrinkRequest setMajorQuestion(String majorQuestion) {
        this.majorQuestion = majorQuestion;
        return this;
    }
    public String getMajorQuestion() {
        return this.majorQuestion;
    }

    public UpdateCustomQAShrinkRequest setSupplementaryQuestionsShrink(String supplementaryQuestionsShrink) {
        this.supplementaryQuestionsShrink = supplementaryQuestionsShrink;
        return this;
    }
    public String getSupplementaryQuestionsShrink() {
        return this.supplementaryQuestionsShrink;
    }

}
