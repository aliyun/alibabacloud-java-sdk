// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class CheckSelectedDomainStatusResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Module")
    public CheckSelectedDomainStatusResponseBodyModule module;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CheckSelectedDomainStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSelectedDomainStatusResponseBody self = new CheckSelectedDomainStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSelectedDomainStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CheckSelectedDomainStatusResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CheckSelectedDomainStatusResponseBody setModule(CheckSelectedDomainStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CheckSelectedDomainStatusResponseBodyModule getModule() {
        return this.module;
    }

    public CheckSelectedDomainStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSelectedDomainStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckSelectedDomainStatusResponseBodyModule extends TeaModel {
        @NameInMap("DeadDate")
        public Long deadDate;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Price")
        public Double price;

        @NameInMap("RegDate")
        public Long regDate;

        public static CheckSelectedDomainStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CheckSelectedDomainStatusResponseBodyModule self = new CheckSelectedDomainStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CheckSelectedDomainStatusResponseBodyModule setDeadDate(Long deadDate) {
            this.deadDate = deadDate;
            return this;
        }
        public Long getDeadDate() {
            return this.deadDate;
        }

        public CheckSelectedDomainStatusResponseBodyModule setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CheckSelectedDomainStatusResponseBodyModule setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CheckSelectedDomainStatusResponseBodyModule setPrice(Double price) {
            this.price = price;
            return this;
        }
        public Double getPrice() {
            return this.price;
        }

        public CheckSelectedDomainStatusResponseBodyModule setRegDate(Long regDate) {
            this.regDate = regDate;
            return this;
        }
        public Long getRegDate() {
            return this.regDate;
        }

    }

}
