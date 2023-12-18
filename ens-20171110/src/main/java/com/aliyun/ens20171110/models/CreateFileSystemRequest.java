// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The information about the orders.</p>
     */
    @NameInMap("OrderDetails")
    public java.util.List<CreateFileSystemRequestOrderDetails> orderDetails;

    public static CreateFileSystemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemRequest self = new CreateFileSystemRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemRequest setOrderDetails(java.util.List<CreateFileSystemRequestOrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public java.util.List<CreateFileSystemRequestOrderDetails> getOrderDetails() {
        return this.orderDetails;
    }

    public static class CreateFileSystemRequestOrderDetails extends TeaModel {
        /**
         * <p>The billing method of the NAS file system. Valid values:</p>
         * <br>
         * <p>*   PrePaid: subscription. This billing method is not supported.</p>
         * <p>*   PostPaid: pay-as-you-go.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The ID of the ENS node.</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The name of the file system.</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <p>The name of the mount target.</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The ID of the VPC.</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The type of the order.</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The storage protocol. Valid values: nsf and smb.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The type of the storage. Set the value to capacity.</p>
         */
        @NameInMap("StorgeType")
        public String storgeType;

        public static CreateFileSystemRequestOrderDetails build(java.util.Map<String, ?> map) throws Exception {
            CreateFileSystemRequestOrderDetails self = new CreateFileSystemRequestOrderDetails();
            return TeaModel.build(map, self);
        }

        public CreateFileSystemRequestOrderDetails setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public CreateFileSystemRequestOrderDetails setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CreateFileSystemRequestOrderDetails setFileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }
        public String getFileSystemName() {
            return this.fileSystemName;
        }

        public CreateFileSystemRequestOrderDetails setMountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }
        public String getMountTargetDomain() {
            return this.mountTargetDomain;
        }

        public CreateFileSystemRequestOrderDetails setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public CreateFileSystemRequestOrderDetails setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public CreateFileSystemRequestOrderDetails setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public CreateFileSystemRequestOrderDetails setStorgeType(String storgeType) {
            this.storgeType = storgeType;
            return this;
        }
        public String getStorgeType() {
            return this.storgeType;
        }

    }

}
