// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesRequest extends TeaModel {
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
    public java.util.List<String> llmTemplateIds;

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

    public static ListLlmTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesRequest self = new ListLlmTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListLlmTemplatesRequest setBizType(Integer bizType) {
        this.bizType = bizType;
        return this;
    }
    public Integer getBizType() {
        return this.bizType;
    }

    public ListLlmTemplatesRequest setLlmCode(String llmCode) {
        this.llmCode = llmCode;
        return this;
    }
    public String getLlmCode() {
        return this.llmCode;
    }

    public ListLlmTemplatesRequest setLlmTemplateIds(java.util.List<String> llmTemplateIds) {
        this.llmTemplateIds = llmTemplateIds;
        return this;
    }
    public java.util.List<String> getLlmTemplateIds() {
        return this.llmTemplateIds;
    }

    public ListLlmTemplatesRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public ListLlmTemplatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLlmTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLlmTemplatesRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public ListLlmTemplatesRequest setSmartModel(Boolean smartModel) {
        this.smartModel = smartModel;
        return this;
    }
    public Boolean getSmartModel() {
        return this.smartModel;
    }

}
