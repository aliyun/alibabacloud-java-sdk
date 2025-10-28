// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateConfigTemplateRequest extends TeaModel {
    /**
     * <p>The content of the configuration template. The value must be in the format that is specified by the Format parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;william&quot;,&quot;age&quot;:18}</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description of the configuration template. The description can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>Test configuration template</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The data format of the configuration template. Valid values:</p>
     * <ul>
     * <li>JSON: JSON format</li>
     * <li>XML: XML format</li>
     * <li>YAML: YAML format</li>
     * <li>Properties: .properties format</li>
     * <li>KeyValue: key-value pairs</li>
     * <li>Custom: custom format</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>JSON</p>
     */
    @NameInMap("Format")
    public String format;

    /**
     * <p>The ID of the configuration template.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the configuration template. The name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>configtmpl1</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigTemplateRequest self = new UpdateConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateConfigTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConfigTemplateRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public UpdateConfigTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateConfigTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
