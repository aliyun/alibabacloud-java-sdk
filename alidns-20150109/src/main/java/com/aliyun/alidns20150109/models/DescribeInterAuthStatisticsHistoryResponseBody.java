// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsHistoryResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeInterAuthStatisticsHistoryResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInterAuthStatisticsHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsHistoryResponseBody self = new DescribeInterAuthStatisticsHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsHistoryResponseBody setData(java.util.List<DescribeInterAuthStatisticsHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInterAuthStatisticsHistoryResponseBodyData> getData() {
        return this.data;
    }

    public DescribeInterAuthStatisticsHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInterAuthStatisticsHistoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>A</p>
         */
        @NameInMap("Qtype")
        public String qtype;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Ratio")
        public Long ratio;

        /**
         * <strong>example:</strong>
         * <p>1706716800000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <strong>example:</strong>
         * <p>mt2.cn</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeInterAuthStatisticsHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInterAuthStatisticsHistoryResponseBodyData self = new DescribeInterAuthStatisticsHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setQtype(String qtype) {
            this.qtype = qtype;
            return this;
        }
        public String getQtype() {
            return this.qtype;
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setRatio(Long ratio) {
            this.ratio = ratio;
            return this;
        }
        public Long getRatio() {
            return this.ratio;
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public DescribeInterAuthStatisticsHistoryResponseBodyData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
