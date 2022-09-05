// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetMainPartPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetMainPartPageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMainPartPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMainPartPageResponseBody self = new GetMainPartPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMainPartPageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetMainPartPageResponseBody setData(GetMainPartPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMainPartPageResponseBodyData getData() {
        return this.data;
    }

    public GetMainPartPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMainPartPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMainPartPageResponseBodyDataListAccountTypeList extends TeaModel {
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AccountTypeDesc")
        public String accountTypeDesc;

        public static GetMainPartPageResponseBodyDataListAccountTypeList build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartPageResponseBodyDataListAccountTypeList self = new GetMainPartPageResponseBodyDataListAccountTypeList();
            return TeaModel.build(map, self);
        }

        public GetMainPartPageResponseBodyDataListAccountTypeList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetMainPartPageResponseBodyDataListAccountTypeList setAccountTypeDesc(String accountTypeDesc) {
            this.accountTypeDesc = accountTypeDesc;
            return this;
        }
        public String getAccountTypeDesc() {
            return this.accountTypeDesc;
        }

    }

    public static class GetMainPartPageResponseBodyDataList extends TeaModel {
        @NameInMap("AccountTypeList")
        public java.util.List<GetMainPartPageResponseBodyDataListAccountTypeList> accountTypeList;

        @NameInMap("Company")
        public String company;

        @NameInMap("MainId")
        public Long mainId;

        @NameInMap("MainName")
        public String mainName;

        public static GetMainPartPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartPageResponseBodyDataList self = new GetMainPartPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetMainPartPageResponseBodyDataList setAccountTypeList(java.util.List<GetMainPartPageResponseBodyDataListAccountTypeList> accountTypeList) {
            this.accountTypeList = accountTypeList;
            return this;
        }
        public java.util.List<GetMainPartPageResponseBodyDataListAccountTypeList> getAccountTypeList() {
            return this.accountTypeList;
        }

        public GetMainPartPageResponseBodyDataList setCompany(String company) {
            this.company = company;
            return this;
        }
        public String getCompany() {
            return this.company;
        }

        public GetMainPartPageResponseBodyDataList setMainId(Long mainId) {
            this.mainId = mainId;
            return this;
        }
        public Long getMainId() {
            return this.mainId;
        }

        public GetMainPartPageResponseBodyDataList setMainName(String mainName) {
            this.mainName = mainName;
            return this;
        }
        public String getMainName() {
            return this.mainName;
        }

    }

    public static class GetMainPartPageResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        public static GetMainPartPageResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartPageResponseBodyDataPageInfo self = new GetMainPartPageResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetMainPartPageResponseBodyDataPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetMainPartPageResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMainPartPageResponseBodyDataPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

    public static class GetMainPartPageResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetMainPartPageResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public GetMainPartPageResponseBodyDataPageInfo pageInfo;

        public static GetMainPartPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMainPartPageResponseBodyData self = new GetMainPartPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMainPartPageResponseBodyData setList(java.util.List<GetMainPartPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetMainPartPageResponseBodyDataList> getList() {
            return this.list;
        }

        public GetMainPartPageResponseBodyData setPageInfo(GetMainPartPageResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetMainPartPageResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
