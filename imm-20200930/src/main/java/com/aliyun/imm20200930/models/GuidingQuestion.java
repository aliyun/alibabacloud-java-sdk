// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GuidingQuestion extends TeaModel {
    /**
     * <p>The answer.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;将场景文本检测和布局分析统一起来是重要的，因为这两个任务虽然在文献中通常被独立研究，但实际上是紧密相关的。&quot;</p>
     */
    @NameInMap("Answer")
    public String answer;

    /**
     * <p>The question.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;为什么将场景文本检测和布局分析统一起来是重要的？&quot;</p>
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
