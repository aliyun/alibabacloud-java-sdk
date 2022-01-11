// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckDomainStatusResponseBody extends TeaModel {
    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // module
    @NameInMap("Module")
    public CheckDomainStatusResponseBodyModule module;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CheckDomainStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDomainStatusResponseBody self = new CheckDomainStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDomainStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckDomainStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckDomainStatusResponseBody setModule(CheckDomainStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckDomainStatusResponseBodyModule getModule() {
        return this.module;
    }

    public CheckDomainStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDomainStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckDomainStatusResponseBodyModule extends TeaModel {
        @NameInMap("DeadDate")
        public Long deadDate;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Price")
        public Float price;

        @NameInMap("RegDate")
        public Long regDate;

        public static CheckDomainStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckDomainStatusResponseBodyModule self = new CheckDomainStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckDomainStatusResponseBodyModule setDeadDate(Long deadDate) {
            this.deadDate = deadDate;
            return this;
        }
        public Long getDeadDate() {
            return this.deadDate;
        }

        public CheckDomainStatusResponseBodyModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckDomainStatusResponseBodyModule setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CheckDomainStatusResponseBodyModule setPrice(Float price) {
            this.price = price;
            return this;
        }
        public Float getPrice() {
            return this.price;
        }

        public CheckDomainStatusResponseBodyModule setRegDate(Long regDate) {
            this.regDate = regDate;
            return this;
        }
        public Long getRegDate() {
            return this.regDate;
        }

    }

}
