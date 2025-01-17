// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetImageTranslateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;have_ocr&quot;: &quot;false&quot;, &quot;without_text&quot;:&quot;true&quot;, &quot;have_psd&quot;: &quot;false&quot;, &quot;ignore_entity&quot;: &quot;false&quot;}</p>
     */
    @NameInMap("Extra")
    public String extra;

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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://xxxxxxx.oss-cn-shenzhen.aliyuncs.com/xxxxxx.jpg">http://xxxxxxx.oss-cn-shenzhen.aliyuncs.com/xxxxxx.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static GetImageTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetImageTranslateRequest self = new GetImageTranslateRequest();
        return TeaModel.build(map, self);
    }

    public GetImageTranslateRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

    public GetImageTranslateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public GetImageTranslateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public GetImageTranslateRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
