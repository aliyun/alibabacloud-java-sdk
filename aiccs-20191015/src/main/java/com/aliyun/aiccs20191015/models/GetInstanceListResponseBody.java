// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetInstanceListResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("CommodityInstances")
    public java.util.List<GetInstanceListResponseBodyCommodityInstances> commodityInstances;

    public static GetInstanceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceListResponseBody self = new GetInstanceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInstanceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInstanceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInstanceListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetInstanceListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetInstanceListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public GetInstanceListResponseBody setCommodityInstances(java.util.List<GetInstanceListResponseBodyCommodityInstances> commodityInstances) {
        this.commodityInstances = commodityInstances;
        return this;
    }
    public java.util.List<GetInstanceListResponseBodyCommodityInstances> getCommodityInstances() {
        return this.commodityInstances;
    }

    public static class GetInstanceListResponseBodyCommodityInstances extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("InstanceId")
        public String instanceId;

        public static GetInstanceListResponseBodyCommodityInstances build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceListResponseBodyCommodityInstances self = new GetInstanceListResponseBodyCommodityInstances();
            return TeaModel.build(map, self);
        }

        public GetInstanceListResponseBodyCommodityInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetInstanceListResponseBodyCommodityInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
