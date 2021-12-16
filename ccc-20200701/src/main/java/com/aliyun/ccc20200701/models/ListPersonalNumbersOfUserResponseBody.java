// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPersonalNumbersOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPersonalNumbersOfUserResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPersonalNumbersOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPersonalNumbersOfUserResponseBody self = new ListPersonalNumbersOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPersonalNumbersOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPersonalNumbersOfUserResponseBody setData(ListPersonalNumbersOfUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPersonalNumbersOfUserResponseBodyData getData() {
        return this.data;
    }

    public ListPersonalNumbersOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPersonalNumbersOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPersonalNumbersOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPersonalNumbersOfUserResponseBodyDataList extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("City")
        public String city;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Number")
        public String number;

        @NameInMap("Province")
        public String province;

        public static ListPersonalNumbersOfUserResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPersonalNumbersOfUserResponseBodyDataList self = new ListPersonalNumbersOfUserResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListPersonalNumbersOfUserResponseBodyDataList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListPersonalNumbersOfUserResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPersonalNumbersOfUserResponseBodyDataList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListPersonalNumbersOfUserResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPersonalNumbersOfUserResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListPersonalNumbersOfUserResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class ListPersonalNumbersOfUserResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListPersonalNumbersOfUserResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPersonalNumbersOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPersonalNumbersOfUserResponseBodyData self = new ListPersonalNumbersOfUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPersonalNumbersOfUserResponseBodyData setList(java.util.List<ListPersonalNumbersOfUserResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPersonalNumbersOfUserResponseBodyDataList> getList() {
            return this.list;
        }

        public ListPersonalNumbersOfUserResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPersonalNumbersOfUserResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPersonalNumbersOfUserResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
