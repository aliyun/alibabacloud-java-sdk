// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesRequest extends TeaModel {
    /**
     * <p>The model code used for filtering. Fuzzy match is supported.</p>
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
     * <p>The page number. Pages start from page 1. Values 0 and 1 return the same result.</p>
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

    public static ListLlmTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesRequest self = new ListLlmTemplatesRequest();
        return TeaModel.build(map, self);
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

}
