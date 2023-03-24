// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSecurityPracticeReportResponseBody extends TeaModel {
    /**
     * <p>The information of the security report for the Alibaba Cloud account.</p>
     */
    @NameInMap("AccountSecurityPracticeInfo")
    public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfo accountSecurityPracticeInfo;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>Indicates whether MFA is enabled. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("BindMfa")
        public Boolean bindMfa;

        /**
         * <p>The number of old AccessKey pairs for the Alibaba Cloud account.</p>
         */
        @NameInMap("OldAkNum")
        public Integer oldAkNum;

        /**
         * <p>The number of AccessKey pairs for the Alibaba Cloud account.</p>
         */
        @NameInMap("RootWithAccessKey")
        public Integer rootWithAccessKey;

        /**
         * <p>The number of RAM users within the Alibaba Cloud account.</p>
         */
        @NameInMap("SubUser")
        public Integer subUser;

        /**
         * <p>The number of RAM users that have MFA devices bound.</p>
         */
        @NameInMap("SubUserBindMfa")
        public Integer subUserBindMfa;

        /**
         * <p>The complexity level of the password for the RAM user. Valid values:</p>
         * <br>
         * <p>*   low</p>
         * <p>*   mid</p>
         * <p>*   high</p>
         */
        @NameInMap("SubUserPwdLevel")
        public String subUserPwdLevel;

        /**
         * <p>The number of RAM users that use the old AccessKey pairs.</p>
         */
        @NameInMap("SubUserWithOldAccessKey")
        public Integer subUserWithOldAccessKey;

        /**
         * <p>The number of RAM users that have no AccessKey pairs.</p>
         */
        @NameInMap("SubUserWithUnusedAccessKey")
        public Integer subUserWithUnusedAccessKey;

        /**
         * <p>The number of AccessKey pairs that are not used for the Alibaba Cloud account.</p>
         */
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
        /**
         * <p>The information of the security report for the Alibaba Cloud account.</p>
         */
        @NameInMap("AccountSecurityPracticeUserInfo")
        public GetAccountSecurityPracticeReportResponseBodyAccountSecurityPracticeInfoAccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo;

        /**
         * <p>The security score of the Alibaba Cloud account.</p>
         */
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
