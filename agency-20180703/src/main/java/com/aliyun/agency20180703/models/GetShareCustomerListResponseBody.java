// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetShareCustomerListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public GetShareCustomerListResponseBodyDataList dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetShareCustomerListResponseBodyPageInfo pageInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetShareCustomerListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShareCustomerListResponseBody self = new GetShareCustomerListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShareCustomerListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetShareCustomerListResponseBody setDataList(GetShareCustomerListResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetShareCustomerListResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetShareCustomerListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetShareCustomerListResponseBody setPageInfo(GetShareCustomerListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetShareCustomerListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetShareCustomerListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetShareCustomerListResponseBodyDataListDataCustomerAccounts extends TeaModel {
        @NameInMap("CustomerAccount")
        public java.util.List<String> customerAccount;

        public static GetShareCustomerListResponseBodyDataListDataCustomerAccounts build(java.util.Map<String, ?> map) throws Exception {
            GetShareCustomerListResponseBodyDataListDataCustomerAccounts self = new GetShareCustomerListResponseBodyDataListDataCustomerAccounts();
            return TeaModel.build(map, self);
        }

        public GetShareCustomerListResponseBodyDataListDataCustomerAccounts setCustomerAccount(java.util.List<String> customerAccount) {
            this.customerAccount = customerAccount;
            return this;
        }
        public java.util.List<String> getCustomerAccount() {
            return this.customerAccount;
        }

    }

    public static class GetShareCustomerListResponseBodyDataListDataCustomerUids extends TeaModel {
        @NameInMap("CustomerUid")
        public java.util.List<String> customerUid;

        public static GetShareCustomerListResponseBodyDataListDataCustomerUids build(java.util.Map<String, ?> map) throws Exception {
            GetShareCustomerListResponseBodyDataListDataCustomerUids self = new GetShareCustomerListResponseBodyDataListDataCustomerUids();
            return TeaModel.build(map, self);
        }

        public GetShareCustomerListResponseBodyDataListDataCustomerUids setCustomerUid(java.util.List<String> customerUid) {
            this.customerUid = customerUid;
            return this;
        }
        public java.util.List<String> getCustomerUid() {
            return this.customerUid;
        }

    }

    public static class GetShareCustomerListResponseBodyDataListData extends TeaModel {
        @NameInMap("Cid")
        public Long cid;

        @NameInMap("CustomerAccounts")
        public GetShareCustomerListResponseBodyDataListDataCustomerAccounts customerAccounts;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("CustomerType")
        public Integer customerType;

        @NameInMap("CustomerUids")
        public GetShareCustomerListResponseBodyDataListDataCustomerUids customerUids;

        @NameInMap("ExitOnGoingProject")
        public String exitOnGoingProject;

        @NameInMap("ParentUid")
        public Long parentUid;

        public static GetShareCustomerListResponseBodyDataListData build(java.util.Map<String, ?> map) throws Exception {
            GetShareCustomerListResponseBodyDataListData self = new GetShareCustomerListResponseBodyDataListData();
            return TeaModel.build(map, self);
        }

        public GetShareCustomerListResponseBodyDataListData setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetShareCustomerListResponseBodyDataListData setCustomerAccounts(GetShareCustomerListResponseBodyDataListDataCustomerAccounts customerAccounts) {
            this.customerAccounts = customerAccounts;
            return this;
        }
        public GetShareCustomerListResponseBodyDataListDataCustomerAccounts getCustomerAccounts() {
            return this.customerAccounts;
        }

        public GetShareCustomerListResponseBodyDataListData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public GetShareCustomerListResponseBodyDataListData setCustomerType(Integer customerType) {
            this.customerType = customerType;
            return this;
        }
        public Integer getCustomerType() {
            return this.customerType;
        }

        public GetShareCustomerListResponseBodyDataListData setCustomerUids(GetShareCustomerListResponseBodyDataListDataCustomerUids customerUids) {
            this.customerUids = customerUids;
            return this;
        }
        public GetShareCustomerListResponseBodyDataListDataCustomerUids getCustomerUids() {
            return this.customerUids;
        }

        public GetShareCustomerListResponseBodyDataListData setExitOnGoingProject(String exitOnGoingProject) {
            this.exitOnGoingProject = exitOnGoingProject;
            return this;
        }
        public String getExitOnGoingProject() {
            return this.exitOnGoingProject;
        }

        public GetShareCustomerListResponseBodyDataListData setParentUid(Long parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public Long getParentUid() {
            return this.parentUid;
        }

    }

    public static class GetShareCustomerListResponseBodyDataList extends TeaModel {
        @NameInMap("data")
        public java.util.List<GetShareCustomerListResponseBodyDataListData> data;

        public static GetShareCustomerListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetShareCustomerListResponseBodyDataList self = new GetShareCustomerListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetShareCustomerListResponseBodyDataList setData(java.util.List<GetShareCustomerListResponseBodyDataListData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetShareCustomerListResponseBodyDataListData> getData() {
            return this.data;
        }

    }

    public static class GetShareCustomerListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetShareCustomerListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetShareCustomerListResponseBodyPageInfo self = new GetShareCustomerListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetShareCustomerListResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetShareCustomerListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetShareCustomerListResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
