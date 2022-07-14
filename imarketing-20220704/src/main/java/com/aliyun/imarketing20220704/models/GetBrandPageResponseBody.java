// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetBrandPageResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetBrandPageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBrandPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBrandPageResponseBody self = new GetBrandPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBrandPageResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetBrandPageResponseBody setData(GetBrandPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBrandPageResponseBodyData getData() {
        return this.data;
    }

    public GetBrandPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBrandPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBrandPageResponseBodyDataList extends TeaModel {
        @NameInMap("AccountNo")
        public String accountNo;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("Company")
        public String company;

        @NameInMap("MainId")
        public Long mainId;

        @NameInMap("MainName")
        public String mainName;

        @NameInMap("ParentMainId")
        public Long parentMainId;

        public static GetBrandPageResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetBrandPageResponseBodyDataList self = new GetBrandPageResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetBrandPageResponseBodyDataList setAccountNo(String accountNo) {
            this.accountNo = accountNo;
            return this;
        }
        public String getAccountNo() {
            return this.accountNo;
        }

        public GetBrandPageResponseBodyDataList setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public GetBrandPageResponseBodyDataList setCompany(String company) {
            this.company = company;
            return this;
        }
        public String getCompany() {
            return this.company;
        }

        public GetBrandPageResponseBodyDataList setMainId(Long mainId) {
            this.mainId = mainId;
            return this;
        }
        public Long getMainId() {
            return this.mainId;
        }

        public GetBrandPageResponseBodyDataList setMainName(String mainName) {
            this.mainName = mainName;
            return this;
        }
        public String getMainName() {
            return this.mainName;
        }

        public GetBrandPageResponseBodyDataList setParentMainId(Long parentMainId) {
            this.parentMainId = parentMainId;
            return this;
        }
        public Long getParentMainId() {
            return this.parentMainId;
        }

    }

    public static class GetBrandPageResponseBodyDataPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalNumber")
        public Integer totalNumber;

        public static GetBrandPageResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBrandPageResponseBodyDataPageInfo self = new GetBrandPageResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public GetBrandPageResponseBodyDataPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetBrandPageResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetBrandPageResponseBodyDataPageInfo setTotalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

    }

    public static class GetBrandPageResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<GetBrandPageResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public GetBrandPageResponseBodyDataPageInfo pageInfo;

        public static GetBrandPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBrandPageResponseBodyData self = new GetBrandPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBrandPageResponseBodyData setList(java.util.List<GetBrandPageResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetBrandPageResponseBodyDataList> getList() {
            return this.list;
        }

        public GetBrandPageResponseBodyData setPageInfo(GetBrandPageResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public GetBrandPageResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
