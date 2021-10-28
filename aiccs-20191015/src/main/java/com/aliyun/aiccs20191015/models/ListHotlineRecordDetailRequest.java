// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordDetailRequest extends TeaModel {
    // clientToken
    @NameInMap("ClientToken")
    public String clientToken;

    // 热线挂断的时间范围
    @NameInMap("CloseTimeEnd")
    public Long closeTimeEnd;

    // 热线挂断的时间范围
    @NameInMap("CloseTimeStart")
    public Long closeTimeStart;

    // 当前页
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 每页数据量
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHotlineRecordDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordDetailRequest self = new ListHotlineRecordDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordDetailRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListHotlineRecordDetailRequest setCloseTimeEnd(Long closeTimeEnd) {
        this.closeTimeEnd = closeTimeEnd;
        return this;
    }
    public Long getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    public ListHotlineRecordDetailRequest setCloseTimeStart(Long closeTimeStart) {
        this.closeTimeStart = closeTimeStart;
        return this;
    }
    public Long getCloseTimeStart() {
        return this.closeTimeStart;
    }

    public ListHotlineRecordDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListHotlineRecordDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHotlineRecordDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
