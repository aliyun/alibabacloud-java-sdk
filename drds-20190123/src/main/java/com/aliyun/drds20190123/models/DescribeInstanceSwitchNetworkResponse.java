// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeInstanceSwitchNetworkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("VpcInfos")
    @Validation(required = true)
    public DescribeInstanceSwitchNetworkResponseVpcInfos vpcInfos;

    public static DescribeInstanceSwitchNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSwitchNetworkResponse self = new DescribeInstanceSwitchNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSwitchNetworkResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSwitchNetworkResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceSwitchNetworkResponse setVpcInfos(DescribeInstanceSwitchNetworkResponseVpcInfos vpcInfos) {
        this.vpcInfos = vpcInfos;
        return this;
    }
    public DescribeInstanceSwitchNetworkResponseVpcInfos getVpcInfos() {
        return this.vpcInfos;
    }

    public static class DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo extends TeaModel {
        @NameInMap("VswitchId")
        @Validation(required = true)
        public String vswitchId;

        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("VswitchName")
        @Validation(required = true)
        public String vswitchName;

        @NameInMap("AzoneId")
        @Validation(required = true)
        public String azoneId;

        @NameInMap("DrdsSupported")
        @Validation(required = true)
        public Boolean drdsSupported;

        public static DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo self = new DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo setVswitchName(String vswitchName) {
            this.vswitchName = vswitchName;
            return this;
        }
        public String getVswitchName() {
            return this.vswitchName;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo setAzoneId(String azoneId) {
            this.azoneId = azoneId;
            return this;
        }
        public String getAzoneId() {
            return this.azoneId;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo setDrdsSupported(Boolean drdsSupported) {
            this.drdsSupported = drdsSupported;
            return this;
        }
        public Boolean getDrdsSupported() {
            return this.drdsSupported;
        }

    }

    public static class DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos extends TeaModel {
        @NameInMap("VswitchInfo")
        @Validation(required = true)
        public java.util.List<DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo> vswitchInfo;

        public static DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos self = new DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos setVswitchInfo(java.util.List<DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo> vswitchInfo) {
            this.vswitchInfo = vswitchInfo;
            return this;
        }
        public java.util.List<DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfosVswitchInfo> getVswitchInfo() {
            return this.vswitchInfo;
        }

    }

    public static class DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo extends TeaModel {
        @NameInMap("VpcId")
        @Validation(required = true)
        public String vpcId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("VpcName")
        @Validation(required = true)
        public String vpcName;

        @NameInMap("VswitchInfos")
        @Validation(required = true)
        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos vswitchInfos;

        public static DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo self = new DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo setVswitchInfos(DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos vswitchInfos) {
            this.vswitchInfos = vswitchInfos;
            return this;
        }
        public DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfoVswitchInfos getVswitchInfos() {
            return this.vswitchInfos;
        }

    }

    public static class DescribeInstanceSwitchNetworkResponseVpcInfos extends TeaModel {
        @NameInMap("VpcInfo")
        @Validation(required = true)
        public java.util.List<DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo> vpcInfo;

        public static DescribeInstanceSwitchNetworkResponseVpcInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSwitchNetworkResponseVpcInfos self = new DescribeInstanceSwitchNetworkResponseVpcInfos();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSwitchNetworkResponseVpcInfos setVpcInfo(java.util.List<DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo> vpcInfo) {
            this.vpcInfo = vpcInfo;
            return this;
        }
        public java.util.List<DescribeInstanceSwitchNetworkResponseVpcInfosVpcInfo> getVpcInfo() {
            return this.vpcInfo;
        }

    }

}
