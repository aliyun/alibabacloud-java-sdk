// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsStatisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("AbnormalPrivateDnsCount")
    public Long abnormalPrivateDnsCount;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("CreatedPrivateDnsCount")
    public Long createdPrivateDnsCount;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("DomainNameTotalCount")
    public Long domainNameTotalCount;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NewDomainNameTotalCount")
    public Long newDomainNameTotalCount;

    /**
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("NormalPrivateDnsCount")
    public Long normalPrivateDnsCount;

    @NameInMap("PrivateDnsRegionList")
    public java.util.List<DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList> privateDnsRegionList;

    /**
     * <strong>example:</strong>
     * <p>5716ED52-1B82-5DE1-8695-EFEC453D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePrivateDnsStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsStatisticsResponseBody self = new DescribePrivateDnsStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsStatisticsResponseBody setAbnormalPrivateDnsCount(Long abnormalPrivateDnsCount) {
        this.abnormalPrivateDnsCount = abnormalPrivateDnsCount;
        return this;
    }
    public Long getAbnormalPrivateDnsCount() {
        return this.abnormalPrivateDnsCount;
    }

    public DescribePrivateDnsStatisticsResponseBody setCreatedPrivateDnsCount(Long createdPrivateDnsCount) {
        this.createdPrivateDnsCount = createdPrivateDnsCount;
        return this;
    }
    public Long getCreatedPrivateDnsCount() {
        return this.createdPrivateDnsCount;
    }

    public DescribePrivateDnsStatisticsResponseBody setDomainNameTotalCount(Long domainNameTotalCount) {
        this.domainNameTotalCount = domainNameTotalCount;
        return this;
    }
    public Long getDomainNameTotalCount() {
        return this.domainNameTotalCount;
    }

    public DescribePrivateDnsStatisticsResponseBody setNewDomainNameTotalCount(Long newDomainNameTotalCount) {
        this.newDomainNameTotalCount = newDomainNameTotalCount;
        return this;
    }
    public Long getNewDomainNameTotalCount() {
        return this.newDomainNameTotalCount;
    }

    public DescribePrivateDnsStatisticsResponseBody setNormalPrivateDnsCount(Long normalPrivateDnsCount) {
        this.normalPrivateDnsCount = normalPrivateDnsCount;
        return this;
    }
    public Long getNormalPrivateDnsCount() {
        return this.normalPrivateDnsCount;
    }

    public DescribePrivateDnsStatisticsResponseBody setPrivateDnsRegionList(java.util.List<DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList> privateDnsRegionList) {
        this.privateDnsRegionList = privateDnsRegionList;
        return this;
    }
    public java.util.List<DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList> getPrivateDnsRegionList() {
        return this.privateDnsRegionList;
    }

    public DescribePrivateDnsStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("DomainNameCount")
        public Long domainNameCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("NewDomainNameCount")
        public Long newDomainNameCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PrivateDnsCount")
        public Long privateDnsCount;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        public static DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList build(java.util.Map<String, ?> map) throws Exception {
            DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList self = new DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList();
            return TeaModel.build(map, self);
        }

        public DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList setDomainNameCount(Long domainNameCount) {
            this.domainNameCount = domainNameCount;
            return this;
        }
        public Long getDomainNameCount() {
            return this.domainNameCount;
        }

        public DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList setNewDomainNameCount(Long newDomainNameCount) {
            this.newDomainNameCount = newDomainNameCount;
            return this;
        }
        public Long getNewDomainNameCount() {
            return this.newDomainNameCount;
        }

        public DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList setPrivateDnsCount(Long privateDnsCount) {
            this.privateDnsCount = privateDnsCount;
            return this;
        }
        public Long getPrivateDnsCount() {
            return this.privateDnsCount;
        }

        public DescribePrivateDnsStatisticsResponseBodyPrivateDnsRegionList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

    }

}
