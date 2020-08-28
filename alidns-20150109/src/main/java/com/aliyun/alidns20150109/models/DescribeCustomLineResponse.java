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

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("IpSegments")
    @Validation(required = true)
    public String ipSegments;

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

    public static class DescribeCustomLineResponseIpSegmentList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

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

    }

}
