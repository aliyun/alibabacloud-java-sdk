// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class GetResolveCountSummaryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResolveSummary")
    public GetResolveCountSummaryResponseBodyResolveSummary resolveSummary;

    public static GetResolveCountSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResolveCountSummaryResponseBody self = new GetResolveCountSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResolveCountSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResolveCountSummaryResponseBody setResolveSummary(GetResolveCountSummaryResponseBodyResolveSummary resolveSummary) {
        this.resolveSummary = resolveSummary;
        return this;
    }
    public GetResolveCountSummaryResponseBodyResolveSummary getResolveSummary() {
        return this.resolveSummary;
    }

    public static class GetResolveCountSummaryResponseBodyResolveSummary extends TeaModel {
        @NameInMap("Http")
        public Long http;

        @NameInMap("Http6")
        public Long http6;

        @NameInMap("Https")
        public Long https;

        @NameInMap("Https6")
        public Long https6;

        public static GetResolveCountSummaryResponseBodyResolveSummary build(java.util.Map<String, ?> map) throws Exception {
            GetResolveCountSummaryResponseBodyResolveSummary self = new GetResolveCountSummaryResponseBodyResolveSummary();
            return TeaModel.build(map, self);
        }

        public GetResolveCountSummaryResponseBodyResolveSummary setHttp(Long http) {
            this.http = http;
            return this;
        }
        public Long getHttp() {
            return this.http;
        }

        public GetResolveCountSummaryResponseBodyResolveSummary setHttp6(Long http6) {
            this.http6 = http6;
            return this;
        }
        public Long getHttp6() {
            return this.http6;
        }

        public GetResolveCountSummaryResponseBodyResolveSummary setHttps(Long https) {
            this.https = https;
            return this;
        }
        public Long getHttps() {
            return this.https;
        }

        public GetResolveCountSummaryResponseBodyResolveSummary setHttps6(Long https6) {
            this.https6 = https6;
            return this;
        }
        public Long getHttps6() {
            return this.https6;
        }

    }

}
