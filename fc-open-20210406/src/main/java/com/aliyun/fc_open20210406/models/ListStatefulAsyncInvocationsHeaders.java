// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The CRC-64 value of the function code package. This value is used to check data integrity. The value is automatically calculated by the tool.</p>
     * 
     * <strong>example:</strong>
     * <p>1506052139770049xxxx</p>
     */
    @NameInMap("X-Fc-Code-Checksum")
    public String xFcCodeChecksum;

    /**
     * <p>The time when the function is invoked. The value is in the <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong> format.</p>
     * 
     * <strong>example:</strong>
     * <p>Sat, 14 Jul 2017 07:02:38 GMT</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The method used to invoke the function.</p>
     * <ul>
     * <li><strong>Sync</strong>: synchronous invocations</li>
     * <li><strong>Async</strong>: asynchronous invocations</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Async</p>
     */
    @NameInMap("X-Fc-Invocation-Type")
    public String xFcInvocationType;

    /**
     * <p>The method used to return logs.</p>
     * <ul>
     * <li><strong>Tail</strong>: returns the last 4 KB of logs that are generated for the current request.</li>
     * <li><strong>None</strong>: does not return logs for the current request. Default value: None.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tail</p>
     */
    @NameInMap("X-Fc-Log-Type")
    public String xFcLogType;

    /**
     * <p>The trace ID of the request for Function Compute API.</p>
     * 
     * <strong>example:</strong>
     * <p>abcxxx</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListStatefulAsyncInvocationsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationsHeaders self = new ListStatefulAsyncInvocationsHeaders();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListStatefulAsyncInvocationsHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListStatefulAsyncInvocationsHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    public ListStatefulAsyncInvocationsHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListStatefulAsyncInvocationsHeaders setXFcInvocationType(String xFcInvocationType) {
        this.xFcInvocationType = xFcInvocationType;
        return this;
    }
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    public ListStatefulAsyncInvocationsHeaders setXFcLogType(String xFcLogType) {
        this.xFcLogType = xFcLogType;
        return this;
    }
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public ListStatefulAsyncInvocationsHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
