// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineResponseBody extends TeaModel {
    /**
     * <p>The code of the custom line.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the custom line.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The CIDR blocks. Separate IP addresses with a hyphen (-). Enter a CIDR block in each row. You can enter 1 to 50 CIDR blocks at a time. If a CIDR block contains only one IP address, enter the IP address in the format of IP1-IP1. Different CIDR blocks cannot be overlapped.</p>
     */
    @NameInMap("IpSegmentList")
    public java.util.List<DescribeCustomLineResponseBodyIpSegmentList> ipSegmentList;

    /**
     * <p>The name of the custom line.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineResponseBody self = new DescribeCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomLineResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCustomLineResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeCustomLineResponseBody setIpSegmentList(java.util.List<DescribeCustomLineResponseBodyIpSegmentList> ipSegmentList) {
        this.ipSegmentList = ipSegmentList;
        return this;
    }
    public java.util.List<DescribeCustomLineResponseBodyIpSegmentList> getIpSegmentList() {
        return this.ipSegmentList;
    }

    public DescribeCustomLineResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCustomLineResponseBodyIpSegmentList extends TeaModel {
        /**
         * <p>The end IP address of the CIDR block.</p>
         */
        @NameInMap("EndIp")
        public String endIp;

        /**
         * <p>The start IP address of the CIDR block.</p>
         */
        @NameInMap("StartIp")
        public String startIp;

        public static DescribeCustomLineResponseBodyIpSegmentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLineResponseBodyIpSegmentList self = new DescribeCustomLineResponseBodyIpSegmentList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLineResponseBodyIpSegmentList setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

        public DescribeCustomLineResponseBodyIpSegmentList setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

    }

}
