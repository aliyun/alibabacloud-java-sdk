// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsZoneOverviewResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeInterAuthStatisticsZoneOverviewResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInterAuthStatisticsZoneOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsZoneOverviewResponseBody self = new DescribeInterAuthStatisticsZoneOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsZoneOverviewResponseBody setData(DescribeInterAuthStatisticsZoneOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeInterAuthStatisticsZoneOverviewResponseBodyData getData() {
        return this.data;
    }

    public DescribeInterAuthStatisticsZoneOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInterAuthStatisticsZoneOverviewResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("RefusedDomainCount")
        public Long refusedDomainCount;

        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("SuddenDropDomainCount")
        public Long suddenDropDomainCount;

        /**
         * <strong>example:</strong>
         * <p>56</p>
         */
        @NameInMap("SuddenIncreaseDomainCount")
        public Long suddenIncreaseDomainCount;

        public static DescribeInterAuthStatisticsZoneOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInterAuthStatisticsZoneOverviewResponseBodyData self = new DescribeInterAuthStatisticsZoneOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInterAuthStatisticsZoneOverviewResponseBodyData setRefusedDomainCount(Long refusedDomainCount) {
            this.refusedDomainCount = refusedDomainCount;
            return this;
        }
        public Long getRefusedDomainCount() {
            return this.refusedDomainCount;
        }

        public DescribeInterAuthStatisticsZoneOverviewResponseBodyData setSuddenDropDomainCount(Long suddenDropDomainCount) {
            this.suddenDropDomainCount = suddenDropDomainCount;
            return this;
        }
        public Long getSuddenDropDomainCount() {
            return this.suddenDropDomainCount;
        }

        public DescribeInterAuthStatisticsZoneOverviewResponseBodyData setSuddenIncreaseDomainCount(Long suddenIncreaseDomainCount) {
            this.suddenIncreaseDomainCount = suddenIncreaseDomainCount;
            return this;
        }
        public Long getSuddenIncreaseDomainCount() {
            return this.suddenIncreaseDomainCount;
        }

    }

}
