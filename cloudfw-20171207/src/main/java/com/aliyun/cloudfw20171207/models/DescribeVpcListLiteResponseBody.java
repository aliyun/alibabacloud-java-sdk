// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcListLiteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcList")
    public java.util.List<DescribeVpcListLiteResponseBodyVpcList> vpcList;

    public static DescribeVpcListLiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcListLiteResponseBody self = new DescribeVpcListLiteResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcListLiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcListLiteResponseBody setVpcList(java.util.List<DescribeVpcListLiteResponseBodyVpcList> vpcList) {
        this.vpcList = vpcList;
        return this;
    }
    public java.util.List<DescribeVpcListLiteResponseBodyVpcList> getVpcList() {
        return this.vpcList;
    }

    public static class DescribeVpcListLiteResponseBodyVpcList extends TeaModel {
        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcListLiteResponseBodyVpcList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcListLiteResponseBodyVpcList self = new DescribeVpcListLiteResponseBodyVpcList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcListLiteResponseBodyVpcList setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcListLiteResponseBodyVpcList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcListLiteResponseBodyVpcList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
