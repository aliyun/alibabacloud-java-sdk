// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20180807.models;

import com.aliyun.tea.*;

public class MachineTranslateECommerceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentFormat")
    public String contentFormat;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static MachineTranslateECommerceRequest build(java.util.Map<String, ?> map) throws Exception {
        MachineTranslateECommerceRequest self = new MachineTranslateECommerceRequest();
        return TeaModel.build(map, self);
    }

    public MachineTranslateECommerceRequest setContentFormat(String contentFormat) {
        this.contentFormat = contentFormat;
        return this;
    }
    public String getContentFormat() {
        return this.contentFormat;
    }

    public MachineTranslateECommerceRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public MachineTranslateECommerceRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

    public MachineTranslateECommerceRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
