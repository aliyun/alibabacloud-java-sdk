// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetVhostErrorByTaskIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetVhostErrorByTaskIdResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetVhostErrorByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVhostErrorByTaskIdResponseBody self = new GetVhostErrorByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVhostErrorByTaskIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVhostErrorByTaskIdResponseBody setData(GetVhostErrorByTaskIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVhostErrorByTaskIdResponseBodyData getData() {
        return this.data;
    }

    public GetVhostErrorByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVhostErrorByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVhostErrorByTaskIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO extends TeaModel {
        @NameInMap("ErrorMessage")
        public Integer errorMessage;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO build(java.util.Map<String, ?> map) throws Exception {
            GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO self = new GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO();
            return TeaModel.build(map, self);
        }

        public GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO setErrorMessage(Integer errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public Integer getErrorMessage() {
            return this.errorMessage;
        }

        public GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class GetVhostErrorByTaskIdResponseBodyDataVoList extends TeaModel {
        @NameInMap("VhostErrorDO")
        public java.util.List<GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO> vhostErrorDO;

        public static GetVhostErrorByTaskIdResponseBodyDataVoList build(java.util.Map<String, ?> map) throws Exception {
            GetVhostErrorByTaskIdResponseBodyDataVoList self = new GetVhostErrorByTaskIdResponseBodyDataVoList();
            return TeaModel.build(map, self);
        }

        public GetVhostErrorByTaskIdResponseBodyDataVoList setVhostErrorDO(java.util.List<GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO> vhostErrorDO) {
            this.vhostErrorDO = vhostErrorDO;
            return this;
        }
        public java.util.List<GetVhostErrorByTaskIdResponseBodyDataVoListVhostErrorDO> getVhostErrorDO() {
            return this.vhostErrorDO;
        }

    }

    public static class GetVhostErrorByTaskIdResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("VoList")
        public GetVhostErrorByTaskIdResponseBodyDataVoList voList;

        public static GetVhostErrorByTaskIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVhostErrorByTaskIdResponseBodyData self = new GetVhostErrorByTaskIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVhostErrorByTaskIdResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetVhostErrorByTaskIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetVhostErrorByTaskIdResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetVhostErrorByTaskIdResponseBodyData setVoList(GetVhostErrorByTaskIdResponseBodyDataVoList voList) {
            this.voList = voList;
            return this;
        }
        public GetVhostErrorByTaskIdResponseBodyDataVoList getVoList() {
            return this.voList;
        }

    }

}
