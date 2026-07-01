// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateRequest extends TeaModel {
    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-template</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The template subtype.</p>
     * <p>Valid values for transcoding templates:</p>
     * <ul>
     * <li><p>1 (Normal): regular template.</p>
     * </li>
     * <li><p>2 (AudioTranscode): audio transcoding template.</p>
     * </li>
     * <li><p>3 (Remux): container format conversion template.</p>
     * </li>
     * <li><p>4 (NarrowBandV1): Narrowband HD 1.0 template.</p>
     * </li>
     * <li><p>5 (NarrowBandV2): Narrowband HD 2.0 template.</p>
     * </li>
     * </ul>
     * <p>Valid values for snapshot templates:</p>
     * <ul>
     * <li><p>1 (Normal): regular template.</p>
     * </li>
     * <li><p>2 (Sprite): sprite template.</p>
     * </li>
     * <li><p>3 (WebVtt): WebVTT template.</p>
     * </li>
     * </ul>
     * <p>Valid values for AI-assisted content moderation templates:</p>
     * <ul>
     * <li><p>1 (Video): video moderation template.</p>
     * </li>
     * <li><p>2 (Audio): audio moderation template.</p>
     * </li>
     * <li><p>3 (Image): image moderation template.</p>
     * </li>
     * </ul>
     * <p>Valid values for AI-assisted intelligent erasure templates.</p>
     * <ul>
     * <li><p>1 (VideoDelogo): logo erasure template.</p>
     * </li>
     * <li><p>2 (VideoDetext): subtitle erasure template.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Subtype")
    public Integer subtype;

    /**
     * <p>The template configurations. For more information, see <a href="https://help.aliyun.com/document_detail/448291.html">Template parameters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;flv&quot;},&quot;Video&quot;:{},&quot;Audio&quot;:{}}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The template type. Valid values:</p>
     * <ul>
     * <li><p>1: transcoding template.</p>
     * </li>
     * <li><p>2: snapshot template.</p>
     * </li>
     * <li><p>3: animated image template.</p>
     * </li>
     * <li><p>4\. image watermark template.</p>
     * </li>
     * <li><p>5: text watermark template.</p>
     * </li>
     * <li><p>6: subtitle template.</p>
     * </li>
     * <li><p>7: AI-assisted content moderation template.</p>
     * </li>
     * <li><p>8: AI-assisted intelligent thumbnail template.</p>
     * </li>
     * <li><p>9: AI-assisted intelligent erasure template.</p>
     * </li>
     * <li><p>10: AI-assisted media fingerprint analysis template.</p>
     * </li>
     * <li><p>11: AI-assisted smart tagging template.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateRequest self = new CreateCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomTemplateRequest setSubtype(Integer subtype) {
        this.subtype = subtype;
        return this;
    }
    public Integer getSubtype() {
        return this.subtype;
    }

    public CreateCustomTemplateRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public CreateCustomTemplateRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
