// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeHeadersResponseBody extends TeaModel {
    @NameInMap("CustomHeader")
    public DescribeHeadersResponseBodyCustomHeader customHeader;

    /**
     * <strong>example:</strong>
     * <p>{&quot;X-Client-IP&quot;:true,&quot;X-True-IP&quot;:true,&quot;Web-Server-Type&quot;:true,&quot;WL-Proxy-Client-IP&quot;:true,&quot;X-Forwarded-Proto&quot;:true}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("EmbeddedHeaders")
    public String embeddedHeaders;

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

    public DescribeHeadersResponseBody setEmbeddedHeaders(String embeddedHeaders) {
        this.embeddedHeaders = embeddedHeaders;
        return this;
    }
    public String getEmbeddedHeaders() {
        return this.embeddedHeaders;
    }

    public DescribeHeadersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHeadersResponseBodyCustomHeader extends TeaModel {
        @NameInMap("Domain")
        public String domain;

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
