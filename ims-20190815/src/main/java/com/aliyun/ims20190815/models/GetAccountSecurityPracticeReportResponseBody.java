// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSecurityPracticeReportResponseBody extends TeaModel {
    @NameInMap("AccountSecurityPracticeInfo")
    public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo accountSecurityPracticeInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAccountSecurityPracticeReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSecurityPracticeReportResponseBody self = new GetAccountSecurityPracticeReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccountSecurityPracticeReportResponseBody setAccountSecurityPracticeInfo(GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo accountSecurityPracticeInfo) {
        this.accountSecurityPracticeInfo = accountSecurityPracticeInfo;
        return this;
    }
    public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo getAccountSecurityPracticeInfo() {
        return this.accountSecurityPracticeInfo;
    }

    public GetAccountSecurityPracticeReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo extends TeaModel {
        @NameInMap("BindMfa")
        public Boolean bindMfa;

        @NameInMap("OldAkNum")
        public Integer oldAkNum;

        @NameInMap("RootWithAccessKey")
        public Integer rootWithAccessKey;

        @NameInMap("SubUser")
        public Integer subUser;

        @NameInMap("SubUserBindMfa")
        public Integer subUserBindMfa;

        @NameInMap("SubUserPwdLevel")
        public String subUserPwdLevel;

        @NameInMap("SubUserWithOldAccessKey")
        public Integer subUserWithOldAccessKey;

        @NameInMap("SubUserWithUnusedAccessKey")
        public Integer subUserWithUnusedAccessKey;

        @NameInMap("UnusedAkNum")
        public Integer unusedAkNum;

        public static GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo self = new GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setBindMfa(Boolean bindMfa) {
            this.bindMfa = bindMfa;
            return this;
        }
        public Boolean getBindMfa() {
            return this.bindMfa;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setOldAkNum(Integer oldAkNum) {
            this.oldAkNum = oldAkNum;
            return this;
        }
        public Integer getOldAkNum() {
            return this.oldAkNum;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setRootWithAccessKey(Integer rootWithAccessKey) {
            this.rootWithAccessKey = rootWithAccessKey;
            return this;
        }
        public Integer getRootWithAccessKey() {
            return this.rootWithAccessKey;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUser(Integer subUser) {
            this.subUser = subUser;
            return this;
        }
        public Integer getSubUser() {
            return this.subUser;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserBindMfa(Integer subUserBindMfa) {
            this.subUserBindMfa = subUserBindMfa;
            return this;
        }
        public Integer getSubUserBindMfa() {
            return this.subUserBindMfa;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserPwdLevel(String subUserPwdLevel) {
            this.subUserPwdLevel = subUserPwdLevel;
            return this;
        }
        public String getSubUserPwdLevel() {
            return this.subUserPwdLevel;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserWithOldAccessKey(Integer subUserWithOldAccessKey) {
            this.subUserWithOldAccessKey = subUserWithOldAccessKey;
            return this;
        }
        public Integer getSubUserWithOldAccessKey() {
            return this.subUserWithOldAccessKey;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserWithUnusedAccessKey(Integer subUserWithUnusedAccessKey) {
            this.subUserWithUnusedAccessKey = subUserWithUnusedAccessKey;
            return this;
        }
        public Integer getSubUserWithUnusedAccessKey() {
            return this.subUserWithUnusedAccessKey;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setUnusedAkNum(Integer unusedAkNum) {
            this.unusedAkNum = unusedAkNum;
            return this;
        }
        public Integer getUnusedAkNum() {
            return this.unusedAkNum;
        }

    }

    public static class GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo extends TeaModel {
        @NameInMap("AccountSecurityPracticeUserInfo")
        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo;

        @NameInMap("Score")
        public Integer score;

        public static GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo self = new GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo setAccountSecurityPracticeUserInfo(GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo) {
            this.accountSecurityPracticeUserInfo = accountSecurityPracticeUserInfo;
            return this;
        }
        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo getAccountSecurityPracticeUserInfo() {
            return this.accountSecurityPracticeUserInfo;
        }

        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

    }

}
