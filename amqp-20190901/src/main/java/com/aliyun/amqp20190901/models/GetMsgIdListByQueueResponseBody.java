// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetMsgIdListByQueueResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetMsgIdListByQueueResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMsgIdListByQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsgIdListByQueueResponseBody self = new GetMsgIdListByQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsgIdListByQueueResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetMsgIdListByQueueResponseBody setData(GetMsgIdListByQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMsgIdListByQueueResponseBodyData getData() {
        return this.data;
    }

    public GetMsgIdListByQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMsgIdListByQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsgIdListByQueueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMsgIdListByQueueResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("VoList")
        public java.util.List<String> voList;

        public static GetMsgIdListByQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMsgIdListByQueueResponseBodyData self = new GetMsgIdListByQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMsgIdListByQueueResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetMsgIdListByQueueResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMsgIdListByQueueResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetMsgIdListByQueueResponseBodyData setVoList(java.util.List<String> voList) {
            this.voList = voList;
            return this;
        }
        public java.util.List<String> getVoList() {
            return this.voList;
        }

    }

}
