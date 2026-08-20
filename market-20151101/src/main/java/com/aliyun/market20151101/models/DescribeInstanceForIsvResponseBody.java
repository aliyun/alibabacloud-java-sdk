// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeInstanceForIsvResponseBody extends TeaModel {
    /**
     * <p>The activation URL.</p>
     * 
     * <strong>example:</strong>
     * <p>https://*****.com</p>
     */
    @NameInMap("ActiveAddress")
    public String activeAddress;

    /**
     * <p>The application information. The metric description of the parameters in the example is as follows:</p>
     * <p>username: the username.
     * passowrd: the password.
     * frontEndUrl: the frontend URL.
     * adminUrl: the administration URL.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;frontEndUrl&quot;:&quot;https://<em><em><strong>.aliyundoc.com&quot;,&quot;password&quot;:&quot;Sjtv</strong></em>&quot;,&quot;adminUrl&quot;:&quot;https://</em><em><strong>.aliyundoc.com&quot;,&quot;username&quot;:&quot;aliyun</strong></em>&quot;}</p>
     */
    @NameInMap("AppJson")
    public String appJson;

    /**
     * <p>The automatic payment information for epoch-based products. A non-empty value indicates that you enable auto-renewal.
     * autoRenewCycle: Day, Month, or Year.
     * autoRenewDuration: the renewal epoch.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;autoRenewCycle&quot;:&quot;Year&quot;,&quot;autoRenewDuration&quot;:1}</p>
     */
    @NameInMap("AutoRenewal")
    public String autoRenewal;

    /**
     * <p>The time when the instance was activated (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1570634021000</p>
     */
    @NameInMap("BeganOn")
    public Long beganOn;

    /**
     * <p>The business module. The metric description of the parameters in the example is as follows:</p>
     * <ul>
     * <li>package_version: the version.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;package_version&quot;:&quot;yuncode000111&quot;}</p>
     */
    @NameInMap("ComponentJson")
    public String componentJson;

    /**
     * <p>The creation time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1570634018000</p>
     */
    @NameInMap("CreatedOn")
    public Long createdOn;

    /**
     * <p>The expiration time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1602259200000</p>
     */
    @NameInMap("EndOn")
    public Long endOn;

    /**
     * <p>The extended information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;说明&quot;: &quot;如有使用问题，请联系...&quot;}</p>
     */
    @NameInMap("ExtendJson")
    public String extendJson;

    /**
     * <p>The host information. The metric description of the parameters in the example is as follows:</p>
     * <p>username: the username.
     * passowrd: the password.
     * ip: the host IP address.
     * innerIp: the internal network IP address of the host.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;password&quot;:&quot;<em><strong>&quot;,&quot;ip&quot;:&quot;118.31.</strong></em>.41&quot;,&quot;innerIp&quot;:&quot;118.31.<em><strong>.41&quot;,&quot;region&quot;:&quot;&quot;,&quot;username&quot;:&quot;</strong></em>&quot;,&quot;beianInfo&quot;:&quot;&quot;}</p>
     */
    @NameInMap("HostJson")
    public String hostJson;

    /**
     * <p>The image instance information.
     * imageId: the image ID.
     * instanceId: the instance ID.
     * ecsInstanceId: the ECS instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;imageId&quot;:&quot;m-*******&quot;,&quot;instanceId&quot;:********}</p>
     */
    @NameInMap("ImageJson")
    public String imageJson;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1551111111</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Indicates whether the instance is a trial instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTrial")
    public Boolean isTrial;

    /**
     * <p>The activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("LicenseCode")
    public String licenseCode;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>204211111111111</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The commodity code.</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj00**11</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The product name.</p>
     * 
     * <strong>example:</strong>
     * <p>***协同办公</p>
     */
    @NameInMap("ProductName")
    public String productName;

    /**
     * <p>The SKU code.</p>
     * 
     * <strong>example:</strong>
     * <p>cmgj00**11-prepay</p>
     */
    @NameInMap("ProductSkuCode")
    public String productSkuCode;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li>APP: application.</li>
     * <li>SERVIC: service.</li>
     * <li>MIRROR: image.</li>
     * <li>DOWNLOAD: download.</li>
     * <li>API_SERVICE: API.</li>
     * <li>DOCKER: Docker.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The relational information.</p>
     */
    @NameInMap("RelationalData")
    public DescribeInstanceForIsvResponseBodyRelationalData relationalData;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6EF60BEC-<strong><strong>-</strong></strong>-****-270359FB54A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The business status. Different values are set based on the product type.</p>
     * <p>When ProductType is set to MIRROR:</p>
     * <ul>
     * <li>PRODUCE: being provisioned.</li>
     * <li>USING: in use.</li>
     * <li>UNUSED: not in use.</li>
     * <li>EXPIRED: expired.</li>
     * <li>CLOSED: released.</li>
     * </ul>
     * <p>When ProductType is set to SERVICE:</p>
     * <ul>
     * <li>READYING: not started.</li>
     * <li>STARTED: in service.</li>
     * <li>CONFIRM: completed.</li>
     * <li>EXPIRED: expired.</li>
     * <li>CLOSED: released.</li>
     * </ul>
     * <p>When ProductType is set to APP, DOWNLOAD, API_SERVICE, or DOCKER:</p>
     * <ul>
     * <li>OPENING: being activated.</li>
     * <li>OPENED: activated.</li>
     * <li>EXPIRED: expired.</li>
     * <li>CLOSED: released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OPENED</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The service provider name.</p>
     * 
     * <strong>example:</strong>
     * <p>*****有限公司</p>
     */
    @NameInMap("SupplierName")
    public String supplierName;

    public static DescribeInstanceForIsvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceForIsvResponseBody self = new DescribeInstanceForIsvResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceForIsvResponseBody setActiveAddress(String activeAddress) {
        this.activeAddress = activeAddress;
        return this;
    }
    public String getActiveAddress() {
        return this.activeAddress;
    }

    public DescribeInstanceForIsvResponseBody setAppJson(String appJson) {
        this.appJson = appJson;
        return this;
    }
    public String getAppJson() {
        return this.appJson;
    }

    public DescribeInstanceForIsvResponseBody setAutoRenewal(String autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public String getAutoRenewal() {
        return this.autoRenewal;
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

    public DescribeInstanceForIsvResponseBody setHostJson(String hostJson) {
        this.hostJson = hostJson;
        return this;
    }
    public String getHostJson() {
        return this.hostJson;
    }

    public DescribeInstanceForIsvResponseBody setImageJson(String imageJson) {
        this.imageJson = imageJson;
        return this;
    }
    public String getImageJson() {
        return this.imageJson;
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

    public DescribeInstanceForIsvResponseBody setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
        return this;
    }
    public String getLicenseCode() {
        return this.licenseCode;
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
         * <p>The service status. Valid values:</p>
         * <ul>
         * <li>READYING: not started.</li>
         * <li>STARTED: in service.</li>
         * <li>CONFIRM: completed.</li>
         * <li>EXPIRED: expired.</li>
         * <li>CLOSED: released.</li>
         * </ul>
         * 
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
