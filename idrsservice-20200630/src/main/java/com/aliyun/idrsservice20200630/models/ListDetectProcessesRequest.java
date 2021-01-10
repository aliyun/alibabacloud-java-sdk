// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListDetectProcessesRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Name")
    public String name;

    @NameInMap("PublishStatus")
    public Boolean publishStatus;

    public static ListDetectProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDetectProcessesRequest self = new ListDetectProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ListDetectProcessesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListDetectProcessesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDetectProcessesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListDetectProcessesRequest setPublishStatus(Boolean publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }
    public Boolean getPublishStatus() {
        return this.publishStatus;
    }

}
