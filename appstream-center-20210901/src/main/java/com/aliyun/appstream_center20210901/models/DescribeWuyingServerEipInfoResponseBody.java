// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeWuyingServerEipInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the associated EIP.</p>
     */
    @NameInMap("EipInfoModel")
    public DescribeWuyingServerEipInfoResponseBodyEipInfoModel eipInfoModel;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeWuyingServerEipInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWuyingServerEipInfoResponseBody self = new DescribeWuyingServerEipInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWuyingServerEipInfoResponseBody setEipInfoModel(DescribeWuyingServerEipInfoResponseBodyEipInfoModel eipInfoModel) {
        this.eipInfoModel = eipInfoModel;
        return this;
    }
    public DescribeWuyingServerEipInfoResponseBodyEipInfoModel getEipInfoModel() {
        return this.eipInfoModel;
    }

    public DescribeWuyingServerEipInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeWuyingServerEipInfoResponseBodyEipInfoModel extends TeaModel {
        @NameInMap("EipId")
        public String eipId;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>171.xxx.xxx.221</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        /**
         * <p>The ID of the elastic network interface (ENI).</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp174p2xxxxxbyh02ix</p>
         */
        @NameInMap("NetworkInterfaceId")
        public String networkInterfaceId;

        /**
         * <p>The port range.</p>
         * 
         * <strong>example:</strong>
         * <p>6606/6607</p>
         */
        @NameInMap("ServerPortRange")
        public String serverPortRange;

        public static DescribeWuyingServerEipInfoResponseBodyEipInfoModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeWuyingServerEipInfoResponseBodyEipInfoModel self = new DescribeWuyingServerEipInfoResponseBodyEipInfoModel();
            return TeaModel.build(map, self);
        }

        public DescribeWuyingServerEipInfoResponseBodyEipInfoModel setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

        public DescribeWuyingServerEipInfoResponseBodyEipInfoModel setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public DescribeWuyingServerEipInfoResponseBodyEipInfoModel setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeWuyingServerEipInfoResponseBodyEipInfoModel setServerPortRange(String serverPortRange) {
            this.serverPortRange = serverPortRange;
            return this;
        }
        public String getServerPortRange() {
            return this.serverPortRange;
        }

    }

}
