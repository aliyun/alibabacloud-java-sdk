// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetPromptTestResultRequest extends TeaModel {
    /**
     * <p>The configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;enable\&quot;:false}</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The text content.</p>
     * 
     * <strong>example:</strong>
     * <p>测试文本</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The business type.</p>
     * 
     * <strong>example:</strong>
     * <p>custom_llm_template</p>
     */
    @NameInMap("Type")
    public String type;

    public static GetPromptTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPromptTestResultRequest self = new GetPromptTestResultRequest();
        return TeaModel.build(map, self);
    }

    public GetPromptTestResultRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public GetPromptTestResultRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetPromptTestResultRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public GetPromptTestResultRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public GetPromptTestResultRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
