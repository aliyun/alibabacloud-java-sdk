// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelRequest extends TeaModel {
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
     * <li>image</li>
     * <li>video</li>
     * <li>audio</li>
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
     * <li>PersonName: queries media assets based on character names.</li>
     * <li>Ocr: queries media assets based on subtitles.</li>
     * <li>AiCategory: queries media assets based on AI categories.</li>
     * <li>FullSearch (default): queries all media assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ocr</p>
     */
    @NameInMap("MultimodalSearchType")
    public String multimodalSearchType;

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
     * <li>CreationTime:Desc (default): sorts results in reverse chronological order.</li>
     * <li>CreationTime:Asc: sorts results in chronological order.</li>
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
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SpecificSearch")
    public Boolean specificSearch;

    /**
     * <p>The content that you want to query.</p>
     */
    @NameInMap("Text")
    public String text;

    public static SearchMediaByAILabelRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByAILabelRequest self = new SearchMediaByAILabelRequest();
        return TeaModel.build(map, self);
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

}
