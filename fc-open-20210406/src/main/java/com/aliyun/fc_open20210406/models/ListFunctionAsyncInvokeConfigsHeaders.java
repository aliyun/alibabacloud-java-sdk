// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListFunctionAsyncInvokeConfigsHeaders extends TeaModel {
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
     * <p>The time when the Function Compute is called. The format is <strong>EEE,d MMM yyyy HH:mm:ss GMT</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Sat, 14 Jul 2017 07:02:38 GMT</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The invocation method.</p>
     * <ul>
     * <li><strong>Sync</strong>: synchronous</li>
     * <li><strong>Async</strong>: asynchronous</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Async</p>
     */
    @NameInMap("X-Fc-Invocation-Type")
    public String xFcInvocationType;

    /**
     * <p>The method used to return logs. Valid values:</p>
     * <ul>
     * <li><strong>Tail</strong>: returns the last 4 KB of logs that are generated for the current request.</li>
     * <li><strong>None</strong>: No logs are returned for the current request. Default value: None.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Tail</p>
     */
    @NameInMap("X-Fc-Log-Type")
    public String xFcLogType;

    /**
     * <p>The trace ID of the invocation request of Function Compute.</p>
     * 
     * <strong>example:</strong>
     * <p>asdf****</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListFunctionAsyncInvokeConfigsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionAsyncInvokeConfigsHeaders self = new ListFunctionAsyncInvokeConfigsHeaders();
        return TeaModel.build(map, self);
    }

    public ListFunctionAsyncInvokeConfigsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListFunctionAsyncInvokeConfigsHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListFunctionAsyncInvokeConfigsHeaders setXFcCodeChecksum(String xFcCodeChecksum) {
        this.xFcCodeChecksum = xFcCodeChecksum;
        return this;
    }
    public String getXFcCodeChecksum() {
        return this.xFcCodeChecksum;
    }

    public ListFunctionAsyncInvokeConfigsHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListFunctionAsyncInvokeConfigsHeaders setXFcInvocationType(String xFcInvocationType) {
        this.xFcInvocationType = xFcInvocationType;
        return this;
    }
    public String getXFcInvocationType() {
        return this.xFcInvocationType;
    }

    public ListFunctionAsyncInvokeConfigsHeaders setXFcLogType(String xFcLogType) {
        this.xFcLogType = xFcLogType;
        return this;
    }
    public String getXFcLogType() {
        return this.xFcLogType;
    }

    public ListFunctionAsyncInvokeConfigsHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
