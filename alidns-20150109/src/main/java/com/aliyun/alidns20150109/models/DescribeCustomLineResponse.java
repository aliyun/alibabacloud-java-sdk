// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeCustomLineResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Id")
    @Validation(required = true)
    public Long id;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("IpSegmentList")
    @Validation(required = true)
    public java.util.List<DescribeCustomLineResponseIpSegmentList> ipSegmentList;

    public static DescribeCustomLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomLineResponse self = new DescribeCustomLineResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomLineResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomLineResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeCustomLineResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCustomLineResponse setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCustomLineResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCustomLineResponse setIpSegmentList(java.util.List<DescribeCustomLineResponseIpSegmentList> ipSegmentList) {
        this.ipSegmentList = ipSegmentList;
        return this;
    }
    public java.util.List<DescribeCustomLineResponseIpSegmentList> getIpSegmentList() {
        return this.ipSegmentList;
    }

    public static class DescribeCustomLineResponseIpSegmentList extends TeaModel {
        @NameInMap("StartIp")
        @Validation(required = true)
        public String startIp;

        @NameInMap("EndIp")
        @Validation(required = true)
        public String endIp;

        public static DescribeCustomLineResponseIpSegmentList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomLineResponseIpSegmentList self = new DescribeCustomLineResponseIpSegmentList();
            return TeaModel.build(map, self);
        }

        public DescribeCustomLineResponseIpSegmentList setStartIp(String startIp) {
            this.startIp = startIp;
            return this;
        }
        public String getStartIp() {
            return this.startIp;
        }

        public DescribeCustomLineResponseIpSegmentList setEndIp(String endIp) {
            this.endIp = endIp;
            return this;
        }
        public String getEndIp() {
            return this.endIp;
        }

    }

}
