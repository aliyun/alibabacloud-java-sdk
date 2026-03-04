// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class Hotword extends TeaModel {
    /**
     * <p>The language of the hotword text. Valid values:</p>
     * <ul>
     * <li>For structured media analysis and ASR: zh: Chinese en: English</li>
     * <li>For video translation: Supports 53 languages.</li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The text of the hotword.</p>
     * <ul>
     * <li>For structured media analysis and ASR:</li>
     * <li><ul>
     * <li>Chinese: Up to 15 characters.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>English: Up to 10 words, separated by spaces.</li>
     * </ul>
     * </li>
     * <li><ul>
     * <li>Mixed: Each letter is counted as one character (following the Chinese limit).</li>
     * </ul>
     * </li>
     * <li>For video translation: Up to 100 characters.</li>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <ul>
     * <li>Predefined translation results for the hotword.</li>
     * <li>This field is only used in translation-related scenarios.</li>
     * </ul>
     */
    @NameInMap("TranspositionResultList")
    public java.util.List<TranspositionResult> transpositionResultList;

    /**
     * <p>The weight of the hotword.</p>
     * <ol>
     * <li>Valid values: [-6,5].</li>
     * <li>A positive value increases the likelihood of the word being recognized, while a negative value decreases the likelihood.</li>
     * <li>A value of -6 specifies that recognition of this word should be minimized.</li>
     * <li>Recommended value: 2.</li>
     * <li>If the desired effect is not achieved, you can increase the weight. However, excessively high weights may negatively impact the recognition accuracy of other words.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
