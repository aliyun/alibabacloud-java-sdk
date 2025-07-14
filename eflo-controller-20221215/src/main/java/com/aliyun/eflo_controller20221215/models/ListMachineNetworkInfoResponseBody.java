// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ListMachineNetworkInfoResponseBody extends TeaModel {
    /**
     * <p>machine network infomation</p>
     */
    @NameInMap("MachineNetworkInfo")
    public java.util.List<ListMachineNetworkInfoResponseBodyMachineNetworkInfo> machineNetworkInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMachineNetworkInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMachineNetworkInfoResponseBody self = new ListMachineNetworkInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMachineNetworkInfoResponseBody setMachineNetworkInfo(java.util.List<ListMachineNetworkInfoResponseBodyMachineNetworkInfo> machineNetworkInfo) {
        this.machineNetworkInfo = machineNetworkInfo;
        return this;
    }
    public java.util.List<ListMachineNetworkInfoResponseBodyMachineNetworkInfo> getMachineNetworkInfo() {
        return this.machineNetworkInfo;
    }

    public ListMachineNetworkInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMachineNetworkInfoResponseBodyMachineNetworkInfo extends TeaModel {
        /**
         * <p>Network of cluster</p>
         * 
         * <strong>example:</strong>
         * <p>vpc/acl</p>
         */
        @NameInMap("ClusterNet")
        public String clusterNet;

        /**
         * <p>Specifies whether to enable the Jumbo Frames feature for the instance. Valid values:</p>
         * <ul>
         * <li>true: The Jumbo Frame feature is enabled for the instance.</li>
         * <li>false: The Jumbo Frame feature is disabled for the instance.</li>
         * </ul>
         * <p>Take note of the following items:</p>
         * <ul>
         * <li>The instance must be in the Running (<code>Running</code>) or Stopped (<code>Stopped</code>) state.</li>
         * <li>The instance must reside in a VPC.</li>
         * <li>After the Jumbo Frames feature is enabled, the MTU value of the instance is set to 8500. After the Jumbo Frames feature is disabled, the MTU value of the instance is set to 1500. You can enable the Jumbo Frames feature only for specific instance types. For more information, see <a href="https://help.aliyun.com/document_detail/200512.html">Jumbo Frames</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableJumboFrame")
        public Boolean enableJumboFrame;

        /**
         * <p>HPN zone</p>
         * 
         * <strong>example:</strong>
         * <p>B1</p>
         */
        @NameInMap("HpnZone")
        public String hpnZone;

        /**
         * <p>Specifies whether dpu machine.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDpuMode")
        public Boolean isDpuMode;

        /**
         * <p>The type of machine.</p>
         * 
         * <strong>example:</strong>
         * <p>efg1.nvga8n</p>
         */
        @NameInMap("MachineType")
        public String machineType;

        /**
         * <p>Network architecture</p>
         * 
         * <strong>example:</strong>
         * <p>XX-7.0</p>
         */
        @NameInMap("NetArch")
        public String netArch;

        /**
         * <p>The ID of the region in which the application is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ListMachineNetworkInfoResponseBodyMachineNetworkInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMachineNetworkInfoResponseBodyMachineNetworkInfo self = new ListMachineNetworkInfoResponseBodyMachineNetworkInfo();
            return TeaModel.build(map, self);
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setClusterNet(String clusterNet) {
            this.clusterNet = clusterNet;
            return this;
        }
        public String getClusterNet() {
            return this.clusterNet;
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setEnableJumboFrame(Boolean enableJumboFrame) {
            this.enableJumboFrame = enableJumboFrame;
            return this;
        }
        public Boolean getEnableJumboFrame() {
            return this.enableJumboFrame;
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setHpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }
        public String getHpnZone() {
            return this.hpnZone;
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setIsDpuMode(Boolean isDpuMode) {
            this.isDpuMode = isDpuMode;
            return this;
        }
        public Boolean getIsDpuMode() {
            return this.isDpuMode;
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setMachineType(String machineType) {
            this.machineType = machineType;
            return this;
        }
        public String getMachineType() {
            return this.machineType;
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setNetArch(String netArch) {
            this.netArch = netArch;
            return this;
        }
        public String getNetArch() {
            return this.netArch;
        }

        public ListMachineNetworkInfoResponseBodyMachineNetworkInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
