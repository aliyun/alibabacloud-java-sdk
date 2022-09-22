// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeEniQosGroupInfoResponseBody extends TeaModel {
    @NameInMap("QosGroupInfo")
    public QosGroupInfo qosGroupInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeEniQosGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEniQosGroupInfoResponseBody self = new DescribeEniQosGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEniQosGroupInfoResponseBody setQosGroupInfo(QosGroupInfo qosGroupInfo) {
        this.qosGroupInfo = qosGroupInfo;
        return this;
    }
    public QosGroupInfo getQosGroupInfo() {
        return this.qosGroupInfo;
    }

    public DescribeEniQosGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class NetworkInterfaceIds extends TeaModel {
        @NameInMap("NetworkInterfaceId")
        public java.util.List<String> networkInterfaceId;

        public static NetworkInterfaceIds build(java.util.Map<String, ?> map) throws Exception {
            NetworkInterfaceIds self = new NetworkInterfaceIds();
            return TeaModel.build(map, self);
        }

        public NetworkInterfaceIds setNetworkInterfaceId(java.util.List<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public java.util.List<String> getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

    }

    public static class QosGroup extends TeaModel {
        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("QosGroupName")
        public String qosGroupName;

        @NameInMap("Rx")
        public String rx;

        @NameInMap("RxPps")
        public String rxPps;

        @NameInMap("Tx")
        public String tx;

        @NameInMap("TxPps")
        public String txPps;

        @NameInMap("Type")
        public String type;

        public static QosGroup build(java.util.Map<String, ?> map) throws Exception {
            QosGroup self = new QosGroup();
            return TeaModel.build(map, self);
        }

        public QosGroup setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QosGroup setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public QosGroup setQosGroupName(String qosGroupName) {
            this.qosGroupName = qosGroupName;
            return this;
        }
        public String getQosGroupName() {
            return this.qosGroupName;
        }

        public QosGroup setRx(String rx) {
            this.rx = rx;
            return this;
        }
        public String getRx() {
            return this.rx;
        }

        public QosGroup setRxPps(String rxPps) {
            this.rxPps = rxPps;
            return this;
        }
        public String getRxPps() {
            return this.rxPps;
        }

        public QosGroup setTx(String tx) {
            this.tx = tx;
            return this;
        }
        public String getTx() {
            return this.tx;
        }

        public QosGroup setTxPps(String txPps) {
            this.txPps = txPps;
            return this;
        }
        public String getTxPps() {
            return this.txPps;
        }

        public QosGroup setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QosGroupInfo extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("NetworkInterfaceIds")
        public NetworkInterfaceIds networkInterfaceIds;

        @NameInMap("QosGroup")
        public QosGroup qosGroup;

        public static QosGroupInfo build(java.util.Map<String, ?> map) throws Exception {
            QosGroupInfo self = new QosGroupInfo();
            return TeaModel.build(map, self);
        }

        public QosGroupInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QosGroupInfo setNetworkInterfaceIds(NetworkInterfaceIds networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }
        public NetworkInterfaceIds getNetworkInterfaceIds() {
            return this.networkInterfaceIds;
        }

        public QosGroupInfo setQosGroup(QosGroup qosGroup) {
            this.qosGroup = qosGroup;
            return this;
        }
        public QosGroup getQosGroup() {
            return this.qosGroup;
        }

    }

}
