// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDtsServiceLogResponseBody extends TeaModel {
    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceLogContexts")
    public java.util.List<DescribeDtsServiceLogResponseBodyServiceLogContexts> serviceLogContexts;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalRecordCount")
    public Long totalRecordCount;

    public static DescribeDtsServiceLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDtsServiceLogResponseBody self = new DescribeDtsServiceLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDtsServiceLogResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDtsServiceLogResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDtsServiceLogResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDtsServiceLogResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDtsServiceLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDtsServiceLogResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDtsServiceLogResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDtsServiceLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDtsServiceLogResponseBody setServiceLogContexts(java.util.List<DescribeDtsServiceLogResponseBodyServiceLogContexts> serviceLogContexts) {
        this.serviceLogContexts = serviceLogContexts;
        return this;
    }
    public java.util.List<DescribeDtsServiceLogResponseBodyServiceLogContexts> getServiceLogContexts() {
        return this.serviceLogContexts;
    }

    public DescribeDtsServiceLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDtsServiceLogResponseBody setTotalRecordCount(Long totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Long getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDtsServiceLogResponseBodyServiceLogContexts extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("State")
        public String state;

        @NameInMap("Time")
        public String time;

        public static DescribeDtsServiceLogResponseBodyServiceLogContexts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDtsServiceLogResponseBodyServiceLogContexts self = new DescribeDtsServiceLogResponseBodyServiceLogContexts();
            return TeaModel.build(map, self);
        }

        public DescribeDtsServiceLogResponseBodyServiceLogContexts setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public DescribeDtsServiceLogResponseBodyServiceLogContexts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeDtsServiceLogResponseBodyServiceLogContexts setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
