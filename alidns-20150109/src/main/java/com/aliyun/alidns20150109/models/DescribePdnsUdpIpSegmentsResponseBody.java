// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUdpIpSegmentsResponseBody extends TeaModel {
    @NameInMap("IpSegments")
    public java.util.List<DescribePdnsUdpIpSegmentsResponseBodyIpSegments> ipSegments;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePdnsUdpIpSegmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsUdpIpSegmentsResponseBody self = new DescribePdnsUdpIpSegmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsUdpIpSegmentsResponseBody setIpSegments(java.util.List<DescribePdnsUdpIpSegmentsResponseBodyIpSegments> ipSegments) {
        this.ipSegments = ipSegments;
        return this;
    }
    public java.util.List<DescribePdnsUdpIpSegmentsResponseBodyIpSegments> getIpSegments() {
        return this.ipSegments;
    }

    public DescribePdnsUdpIpSegmentsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsUdpIpSegmentsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsUdpIpSegmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePdnsUdpIpSegmentsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePdnsUdpIpSegmentsResponseBodyIpSegments extends TeaModel {
        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Mask")
        public Long mask;

        @NameInMap("Name")
        public String name;

        @NameInMap("State")
        public String state;

        @NameInMap("UpdateDate")
        public String updateDate;

        public static DescribePdnsUdpIpSegmentsResponseBodyIpSegments build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsUdpIpSegmentsResponseBodyIpSegments self = new DescribePdnsUdpIpSegmentsResponseBodyIpSegments();
            return TeaModel.build(map, self);
        }

        public DescribePdnsUdpIpSegmentsResponseBodyIpSegments setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public DescribePdnsUdpIpSegmentsResponseBodyIpSegments setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribePdnsUdpIpSegmentsResponseBodyIpSegments setMask(Long mask) {
            this.mask = mask;
            return this;
        }
        public Long getMask() {
            return this.mask;
        }

        public DescribePdnsUdpIpSegmentsResponseBodyIpSegments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePdnsUdpIpSegmentsResponseBodyIpSegments setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePdnsUdpIpSegmentsResponseBodyIpSegments setUpdateDate(String updateDate) {
            this.updateDate = updateDate;
            return this;
        }
        public String getUpdateDate() {
            return this.updateDate;
        }

    }

}
