// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DescribeSecurityWhiteListResponseBody extends TeaModel {
    @NameInMap("DescribeSecurityWhiteList")
    public java.util.List<DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList> describeSecurityWhiteList;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSecurityWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityWhiteListResponseBody self = new DescribeSecurityWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityWhiteListResponseBody setDescribeSecurityWhiteList(java.util.List<DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList> describeSecurityWhiteList) {
        this.describeSecurityWhiteList = describeSecurityWhiteList;
        return this;
    }
    public java.util.List<DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList> getDescribeSecurityWhiteList() {
        return this.describeSecurityWhiteList;
    }

    public DescribeSecurityWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList extends TeaModel {
        @NameInMap("PortRange")
        public String portRange;

        @NameInMap("WhiteIp")
        public String whiteIp;

        @NameInMap("Description")
        public String description;

        @NameInMap("CreateTime")
        public String createTime;

        public static DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList self = new DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList();
            return TeaModel.build(map, self);
        }

        public DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList setPortRange(String portRange) {
            this.portRange = portRange;
            return this;
        }
        public String getPortRange() {
            return this.portRange;
        }

        public DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList setWhiteIp(String whiteIp) {
            this.whiteIp = whiteIp;
            return this;
        }
        public String getWhiteIp() {
            return this.whiteIp;
        }

        public DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSecurityWhiteListResponseBodyDescribeSecurityWhiteList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
