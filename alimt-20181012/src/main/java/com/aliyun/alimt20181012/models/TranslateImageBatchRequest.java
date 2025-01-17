// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateImageBatchRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my_awesome_task_1</p>
     */
    @NameInMap("CustomTaskId")
    public String customTaskId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;needEditorData&quot;: &quot;false&quot;, &quot;ignoreEntityRecognize&quot;: &quot;true&quot;}</p>
     */
    @NameInMap("Ext")
    public String ext;

    /**
     * <strong>example:</strong>
     * <p>general</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/1.jpg,https://example.com/2.jpg,https://example.com/3.jpg">https://example.com/1.jpg,https://example.com/2.jpg,https://example.com/3.jpg</a></p>
     */
    @NameInMap("ImageUrls")
    public String imageUrls;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TranslateImageBatchRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateImageBatchRequest self = new TranslateImageBatchRequest();
        return TeaModel.build(map, self);
    }

    public TranslateImageBatchRequest setCustomTaskId(String customTaskId) {
        this.customTaskId = customTaskId;
        return this;
    }
    public String getCustomTaskId() {
        return this.customTaskId;
    }

    public TranslateImageBatchRequest setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public TranslateImageBatchRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public TranslateImageBatchRequest setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
    public String getImageUrls() {
        return this.imageUrls;
    }

    public TranslateImageBatchRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateImageBatchRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
