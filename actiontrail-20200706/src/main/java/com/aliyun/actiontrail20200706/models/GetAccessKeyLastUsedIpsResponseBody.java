// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetAccessKeyLastUsedIpsResponseBody extends TeaModel {
    /**
     * <p>The list of returned IP addresses.</p>
     */
    @NameInMap("Ips")
    public java.util.List<GetAccessKeyLastUsedIpsResponseBodyIps> ips;

    /**
     * <p>The token that determines the start point of the query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessKeyLastUsedIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessKeyLastUsedIpsResponseBody self = new GetAccessKeyLastUsedIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessKeyLastUsedIpsResponseBody setIps(java.util.List<GetAccessKeyLastUsedIpsResponseBodyIps> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<GetAccessKeyLastUsedIpsResponseBodyIps> getIps() {
        return this.ips;
    }

    public GetAccessKeyLastUsedIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetAccessKeyLastUsedIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessKeyLastUsedIpsResponseBodyIps extends TeaModel {
        /**
         * <p>An array that consists of the details about the event.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The IP address.</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The event source.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The timestamp when the IP address was used.</p>
         */
        @NameInMap("UsedTimestamp")
        public Long usedTimestamp;

        public static GetAccessKeyLastUsedIpsResponseBodyIps build(java.util.Map<String, ?> map) throws Exception {
            GetAccessKeyLastUsedIpsResponseBodyIps self = new GetAccessKeyLastUsedIpsResponseBodyIps();
            return TeaModel.build(map, self);
        }

        public GetAccessKeyLastUsedIpsResponseBodyIps setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAccessKeyLastUsedIpsResponseBodyIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetAccessKeyLastUsedIpsResponseBodyIps setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAccessKeyLastUsedIpsResponseBodyIps setUsedTimestamp(Long usedTimestamp) {
            this.usedTimestamp = usedTimestamp;
            return this;
        }
        public Long getUsedTimestamp() {
            return this.usedTimestamp;
        }

    }

}
