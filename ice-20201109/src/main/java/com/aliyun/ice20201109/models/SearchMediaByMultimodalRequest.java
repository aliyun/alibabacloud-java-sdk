// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchMediaByMultimodalRequest extends TeaModel {
    /**
     * <p>The custom filters. The value is a JSON string. Supported fields include the integer field intField1 and the string fields strField1 and strField2. You can specify at most one match type for a single field. Filters for different fields are combined by using the AND operator. Examples:</p>
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
     * <p>The media asset type. Default value: video. Valid values:</p>
     * <ul>
     * <li>image: Image.</li>
     * <li>video: Video.</li>
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
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The search library.</p>
     * 
     * <strong>example:</strong>
     * <p>test-1</p>
     */
    @NameInMap("SearchLibName")
    public String searchLibName;

    /**
     * <p>The search content. It can be a natural language description.</p>
     * 
     * <strong>example:</strong>
     * <p>Two pandas are fighting</p>
     */
    @NameInMap("Text")
    public String text;

    /**
     * <p>The creation time. The value is a timestamp in milliseconds. gte specifies greater than or equal to, and lte specifies less than or equal to. Example:</p>
     * <ul>
     * <li>Range match, such as {&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;gte&quot;:1761205662998,&quot;lte&quot;:1771205662998}</p>
     */
    @NameInMap("UtcCreate")
    public String utcCreate;

    public static SearchMediaByMultimodalRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMediaByMultimodalRequest self = new SearchMediaByMultimodalRequest();
        return TeaModel.build(map, self);
    }

    public SearchMediaByMultimodalRequest setCustomFilters(String customFilters) {
        this.customFilters = customFilters;
        return this;
    }
    public String getCustomFilters() {
        return this.customFilters;
    }

    public SearchMediaByMultimodalRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public SearchMediaByMultimodalRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SearchMediaByMultimodalRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchMediaByMultimodalRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchMediaByMultimodalRequest setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public SearchMediaByMultimodalRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public SearchMediaByMultimodalRequest setUtcCreate(String utcCreate) {
        this.utcCreate = utcCreate;
        return this;
    }
    public String getUtcCreate() {
        return this.utcCreate;
    }

}
