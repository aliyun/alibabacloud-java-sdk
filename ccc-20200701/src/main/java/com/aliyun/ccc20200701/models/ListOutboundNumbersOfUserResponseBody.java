// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListOutboundNumbersOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListOutboundNumbersOfUserResponseBodyData data;

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

    public ListOutboundNumbersOfUserResponseBody setData(ListOutboundNumbersOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOutboundNumbersOfUserResponseBodyData getData() {
        return this.data;
    }

    public static class ListOutboundNumbersOfUserResponseBodyDataList extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static ListOutboundNumbersOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundNumbersOfUserResponseBodyDataList self = new ListOutboundNumbersOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListOutboundNumbersOfUserResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListOutboundNumbersOfUserResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListOutboundNumbersOfUserResponseBodyDataList> list;

        public static ListOutboundNumbersOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundNumbersOfUserResponseBodyData self = new ListOutboundNumbersOfUserResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListOutboundNumbersOfUserResponseBodyData setList(java.util.List<ListOutboundNumbersOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListOutboundNumbersOfUserResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
