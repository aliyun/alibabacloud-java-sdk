// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetUnassociatedCustomerResponseBody extends TeaModel {
    /**
     * <p>Error Code, Candidate Value：</p>
     * <ul>
     * <li>200: OK</li>
     * <li>1109: System error</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("InviteInfoList")
    public GetUnassociatedCustomerResponseBodyInviteInfoList inviteInfoList;

    /**
     * <p>Message information</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Pagination Information</p>
     */
    @NameInMap("PageInfo")
    public GetUnassociatedCustomerResponseBodyPageInfo pageInfo;

    /**
     * <p>Request ID, Alibaba Cloud will track errors with this.</p>
     * 
     * <strong>example:</strong>
     * <p>23309219-4A34-589D-A3E0-9B2A3BFFD24F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Candidate Value: True/False, which indicates whether the current API call itself is successful. It does not guarantee the success of subsequent business operations.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetUnassociatedCustomerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnassociatedCustomerResponseBody self = new GetUnassociatedCustomerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnassociatedCustomerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUnassociatedCustomerResponseBody setInviteInfoList(GetUnassociatedCustomerResponseBodyInviteInfoList inviteInfoList) {
        this.inviteInfoList = inviteInfoList;
        return this;
    }
    public GetUnassociatedCustomerResponseBodyInviteInfoList getInviteInfoList() {
        return this.inviteInfoList;
    }

    public GetUnassociatedCustomerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnassociatedCustomerResponseBody setPageInfo(GetUnassociatedCustomerResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public GetUnassociatedCustomerResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public GetUnassociatedCustomerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUnassociatedCustomerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo extends TeaModel {
        @NameInMap("AccountNickname")
        public String accountNickname;

        @NameInMap("Email")
        public String email;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("InviteId")
        public Long inviteId;

        @NameInMap("Status")
        public Integer status;

        public static GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo self = new GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo();
            return TeaModel.build(map, self);
        }

        public GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo setAccountNickname(String accountNickname) {
            this.accountNickname = accountNickname;
            return this;
        }
        public String getAccountNickname() {
            return this.accountNickname;
        }

        public GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo setInviteId(Long inviteId) {
            this.inviteId = inviteId;
            return this;
        }
        public Long getInviteId() {
            return this.inviteId;
        }

        public GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetUnassociatedCustomerResponseBodyInviteInfoList extends TeaModel {
        @NameInMap("InviteInfo")
        public java.util.List<GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo> inviteInfo;

        public static GetUnassociatedCustomerResponseBodyInviteInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetUnassociatedCustomerResponseBodyInviteInfoList self = new GetUnassociatedCustomerResponseBodyInviteInfoList();
            return TeaModel.build(map, self);
        }

        public GetUnassociatedCustomerResponseBodyInviteInfoList setInviteInfo(java.util.List<GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo> inviteInfo) {
            this.inviteInfo = inviteInfo;
            return this;
        }
        public java.util.List<GetUnassociatedCustomerResponseBodyInviteInfoListInviteInfo> getInviteInfo() {
            return this.inviteInfo;
        }

    }

    public static class GetUnassociatedCustomerResponseBodyPageInfo extends TeaModel {
        /**
         * <p>Pagination, current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>Pagination, record number on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Pagination, page volume in total.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static GetUnassociatedCustomerResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUnassociatedCustomerResponseBodyPageInfo self = new GetUnassociatedCustomerResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public GetUnassociatedCustomerResponseBodyPageInfo setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public GetUnassociatedCustomerResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetUnassociatedCustomerResponseBodyPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
