// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineNetworkInfoRequest extends TeaModel {
    /**
     * <p>hpn information of machine</p>
     */
    @NameInMap("MachineHpnInfo")
    public java.util.List<ListMachineNetworkInfoRequestMachineHpnInfo> machineHpnInfo;

    public static ListMachineNetworkInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMachineNetworkInfoRequest self = new ListMachineNetworkInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListMachineNetworkInfoRequest setMachineHpnInfo(java.util.List<ListMachineNetworkInfoRequestMachineHpnInfo> machineHpnInfo) {
        this.machineHpnInfo = machineHpnInfo;
        return this;
    }
    public java.util.List<ListMachineNetworkInfoRequestMachineHpnInfo> getMachineHpnInfo() {
        return this.machineHpnInfo;
    }

    public static class ListMachineNetworkInfoRequestMachineHpnInfo extends TeaModel {
        /**
         * <p>hpn zone infomation</p>
         * 
         * <strong>example:</strong>
         * <p>C1</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <p>The type of machine.</p>
         * 
         * <strong>example:</strong>
         * <p>efg2.C48cNHmcn</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>The ID of the region in which the application is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListMachineNetworkInfoRequestMachineHpnInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMachineNetworkInfoRequestMachineHpnInfo self = new ListMachineNetworkInfoRequestMachineHpnInfo();
            return TeaModel.build(map, self);
        }

        public ListMachineNetworkInfoRequestMachineHpnInfo setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListMachineNetworkInfoRequestMachineHpnInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListMachineNetworkInfoRequestMachineHpnInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
