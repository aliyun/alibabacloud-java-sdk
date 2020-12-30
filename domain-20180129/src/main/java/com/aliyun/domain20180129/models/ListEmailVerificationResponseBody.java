// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class ListEmailVerificationResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("Data")
    public java.util.List<ListEmailVerificationResponseBodyData> data;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static ListEmailVerificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEmailVerificationResponseBody self = new ListEmailVerificationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEmailVerificationResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public ListEmailVerificationResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public ListEmailVerificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEmailVerificationResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEmailVerificationResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public ListEmailVerificationResponseBody setData(java.util.List<ListEmailVerificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEmailVerificationResponseBodyData> getData() {
        return this.data;
    }

    public ListEmailVerificationResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public ListEmailVerificationResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class ListEmailVerificationResponseBodyData extends TeaModel {
        @NameInMap("VerificationTime")
        public String verificationTime;

        @NameInMap("Email")
        public String email;

        @NameInMap("EmailVerificationNo")
        public String emailVerificationNo;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("VerificationStatus")
        public Integer verificationStatus;

        @NameInMap("TokenSendTime")
        public String tokenSendTime;

        @NameInMap("SendIp")
        public String sendIp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ConfirmIp")
        public String confirmIp;

        public static ListEmailVerificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEmailVerificationResponseBodyData self = new ListEmailVerificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEmailVerificationResponseBodyData setVerificationTime(String verificationTime) {
            this.verificationTime = verificationTime;
            return this;
        }
        public String getVerificationTime() {
            return this.verificationTime;
        }

        public ListEmailVerificationResponseBodyData setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListEmailVerificationResponseBodyData setEmailVerificationNo(String emailVerificationNo) {
            this.emailVerificationNo = emailVerificationNo;
            return this;
        }
        public String getEmailVerificationNo() {
            return this.emailVerificationNo;
        }

        public ListEmailVerificationResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListEmailVerificationResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListEmailVerificationResponseBodyData setVerificationStatus(Integer verificationStatus) {
            this.verificationStatus = verificationStatus;
            return this;
        }
        public Integer getVerificationStatus() {
            return this.verificationStatus;
        }

        public ListEmailVerificationResponseBodyData setTokenSendTime(String tokenSendTime) {
            this.tokenSendTime = tokenSendTime;
            return this;
        }
        public String getTokenSendTime() {
            return this.tokenSendTime;
        }

        public ListEmailVerificationResponseBodyData setSendIp(String sendIp) {
            this.sendIp = sendIp;
            return this;
        }
        public String getSendIp() {
            return this.sendIp;
        }

        public ListEmailVerificationResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListEmailVerificationResponseBodyData setConfirmIp(String confirmIp) {
            this.confirmIp = confirmIp;
            return this;
        }
        public String getConfirmIp() {
            return this.confirmIp;
        }

    }

}
