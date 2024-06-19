// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLbAx7BkQzyYC+ONO+WudHGKEdB0uWSY7AGnM3qCgm/Ynge7zU6NWdbj0Tegyajyqyc=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListServiceInstanceResourcesResponseBodyResources> resources;

    public static ListServiceInstanceResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceResourcesResponseBody self = new ListServiceInstanceResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceResourcesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceResourcesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceInstanceResourcesResponseBody setResources(java.util.List<ListServiceInstanceResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListServiceInstanceResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListServiceInstanceResourcesResponseBodyResources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2022-03-01T12:00:00</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <strong>example:</strong>
         * <p>rds</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ProductType")
        public String productType;

        /**
         * <strong>example:</strong>
         * <p>AutoRenewal</p>
         */
        @NameInMap("RenewStatus")
        public String renewStatus;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RenewalPeriod")
        public Integer renewalPeriod;

        /**
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("RenewalPeriodUnit")
        public String renewalPeriodUnit;

        /**
         * <strong>example:</strong>
         * <p>arn:acs:sag:cn-hangzhou:130920852836****:ccn/ccn-b3qf0q439sq2de****</p>
         */
        @NameInMap("ResourceARN")
        public String resourceARN;

        @NameInMap("Status")
        public String status;

        public static ListServiceInstanceResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceResourcesResponseBodyResources self = new ListServiceInstanceResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceInstanceResourcesResponseBodyResources setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListServiceInstanceResourcesResponseBodyResources setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public ListServiceInstanceResourcesResponseBodyResources setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListServiceInstanceResourcesResponseBodyResources setProductType(String productType) {
            this.productType = productType;
            return this;
        }
        public String getProductType() {
            return this.productType;
        }

        public ListServiceInstanceResourcesResponseBodyResources setRenewStatus(String renewStatus) {
            this.renewStatus = renewStatus;
            return this;
        }
        public String getRenewStatus() {
            return this.renewStatus;
        }

        public ListServiceInstanceResourcesResponseBodyResources setRenewalPeriod(Integer renewalPeriod) {
            this.renewalPeriod = renewalPeriod;
            return this;
        }
        public Integer getRenewalPeriod() {
            return this.renewalPeriod;
        }

        public ListServiceInstanceResourcesResponseBodyResources setRenewalPeriodUnit(String renewalPeriodUnit) {
            this.renewalPeriodUnit = renewalPeriodUnit;
            return this;
        }
        public String getRenewalPeriodUnit() {
            return this.renewalPeriodUnit;
        }

        public ListServiceInstanceResourcesResponseBodyResources setResourceARN(String resourceARN) {
            this.resourceARN = resourceARN;
            return this;
        }
        public String getResourceARN() {
            return this.resourceARN;
        }

        public ListServiceInstanceResourcesResponseBodyResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
