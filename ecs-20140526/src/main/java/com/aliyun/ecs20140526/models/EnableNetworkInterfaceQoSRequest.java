// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EnableNetworkInterfaceQoSRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-2zeh9atclduxvf1z****</p>
     */
    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("QoS")
    public EnableNetworkInterfaceQoSRequestQoS qoS;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static EnableNetworkInterfaceQoSRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableNetworkInterfaceQoSRequest self = new EnableNetworkInterfaceQoSRequest();
        return TeaModel.build(map, self);
    }

    public EnableNetworkInterfaceQoSRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public EnableNetworkInterfaceQoSRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableNetworkInterfaceQoSRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableNetworkInterfaceQoSRequest setQoS(EnableNetworkInterfaceQoSRequestQoS qoS) {
        this.qoS = qoS;
        return this;
    }
    public EnableNetworkInterfaceQoSRequestQoS getQoS() {
        return this.qoS;
    }

    public EnableNetworkInterfaceQoSRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableNetworkInterfaceQoSRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableNetworkInterfaceQoSRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class EnableNetworkInterfaceQoSRequestQoS extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("BandwidthRx")
        public Long bandwidthRx;

        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("BandwidthTx")
        public Long bandwidthTx;

        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("ConcurrentConnections")
        public Long concurrentConnections;

        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("PpsRx")
        public Long ppsRx;

        /**
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("PpsTx")
        public Long ppsTx;

        public static EnableNetworkInterfaceQoSRequestQoS build(java.util.Map<String, ?> map) throws Exception {
            EnableNetworkInterfaceQoSRequestQoS self = new EnableNetworkInterfaceQoSRequestQoS();
            return TeaModel.build(map, self);
        }

        public EnableNetworkInterfaceQoSRequestQoS setBandwidthRx(Long bandwidthRx) {
            this.bandwidthRx = bandwidthRx;
            return this;
        }
        public Long getBandwidthRx() {
            return this.bandwidthRx;
        }

        public EnableNetworkInterfaceQoSRequestQoS setBandwidthTx(Long bandwidthTx) {
            this.bandwidthTx = bandwidthTx;
            return this;
        }
        public Long getBandwidthTx() {
            return this.bandwidthTx;
        }

        public EnableNetworkInterfaceQoSRequestQoS setConcurrentConnections(Long concurrentConnections) {
            this.concurrentConnections = concurrentConnections;
            return this;
        }
        public Long getConcurrentConnections() {
            return this.concurrentConnections;
        }

        public EnableNetworkInterfaceQoSRequestQoS setPpsRx(Long ppsRx) {
            this.ppsRx = ppsRx;
            return this;
        }
        public Long getPpsRx() {
            return this.ppsRx;
        }

        public EnableNetworkInterfaceQoSRequestQoS setPpsTx(Long ppsTx) {
            this.ppsTx = ppsTx;
            return this;
        }
        public Long getPpsTx() {
            return this.ppsTx;
        }

    }

}
