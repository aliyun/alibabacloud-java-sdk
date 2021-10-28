// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    // 任务列表
    @NameInMap("Data")
    public GetAiOutboundTaskListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAiOutboundTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAiOutboundTaskListResponseBody self = new GetAiOutboundTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAiOutboundTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAiOutboundTaskListResponseBody setData(GetAiOutboundTaskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAiOutboundTaskListResponseBodyData getData() {
        return this.data;
    }

    public GetAiOutboundTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAiOutboundTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAiOutboundTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAiOutboundTaskListResponseBodyDataList extends TeaModel {
        // 自动外呼的并发
        @NameInMap("ConcurrentRate")
        public Integer concurrentRate;

        // 任务创建时间毫秒时间戳
        @NameInMap("CreateTime")
        public Long createTime;

        // 任务描述
        @NameInMap("Description")
        public String description;

        // 任务已完成量
        @NameInMap("FinishCount")
        public Integer finishCount;

        // 任务完成率
        @NameInMap("FinishRate")
        public Float finishRate;

        // 技能组id（预测式）或者ivr id（自动外呼）
        @NameInMap("HandlerId")
        public Long handlerId;

        // 技能组名称或ivr名称
        @NameInMap("HandlerName")
        public String handlerName;

        // 任务名称
        @NameInMap("Name")
        public String name;

        // 任务状态（0:未开始,1:进行中,2:系统暂停,3:手动暂停,4:已完成,5:已终止）
        @NameInMap("Status")
        public Integer status;

        // 任务状态描述
        @NameInMap("StatusDesc")
        public String statusDesc;

        // 任务id
        @NameInMap("TaskId")
        public Long taskId;

        // 任务总量
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetAiOutboundTaskListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskListResponseBodyDataList self = new GetAiOutboundTaskListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskListResponseBodyDataList setConcurrentRate(Integer concurrentRate) {
            this.concurrentRate = concurrentRate;
            return this;
        }
        public Integer getConcurrentRate() {
            return this.concurrentRate;
        }

        public GetAiOutboundTaskListResponseBodyDataList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetAiOutboundTaskListResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAiOutboundTaskListResponseBodyDataList setFinishCount(Integer finishCount) {
            this.finishCount = finishCount;
            return this;
        }
        public Integer getFinishCount() {
            return this.finishCount;
        }

        public GetAiOutboundTaskListResponseBodyDataList setFinishRate(Float finishRate) {
            this.finishRate = finishRate;
            return this;
        }
        public Float getFinishRate() {
            return this.finishRate;
        }

        public GetAiOutboundTaskListResponseBodyDataList setHandlerId(Long handlerId) {
            this.handlerId = handlerId;
            return this;
        }
        public Long getHandlerId() {
            return this.handlerId;
        }

        public GetAiOutboundTaskListResponseBodyDataList setHandlerName(String handlerName) {
            this.handlerName = handlerName;
            return this;
        }
        public String getHandlerName() {
            return this.handlerName;
        }

        public GetAiOutboundTaskListResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAiOutboundTaskListResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetAiOutboundTaskListResponseBodyDataList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetAiOutboundTaskListResponseBodyDataList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetAiOutboundTaskListResponseBodyDataList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetAiOutboundTaskListResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // 是否有下一页
        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        // 任务信息
        @NameInMap("List")
        public java.util.List<GetAiOutboundTaskListResponseBodyDataList> list;

        // 分页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 数据总量
        @NameInMap("TotalResults")
        public Integer totalResults;

        public static GetAiOutboundTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAiOutboundTaskListResponseBodyData self = new GetAiOutboundTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAiOutboundTaskListResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetAiOutboundTaskListResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public GetAiOutboundTaskListResponseBodyData setList(java.util.List<GetAiOutboundTaskListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAiOutboundTaskListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetAiOutboundTaskListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAiOutboundTaskListResponseBodyData setTotalResults(Integer totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Integer getTotalResults() {
            return this.totalResults;
        }

    }

}
