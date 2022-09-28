// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetShareAccountListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public GetShareAccountListResponseBodyDataList dataList;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetShareAccountListResponseBodyPageInfo pageInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetShareAccountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetShareAccountListResponseBody self = new GetShareAccountListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetShareAccountListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetShareAccountListResponseBody setDataList(GetShareAccountListResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetShareAccountListResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GetShareAccountListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetShareAccountListResponseBody setPageInfo(GetShareAccountListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetShareAccountListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetShareAccountListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetShareAccountListResponseBodyDataListData extends TeaModel {
        @NameInMap("Cid")
        public Long cid;

        @NameInMap("CloudAccount")
        public String cloudAccount;

        @NameInMap("CustomerAccount")
        public String customerAccount;

        @NameInMap("CustomerName")
        public String customerName;

        @NameInMap("CustomerPhone")
        public String customerPhone;

        @NameInMap("ParentUid")
        public Long parentUid;

        @NameInMap("Uid")
        public Long uid;

        public static GetShareAccountListResponseBodyDataListData build(java.util.Map<String, ?> map) throws Exception {
            GetShareAccountListResponseBodyDataListData self = new GetShareAccountListResponseBodyDataListData();
            return TeaModel.build(map, self);
        }

        public GetShareAccountListResponseBodyDataListData setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetShareAccountListResponseBodyDataListData setCloudAccount(String cloudAccount) {
            this.cloudAccount = cloudAccount;
            return this;
        }
        public String getCloudAccount() {
            return this.cloudAccount;
        }

        public GetShareAccountListResponseBodyDataListData setCustomerAccount(String customerAccount) {
            this.customerAccount = customerAccount;
            return this;
        }
        public String getCustomerAccount() {
            return this.customerAccount;
        }

        public GetShareAccountListResponseBodyDataListData setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public GetShareAccountListResponseBodyDataListData setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }
        public String getCustomerPhone() {
            return this.customerPhone;
        }

        public GetShareAccountListResponseBodyDataListData setParentUid(Long parentUid) {
            this.parentUid = parentUid;
            return this;
        }
        public Long getParentUid() {
            return this.parentUid;
        }

        public GetShareAccountListResponseBodyDataListData setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetShareAccountListResponseBodyDataList extends TeaModel {
        @NameInMap("data")
        public java.util.List<GetShareAccountListResponseBodyDataListData> data;

        public static GetShareAccountListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetShareAccountListResponseBodyDataList self = new GetShareAccountListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetShareAccountListResponseBodyDataList setData(java.util.List<GetShareAccountListResponseBodyDataListData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GetShareAccountListResponseBodyDataListData> getData() {
            return this.data;
        }

    }

    public static class GetShareAccountListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetShareAccountListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetShareAccountListResponseBodyPageInfo self = new GetShareAccountListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetShareAccountListResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetShareAccountListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetShareAccountListResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
