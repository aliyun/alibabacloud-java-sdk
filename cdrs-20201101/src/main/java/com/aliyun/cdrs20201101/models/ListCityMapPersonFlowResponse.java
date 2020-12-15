// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapPersonFlowResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListCityMapPersonFlowResponseData> data;

    public static ListCityMapPersonFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapPersonFlowResponse self = new ListCityMapPersonFlowResponse();
        return TeaModel.build(map, self);
    }

    public ListCityMapPersonFlowResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCityMapPersonFlowResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCityMapPersonFlowResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCityMapPersonFlowResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCityMapPersonFlowResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCityMapPersonFlowResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCityMapPersonFlowResponse setData(java.util.List<ListCityMapPersonFlowResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCityMapPersonFlowResponseData> getData() {
        return this.data;
    }

    public static class ListCityMapPersonFlowResponseData extends TeaModel {
        @NameInMap("OriginDataSourceId")
        @Validation(required = true)
        public String originDataSourceId;

        @NameInMap("TargetDataSourceId")
        @Validation(required = true)
        public String targetDataSourceId;

        @NameInMap("FlowNumber")
        @Validation(required = true)
        public String flowNumber;

        @NameInMap("FlowDirection")
        @Validation(required = true)
        public String flowDirection;

        public static ListCityMapPersonFlowResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCityMapPersonFlowResponseData self = new ListCityMapPersonFlowResponseData();
            return TeaModel.build(map, self);
        }

        public ListCityMapPersonFlowResponseData setOriginDataSourceId(String originDataSourceId) {
            this.originDataSourceId = originDataSourceId;
            return this;
        }
        public String getOriginDataSourceId() {
            return this.originDataSourceId;
        }

        public ListCityMapPersonFlowResponseData setTargetDataSourceId(String targetDataSourceId) {
            this.targetDataSourceId = targetDataSourceId;
            return this;
        }
        public String getTargetDataSourceId() {
            return this.targetDataSourceId;
        }

        public ListCityMapPersonFlowResponseData setFlowNumber(String flowNumber) {
            this.flowNumber = flowNumber;
            return this;
        }
        public String getFlowNumber() {
            return this.flowNumber;
        }

        public ListCityMapPersonFlowResponseData setFlowDirection(String flowDirection) {
            this.flowDirection = flowDirection;
            return this;
        }
        public String getFlowDirection() {
            return this.flowDirection;
        }

    }

}
