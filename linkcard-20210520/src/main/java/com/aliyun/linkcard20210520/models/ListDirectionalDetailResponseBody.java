// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class ListDirectionalDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDirectionalDetailResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDirectionalDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDirectionalDetailResponseBody self = new ListDirectionalDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDirectionalDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDirectionalDetailResponseBody setData(ListDirectionalDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDirectionalDetailResponseBodyData getData() {
        return this.data;
    }

    public ListDirectionalDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDirectionalDetailResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public ListDirectionalDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDirectionalDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDirectionalDetailResponseBodyDataPaginationResultList extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AddressType")
        public String addressType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Source")
        public String source;

        @NameInMap("State")
        public String state;

        public static ListDirectionalDetailResponseBodyDataPaginationResultList build(java.util.Map<String, ?> map) throws Exception {
            ListDirectionalDetailResponseBodyDataPaginationResultList self = new ListDirectionalDetailResponseBodyDataPaginationResultList();
            return TeaModel.build(map, self);
        }

        public ListDirectionalDetailResponseBodyDataPaginationResultList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResultList setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResultList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResultList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResultList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListDirectionalDetailResponseBodyDataPaginationResult extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListDirectionalDetailResponseBodyDataPaginationResultList> list;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static ListDirectionalDetailResponseBodyDataPaginationResult build(java.util.Map<String, ?> map) throws Exception {
            ListDirectionalDetailResponseBodyDataPaginationResult self = new ListDirectionalDetailResponseBodyDataPaginationResult();
            return TeaModel.build(map, self);
        }

        public ListDirectionalDetailResponseBodyDataPaginationResult setList(java.util.List<ListDirectionalDetailResponseBodyDataPaginationResultList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListDirectionalDetailResponseBodyDataPaginationResultList> getList() {
            return this.list;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResult setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResult setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDirectionalDetailResponseBodyDataPaginationResult setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListDirectionalDetailResponseBodyData extends TeaModel {
        @NameInMap("DirectionalGroupId")
        public Long directionalGroupId;

        @NameInMap("DirectionalName")
        public String directionalName;

        @NameInMap("PaginationResult")
        public ListDirectionalDetailResponseBodyDataPaginationResult paginationResult;

        public static ListDirectionalDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDirectionalDetailResponseBodyData self = new ListDirectionalDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDirectionalDetailResponseBodyData setDirectionalGroupId(Long directionalGroupId) {
            this.directionalGroupId = directionalGroupId;
            return this;
        }
        public Long getDirectionalGroupId() {
            return this.directionalGroupId;
        }

        public ListDirectionalDetailResponseBodyData setDirectionalName(String directionalName) {
            this.directionalName = directionalName;
            return this;
        }
        public String getDirectionalName() {
            return this.directionalName;
        }

        public ListDirectionalDetailResponseBodyData setPaginationResult(ListDirectionalDetailResponseBodyDataPaginationResult paginationResult) {
            this.paginationResult = paginationResult;
            return this;
        }
        public ListDirectionalDetailResponseBodyDataPaginationResult getPaginationResult() {
            return this.paginationResult;
        }

    }

}
