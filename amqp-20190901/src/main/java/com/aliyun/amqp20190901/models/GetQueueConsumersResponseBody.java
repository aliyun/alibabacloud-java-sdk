// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetQueueConsumersResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetQueueConsumersResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQueueConsumersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueConsumersResponseBody self = new GetQueueConsumersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueConsumersResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetQueueConsumersResponseBody setData(GetQueueConsumersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueueConsumersResponseBodyData getData() {
        return this.data;
    }

    public GetQueueConsumersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueueConsumersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueConsumersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQueueConsumersResponseBodyDataVoList extends TeaModel {
        @NameInMap("ClientAddress")
        public String clientAddress;

        @NameInMap("ConsumerTag")
        public String consumerTag;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        public static GetQueueConsumersResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConsumersResponseBodyDataVoList self = new GetQueueConsumersResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetQueueConsumersResponseBodyDataVoList setClientAddress(String clientAddress) {
            this.clientAddress = clientAddress;
            return this;
        }
        public String getClientAddress() {
            return this.clientAddress;
        }

        public GetQueueConsumersResponseBodyDataVoList setConsumerTag(String consumerTag) {
            this.consumerTag = consumerTag;
            return this;
        }
        public String getConsumerTag() {
            return this.consumerTag;
        }

        public GetQueueConsumersResponseBodyDataVoList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

    }

    public static class GetQueueConsumersResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoList")
        public java.util.List<GetQueueConsumersResponseBodyDataVoList> voList;

        public static GetQueueConsumersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueueConsumersResponseBodyData self = new GetQueueConsumersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueueConsumersResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetQueueConsumersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueueConsumersResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetQueueConsumersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetQueueConsumersResponseBodyData setVoList(java.util.List<GetQueueConsumersResponseBodyDataVoList> voList) {
            this.voList = voList;
            return this;
        }
        public java.util.List<GetQueueConsumersResponseBodyDataVoList> getVoList() {
            return this.voList;
        }

    }

}
