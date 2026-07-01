// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelRequest extends TeaModel {
    /**
     * <p>Custom filters. A JSON string. The following backing fields are supported: intField1 (integer type), strField1 and strField2 (string type). For the same field, only one matching method can be specified. Filters on different fields are combined with a logical AND relationship.</p>
     * <ul>
     * <li><p>Exact match, for example: {&quot;intField1&quot;:12,&quot;strField1&quot;:&quot;abc&quot;}</p>
     * </li>
     * <li><p>Multi-value match, for example: {&quot;intField1&quot;:[12,13],&quot;strField1&quot;:[&quot;abc&quot;,&quot;cd&quot;]}</p>
     * </li>
     * <li><p>Range match, for example: {&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13}}</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;intField1&quot;:{&quot;gte&quot;:12,&quot;lte&quot;:13},&quot;strField2&quot;:[&quot;cd&quot;,&quot;de&quot;],&quot;strField1&quot;:&quot;abc&quot;}</p>
     */
    @NameInMap("CustomFilters")
    public String customFilters;

    /**
     * <p>Matching pattern. The default value is fuzzy for Fuzzy Matching. Valid values:</p>
     * <ul>
     * <li><p>fuzzy: Fuzzy Matching</p>
     * </li>
     * <li><p>precise: Precise matching. This pattern applies only to newly added media assets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("MatchingMode")
    public String matchingMode;

    /**
     * <p>The ID of the media asset. This parameter is required if you want to query media asset clips.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of the media assets. Valid values:</p>
     * <ul>
     * <li><p>image</p>
     * </li>
     * <li><p>video</p>
     * </li>
     * <li><p>audio</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The type of query. Valid values:</p>
     * <ul>
     * <li><p>PersonName: queries media assets based on character names.</p>
     * </li>
     * <li><p>Ocr: queries media assets based on subtitles.</p>
     * </li>
     * <li><p>AiCategory: queries media assets based on AI categories.</p>
     * </li>
     * <li><p>FullSearch (default): queries all media assets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ocr</p>
     */
    @NameInMap("MultimodalSearchType")
    public String multimodalSearchType;

    /**
     * <p>Namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>name-1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
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
     * <p>The sorting method of the results. Valid values:</p>
     * <ul>
     * <li><p>CreationTime:Desc (default): sorts results in reverse chronological order.</p>
     * </li>
     * <li><p>CreationTime:Asc: sorts results in chronological order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CreationTime:Desc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>Specifies whether to query media asset clips. Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * </li>
     * <li><p>false</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpecificSearch")
    public Boolean specificSearch;

    /**
     * <p>The content that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>Kite</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>Creation time, in milliseconds UNIX timestamp. Use gte for greater than or equal to, and lte for less than or equal to.</p>
     * <ul>
     * <li>Example range: {&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}</li>
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
