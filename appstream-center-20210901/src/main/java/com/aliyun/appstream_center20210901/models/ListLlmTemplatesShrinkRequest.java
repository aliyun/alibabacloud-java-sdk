// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>The business type. This parameter is required when SmartModel is set to true.</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The model code filter. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LlmCode")
    public String llmCode;

    /**
     * <p>The model template IDs used for filtering.</p>
     */
    @NameInMap("LlmTemplateIds")
    public String llmTemplateIdsShrink;

    /**
     * <p>The ID of the associated model group.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The page number, starting from 1. Values 0 and 1 return the same result.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the model provider template.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    /**
     * <p>Specifies whether to query smart models. If set to true, only LLMs under system preset smart models are returned, and BizType is required. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SmartModel")
    public Boolean smartModel;

    public static ListLlmTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesShrinkRequest self = new ListLlmTemplatesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListLlmTemplatesShrinkRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListLlmTemplatesShrinkRequest setLlmCode(String llmCode) {
        this.llmCode = llmCode;
        return this;
    }
    public String getLlmCode() {
        return this.llmCode;
    }

    public ListLlmTemplatesShrinkRequest setLlmTemplateIdsShrink(String llmTemplateIdsShrink) {
        this.llmTemplateIdsShrink = llmTemplateIdsShrink;
        return this;
    }
    public String getLlmTemplateIdsShrink() {
        return this.llmTemplateIdsShrink;
    }

    public ListLlmTemplatesShrinkRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public ListLlmTemplatesShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLlmTemplatesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLlmTemplatesShrinkRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public ListLlmTemplatesShrinkRequest setSmartModel(Boolean smartModel) {
        this.smartModel = smartModel;
        return this;
    }
    public Boolean getSmartModel() {
        return this.smartModel;
    }

}
