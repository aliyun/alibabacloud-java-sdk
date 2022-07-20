// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListLiveTranscodeJobsRequest extends TeaModel {
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("StartMode")
    public Integer startMode;

    @NameInMap("Status")
    public Integer status;

    // 模板Id
    @NameInMap("Type")
    public String type;

    public static ListLiveTranscodeJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveTranscodeJobsRequest self = new ListLiveTranscodeJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveTranscodeJobsRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListLiveTranscodeJobsRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListLiveTranscodeJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLiveTranscodeJobsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListLiveTranscodeJobsRequest setStartMode(Integer startMode) {
        this.startMode = startMode;
        return this;
    }
    public Integer getStartMode() {
        return this.startMode;
    }

    public ListLiveTranscodeJobsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListLiveTranscodeJobsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
