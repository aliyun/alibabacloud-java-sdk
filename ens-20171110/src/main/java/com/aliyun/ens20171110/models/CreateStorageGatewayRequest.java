// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateStorageGatewayRequest extends TeaModel {
    /**
     * <p>The array of orders.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderDetails")
    public java.util.List<CreateStorageGatewayRequestOrderDetails> orderDetails;

    public static CreateStorageGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStorageGatewayRequest self = new CreateStorageGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateStorageGatewayRequest setOrderDetails(java.util.List<CreateStorageGatewayRequestOrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public java.util.List<CreateStorageGatewayRequestOrderDetails> getOrderDetails() {
        return this.orderDetails;
    }

    public static class CreateStorageGatewayRequestOrderDetails extends TeaModel {
        /**
         * <p>The description of the gateway. The description must be 2 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>testDescription</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the node.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-3</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The name of the gateway. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>testGatewayName</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <p>The type of the gateway. Set this parameter to <strong>1</strong>. <strong>1</strong> indicates iSCSI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("GatewayType")
        public String gatewayType;

        /**
         * <p>The ID of the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-123</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateStorageGatewayRequestOrderDetails build(java.util.Map<String, ?> map) throws Exception {
            CreateStorageGatewayRequestOrderDetails self = new CreateStorageGatewayRequestOrderDetails();
            return TeaModel.build(map, self);
        }

        public CreateStorageGatewayRequestOrderDetails setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateStorageGatewayRequestOrderDetails setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public CreateStorageGatewayRequestOrderDetails setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public CreateStorageGatewayRequestOrderDetails setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public CreateStorageGatewayRequestOrderDetails setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
