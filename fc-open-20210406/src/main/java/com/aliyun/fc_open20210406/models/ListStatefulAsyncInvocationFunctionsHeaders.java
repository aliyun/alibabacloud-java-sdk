// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>It is a tool used to manage and configure Alibaba Cloud resources. After simple installation and configuration, you can use Alibaba Cloud CLI to manage multiple Alibaba Cloud services and migrate your data and business to the cloud with ease.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The token used to obtain more results. If this parameter is left empty, all the results are returned.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The details of returned data.</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListStatefulAsyncInvocationFunctionsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationFunctionsHeaders self = new ListStatefulAsyncInvocationFunctionsHeaders();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListStatefulAsyncInvocationFunctionsHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
