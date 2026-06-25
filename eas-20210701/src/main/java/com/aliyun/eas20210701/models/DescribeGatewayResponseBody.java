// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeGatewayResponseBody extends TeaModel {
    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The time when the private gateway was created. The time is in Coordinated Universal Time (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-19T14:19:42Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The ID of the self-managed cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>c935eadf284c14c2da57a2a13ad6******</p>
     */
    @NameInMap("ExternalClusterId")
    public String externalClusterId;

    /**
     * <p>The ID of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******</p>
     */
    @NameInMap("GatewayId")
    public String gatewayId;

    /**
     * <p>The alias of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>mygateway1</p>
     */
    @NameInMap("GatewayName")
    public String gatewayName;

    /**
     * <p>The instance type of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>2c4g</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The public endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******-1801786532******.cn-wulanchabu.pai-eas.aliyuncs.com</p>
     */
    @NameInMap("InternetDomain")
    public String internetDomain;

    /**
     * <p>Indicates whether public network access is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("InternetEnabled")
    public Boolean internetEnabled;

    /**
     * <p>The status of public network access.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("InternetStatus")
    public String internetStatus;

    /**
     * <p>The private endpoint.</p>
     * 
     * <strong>example:</strong>
     * <p>gw-1uhcqmsc7x22******-1801786532******-vpc.cn-wulanchabu.pai-eas.aliyuncs.com</p>
     */
    @NameInMap("IntranetDomain")
    public String intranetDomain;

    @NameInMap("IntranetEnabled")
    public Boolean intranetEnabled;

    /**
     * <p>Indicates whether the gateway is the default private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("Labels")
    public java.util.List<DescribeGatewayResponseBodyLabels> labels;

    /**
     * <p>The number of private gateway nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Replicas")
    public Integer replicas;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether HTTP to HTTPS redirection is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SSLRedirectionEnabled")
    public Boolean SSLRedirectionEnabled;

    /**
     * <p>The status of the private gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The time when the private gateway was last updated. The time is in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-24T11:52:17Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static DescribeGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayResponseBody self = new DescribeGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeGatewayResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGatewayResponseBody setExternalClusterId(String externalClusterId) {
        this.externalClusterId = externalClusterId;
        return this;
    }
    public String getExternalClusterId() {
        return this.externalClusterId;
    }

    public DescribeGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public DescribeGatewayResponseBody setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }
    public String getGatewayName() {
        return this.gatewayName;
    }

    public DescribeGatewayResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeGatewayResponseBody setInternetDomain(String internetDomain) {
        this.internetDomain = internetDomain;
        return this;
    }
    public String getInternetDomain() {
        return this.internetDomain;
    }

    public DescribeGatewayResponseBody setInternetEnabled(Boolean internetEnabled) {
        this.internetEnabled = internetEnabled;
        return this;
    }
    public Boolean getInternetEnabled() {
        return this.internetEnabled;
    }

    public DescribeGatewayResponseBody setInternetStatus(String internetStatus) {
        this.internetStatus = internetStatus;
        return this;
    }
    public String getInternetStatus() {
        return this.internetStatus;
    }

    public DescribeGatewayResponseBody setIntranetDomain(String intranetDomain) {
        this.intranetDomain = intranetDomain;
        return this;
    }
    public String getIntranetDomain() {
        return this.intranetDomain;
    }

    public DescribeGatewayResponseBody setIntranetEnabled(Boolean intranetEnabled) {
        this.intranetEnabled = intranetEnabled;
        return this;
    }
    public Boolean getIntranetEnabled() {
        return this.intranetEnabled;
    }

    public DescribeGatewayResponseBody setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DescribeGatewayResponseBody setLabels(java.util.List<DescribeGatewayResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<DescribeGatewayResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public DescribeGatewayResponseBody setReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }
    public Integer getReplicas() {
        return this.replicas;
    }

    public DescribeGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatewayResponseBody setSSLRedirectionEnabled(Boolean SSLRedirectionEnabled) {
        this.SSLRedirectionEnabled = SSLRedirectionEnabled;
        return this;
    }
    public Boolean getSSLRedirectionEnabled() {
        return this.SSLRedirectionEnabled;
    }

    public DescribeGatewayResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeGatewayResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class DescribeGatewayResponseBodyLabels extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("LabelValue")
        public String labelValue;

        public static DescribeGatewayResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatewayResponseBodyLabels self = new DescribeGatewayResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public DescribeGatewayResponseBodyLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public DescribeGatewayResponseBodyLabels setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

}
