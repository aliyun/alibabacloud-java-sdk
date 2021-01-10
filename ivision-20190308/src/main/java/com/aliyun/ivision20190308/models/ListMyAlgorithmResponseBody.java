// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class ListMyAlgorithmResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListMyAlgorithmResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListMyAlgorithmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMyAlgorithmResponseBody self = new ListMyAlgorithmResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMyAlgorithmResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMyAlgorithmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMyAlgorithmResponseBody setData(ListMyAlgorithmResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMyAlgorithmResponseBodyData getData() {
        return this.data;
    }

    public ListMyAlgorithmResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMyAlgorithmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMyAlgorithmResponseBodyDataAlgorithmList extends TeaModel {
        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("DeployRegion")
        public String deployRegion;

        @NameInMap("CurrentMonthCount")
        public Integer currentMonthCount;

        @NameInMap("AlgorithmCode")
        public String algorithmCode;

        @NameInMap("ApiDocUrl")
        public String apiDocUrl;

        @NameInMap("YesterdayCount")
        public Integer yesterdayCount;

        @NameInMap("AlgorithmOrder")
        public Integer algorithmOrder;

        public static ListMyAlgorithmResponseBodyDataAlgorithmList build(java.util.Map<String, ?> map) throws Exception {
            ListMyAlgorithmResponseBodyDataAlgorithmList self = new ListMyAlgorithmResponseBodyDataAlgorithmList();
            return TeaModel.build(map, self);
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setDeployRegion(String deployRegion) {
            this.deployRegion = deployRegion;
            return this;
        }
        public String getDeployRegion() {
            return this.deployRegion;
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setCurrentMonthCount(Integer currentMonthCount) {
            this.currentMonthCount = currentMonthCount;
            return this;
        }
        public Integer getCurrentMonthCount() {
            return this.currentMonthCount;
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setAlgorithmCode(String algorithmCode) {
            this.algorithmCode = algorithmCode;
            return this;
        }
        public String getAlgorithmCode() {
            return this.algorithmCode;
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setApiDocUrl(String apiDocUrl) {
            this.apiDocUrl = apiDocUrl;
            return this;
        }
        public String getApiDocUrl() {
            return this.apiDocUrl;
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setYesterdayCount(Integer yesterdayCount) {
            this.yesterdayCount = yesterdayCount;
            return this;
        }
        public Integer getYesterdayCount() {
            return this.yesterdayCount;
        }

        public ListMyAlgorithmResponseBodyDataAlgorithmList setAlgorithmOrder(Integer algorithmOrder) {
            this.algorithmOrder = algorithmOrder;
            return this;
        }
        public Integer getAlgorithmOrder() {
            return this.algorithmOrder;
        }

    }

    public static class ListMyAlgorithmResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmList")
        public java.util.List<ListMyAlgorithmResponseBodyDataAlgorithmList> algorithmList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMyAlgorithmResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMyAlgorithmResponseBodyData self = new ListMyAlgorithmResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMyAlgorithmResponseBodyData setAlgorithmList(java.util.List<ListMyAlgorithmResponseBodyDataAlgorithmList> algorithmList) {
            this.algorithmList = algorithmList;
            return this;
        }
        public java.util.List<ListMyAlgorithmResponseBodyDataAlgorithmList> getAlgorithmList() {
            return this.algorithmList;
        }

        public ListMyAlgorithmResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMyAlgorithmResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMyAlgorithmResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
