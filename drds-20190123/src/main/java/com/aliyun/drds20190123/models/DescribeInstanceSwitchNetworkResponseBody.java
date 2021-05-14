// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchNetworkResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcInfos")
    public DescribeInstanceSwitchNetworkResponseBodyVpcInfos vpcInfos;

    public static DescribeInstanceSwitchNetworkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchNetworkResponseBody self = new DescribeInstanceSwitchNetworkResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchNetworkResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceSwitchNetworkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSwitchNetworkResponseBody setVpcInfos(DescribeInstanceSwitchNetworkResponseBodyVpcInfos vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public DescribeInstanceSwitchNetworkResponseBodyVpcInfos getVpcInfos() {
        return this.vpcInfos;
    }

    public static class DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("DrdsSupported")
        public Boolean drdsSupported;

        @NameInMap("VswitchId")
        public String vswitchId;

        @NameInMap("AzoneId")
        public String azoneId;

        @NameInMap("VswitchName")
        public String vswitchName;

        public static DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo self = new DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo setDrdsSupported(Boolean drdsSupported) {
            this.drdsSupported = drdsSupported;
            return this;
        }
        public Boolean getDrdsSupported() {
            return this.drdsSupported;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo setVswitchName(String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        public String getVswitchName() {
            return this.vswitchName;
        }

    }

    public static class DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos extends TeaModel {
        @NameInMap("VswitchInfo")
        public java.util.List<DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo> vswitchInfo;

        public static DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos self = new DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos setVswitchInfo(java.util.List<DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo> vswitchInfo) {
            this.vswitchInfo = vswitchInfo;
            return this;
        }
        public java.util.List<DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfosVswitchInfo> getVswitchInfo() {
            return this.vswitchInfo;
        }

    }

    public static class DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo extends TeaModel {
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcName")
        public String vpcName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("VswitchInfos")
        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos vswitchInfos;

        public static DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo self = new DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo setVswitchInfos(DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos vswitchInfos) {
            this.vswitchInfos = vswitchInfos;
            return this;
        }
        public DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfoVswitchInfos getVswitchInfos() {
            return this.vswitchInfos;
        }

    }

    public static class DescribeInstanceSwitchNetworkResponseBodyVpcInfos extends TeaModel {
        @NameInMap("VpcInfo")
        public java.util.List<DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo> vpcInfo;

        public static DescribeInstanceSwitchNetworkResponseBodyVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseBodyVpcInfos self = new DescribeInstanceSwitchNetworkResponseBodyVpcInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseBodyVpcInfos setVpcInfo(java.util.List<DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo> vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public java.util.List<DescribeInstanceSwitchNetworkResponseBodyVpcInfosVpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

    }

}
