// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListPipelineTriggerEventsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<PipelineTriggerEvent> data;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("totalCount")
    public Long totalCount;

    public static ListPipelineTriggerEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineTriggerEventsResponseBody self = new ListPipelineTriggerEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineTriggerEventsResponseBody setData(java.util.List<PipelineTriggerEvent> data) {
        this.data = data;
        return this;
    }
    public java.util.List<PipelineTriggerEvent> getData() {
        return this.data;
    }

    public ListPipelineTriggerEventsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelineTriggerEventsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPipelineTriggerEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
