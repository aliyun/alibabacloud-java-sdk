// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSecurityPracticeReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccountSecurityPracticeInfo")
    @Validation(required = true)
    public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo accountSecurityPracticeInfo;

    public static GetAccountSecurityPracticeReportResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSecurityPracticeReportResponse self = new GetAccountSecurityPracticeReportResponse();
        return TeaModel.build(map, self);
    }

    public GetAccountSecurityPracticeReportResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAccountSecurityPracticeReportResponse setAccountSecurityPracticeInfo(GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo accountSecurityPracticeInfo) {
        this.accountSecurityPracticeInfo = accountSecurityPracticeInfo;
        return this;
    }
    public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo getAccountSecurityPracticeInfo() {
        return this.accountSecurityPracticeInfo;
    }

    public static class GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo extends TeaModel {
        @NameInMap("BindMfa")
        @Validation(required = true)
        public Boolean bindMfa;

        @NameInMap("SubUserPwdLevel")
        @Validation(required = true)
        public String subUserPwdLevel;

        @NameInMap("RootWithAccessKey")
        @Validation(required = true)
        public Integer rootWithAccessKey;

        @NameInMap("OldAkNum")
        @Validation(required = true)
        public Integer oldAkNum;

        @NameInMap("UnusedAkNum")
        @Validation(required = true)
        public Integer unusedAkNum;

        @NameInMap("SubUser")
        @Validation(required = true)
        public Integer subUser;

        @NameInMap("SubUserBindMfa")
        @Validation(required = true)
        public Integer subUserBindMfa;

        @NameInMap("SubUserWithOldAccessKey")
        @Validation(required = true)
        public Integer subUserWithOldAccessKey;

        @NameInMap("SubUserWithUnusedAccessKey")
        @Validation(required = true)
        public Integer subUserWithUnusedAccessKey;

        public static GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo self = new GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setBindMfa(Boolean bindMfa) {
            this.bindMfa = bindMfa;
            return this;
        }
        public Boolean getBindMfa() {
            return this.bindMfa;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserPwdLevel(String subUserPwdLevel) {
            this.subUserPwdLevel = subUserPwdLevel;
            return this;
        }
        public String getSubUserPwdLevel() {
            return this.subUserPwdLevel;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setRootWithAccessKey(Integer rootWithAccessKey) {
            this.rootWithAccessKey = rootWithAccessKey;
            return this;
        }
        public Integer getRootWithAccessKey() {
            return this.rootWithAccessKey;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setOldAkNum(Integer oldAkNum) {
            this.oldAkNum = oldAkNum;
            return this;
        }
        public Integer getOldAkNum() {
            return this.oldAkNum;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setUnusedAkNum(Integer unusedAkNum) {
            this.unusedAkNum = unusedAkNum;
            return this;
        }
        public Integer getUnusedAkNum() {
            return this.unusedAkNum;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUser(Integer subUser) {
            this.subUser = subUser;
            return this;
        }
        public Integer getSubUser() {
            return this.subUser;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserBindMfa(Integer subUserBindMfa) {
            this.subUserBindMfa = subUserBindMfa;
            return this;
        }
        public Integer getSubUserBindMfa() {
            return this.subUserBindMfa;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserWithOldAccessKey(Integer subUserWithOldAccessKey) {
            this.subUserWithOldAccessKey = subUserWithOldAccessKey;
            return this;
        }
        public Integer getSubUserWithOldAccessKey() {
            return this.subUserWithOldAccessKey;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo setSubUserWithUnusedAccessKey(Integer subUserWithUnusedAccessKey) {
            this.subUserWithUnusedAccessKey = subUserWithUnusedAccessKey;
            return this;
        }
        public Integer getSubUserWithUnusedAccessKey() {
            return this.subUserWithUnusedAccessKey;
        }

    }

    public static class GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public Integer score;

        @NameInMap("AccountSecurityPracticeUserInfo")
        @Validation(required = true)
        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo;

        public static GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo self = new GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo();
            return TeaModel.build(map, self);
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfo setAccountSecurityPracticeUserInfo(GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo) {
            this.accountSecurityPracticeUserInfo = accountSecurityPracticeUserInfo;
            return this;
        }
        public GetAccountSecurityPracticeReportResponseAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo getAccountSecurityPracticeUserInfo() {
            return this.accountSecurityPracticeUserInfo;
        }

    }

}
