// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesShrinkRequest extends TeaModel {
    /**
     * <p>The business type. This parameter is required when SmartModel is set to true.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BizType")
    public Integer bizType;

    /**
     * <p>The display language of the model. Valid values:</p>
     * <ul>
     * <li>zh-CN: Simplified Chinese.</li>
     * <li>en-US: English.</li>
     * <li>ja-JP: Japanese.</li>
     * <li>zh-TW: Traditional Chinese.
     * Default value: zh-CN. Currently, zh-TW returns Simplified Chinese, and ja-JP returns English. If the model is not included in Alibaba Cloud Model Studio or the English text is missing, the original source text is retained without automatic translation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The model code for filtering. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LlmCode")
    public String llmCode;

    /**
     * <p>The model template IDs for filtering.</p>
     */
    @NameInMap("LlmTemplateIds")
    public String llmTemplateIdsShrink;

    /**
     * <p>The associated model group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>The page number. Pages start from 1. A value of 0 returns the same result as 1.</p>
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
     * <p>The model provider template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    /**
     * <p>Specifies whether to query smart models. Valid values:</p>
     * <ul>
     * <li>true: Only LLMs under system-preset smart models are returned. In this case, BizType is required.</li>
     * <li>false: Smart models are not specifically filtered.
     * Default value: false.</li>
     * </ul>
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

    public ListLlmTemplatesShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
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
