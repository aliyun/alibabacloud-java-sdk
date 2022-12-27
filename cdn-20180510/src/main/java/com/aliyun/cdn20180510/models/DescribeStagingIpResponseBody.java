// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeStagingIpResponseBody extends TeaModel {
    // The IPv4 addresses of the nodes.
    @NameInMap("IPV4s")
    public DescribeStagingIpResponseBodyIPV4s IPV4s;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeStagingIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStagingIpResponseBody self = new DescribeStagingIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStagingIpResponseBody setIPV4s(DescribeStagingIpResponseBodyIPV4s IPV4s) {
        this.IPV4s = IPV4s;
        return this;
    }
    public DescribeStagingIpResponseBodyIPV4s getIPV4s() {
        return this.IPV4s;
    }

    public DescribeStagingIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeStagingIpResponseBodyIPV4s extends TeaModel {
        @NameInMap("IPV4")
        public java.util.List<String> IPV4;

        public static DescribeStagingIpResponseBodyIPV4s build(java.util.Map<String, ?> map) throws Exception {
            DescribeStagingIpResponseBodyIPV4s self = new DescribeStagingIpResponseBodyIPV4s();
            return TeaModel.build(map, self);
        }

        public DescribeStagingIpResponseBodyIPV4s setIPV4(java.util.List<String> IPV4) {
            this.IPV4 = IPV4;
            return this;
        }
        public java.util.List<String> getIPV4() {
            return this.IPV4;
        }

    }

}
