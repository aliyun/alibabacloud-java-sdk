// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListLlmTemplatesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>qwen3.6-plus</p>
     */
    @NameInMap("LlmCode")
    public String llmCode;

    @NameInMap("LlmTemplateIds")
    public String llmTemplateIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>mt-xxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static ListLlmTemplatesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLlmTemplatesShrinkRequest self = new ListLlmTemplatesShrinkRequest();
        return TeaModel.build(map, self);
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

}
