// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateFileSystemRequest extends TeaModel {
    /**
     * <p>The information about the orders.</p>
     * <p>This parameter is required.</p>
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
         * <ul>
         * <li>PrePaid: subscription. This billing method is not supported.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The ID of the edge node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-suzhou-telecom</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The name of the file system. The name must be 1 to 80 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nasFile</p>
         */
        @NameInMap("FileSystemName")
        public String fileSystemName;

        /**
         * <p>The name of the mount target. The name must be 1 to 80 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nasMount</p>
         */
        @NameInMap("MountTargetDomain")
        public String mountTargetDomain;

        /**
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-xxx</p>
         */
        @NameInMap("NetworkId")
        public String networkId;

        /**
         * <p>The type of the order. Set the value to BUY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("OrderType")
        public String orderType;

        /**
         * <p>The storage protocol. Set the value to nfs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nfs</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li>Capacity.</li>
         * <li>Performance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>capacity</p>
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
