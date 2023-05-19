// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnStagingIpResponseBody extends TeaModel {
    @NameInMap("IPV4s")
    public DescribeDcdnStagingIpResponseBodyIPV4s IPV4s;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnStagingIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnStagingIpResponseBody self = new DescribeDcdnStagingIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnStagingIpResponseBody setIPV4s(DescribeDcdnStagingIpResponseBodyIPV4s IPV4s) {
        this.IPV4s = IPV4s;
        return this;
    }
    public DescribeDcdnStagingIpResponseBodyIPV4s getIPV4s() {
        return this.IPV4s;
    }

    public DescribeDcdnStagingIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnStagingIpResponseBodyIPV4s extends TeaModel {
        @NameInMap("IPV4")
        public java.util.List<String> IPV4;

        public static DescribeDcdnStagingIpResponseBodyIPV4s build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnStagingIpResponseBodyIPV4s self = new DescribeDcdnStagingIpResponseBodyIPV4s();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnStagingIpResponseBodyIPV4s setIPV4(java.util.List<String> IPV4) {
            this.IPV4 = IPV4;
            return this;
        }
        public java.util.List<String> getIPV4() {
            return this.IPV4;
        }

    }

}
