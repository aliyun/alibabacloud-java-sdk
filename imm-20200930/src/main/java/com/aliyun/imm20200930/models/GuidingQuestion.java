// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GuidingQuestion extends TeaModel {
    /**
     * <p>The answer to the question.</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The guiding question.</p>
     */
    @NameInMap("Question")
    public String question;

    public static GuidingQuestion build(java.util.Map<String, ?> map) throws Exception {
        GuidingQuestion self = new GuidingQuestion();
        return TeaModel.build(map, self);
    }

    public GuidingQuestion setAnswer(String answer) {
        this.answer = answer;
        return this;
    }
    public String getAnswer() {
        return this.answer;
    }

    public GuidingQuestion setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

}
