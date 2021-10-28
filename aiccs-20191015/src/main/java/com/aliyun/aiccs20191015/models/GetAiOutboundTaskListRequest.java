// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskListRequest extends TeaModel {
    // 任务创建截止时间戳（毫秒）
    @NameInMap("CreateTimeEnd")
    public Long createTimeEnd;

    // 任务创建起始时间戳（毫秒）
    @NameInMap("CreateTimeStart")
    public Long createTimeStart;

    // 查询第几页
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 分页大小(<=50)
    @NameInMap("PageSize")
    public Integer pageSize;

    // 过滤条件：匹配任务ID或者模糊匹配任务名
    @NameInMap("SearchKey")
    public String searchKey;

    // 任务状态（0:未开始,1:进行中,2:系统暂停,3:手动暂停,4:已完成,5:已终止）
    @NameInMap("Status")
    public Integer status;

    // 任务类型(2:预测式外呼，3:自动外呼)
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
