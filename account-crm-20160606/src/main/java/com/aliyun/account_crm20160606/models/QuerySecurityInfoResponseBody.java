// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QuerySecurityInfoResponseBody extends TeaModel {
    @NameInMap("AccountSecurityInfoDto")
    public QuerySecurityInfoResponseBodyAccountSecurityInfoDto accountSecurityInfoDto;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySecurityInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityInfoResponseBody self = new QuerySecurityInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecurityInfoResponseBody setAccountSecurityInfoDto(QuerySecurityInfoResponseBodyAccountSecurityInfoDto accountSecurityInfoDto) {
        this.accountSecurityInfoDto = accountSecurityInfoDto;
        return this;
    }
    public QuerySecurityInfoResponseBodyAccountSecurityInfoDto getAccountSecurityInfoDto() {
        return this.accountSecurityInfoDto;
    }

    public QuerySecurityInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecurityInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecurityInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecurityInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySecurityInfoResponseBodyAccountSecurityInfoDto extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NationalityCode")
        public String nationalityCode;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("ProfileType")
        public String profileType;

        @NameInMap("SecurityEmail")
        public String securityEmail;

        @NameInMap("SecurityMobile")
        public String securityMobile;

        public static QuerySecurityInfoResponseBodyAccountSecurityInfoDto build(java.util.Map<String, ?> map) throws Exception {
            QuerySecurityInfoResponseBodyAccountSecurityInfoDto self = new QuerySecurityInfoResponseBodyAccountSecurityInfoDto();
            return TeaModel.build(map, self);
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setProfileType(String profileType) {
            this.profileType = profileType;
            return this;
        }
        public String getProfileType() {
            return this.profileType;
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setSecurityEmail(String securityEmail) {
            this.securityEmail = securityEmail;
            return this;
        }
        public String getSecurityEmail() {
            return this.securityEmail;
        }

        public QuerySecurityInfoResponseBodyAccountSecurityInfoDto setSecurityMobile(String securityMobile) {
            this.securityMobile = securityMobile;
            return this;
        }
        public String getSecurityMobile() {
            return this.securityMobile;
        }

    }

}
