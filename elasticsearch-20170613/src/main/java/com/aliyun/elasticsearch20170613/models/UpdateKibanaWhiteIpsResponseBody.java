// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateKibanaWhiteIpsResponseBodyResult result;

    public static UpdateKibanaWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaWhiteIpsResponseBody self = new UpdateKibanaWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateKibanaWhiteIpsResponseBody setResult(UpdateKibanaWhiteIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateKibanaWhiteIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList build(java.util.Map<String, ?> map) throws Exception {
            UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList self = new UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList();
            return TeaModel.build(map, self);
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

    public static class UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("vswitchId")
        public String vswitchId;

        @NameInMap("whiteIpGroupList")
        public java.util.List<UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList;

        public static UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig self = new UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig setWhiteIpGroupList(java.util.List<UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList) {
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }
        public java.util.List<UpdateKibanaWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

    }

    public static class UpdateKibanaWhiteIpsResponseBodyResult extends TeaModel {
        @NameInMap("kibanaIPWhitelist")
        public java.util.List<String> kibanaIPWhitelist;

        @NameInMap("kibanaPrivateIPWhitelist")
        public java.util.List<String> kibanaPrivateIPWhitelist;

        @NameInMap("networkConfig")
        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig networkConfig;

        public static UpdateKibanaWhiteIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateKibanaWhiteIpsResponseBodyResult self = new UpdateKibanaWhiteIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateKibanaWhiteIpsResponseBodyResult setKibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        public UpdateKibanaWhiteIpsResponseBodyResult setKibanaPrivateIPWhitelist(java.util.List<String> kibanaPrivateIPWhitelist) {
            this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
            return this;
        }
        public java.util.List<String> getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        public UpdateKibanaWhiteIpsResponseBodyResult setNetworkConfig(UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public UpdateKibanaWhiteIpsResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

    }

}
