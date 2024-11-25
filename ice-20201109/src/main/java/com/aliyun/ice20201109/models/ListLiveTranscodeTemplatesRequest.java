// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeTemplatesRequest extends TeaModel {
    /**
     * <p>The category of the template. Valid values:</p>
     * <ul>
     * <li>system</li>
     * <li>customized</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customized</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The search keyword. You can use the template ID or name as the keyword to search for templates. If you search for templates by name, fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>my_template</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The page number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The sorting order. By default, the query results are sorted by creation time in descending order. Valid values:</p>
     * <ul>
     * <li>asc</li>
     * <li>desc</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asc</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The type of the template. Valid values:</p>
     * <ul>
     * <li>normal</li>
     * <li>narrow-band</li>
     * <li>audio-only</li>
     * <li>origin</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The video codec. Valid values:</p>
     * <ul>
     * <li>H.264</li>
     * <li>H.265</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>H.264</p>
     */
    @NameInMap("VideoCodec")
    public String videoCodec;

    public static ListLiveTranscodeTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeTemplatesRequest self = new ListLiveTranscodeTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeTemplatesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListLiveTranscodeTemplatesRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListLiveTranscodeTemplatesRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveTranscodeTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveTranscodeTemplatesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveTranscodeTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListLiveTranscodeTemplatesRequest setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }
    public String getVideoCodec() {
        return this.videoCodec;
    }

}
