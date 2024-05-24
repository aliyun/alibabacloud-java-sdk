// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTriggersResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<PipelineTrigger> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListPipelineTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTriggersResponseBody self = new ListPipelineTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineTriggersResponseBody setData(java.util.List<PipelineTrigger> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PipelineTrigger> getData() {
        return this.data;
    }

    public ListPipelineTriggersResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelineTriggersResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPipelineTriggersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
