// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstanceForIsvResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1570634021000</p>
     */
    @NameInMap("BeganOn")
    public Long beganOn;

    /**
     * <strong>example:</strong>
     * <p>{&quot;package_version&quot;:&quot;yuncode000111&quot;}</p>
     */
    @NameInMap("ComponentJson")
    public String componentJson;

    /**
     * <strong>example:</strong>
     * <p>1570634018000</p>
     */
    @NameInMap("CreatedOn")
    public Long createdOn;

    /**
     * <strong>example:</strong>
     * <p>1602259200000</p>
     */
    @NameInMap("EndOn")
    public Long endOn;

    @NameInMap("ExtendJson")
    public String extendJson;

    /**
     * <strong>example:</strong>
     * <p>1551111111</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTrial")
    public Boolean isTrial;

    /**
     * <strong>example:</strong>
     * <p>204211111111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>cmgj00**11</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ProductName")
    public String productName;

    /**
     * <strong>example:</strong>
     * <p>cmgj00**11-prepay</p>
     */
    @NameInMap("ProductSkuCode")
    public String productSkuCode;

    /**
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("RelationalData")
    public DescribeInstanceForIsvResponseBodyRelationalData relationalData;

    /**
     * <strong>example:</strong>
     * <p>6EF60BEC-<strong><strong>-</strong></strong>-****-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>OPENED</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("SupplierName")
    public String supplierName;

    public static DescribeInstanceForIsvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceForIsvResponseBody self = new DescribeInstanceForIsvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceForIsvResponseBody setBeganOn(Long beganOn) {
        this.beganOn = beganOn;
        return this;
    }
    public Long getBeganOn() {
        return this.beganOn;
    }

    public DescribeInstanceForIsvResponseBody setComponentJson(String componentJson) {
        this.componentJson = componentJson;
        return this;
    }
    public String getComponentJson() {
        return this.componentJson;
    }

    public DescribeInstanceForIsvResponseBody setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
        return this;
    }
    public Long getCreatedOn() {
        return this.createdOn;
    }

    public DescribeInstanceForIsvResponseBody setEndOn(Long endOn) {
        this.endOn = endOn;
        return this;
    }
    public Long getEndOn() {
        return this.endOn;
    }

    public DescribeInstanceForIsvResponseBody setExtendJson(String extendJson) {
        this.extendJson = extendJson;
        return this;
    }
    public String getExtendJson() {
        return this.extendJson;
    }

    public DescribeInstanceForIsvResponseBody setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceForIsvResponseBody setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    public DescribeInstanceForIsvResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DescribeInstanceForIsvResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeInstanceForIsvResponseBody setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public DescribeInstanceForIsvResponseBody setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
        return this;
    }
    public String getProductSkuCode() {
        return this.productSkuCode;
    }

    public DescribeInstanceForIsvResponseBody setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeInstanceForIsvResponseBody setRelationalData(DescribeInstanceForIsvResponseBodyRelationalData relationalData) {
        this.relationalData = relationalData;
        return this;
    }
    public DescribeInstanceForIsvResponseBodyRelationalData getRelationalData() {
        return this.relationalData;
    }

    public DescribeInstanceForIsvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceForIsvResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeInstanceForIsvResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public static class DescribeInstanceForIsvResponseBodyRelationalData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>STARTED</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        public static DescribeInstanceForIsvResponseBodyRelationalData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceForIsvResponseBodyRelationalData self = new DescribeInstanceForIsvResponseBodyRelationalData();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceForIsvResponseBodyRelationalData setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

    }

}
