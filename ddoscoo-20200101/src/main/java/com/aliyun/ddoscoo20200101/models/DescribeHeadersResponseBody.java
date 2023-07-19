// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHeadersResponseBody extends TeaModel {
    /**
     * <p>The information about the custom header.</p>
     */
    @NameInMap("CustomHeader")
    public DescribeHeadersResponseBodyCustomHeader customHeader;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHeadersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHeadersResponseBody self = new DescribeHeadersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHeadersResponseBody setCustomHeader(DescribeHeadersResponseBodyCustomHeader customHeader) {
        this.customHeader = customHeader;
        return this;
    }
    public DescribeHeadersResponseBodyCustomHeader getCustomHeader() {
        return this.customHeader;
    }

    public DescribeHeadersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHeadersResponseBodyCustomHeader extends TeaModel {
        /**
         * <p>The domain name of the website.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The header of the response.</p>
         */
        @NameInMap("Headers")
        public String headers;

        public static DescribeHeadersResponseBodyCustomHeader build(java.util.Map<String, ?> map) throws Exception {
            DescribeHeadersResponseBodyCustomHeader self = new DescribeHeadersResponseBodyCustomHeader();
            return TeaModel.build(map, self);
        }

        public DescribeHeadersResponseBodyCustomHeader setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeHeadersResponseBodyCustomHeader setHeaders(String headers) {
            this.headers = headers;
            return this;
        }
        public String getHeaders() {
            return this.headers;
        }

    }

}
