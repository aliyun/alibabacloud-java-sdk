// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListDirectionalAddressResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDirectionalAddressResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDirectionalAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDirectionalAddressResponseBody self = new ListDirectionalAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDirectionalAddressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDirectionalAddressResponseBody setData(ListDirectionalAddressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDirectionalAddressResponseBodyData getData() {
        return this.data;
    }

    public ListDirectionalAddressResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDirectionalAddressResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public ListDirectionalAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDirectionalAddressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDirectionalAddressResponseBodyDataList extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Source")
        public String source;

        @NameInMap("State")
        public Integer state;

        public static ListDirectionalAddressResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDirectionalAddressResponseBodyDataList self = new ListDirectionalAddressResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDirectionalAddressResponseBodyDataList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListDirectionalAddressResponseBodyDataList setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListDirectionalAddressResponseBodyDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDirectionalAddressResponseBodyDataList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDirectionalAddressResponseBodyDataList setState(Integer state) {
            this.state = state;
            return this;
        }
        public Integer getState() {
            return this.state;
        }

    }

    public static class ListDirectionalAddressResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListDirectionalAddressResponseBodyDataList> list;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListDirectionalAddressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDirectionalAddressResponseBodyData self = new ListDirectionalAddressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDirectionalAddressResponseBodyData setList(java.util.List<ListDirectionalAddressResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDirectionalAddressResponseBodyDataList> getList() {
            return this.list;
        }

        public ListDirectionalAddressResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListDirectionalAddressResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDirectionalAddressResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDirectionalAddressResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
