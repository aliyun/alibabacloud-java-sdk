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
     * <p>Transcoding template subtypes:</p>
     * <ul>
     * <li>1: normal transcoding template (Normal)</li>
     * <li>2: audio transcoding template (AudioTranscode)</li>
     * <li>3: container format conversion (Remux)</li>
     * <li>4: Narrowband HD 1.0 (NarrowBandV1)</li>
     * <li>5: Narrowband HD 2.0 (NarrowBandV2)</li>
     * </ul>
     * <p>Snapshot template subtypes:</p>
     * <ul>
     * <li>1: normal snapshot/static snapshot (Normal)</li>
     * <li>2: sprite snapshot (Sprite)</li>
     * <li>3: WebVTT snapshot (WebVtt)</li>
     * </ul>
     * <p>AI review template subtypes:</p>
     * <ul>
     * <li>1: video review (Video) </li>
     * <li>2: audio review (Audio)</li>
     * <li>3: image review (Image)</li>
     * </ul>
     * <p>AI intelligent erasure template subtypes:</p>
     * <ul>
     * <li>1: logo erasure (VideoDelogo)</li>
     * <li>2: subtitle erasure (VideoDetext)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Subtype")
    public Integer subtype;

    /**
     * <p>The template configuration. For detailed metric description, see <a href="https://help.aliyun.com/document_detail/448291.html">Template parameters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;flv&quot;},&quot;Video&quot;:{},&quot;Audio&quot;:{}}</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The templatetype. Valid values:</p>
     * <ul>
     * <li>1: transcoding template</li>
     * <li>2: snapshot template</li>
     * <li>3: animated image template</li>
     * <li>4: image watermark template</li>
     * <li>5: text watermark template</li>
     * <li>6: subtitle template</li>
     * <li>7: AI intelligent review</li>
     * <li>8: AI intelligent cover</li>
     * <li>9: AI intelligent erasure</li>
     * <li>10: AI intelligent DNA template</li>
     * <li>11: AI intelligent label template</li>
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
