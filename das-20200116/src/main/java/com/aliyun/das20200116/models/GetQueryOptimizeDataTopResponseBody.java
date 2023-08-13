// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTopResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public GetQueryOptimizeDataTopResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeDataTopResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTopResponseBody self = new GetQueryOptimizeDataTopResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTopResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeDataTopResponseBody setData(GetQueryOptimizeDataTopResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeDataTopResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeDataTopResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeDataTopResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeDataTopResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeDataTopResponseBodyDataList extends TeaModel {
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The metric name. Valid values:</p>
         * <br>
         * <p>* **sqlExecuteCount**: the number of slow SQL executions.</p>
         * <p>* **optimizedSqlExecuteCount**: the number of slow SQL executions that need to be optimized.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The metric value.</p>
         */
        @NameInMap("Value")
        public Double value;

        public static GetQueryOptimizeDataTopResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataTopResponseBodyDataList self = new GetQueryOptimizeDataTopResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataTopResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetQueryOptimizeDataTopResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetQueryOptimizeDataTopResponseBodyDataList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetQueryOptimizeDataTopResponseBodyData extends TeaModel {
        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The information about the instances.</p>
         */
        @NameInMap("List")
        public java.util.List<GetQueryOptimizeDataTopResponseBodyDataList> list;

        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeDataTopResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataTopResponseBodyData self = new GetQueryOptimizeDataTopResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataTopResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeDataTopResponseBodyData setList(java.util.List<GetQueryOptimizeDataTopResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeDataTopResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeDataTopResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeDataTopResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeDataTopResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
