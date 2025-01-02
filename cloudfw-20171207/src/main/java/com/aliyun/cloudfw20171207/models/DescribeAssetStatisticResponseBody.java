// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetStatisticResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84******25g4d2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics on specifications.</p>
     */
    @NameInMap("ResourceSpecStatistic")
    public DescribeAssetStatisticResponseBodyResourceSpecStatistic resourceSpecStatistic;

    public static DescribeAssetStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetStatisticResponseBody self = new DescribeAssetStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAssetStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAssetStatisticResponseBody setResourceSpecStatistic(DescribeAssetStatisticResponseBodyResourceSpecStatistic resourceSpecStatistic) {
        this.resourceSpecStatistic = resourceSpecStatistic;
        return this;
    }
    public DescribeAssetStatisticResponseBodyResourceSpecStatistic getResourceSpecStatistic() {
        return this.resourceSpecStatistic;
    }

    public static class DescribeAssetStatisticResponseBodyResourceSpecStatistic extends TeaModel {
        /**
         * <p>The number of public IP addresses that can be protected.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IpNumSpec")
        public Integer ipNumSpec;

        /**
         * <p>The number of public IP addresses that are protected.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpNumUsed")
        public Integer ipNumUsed;

        /**
         * <p>The number of public IP addresses that can enable data leakage detection.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SensitiveDataIpNumSpec")
        public Long sensitiveDataIpNumSpec;

        /**
         * <p>The number of public IP addresses that enabled data leakage detection.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SensitiveDataIpNumUsed")
        public Long sensitiveDataIpNumUsed;

        public static DescribeAssetStatisticResponseBodyResourceSpecStatistic build(java.util.Map<String, ?> map) throws Exception {
            DescribeAssetStatisticResponseBodyResourceSpecStatistic self = new DescribeAssetStatisticResponseBodyResourceSpecStatistic();
            return TeaModel.build(map, self);
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIpNumSpec(Integer ipNumSpec) {
            this.ipNumSpec = ipNumSpec;
            return this;
        }
        public Integer getIpNumSpec() {
            return this.ipNumSpec;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIpNumUsed(Integer ipNumUsed) {
            this.ipNumUsed = ipNumUsed;
            return this;
        }
        public Integer getIpNumUsed() {
            return this.ipNumUsed;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setSensitiveDataIpNumSpec(Long sensitiveDataIpNumSpec) {
            this.sensitiveDataIpNumSpec = sensitiveDataIpNumSpec;
            return this;
        }
        public Long getSensitiveDataIpNumSpec() {
            return this.sensitiveDataIpNumSpec;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setSensitiveDataIpNumUsed(Long sensitiveDataIpNumUsed) {
            this.sensitiveDataIpNumUsed = sensitiveDataIpNumUsed;
            return this;
        }
        public Long getSensitiveDataIpNumUsed() {
            return this.sensitiveDataIpNumUsed;
        }

    }

}
