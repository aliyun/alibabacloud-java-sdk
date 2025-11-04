// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByHybridRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CustomFilters")
    public String customFilters;

    /**
     * <p>The ID of the media asset. If provided, the details of the media asset are returned.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>c469e944b5a856828dc2</strong></strong></p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>The type of media assets. Valid values:</p>
     * <ul>
     * <li>image</li>
     * <li>video</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>The namespace.</p>
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
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the search library</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    /**
     * <p>The natural language search query.</p>
     * 
     * <strong>example:</strong>
     * <p>Two pandas are fighting</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UtcCreate")
    public String utcCreate;

    public static SearchMediaByHybridRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByHybridRequest self = new SearchMediaByHybridRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaByHybridRequest setCustomFilters(String customFilters) {
        this.customFilters = customFilters;
        return this;
    }
    public String getCustomFilters() {
        return this.customFilters;
    }

    public SearchMediaByHybridRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SearchMediaByHybridRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SearchMediaByHybridRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SearchMediaByHybridRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaByHybridRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaByHybridRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public SearchMediaByHybridRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SearchMediaByHybridRequest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

}
