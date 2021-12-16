// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListOutboundNumbersOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListOutboundNumbersOfUserResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOutboundNumbersOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundNumbersOfUserResponseBody self = new ListOutboundNumbersOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutboundNumbersOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOutboundNumbersOfUserResponseBody setData(ListOutboundNumbersOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOutboundNumbersOfUserResponseBodyData getData() {
        return this.data;
    }

    public ListOutboundNumbersOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOutboundNumbersOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutboundNumbersOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOutboundNumbersOfUserResponseBodyDataList extends TeaModel {
        @NameInMap("City")
        public String city;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static ListOutboundNumbersOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundNumbersOfUserResponseBodyDataList self = new ListOutboundNumbersOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListOutboundNumbersOfUserResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListOutboundNumbersOfUserResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListOutboundNumbersOfUserResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListOutboundNumbersOfUserResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListOutboundNumbersOfUserResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOutboundNumbersOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundNumbersOfUserResponseBodyData self = new ListOutboundNumbersOfUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOutboundNumbersOfUserResponseBodyData setList(java.util.List<ListOutboundNumbersOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListOutboundNumbersOfUserResponseBodyDataList> getList() {
            return this.list;
        }

        public ListOutboundNumbersOfUserResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListOutboundNumbersOfUserResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOutboundNumbersOfUserResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
