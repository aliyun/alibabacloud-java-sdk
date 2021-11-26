// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateWhiteIpsResponseBodyResult result;

    public static UpdateWhiteIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteIpsResponseBody self = new UpdateWhiteIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWhiteIpsResponseBody setResult(UpdateWhiteIpsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateWhiteIpsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList extends TeaModel {
        @NameInMap("groupName")
        public String groupName;

        @NameInMap("ips")
        public java.util.List<String> ips;

        @NameInMap("whiteIpType")
        public String whiteIpType;

        public static UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList self = new UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList();
            return TeaModel.build(map, self);
        }

        public UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList setWhiteIpType(String whiteIpType) {
            this.whiteIpType = whiteIpType;
            return this;
        }
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

    }

    public static class UpdateWhiteIpsResponseBodyResultNetworkConfig extends TeaModel {
        @NameInMap("whiteIpGroupList")
        public java.util.List<UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList;

        public static UpdateWhiteIpsResponseBodyResultNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhiteIpsResponseBodyResultNetworkConfig self = new UpdateWhiteIpsResponseBodyResultNetworkConfig();
            return TeaModel.build(map, self);
        }

        public UpdateWhiteIpsResponseBodyResultNetworkConfig setWhiteIpGroupList(java.util.List<UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList> whiteIpGroupList) {
            this.whiteIpGroupList = whiteIpGroupList;
            return this;
        }
        public java.util.List<UpdateWhiteIpsResponseBodyResultNetworkConfigWhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

    }

    public static class UpdateWhiteIpsResponseBodyResult extends TeaModel {
        @NameInMap("esIPWhitelist")
        public java.util.List<String> esIPWhitelist;

        @NameInMap("networkConfig")
        public UpdateWhiteIpsResponseBodyResultNetworkConfig networkConfig;

        public static UpdateWhiteIpsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateWhiteIpsResponseBodyResult self = new UpdateWhiteIpsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateWhiteIpsResponseBodyResult setEsIPWhitelist(java.util.List<String> esIPWhitelist) {
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }
        public java.util.List<String> getEsIPWhitelist() {
            return this.esIPWhitelist;
        }

        public UpdateWhiteIpsResponseBodyResult setNetworkConfig(UpdateWhiteIpsResponseBodyResultNetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public UpdateWhiteIpsResponseBodyResultNetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

    }

}
