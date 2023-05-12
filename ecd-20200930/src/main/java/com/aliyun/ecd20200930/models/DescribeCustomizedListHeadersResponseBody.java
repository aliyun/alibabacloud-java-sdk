// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeCustomizedListHeadersResponseBody extends TeaModel {
    @NameInMap("Headers")
    public java.util.List<DescribeCustomizedListHeadersResponseBodyHeaders> headers;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomizedListHeadersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomizedListHeadersResponseBody self = new DescribeCustomizedListHeadersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomizedListHeadersResponseBody setHeaders(java.util.List<DescribeCustomizedListHeadersResponseBodyHeaders> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.List<DescribeCustomizedListHeadersResponseBodyHeaders> getHeaders() {
        return this.headers;
    }

    public DescribeCustomizedListHeadersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomizedListHeadersResponseBodyHeaders extends TeaModel {
        @NameInMap("DisplayType")
        public String displayType;

        @NameInMap("HeaderKey")
        public String headerKey;

        @NameInMap("HeaderName")
        public String headerName;

        public static DescribeCustomizedListHeadersResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomizedListHeadersResponseBodyHeaders self = new DescribeCustomizedListHeadersResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public DescribeCustomizedListHeadersResponseBodyHeaders setDisplayType(String displayType) {
            this.displayType = displayType;
            return this;
        }
        public String getDisplayType() {
            return this.displayType;
        }

        public DescribeCustomizedListHeadersResponseBodyHeaders setHeaderKey(String headerKey) {
            this.headerKey = headerKey;
            return this;
        }
        public String getHeaderKey() {
            return this.headerKey;
        }

        public DescribeCustomizedListHeadersResponseBodyHeaders setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

}
