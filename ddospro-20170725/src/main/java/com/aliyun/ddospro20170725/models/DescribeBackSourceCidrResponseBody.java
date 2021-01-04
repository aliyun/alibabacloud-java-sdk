// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeBackSourceCidrResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CidrList")
    public DescribeBackSourceCidrResponseBodyCidrList cidrList;

    public static DescribeBackSourceCidrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackSourceCidrResponseBody self = new DescribeBackSourceCidrResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackSourceCidrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackSourceCidrResponseBody setCidrList(DescribeBackSourceCidrResponseBodyCidrList cidrList) {
        this.cidrList = cidrList;
        return this;
    }
    public DescribeBackSourceCidrResponseBodyCidrList getCidrList() {
        return this.cidrList;
    }

    public static class DescribeBackSourceCidrResponseBodyCidrList extends TeaModel {
        @NameInMap("Cidr")
        public java.util.List<String> cidr;

        public static DescribeBackSourceCidrResponseBodyCidrList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackSourceCidrResponseBodyCidrList self = new DescribeBackSourceCidrResponseBodyCidrList();
            return TeaModel.build(map, self);
        }

        public DescribeBackSourceCidrResponseBodyCidrList setCidr(java.util.List<String> cidr) {
            this.cidr = cidr;
            return this;
        }
        public java.util.List<String> getCidr() {
            return this.cidr;
        }

    }

}
