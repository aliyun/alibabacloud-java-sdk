// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTopResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeDataTopResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeDataTopResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

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
