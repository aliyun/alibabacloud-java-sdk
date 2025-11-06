// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetBindingErrorByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetBindingErrorByTaskIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBindingErrorByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBindingErrorByTaskIdResponseBody self = new GetBindingErrorByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBindingErrorByTaskIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBindingErrorByTaskIdResponseBody setData(GetBindingErrorByTaskIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBindingErrorByTaskIdResponseBodyData getData() {
        return this.data;
    }

    public GetBindingErrorByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBindingErrorByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBindingErrorByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO extends TeaModel {
        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("RoutingKey")
        public String routingKey;

        @NameInMap("Src")
        public String src;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO build(java.util.Map<String, ?> map) throws Exception {
            GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO self = new GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO();
            return TeaModel.build(map, self);
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setRoutingKey(String routingKey) {
            this.routingKey = routingKey;
            return this;
        }
        public String getRoutingKey() {
            return this.routingKey;
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class GetBindingErrorByTaskIdResponseBodyDataVoList extends TeaModel {
        @NameInMap("BindingErrorDO")
        public java.util.List<GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO> bindingErrorDO;

        public static GetBindingErrorByTaskIdResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetBindingErrorByTaskIdResponseBodyDataVoList self = new GetBindingErrorByTaskIdResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetBindingErrorByTaskIdResponseBodyDataVoList setBindingErrorDO(java.util.List<GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO> bindingErrorDO) {
            this.bindingErrorDO = bindingErrorDO;
            return this;
        }
        public java.util.List<GetBindingErrorByTaskIdResponseBodyDataVoListBindingErrorDO> getBindingErrorDO() {
            return this.bindingErrorDO;
        }

    }

    public static class GetBindingErrorByTaskIdResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public GetBindingErrorByTaskIdResponseBodyDataVoList voList;

        public static GetBindingErrorByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBindingErrorByTaskIdResponseBodyData self = new GetBindingErrorByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBindingErrorByTaskIdResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetBindingErrorByTaskIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetBindingErrorByTaskIdResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetBindingErrorByTaskIdResponseBodyData setVoList(GetBindingErrorByTaskIdResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public GetBindingErrorByTaskIdResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
