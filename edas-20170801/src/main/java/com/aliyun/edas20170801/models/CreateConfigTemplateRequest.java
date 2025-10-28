// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateConfigTemplateRequest extends TeaModel {
    /**
     * <p>The content of the configuration template. The value must be in the format that is specified by the Format parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Key&quot;:&quot;name&quot;,&quot;Value&quot;:&quot;william&quot;},{&quot;Key&quot;:&quot;age&quot;,&quot;Value&quot;:&quot;12&quot;}]</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The description of the configuration template. The description can be up to 255 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>My configuration template</p>
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
     * <p>The name of the configuration template. The name can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>my-template</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateConfigTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigTemplateRequest self = new CreateConfigTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateConfigTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateConfigTemplateRequest setFormat(String format) {
        this.format = format;
        return this;
    }
    public String getFormat() {
        return this.format;
    }

    public CreateConfigTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
