// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetStatisticResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>850A84******25g4d2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IpNumSpec")
        public Integer ipNumSpec;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("IpNumUsed")
        public Integer ipNumUsed;

        @NameInMap("IsIpNumEnough")
        public Integer isIpNumEnough;

        @NameInMap("IsRegionNumEnough")
        public Integer isRegionNumEnough;

        @NameInMap("IsSuggestUpdate")
        public Integer isSuggestUpdate;

        @NameInMap("RegionNumSpec")
        public Integer regionNumSpec;

        @NameInMap("RegionNumUsed")
        public Integer regionNumUsed;

        @NameInMap("SensitiveDataIpNumSpec")
        public Long sensitiveDataIpNumSpec;

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

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIsIpNumEnough(Integer isIpNumEnough) {
            this.isIpNumEnough = isIpNumEnough;
            return this;
        }
        public Integer getIsIpNumEnough() {
            return this.isIpNumEnough;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIsRegionNumEnough(Integer isRegionNumEnough) {
            this.isRegionNumEnough = isRegionNumEnough;
            return this;
        }
        public Integer getIsRegionNumEnough() {
            return this.isRegionNumEnough;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setIsSuggestUpdate(Integer isSuggestUpdate) {
            this.isSuggestUpdate = isSuggestUpdate;
            return this;
        }
        public Integer getIsSuggestUpdate() {
            return this.isSuggestUpdate;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setRegionNumSpec(Integer regionNumSpec) {
            this.regionNumSpec = regionNumSpec;
            return this;
        }
        public Integer getRegionNumSpec() {
            return this.regionNumSpec;
        }

        public DescribeAssetStatisticResponseBodyResourceSpecStatistic setRegionNumUsed(Integer regionNumUsed) {
            this.regionNumUsed = regionNumUsed;
            return this;
        }
        public Integer getRegionNumUsed() {
            return this.regionNumUsed;
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
