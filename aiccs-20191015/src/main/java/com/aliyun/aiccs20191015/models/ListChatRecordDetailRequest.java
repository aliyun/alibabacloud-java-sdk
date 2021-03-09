// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListChatRecordDetailRequest extends TeaModel {
    // clientToken
    @NameInMap("ClientToken")
    public String clientToken;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 在线挂断的时间范围
    @NameInMap("CloseTimeEnd")
    public Long closeTimeEnd;

    // 当前页
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 每页数据量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 在线挂断的时间范围
    @NameInMap("CloseTimeStart")
    public Long closeTimeStart;

    public static ListChatRecordDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatRecordDetailRequest self = new ListChatRecordDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListChatRecordDetailRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListChatRecordDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListChatRecordDetailRequest setCloseTimeEnd(Long closeTimeEnd) {
        this.closeTimeEnd = closeTimeEnd;
        return this;
    }
    public Long getCloseTimeEnd() {
        return this.closeTimeEnd;
    }

    public ListChatRecordDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListChatRecordDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListChatRecordDetailRequest setCloseTimeStart(Long closeTimeStart) {
        this.closeTimeStart = closeTimeStart;
        return this;
    }
    public Long getCloseTimeStart() {
        return this.closeTimeStart;
    }

}
