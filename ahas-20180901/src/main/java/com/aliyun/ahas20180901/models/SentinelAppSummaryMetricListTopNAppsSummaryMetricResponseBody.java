// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody self = new SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelAppSummaryMetricListTopNAppsSummaryMetricResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
