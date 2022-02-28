// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeNetworksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Networks")
    public DescribeNetworksResponseBodyNetworks networks;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeNetworksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworksResponseBody self = new DescribeNetworksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNetworksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNetworksResponseBody setNetworks(DescribeNetworksResponseBodyNetworks networks) {
        this.networks = networks;
        return this;
    }
    public DescribeNetworksResponseBodyNetworks getNetworks() {
        return this.networks;
    }

    public DescribeNetworksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeNetworksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeNetworksResponseBodyNetworksNetwork extends TeaModel {
        @NameInMap("networkInfo")
        public String networkInfo;

        public static DescribeNetworksResponseBodyNetworksNetwork build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworksNetwork self = new DescribeNetworksResponseBodyNetworksNetwork();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworksNetwork setNetworkInfo(String networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }
        public String getNetworkInfo() {
            return this.networkInfo;
        }

    }

    public static class DescribeNetworksResponseBodyNetworks extends TeaModel {
        @NameInMap("network")
        public java.util.List<DescribeNetworksResponseBodyNetworksNetwork> network;

        public static DescribeNetworksResponseBodyNetworks build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworksResponseBodyNetworks self = new DescribeNetworksResponseBodyNetworks();
            return TeaModel.build(map, self);
        }

        public DescribeNetworksResponseBodyNetworks setNetwork(java.util.List<DescribeNetworksResponseBodyNetworksNetwork> network) {
            this.network = network;
            return this;
        }
        public java.util.List<DescribeNetworksResponseBodyNetworksNetwork> getNetwork() {
            return this.network;
        }

    }

}
