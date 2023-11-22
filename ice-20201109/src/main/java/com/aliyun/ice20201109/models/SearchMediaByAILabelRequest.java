// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByAILabelRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("MultimodalSearchType")
    public String multimodalSearchType;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchLibName")
    public String searchLibName;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SpecificSearch")
    public Boolean specificSearch;

    @NameInMap("Text")
    public String text;

    public static SearchMediaByAILabelRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByAILabelRequest self = new SearchMediaByAILabelRequest();
        return TeaModel.build(map, self);
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
