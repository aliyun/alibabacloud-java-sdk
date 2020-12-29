// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeCapResponseBody extends TeaModel {
    @NameInMap("CapUrl")
    public DescribeCapResponseBodyCapUrl capUrl;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCapResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCapResponseBody self = new DescribeCapResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCapResponseBody setCapUrl(DescribeCapResponseBodyCapUrl capUrl) {
        this.capUrl = capUrl;
        return this;
    }
    public DescribeCapResponseBodyCapUrl getCapUrl() {
        return this.capUrl;
    }

    public DescribeCapResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCapResponseBodyCapUrl extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static DescribeCapResponseBodyCapUrl build(java.util.Map<String, ?> map) throws Exception {
            DescribeCapResponseBodyCapUrl self = new DescribeCapResponseBodyCapUrl();
            return TeaModel.build(map, self);
        }

        public DescribeCapResponseBodyCapUrl setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
