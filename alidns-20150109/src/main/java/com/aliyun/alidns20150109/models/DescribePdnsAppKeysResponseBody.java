// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsAppKeysResponseBody extends TeaModel {
    @NameInMap("AppKeys")
    public java.util.List<DescribePdnsAppKeysResponseBodyAppKeys> appKeys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePdnsAppKeysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsAppKeysResponseBody self = new DescribePdnsAppKeysResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePdnsAppKeysResponseBody setAppKeys(java.util.List<DescribePdnsAppKeysResponseBodyAppKeys> appKeys) {
        this.appKeys = appKeys;
        return this;
    }
    public java.util.List<DescribePdnsAppKeysResponseBodyAppKeys> getAppKeys() {
        return this.appKeys;
    }

    public DescribePdnsAppKeysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("ClusterUserId")
        public String clusterUserId;

        public static DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters self = new DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters();
            return TeaModel.build(map, self);
        }

        public DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters setClusterUserId(String clusterUserId) {
            this.clusterUserId = clusterUserId;
            return this;
        }
        public String getClusterUserId() {
            return this.clusterUserId;
        }

    }

    public static class DescribePdnsAppKeysResponseBodyAppKeys extends TeaModel {
        @NameInMap("AppKeyId")
        public String appKeyId;

        @NameInMap("BindEdgeDnsClusters")
        public java.util.List<DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters> bindEdgeDnsClusters;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("State")
        public String state;

        public static DescribePdnsAppKeysResponseBodyAppKeys build(java.util.Map<String, ?> map) throws Exception {
            DescribePdnsAppKeysResponseBodyAppKeys self = new DescribePdnsAppKeysResponseBodyAppKeys();
            return TeaModel.build(map, self);
        }

        public DescribePdnsAppKeysResponseBodyAppKeys setAppKeyId(String appKeyId) {
            this.appKeyId = appKeyId;
            return this;
        }
        public String getAppKeyId() {
            return this.appKeyId;
        }

        public DescribePdnsAppKeysResponseBodyAppKeys setBindEdgeDnsClusters(java.util.List<DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters> bindEdgeDnsClusters) {
            this.bindEdgeDnsClusters = bindEdgeDnsClusters;
            return this;
        }
        public java.util.List<DescribePdnsAppKeysResponseBodyAppKeysBindEdgeDnsClusters> getBindEdgeDnsClusters() {
            return this.bindEdgeDnsClusters;
        }

        public DescribePdnsAppKeysResponseBodyAppKeys setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public DescribePdnsAppKeysResponseBodyAppKeys setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribePdnsAppKeysResponseBodyAppKeys setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribePdnsAppKeysResponseBodyAppKeys setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
