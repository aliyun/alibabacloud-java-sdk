// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListCustomDomainsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    @NameInMap("X-Fc-Date")
    public String xFcDate;

    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static ListCustomDomainsHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsHeaders self = new ListCustomDomainsHeaders();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListCustomDomainsHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public ListCustomDomainsHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public ListCustomDomainsHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
