// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelRequest extends TeaModel {
    /**
     * <p>The custom filters. The value is a JSON string. Supported fields include the integer field intField1 and the string fields strField1 and strField2. You can select at most one match type for the same field. Filters for different fields use the AND logical operator.</p>
     * <ul>
     * <li>Exact match, such as {&quot;intField1&quot;:12,&quot;strField1&quot;:&quot;abc&quot;}.</li>
     * <li>Multi-value match, such as {&quot;intField1&quot;:[12,13],&quot;strField1&quot;:[&quot;abc&quot;,&quot;cd&quot;]}.</li>
     * <li>Range match, such as {&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13}}.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13},&quot;strField2&quot;:[&quot;cd&quot;,&quot;de&quot;],&quot;strField1&quot;:&quot;abc&quot;}</p>
     */
    @NameInMap("CustomFilters")
    public String customFilters;

    /**
     * <p>The matching mode. Default value: fuzzy. Valid values:</p>
     * <ul>
     * <li>fuzzy: fuzzy match.</li>
     * <li>precise: exact match. This mode takes effect only for newly added media assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("MatchingMode")
    public String matchingMode;

    /**
     * <p>The media asset ID. This parameter is required for precise search.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The media asset type. Valid values:</p>
     * <ul>
     * <li>image: images</li>
     * <li>video: videos</li>
     * <li>audio: audio</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The multimodal search type. Default value: FullSearch. Valid values:</p>
     * <ul>
     * <li>PersonName: person name search</li>
     * <li>Ocr: subtitle search</li>
     * <li>AiCategory: AI categorization search</li>
     * <li>FullSearch: full text search</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ocr</p>
     */
    @NameInMap("MultimodalSearchType")
    public String multimodalSearchType;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>name-1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    /**
     * <p>The sorting of query results. Valid values:</p>
     * <ul>
     * <li>CreationTime:Desc (default): sorts by creation time in descending order.</li>
     * <li>CreationTime:Asc: sorts by creation time in ascending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether to perform a precise search. Valid values:</p>
     * <ul>
     * <li>true: performs a precise search.</li>
     * <li>false: performs a coarse search.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpecificSearch")
    public Boolean specificSearch;

    /**
     * <p>The search content.</p>
     * 
     * <strong>example:</strong>
     * <p>kite</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The creation time, in milliseconds. gte indicates greater than or equal to, and lte indicates less than or equal to.</p>
     * <ul>
     * <li>Range match, such as {&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}</p>
     */
    @NameInMap("UtcCreate")
    public String utcCreate;

    public static SearchMediaByAILabelRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByAILabelRequest self = new SearchMediaByAILabelRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaByAILabelRequest setCustomFilters(String customFilters) {
        this.customFilters = customFilters;
        return this;
    }
    public String getCustomFilters() {
        return this.customFilters;
    }

    public SearchMediaByAILabelRequest setMatchingMode(String matchingMode) {
        this.matchingMode = matchingMode;
        return this;
    }
    public String getMatchingMode() {
        return this.matchingMode;
    }

    public SearchMediaByAILabelRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SearchMediaByAILabelRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SearchMediaByAILabelRequest setMultimodalSearchType(String multimodalSearchType) {
        this.multimodalSearchType = multimodalSearchType;
        return this;
    }
    public String getMultimodalSearchType() {
        return this.multimodalSearchType;
    }

    public SearchMediaByAILabelRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SearchMediaByAILabelRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaByAILabelRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaByAILabelRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public SearchMediaByAILabelRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public SearchMediaByAILabelRequest setSpecificSearch(Boolean specificSearch) {
        this.specificSearch = specificSearch;
        return this;
    }
    public Boolean getSpecificSearch() {
        return this.specificSearch;
    }

    public SearchMediaByAILabelRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SearchMediaByAILabelRequest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

}
