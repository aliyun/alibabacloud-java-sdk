// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductType")
        public String productType;

        @NameInMap("RenewStatus")
        public String renewStatus;

        @NameInMap("RenewalPeriod")
        public Integer renewalPeriod;

        @NameInMap("RenewalPeriodUnit")
        public String renewalPeriodUnit;

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
