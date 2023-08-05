// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class DescribeSuspEventTracingSubNodesCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, Integer> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static DescribeSuspEventTracingSubNodesCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventTracingSubNodesCountResponseBody self = new DescribeSuspEventTracingSubNodesCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setData(java.util.Map<String, Integer> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, Integer> getData() {
        return this.data;
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeSuspEventTracingSubNodesCountResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

}
