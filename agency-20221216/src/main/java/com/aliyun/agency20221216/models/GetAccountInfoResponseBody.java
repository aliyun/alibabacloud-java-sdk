// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetAccountInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfoList")
    public GetAccountInfoResponseBodyAccountInfoList accountInfoList;

    @NameInMap("Code")
    public String code;

    /**
     * <p>message</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public GetAccountInfoResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAccountInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountInfoResponseBody self = new GetAccountInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountInfoResponseBody setAccountInfoList(GetAccountInfoResponseBodyAccountInfoList accountInfoList) {
        this.accountInfoList = accountInfoList;
        return this;
    }
    public GetAccountInfoResponseBodyAccountInfoList getAccountInfoList() {
        return this.accountInfoList;
    }

    public GetAccountInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAccountInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAccountInfoResponseBody setPageInfo(GetAccountInfoResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetAccountInfoResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetAccountInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAccountInfoResponseBodyAccountInfoListAccountInfo extends TeaModel {
        @NameInMap("AccountNickname")
        public String accountNickname;

        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("AssociationSuccessTime")
        public String associationSuccessTime;

        @NameInMap("Cid")
        public Long cid;

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

        public static GetAccountInfoResponseBodyAccountInfoListAccountInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfoListAccountInfo self = new GetAccountInfoResponseBodyAccountInfoListAccountInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setAssociationSuccessTime(String associationSuccessTime) {
            this.associationSuccessTime = associationSuccessTime;
            return this;
        }
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setCid(Long cid) {
            this.cid = cid;
            return this;
        }
        public Long getCid() {
            return this.cid;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setSubAccountType(Integer subAccountType) {
            this.subAccountType = subAccountType;
            return this;
        }
        public Integer getSubAccountType() {
            return this.subAccountType;
        }

        public GetAccountInfoResponseBodyAccountInfoListAccountInfo setUid(Long uid) {
            this.uid = uid;
            return this;
        }
        public Long getUid() {
            return this.uid;
        }

    }

    public static class GetAccountInfoResponseBodyAccountInfoList extends TeaModel {
        @NameInMap("AccountInfo")
        public java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo;

        public static GetAccountInfoResponseBodyAccountInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyAccountInfoList self = new GetAccountInfoResponseBodyAccountInfoList();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyAccountInfoList setAccountInfo(java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> accountInfo) {
            this.accountInfo = accountInfo;
            return this;
        }
        public java.util.List<GetAccountInfoResponseBodyAccountInfoListAccountInfo> getAccountInfo() {
            return this.accountInfo;
        }

    }

    public static class GetAccountInfoResponseBodyPageInfo extends TeaModel {
        @NameInMap("Page")
        public Integer page;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static GetAccountInfoResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountInfoResponseBodyPageInfo self = new GetAccountInfoResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountInfoResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetAccountInfoResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAccountInfoResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
