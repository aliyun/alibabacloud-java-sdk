// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    @NameInMap("Gateways")
    public java.util.List<ListGatewayResponseBodyGateways> gateways;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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

    public static class ListGatewayResponseBodyGateways extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-05-19T14:19:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>mygateway1</p>
         */
        @NameInMap("GatewayName")
        public String gatewayName;

        /**
         * <strong>example:</strong>
         * <p>2c4g</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******-1801786532******.cn-wulanchabu.pai-eas.aliyuncs.com</p>
         */
        @NameInMap("InternetDomain")
        public String internetDomain;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("InternetEnabled")
        public Boolean internetEnabled;

        /**
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******-1801786532******-vpc.cn-wulanchabu.pai-eas.aliyuncs.com</p>
         */
        @NameInMap("IntranetDomain")
        public String intranetDomain;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Replicas")
        public Integer replicas;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2021-02-24T11:52:17Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListGatewayResponseBodyGateways build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyGateways self = new ListGatewayResponseBodyGateways();
            return TeaModel.build(map, self);
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

        public ListGatewayResponseBodyGateways setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListGatewayResponseBodyGateways setReplicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }
        public Integer getReplicas() {
            return this.replicas;
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
