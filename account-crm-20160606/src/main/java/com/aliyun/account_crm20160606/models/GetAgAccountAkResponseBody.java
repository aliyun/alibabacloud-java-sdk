// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgAccountAkResponseBody extends TeaModel {
    @NameInMap("AccountAkDto")
    public GetAgAccountAkResponseBodyAccountAkDto accountAkDto;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAgAccountAkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgAccountAkResponseBody self = new GetAgAccountAkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgAccountAkResponseBody setAccountAkDto(GetAgAccountAkResponseBodyAccountAkDto accountAkDto) {
        this.accountAkDto = accountAkDto;
        return this;
    }
    public GetAgAccountAkResponseBodyAccountAkDto getAccountAkDto() {
        return this.accountAkDto;
    }

    public GetAgAccountAkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgAccountAkResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgAccountAkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgAccountAkResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAgAccountAkResponseBodyAccountAkDto extends TeaModel {
        @NameInMap("Ak")
        public String ak;

        @NameInMap("Secret")
        public String secret;

        public static GetAgAccountAkResponseBodyAccountAkDto build(java.util.Map<String, ?> map) throws Exception {
            GetAgAccountAkResponseBodyAccountAkDto self = new GetAgAccountAkResponseBodyAccountAkDto();
            return TeaModel.build(map, self);
        }

        public GetAgAccountAkResponseBodyAccountAkDto setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public GetAgAccountAkResponseBodyAccountAkDto setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

}
