// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20180703.models;

import com.aliyun.tea.*;

public class GetSubAccountInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfoList")
    public GetSubAccountInfoResponseBodyAccountInfoList accountInfoList;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetSubAccountInfoResponseBodyPageInfo pageInfo;

    @NameInMap("Success")
    public Boolean success;

    public static GetSubAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubAccountInfoResponseBody self = new GetSubAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubAccountInfoResponseBody setAccountInfoList(GetSubAccountInfoResponseBodyAccountInfoList accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public GetSubAccountInfoResponseBodyAccountInfoList getAccountInfoList() {
        return this.accountInfoList;
    }

    public GetSubAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSubAccountInfoResponseBody setPageInfo(GetSubAccountInfoResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetSubAccountInfoResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetSubAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubAccountInfoResponseBodyAccountInfoListAccountInfo extends TeaModel {
        @NameInMap("AccountNickname")
        public String accountNickname;

        @NameInMap("AssociationSuccessTime")
        public String associationSuccessTime;

        @NameInMap("Email")
        public String email;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("SubAccountType")
        public Integer subAccountType;

        @NameInMap("Uid")
        public Long uid;

        public static GetSubAccountInfoResponseBodyAccountInfoListAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSubAccountInfoResponseBodyAccountInfoListAccountInfo self = new GetSubAccountInfoResponseBodyAccountInfoListAccountInfo();
            return TeaModel.build(map, self);
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setAssociationSuccessTime(String associationSuccessTime) {
            this.associationSuccessTime = associationSuccessTime;
            return this;
        }
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setSubAccountType(Integer subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public Integer getSubAccountType() {
            return this.subAccountType;
        }

        public GetSubAccountInfoResponseBodyAccountInfoListAccountInfo setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetSubAccountInfoResponseBodyAccountInfoList extends TeaModel {
        @NameInMap("AccountInfo")
        public java.util.List<GetSubAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo;

        public static GetSubAccountInfoResponseBodyAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetSubAccountInfoResponseBodyAccountInfoList self = new GetSubAccountInfoResponseBodyAccountInfoList();
            return TeaModel.build(map, self);
        }

        public GetSubAccountInfoResponseBodyAccountInfoList setAccountInfo(java.util.List<GetSubAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }
        public java.util.List<GetSubAccountInfoResponseBodyAccountInfoListAccountInfo> getAccountInfo() {
            return this.accountInfo;
        }

    }

    public static class GetSubAccountInfoResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetSubAccountInfoResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSubAccountInfoResponseBodyPageInfo self = new GetSubAccountInfoResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetSubAccountInfoResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetSubAccountInfoResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSubAccountInfoResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
