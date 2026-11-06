// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelProviderLlmCodesRequest extends TeaModel {
    /**
     * <p>The display language for models. Valid values: zh-CN (Simplified Chinese), en-US (English), ja-JP (Japanese), and zh-TW (Traditional Chinese). Default value: zh-CN. Currently, zh-TW returns Simplified Chinese, and ja-JP returns English. If the text is not included in Model Studio or the English text is missing, the original source text is retained without automatic translation.</p>
     * 
     * <strong>example:</strong>
     * <p>en-US</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The LLM code used for fuzzy match filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3-max</p>
     */
    @NameInMap("LlmCode")
    public String llmCode;

    /**
     * <p>The list of model brands as a JSON array string. Supports multi-select filtering and returns results that match any of the specified brands.</p>
     */
    @NameInMap("ModelBrands")
    public java.util.List<String> modelBrands;

    /**
     * <p>The page number, starting from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 1000. Maximum value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the model provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>moonshot</p>
     */
    @NameInMap("ProviderName")
    public String providerName;

    /**
     * <p>The ID of the provider template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pt-xxx-001</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    /**
     * <p>Specifies whether to filter by recommended models. If this parameter is not specified, no filtering is applied.</p>
     */
    @NameInMap("Recommended")
    public Boolean recommended;

    /**
     * <p>The list of recommended levels. This parameter takes effect only for wuying-plan. Results must match any of the selected levels and intersect with other filtering conditions such as region and brand. If this parameter is not specified or an empty array is passed, filtering by level is not applied.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Standard&quot;,&quot;Advanced&quot;]</p>
     */
    @NameInMap("RecommendedLevels")
    public java.util.List<String> recommendedLevels;

    public static ListModelProviderLlmCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelProviderLlmCodesRequest self = new ListModelProviderLlmCodesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelProviderLlmCodesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListModelProviderLlmCodesRequest setLlmCode(String llmCode) {
        this.llmCode = llmCode;
        return this;
    }
    public String getLlmCode() {
        return this.llmCode;
    }

    public ListModelProviderLlmCodesRequest setModelBrands(java.util.List<String> modelBrands) {
        this.modelBrands = modelBrands;
        return this;
    }
    public java.util.List<String> getModelBrands() {
        return this.modelBrands;
    }

    public ListModelProviderLlmCodesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProviderLlmCodesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelProviderLlmCodesRequest setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public ListModelProviderLlmCodesRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

    public ListModelProviderLlmCodesRequest setRecommended(Boolean recommended) {
        this.recommended = recommended;
        return this;
    }
    public Boolean getRecommended() {
        return this.recommended;
    }

    public ListModelProviderLlmCodesRequest setRecommendedLevels(java.util.List<String> recommendedLevels) {
        this.recommendedLevels = recommendedLevels;
        return this;
    }
    public java.util.List<String> getRecommendedLevels() {
        return this.recommendedLevels;
    }

}
