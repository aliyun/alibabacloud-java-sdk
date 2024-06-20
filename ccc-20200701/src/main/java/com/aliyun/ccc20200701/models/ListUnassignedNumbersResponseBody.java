// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUnassignedNumbersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListUnassignedNumbersResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUnassignedNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnassignedNumbersResponseBody self = new ListUnassignedNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnassignedNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListUnassignedNumbersResponseBody setData(ListUnassignedNumbersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListUnassignedNumbersResponseBodyData getData() {
        return this.data;
    }

    public ListUnassignedNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListUnassignedNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListUnassignedNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUnassignedNumbersResponseBodyDataList extends TeaModel {
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>08330011****</p>
         */
        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static ListUnassignedNumbersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListUnassignedNumbersResponseBodyDataList self = new ListUnassignedNumbersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListUnassignedNumbersResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListUnassignedNumbersResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListUnassignedNumbersResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListUnassignedNumbersResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListUnassignedNumbersResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnassignedNumbersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnassignedNumbersResponseBodyData self = new ListUnassignedNumbersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnassignedNumbersResponseBodyData setList(java.util.List<ListUnassignedNumbersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListUnassignedNumbersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListUnassignedNumbersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListUnassignedNumbersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnassignedNumbersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
