// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ReleaseGPUInstanceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The time on which the function is invoked. The format of the value is: EEE,d MMM yyyy HH:mm:ss GMT.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The custom request ID.</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ReleaseGPUInstanceHeaders build(java.util.Map<String, ?> map) throws Exception {
        ReleaseGPUInstanceHeaders self = new ReleaseGPUInstanceHeaders();
        return TeaModel.build(map, self);
    }

    public ReleaseGPUInstanceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ReleaseGPUInstanceHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ReleaseGPUInstanceHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ReleaseGPUInstanceHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
