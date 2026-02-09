// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HttpApiParameter extends TeaModel {
    /**
     * <p>The default value of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("defaultValue")
    public String defaultValue;

    /**
     * <p>The parameter description.</p>
     * 
     * <strong>example:</strong>
     * <p>The example description.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The sample value of the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("exampleValue")
    public String exampleValue;

    /**
     * <p>The parameter name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>userId</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether the parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("required")
    public Boolean required;

    /**
     * <p>The parameter type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Integer</li>
     * <li>Number</li>
     * <li>String</li>
     * <li>Boolean</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("type")
    public String type;

    public static HttpApiParameter build(java.util.Map<String, ?> map) throws Exception {
        HttpApiParameter self = new HttpApiParameter();
        return TeaModel.build(map, self);
    }

    public HttpApiParameter setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public HttpApiParameter setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public HttpApiParameter setExampleValue(String exampleValue) {
        this.exampleValue = exampleValue;
        return this;
    }
    public String getExampleValue() {
        return this.exampleValue;
    }

    public HttpApiParameter setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HttpApiParameter setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public HttpApiParameter setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
