// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueErrorByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetQueueErrorByTaskIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQueueErrorByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueErrorByTaskIdResponseBody self = new GetQueueErrorByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueErrorByTaskIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetQueueErrorByTaskIdResponseBody setData(GetQueueErrorByTaskIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueueErrorByTaskIdResponseBodyData getData() {
        return this.data;
    }

    public GetQueueErrorByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueueErrorByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueErrorByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO extends TeaModel {
        @NameInMap("AutoDelete")
        public Boolean autoDelete;

        @NameInMap("Durable")
        public Boolean durable;

        @NameInMap("ErrorMessage")
        public Integer errorMessage;

        @NameInMap("QueueName")
        public String queueName;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO build(java.util.Map<String, ?> map) throws Exception {
            GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO self = new GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO();
            return TeaModel.build(map, self);
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO setAutoDelete(Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Boolean getAutoDelete() {
            return this.autoDelete;
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO setDurable(Boolean durable) {
            this.durable = durable;
            return this;
        }
        public Boolean getDurable() {
            return this.durable;
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO setErrorMessage(Integer errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Integer getErrorMessage() {
            return this.errorMessage;
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class GetQueueErrorByTaskIdResponseBodyDataVoList extends TeaModel {
        @NameInMap("QueueErrorDO")
        public java.util.List<GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO> queueErrorDO;

        public static GetQueueErrorByTaskIdResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetQueueErrorByTaskIdResponseBodyDataVoList self = new GetQueueErrorByTaskIdResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetQueueErrorByTaskIdResponseBodyDataVoList setQueueErrorDO(java.util.List<GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO> queueErrorDO) {
            this.queueErrorDO = queueErrorDO;
            return this;
        }
        public java.util.List<GetQueueErrorByTaskIdResponseBodyDataVoListQueueErrorDO> getQueueErrorDO() {
            return this.queueErrorDO;
        }

    }

    public static class GetQueueErrorByTaskIdResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public GetQueueErrorByTaskIdResponseBodyDataVoList voList;

        public static GetQueueErrorByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueueErrorByTaskIdResponseBodyData self = new GetQueueErrorByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueueErrorByTaskIdResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetQueueErrorByTaskIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueueErrorByTaskIdResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetQueueErrorByTaskIdResponseBodyData setVoList(GetQueueErrorByTaskIdResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public GetQueueErrorByTaskIdResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
