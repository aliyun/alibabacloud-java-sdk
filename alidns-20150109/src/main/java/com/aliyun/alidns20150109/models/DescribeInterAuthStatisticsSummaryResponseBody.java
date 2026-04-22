// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInterAuthStatisticsSummaryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurPage")
    public Integer curPage;

    @NameInMap("PageData")
    public java.util.List<DescribeInterAuthStatisticsSummaryResponseBodyPageData> pageData;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>853805EA-3D47-47D5-9A1A-A45C24313ABD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    /**
     * <strong>example:</strong>
     * <p>48</p>
     */
    @NameInMap("TotalSize")
    public Integer totalSize;

    public static DescribeInterAuthStatisticsSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInterAuthStatisticsSummaryResponseBody self = new DescribeInterAuthStatisticsSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInterAuthStatisticsSummaryResponseBody setCurPage(Integer curPage) {
        this.curPage = curPage;
        return this;
    }
    public Integer getCurPage() {
        return this.curPage;
    }

    public DescribeInterAuthStatisticsSummaryResponseBody setPageData(java.util.List<DescribeInterAuthStatisticsSummaryResponseBodyPageData> pageData) {
        this.pageData = pageData;
        return this;
    }
    public java.util.List<DescribeInterAuthStatisticsSummaryResponseBodyPageData> getPageData() {
        return this.pageData;
    }

    public DescribeInterAuthStatisticsSummaryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInterAuthStatisticsSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInterAuthStatisticsSummaryResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public DescribeInterAuthStatisticsSummaryResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class DescribeInterAuthStatisticsSummaryResponseBodyPageData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1776754800000</p>
         */
        @NameInMap("AggrTimestamp")
        public Long aggrTimestamp;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <strong>example:</strong>
         * <p>nervermsf.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("FluctuationValue")
        public Integer fluctuationValue;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Line")
        public String line;

        /**
         * <strong>example:</strong>
         * <p>2227</p>
         */
        @NameInMap("PreviousCount")
        public Long previousCount;

        /**
         * <strong>example:</strong>
         * <p>TCP%DF\&quot;</p>
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
         * <p>20</p>
         */
        @NameInMap("Ratio")
        public Long ratio;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rcode")
        public String rcode;

        /**
         * <strong>example:</strong>
         * <p>112.16.17.203</p>
         */
        @NameInMap("SourceIp")
        public String sourceIp;

        /**
         * <strong>example:</strong>
         * <p>telecom</p>
         */
        @NameInMap("SourceIsp")
        public String sourceIsp;

        /**
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("SourceRegion")
        public String sourceRegion;

        /**
         * <strong>example:</strong>
         * <p>longzi.xyz</p>
         */
        @NameInMap("ZoneName")
        public String zoneName;

        public static DescribeInterAuthStatisticsSummaryResponseBodyPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInterAuthStatisticsSummaryResponseBodyPageData self = new DescribeInterAuthStatisticsSummaryResponseBodyPageData();
            return TeaModel.build(map, self);
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setAggrTimestamp(Long aggrTimestamp) {
            this.aggrTimestamp = aggrTimestamp;
            return this;
        }
        public Long getAggrTimestamp() {
            return this.aggrTimestamp;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setFluctuationValue(Integer fluctuationValue) {
            this.fluctuationValue = fluctuationValue;
            return this;
        }
        public Integer getFluctuationValue() {
            return this.fluctuationValue;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setLine(String line) {
            this.line = line;
            return this;
        }
        public String getLine() {
            return this.line;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setPreviousCount(Long previousCount) {
            this.previousCount = previousCount;
            return this;
        }
        public Long getPreviousCount() {
            return this.previousCount;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setQtype(String qtype) {
            this.qtype = qtype;
            return this;
        }
        public String getQtype() {
            return this.qtype;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setRatio(Long ratio) {
            this.ratio = ratio;
            return this;
        }
        public Long getRatio() {
            return this.ratio;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setRcode(String rcode) {
            this.rcode = rcode;
            return this;
        }
        public String getRcode() {
            return this.rcode;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setSourceIsp(String sourceIsp) {
            this.sourceIsp = sourceIsp;
            return this;
        }
        public String getSourceIsp() {
            return this.sourceIsp;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setSourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            return this;
        }
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        public DescribeInterAuthStatisticsSummaryResponseBodyPageData setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }
        public String getZoneName() {
            return this.zoneName;
        }

    }

}
