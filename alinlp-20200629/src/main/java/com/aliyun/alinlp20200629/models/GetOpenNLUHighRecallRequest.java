// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetOpenNLUHighRecallRequest extends TeaModel {
    @NameInMap("Examples")
    public String examples;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Sentence")
    public String sentence;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Task")
    public String task;

    public static GetOpenNLUHighRecallRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpenNLUHighRecallRequest self = new GetOpenNLUHighRecallRequest();
        return TeaModel.build(map, self);
    }

    public GetOpenNLUHighRecallRequest setExamples(String examples) {
        this.examples = examples;
        return this;
    }
    public String getExamples() {
        return this.examples;
    }

    public GetOpenNLUHighRecallRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public GetOpenNLUHighRecallRequest setSentence(String sentence) {
        this.sentence = sentence;
        return this;
    }
    public String getSentence() {
        return this.sentence;
    }

    public GetOpenNLUHighRecallRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetOpenNLUHighRecallRequest setTask(String task) {
        this.task = task;
        return this;
    }
    public String getTask() {
        return this.task;
    }

}
