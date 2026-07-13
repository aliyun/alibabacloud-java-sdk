// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineResponseBody extends TeaModel {
    /**
     * <p>The code of the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>hra0yc-*********</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>5*******</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The list of IP address segments. Use a hyphen (-) to separate the start and end IP addresses. Each line represents one segment. You can specify from 1 to 50 segments. For a single IP address, use the format IP1-IP1. IP address segments cannot overlap.</p>
     */
    @NameInMap("IpSegmentList")
    public java.util.List<DescribeCustomLineResponseBodyIpSegmentList> ipSegmentList;

    /**
     * <p>The name of the custom line.</p>
     * 
     * <strong>example:</strong>
     * <p>测试线路</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B57C121B-A45F-44D8-A9B2-13E5A5044195</p>
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
         * <p>The end IP address of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX</p>
         */
        @NameInMap("EndIp")
        public String endIp;

        /**
         * <p>The start IP address of the segment.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
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
