// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DescribeHiTSDBInstanceSecurityIpListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityIpList")
    public java.util.List<DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList> securityIpList;

    public static DescribeHiTSDBInstanceSecurityIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHiTSDBInstanceSecurityIpListResponseBody self = new DescribeHiTSDBInstanceSecurityIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHiTSDBInstanceSecurityIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHiTSDBInstanceSecurityIpListResponseBody setSecurityIpList(java.util.List<DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList> securityIpList) {
        this.securityIpList = securityIpList;
        return this;
    }
    public java.util.List<DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList> getSecurityIpList() {
        return this.securityIpList;
    }

    public static class DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList extends TeaModel {
        @NameInMap("Ip")
        public String ip;

        public static DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList self = new DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList();
            return TeaModel.build(map, self);
        }

        public DescribeHiTSDBInstanceSecurityIpListResponseBodySecurityIpList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
