// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeRegionIspsResponseBody extends TeaModel {
    /**
     * <p>The list of ISPs.</p>
     */
    @NameInMap("Isps")
    public java.util.List<DescribeRegionIspsResponseBodyIsps> isps;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRegionIspsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionIspsResponseBody self = new DescribeRegionIspsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionIspsResponseBody setIsps(java.util.List<DescribeRegionIspsResponseBodyIsps> isps) {
        this.isps = isps;
        return this;
    }
    public java.util.List<DescribeRegionIspsResponseBodyIsps> getIsps() {
        return this.isps;
    }

    public DescribeRegionIspsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRegionIspsResponseBodyIsps extends TeaModel {
        /**
         * <p>The code of the ISP.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The name of the ISP.</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeRegionIspsResponseBodyIsps build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionIspsResponseBodyIsps self = new DescribeRegionIspsResponseBodyIsps();
            return TeaModel.build(map, self);
        }

        public DescribeRegionIspsResponseBodyIsps setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeRegionIspsResponseBodyIsps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
