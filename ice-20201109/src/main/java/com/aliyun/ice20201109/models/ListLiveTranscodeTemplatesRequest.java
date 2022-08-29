// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeTemplatesRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Type")
    public String type;

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
