// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskListRequest extends TeaModel {
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    public static GetAiOutboundTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskListRequest self = new GetAiOutboundTaskListRequest();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskListRequest setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public GetAiOutboundTaskListRequest setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    public GetAiOutboundTaskListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAiOutboundTaskListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAiOutboundTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAiOutboundTaskListRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public GetAiOutboundTaskListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAiOutboundTaskListRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
