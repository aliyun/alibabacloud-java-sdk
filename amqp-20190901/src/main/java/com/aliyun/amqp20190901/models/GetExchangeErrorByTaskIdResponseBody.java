// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetExchangeErrorByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetExchangeErrorByTaskIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetExchangeErrorByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExchangeErrorByTaskIdResponseBody self = new GetExchangeErrorByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExchangeErrorByTaskIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetExchangeErrorByTaskIdResponseBody setData(GetExchangeErrorByTaskIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExchangeErrorByTaskIdResponseBodyData getData() {
        return this.data;
    }

    public GetExchangeErrorByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExchangeErrorByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExchangeErrorByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO extends TeaModel {
        @NameInMap("ErrorMessage")
        public Integer errorMessage;

        @NameInMap("ExchangeName")
        public String exchangeName;

        @NameInMap("ExchangeType")
        public String exchangeType;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO build(java.util.Map<String, ?> map) throws Exception {
            GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO self = new GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO();
            return TeaModel.build(map, self);
        }

        public GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO setErrorMessage(Integer errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Integer getErrorMessage() {
            return this.errorMessage;
        }

        public GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }
        public String getExchangeName() {
            return this.exchangeName;
        }

        public GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO setExchangeType(String exchangeType) {
            this.exchangeType = exchangeType;
            return this;
        }
        public String getExchangeType() {
            return this.exchangeType;
        }

        public GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class GetExchangeErrorByTaskIdResponseBodyDataVoList extends TeaModel {
        @NameInMap("ExchangeErrorDO")
        public java.util.List<GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO> exchangeErrorDO;

        public static GetExchangeErrorByTaskIdResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetExchangeErrorByTaskIdResponseBodyDataVoList self = new GetExchangeErrorByTaskIdResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetExchangeErrorByTaskIdResponseBodyDataVoList setExchangeErrorDO(java.util.List<GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO> exchangeErrorDO) {
            this.exchangeErrorDO = exchangeErrorDO;
            return this;
        }
        public java.util.List<GetExchangeErrorByTaskIdResponseBodyDataVoListExchangeErrorDO> getExchangeErrorDO() {
            return this.exchangeErrorDO;
        }

    }

    public static class GetExchangeErrorByTaskIdResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public GetExchangeErrorByTaskIdResponseBodyDataVoList voList;

        public static GetExchangeErrorByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExchangeErrorByTaskIdResponseBodyData self = new GetExchangeErrorByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExchangeErrorByTaskIdResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetExchangeErrorByTaskIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetExchangeErrorByTaskIdResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetExchangeErrorByTaskIdResponseBodyData setVoList(GetExchangeErrorByTaskIdResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public GetExchangeErrorByTaskIdResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
