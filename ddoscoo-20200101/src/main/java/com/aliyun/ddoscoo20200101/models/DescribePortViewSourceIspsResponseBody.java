// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceIspsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Isps")
    public java.util.List<DescribePortViewSourceIspsResponseBodyIsps> isps;

    public static DescribePortViewSourceIspsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceIspsResponseBody self = new DescribePortViewSourceIspsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceIspsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortViewSourceIspsResponseBody setIsps(java.util.List<DescribePortViewSourceIspsResponseBodyIsps> isps) {
        this.isps = isps;
        return this;
    }
    public java.util.List<DescribePortViewSourceIspsResponseBodyIsps> getIsps() {
        return this.isps;
    }

    public static class DescribePortViewSourceIspsResponseBodyIsps extends TeaModel {
        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Count")
        public Long count;

        public static DescribePortViewSourceIspsResponseBodyIsps build(java.util.Map<String, ?> map) throws Exception {
            DescribePortViewSourceIspsResponseBodyIsps self = new DescribePortViewSourceIspsResponseBodyIsps();
            return TeaModel.build(map, self);
        }

        public DescribePortViewSourceIspsResponseBodyIsps setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public DescribePortViewSourceIspsResponseBodyIsps setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
