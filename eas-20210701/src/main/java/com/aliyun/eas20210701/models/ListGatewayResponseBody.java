// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    /**
     * <p>The private gateways.</p>
     */
    @NameInMap("Gateways")
    public java.util.List<ListGatewayResponseBodyGateways> gateways;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of private gateways returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponseBody self = new ListGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponseBody setGateways(java.util.List<ListGatewayResponseBodyGateways> gateways) {
        this.gateways = gateways;
        return this;
    }
    public java.util.List<ListGatewayResponseBodyGateways> getGateways() {
        return this.gateways;
    }

    public ListGatewayResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewayResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListGatewayResponseBodyGatewaysLabels extends TeaModel {
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

        public static ListGatewayResponseBodyGatewaysLabels build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyGatewaysLabels self = new ListGatewayResponseBodyGatewaysLabels();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyGatewaysLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public ListGatewayResponseBodyGatewaysLabels setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

    public static class ListGatewayResponseBodyGateways extends TeaModel {
        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PrePaid: subscription.</li>
         * <li>PostPaid: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the private gateway was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-19T14:19:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The private gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The private gateway alias.</p>
         * 
         * <strong>example:</strong>
         * <p>mygateway1</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <p>The type of instances used for the private gateway.</p>
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
         * <p>Indicates whether Internet access is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InternetEnabled")
        public Boolean internetEnabled;

        /**
         * <p>The internal endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******-1801786532******-vpc.cn-wulanchabu.pai-eas.aliyuncs.com</p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        @NameInMap("IntranetEnabled")
        public Boolean intranetEnabled;

        /**
         * <p>Indicates whether it is the default private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Labels")
        public java.util.List<ListGatewayResponseBodyGatewaysLabels> labels;

        /**
         * <p>The number of nodes in the private gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <p>Specifies whether to enable HTTP to HTTPS redirection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SSLRedirectionEnabled")
        public Boolean SSLRedirectionEnabled;

        /**
         * <p>The state of the private gateway.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Creating</li>
         * <li>Stopped</li>
         * <li>Failed</li>
         * <li>Running</li>
         * <li>Deleted</li>
         * <li>Deleting</li>
         * <li>Waiting</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the private gateway was updated. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-24T11:52:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListGatewayResponseBodyGateways build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyGateways self = new ListGatewayResponseBodyGateways();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyGateways setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListGatewayResponseBodyGateways setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListGatewayResponseBodyGateways setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListGatewayResponseBodyGateways setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public ListGatewayResponseBodyGateways setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListGatewayResponseBodyGateways setInternetDomain(String internetDomain) {
            this.internetDomain = internetDomain;
            return this;
        }
        public String getInternetDomain() {
            return this.internetDomain;
        }

        public ListGatewayResponseBodyGateways setInternetEnabled(Boolean internetEnabled) {
            this.internetEnabled = internetEnabled;
            return this;
        }
        public Boolean getInternetEnabled() {
            return this.internetEnabled;
        }

        public ListGatewayResponseBodyGateways setIntranetDomain(String intranetDomain) {
            this.intranetDomain = intranetDomain;
            return this;
        }
        public String getIntranetDomain() {
            return this.intranetDomain;
        }

        public ListGatewayResponseBodyGateways setIntranetEnabled(Boolean intranetEnabled) {
            this.intranetEnabled = intranetEnabled;
            return this;
        }
        public Boolean getIntranetEnabled() {
            return this.intranetEnabled;
        }

        public ListGatewayResponseBodyGateways setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListGatewayResponseBodyGateways setLabels(java.util.List<ListGatewayResponseBodyGatewaysLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyGatewaysLabels> getLabels() {
            return this.labels;
        }

        public ListGatewayResponseBodyGateways setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
        }

        public ListGatewayResponseBodyGateways setSSLRedirectionEnabled(Boolean SSLRedirectionEnabled) {
            this.SSLRedirectionEnabled = SSLRedirectionEnabled;
            return this;
        }
        public Boolean getSSLRedirectionEnabled() {
            return this.SSLRedirectionEnabled;
        }

        public ListGatewayResponseBodyGateways setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListGatewayResponseBodyGateways setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
