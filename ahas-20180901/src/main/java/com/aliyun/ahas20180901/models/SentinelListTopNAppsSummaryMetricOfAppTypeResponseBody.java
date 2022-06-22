// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody extends TeaModel {
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

    public static SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody self = new SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelListTopNAppsSummaryMetricOfAppTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
