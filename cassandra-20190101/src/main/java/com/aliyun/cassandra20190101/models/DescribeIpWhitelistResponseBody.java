// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IpList")
    public DescribeIpWhitelistResponseBodyIpList ipList;

    public static DescribeIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistResponseBody self = new DescribeIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpWhitelistResponseBody setIpList(DescribeIpWhitelistResponseBodyIpList ipList) {
        this.ipList = ipList;
        return this;
    }
    public DescribeIpWhitelistResponseBodyIpList getIpList() {
        return this.ipList;
    }

    public static class DescribeIpWhitelistResponseBodyIpList extends TeaModel {
        @NameInMap("IP")
        public java.util.List<String> IP;

        public static DescribeIpWhitelistResponseBodyIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistResponseBodyIpList self = new DescribeIpWhitelistResponseBodyIpList();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistResponseBodyIpList setIP(java.util.List<String> IP) {
            this.IP = IP;
            return this;
        }
        public java.util.List<String> getIP() {
            return this.IP;
        }

    }

}
