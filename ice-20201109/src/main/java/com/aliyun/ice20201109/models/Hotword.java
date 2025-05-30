// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Hotword extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Text")
    public String text;

    @NameInMap("TranspositionResultList")
    public java.util.List<TranspositionResult> transpositionResultList;

    @NameInMap("Weight")
    public Integer weight;

    public static Hotword build(java.util.Map<String, ?> map) throws Exception {
        Hotword self = new Hotword();
        return TeaModel.build(map, self);
    }

    public Hotword setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public Hotword setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public Hotword setTranspositionResultList(java.util.List<TranspositionResult> transpositionResultList) {
        this.transpositionResultList = transpositionResultList;
        return this;
    }
    public java.util.List<TranspositionResult> getTranspositionResultList() {
        return this.transpositionResultList;
    }

    public Hotword setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
