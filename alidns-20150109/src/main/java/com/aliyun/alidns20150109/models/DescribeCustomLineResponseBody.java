// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpSegmentList")
    public java.util.List<DescribeCustomLineResponseBodyIpSegmentList> ipSegmentList;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Code")
    public String code;

    @NameInMap("Name")
    public String name;

    public static DescribeCustomLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineResponseBody self = new DescribeCustomLineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLineResponseBody setIpSegmentList(java.util.List<DescribeCustomLineResponseBodyIpSegmentList> ipSegmentList) {
        this.ipSegmentList = ipSegmentList;
        return this;
    }
    public java.util.List<DescribeCustomLineResponseBodyIpSegmentList> getIpSegmentList() {
        return this.ipSegmentList;
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

    public DescribeCustomLineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomLineResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class DescribeCustomLineResponseBodyIpSegmentList extends TeaModel {
        @NameInMap("EndIp")
        public String endIp;

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
