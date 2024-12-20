// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetAiOutboundTaskListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAiOutboundTaskListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConcurrentRate")
        public Integer concurrentRate;

        /**
         * <strong>example:</strong>
         * <p>1615083365000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("FinishCount")
        public Integer finishCount;

        /**
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("FinishRate")
        public Float finishRate;

        /**
         * <strong>example:</strong>
         * <p>2468****</p>
         */
        @NameInMap("HandlerId")
        public Long handlerId;

        /**
         * <strong>example:</strong>
         * <p>热线技能组</p>
         */
        @NameInMap("HandlerName")
        public String handlerName;

        /**
         * <strong>example:</strong>
         * <p>xx外呼任务</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>未开始</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <strong>example:</strong>
         * <p>1763****</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        @NameInMap("List")
        public java.util.List<GetAiOutboundTaskListResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
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
