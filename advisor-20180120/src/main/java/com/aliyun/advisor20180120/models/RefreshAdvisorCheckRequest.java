// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class RefreshAdvisorCheckRequest extends TeaModel {
    @NameInMap("AssumeAliyunId")
    public Long assumeAliyunId;

    /**
     * <strong>example:</strong>
     * <p>EcsHighCpuUtilization</p>
     */
    @NameInMap("CheckId")
    public String checkId;

    @NameInMap("CheckPlanId")
    public Long checkPlanId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Product")
    public String product;

    @NameInMap("ResourceDimensionList")
    public java.util.List<RefreshAdvisorCheckRequestResourceDimensionList> resourceDimensionList;

    /**
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static RefreshAdvisorCheckRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshAdvisorCheckRequest self = new RefreshAdvisorCheckRequest();
        return TeaModel.build(map, self);
    }

    public RefreshAdvisorCheckRequest setAssumeAliyunId(Long assumeAliyunId) {
        this.assumeAliyunId = assumeAliyunId;
        return this;
    }
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    public RefreshAdvisorCheckRequest setCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }
    public String getCheckId() {
        return this.checkId;
    }

    public RefreshAdvisorCheckRequest setCheckPlanId(Long checkPlanId) {
        this.checkPlanId = checkPlanId;
        return this;
    }
    public Long getCheckPlanId() {
        return this.checkPlanId;
    }

    public RefreshAdvisorCheckRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public RefreshAdvisorCheckRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public RefreshAdvisorCheckRequest setResourceDimensionList(java.util.List<RefreshAdvisorCheckRequestResourceDimensionList> resourceDimensionList) {
        this.resourceDimensionList = resourceDimensionList;
        return this;
    }
    public java.util.List<RefreshAdvisorCheckRequestResourceDimensionList> getResourceDimensionList() {
        return this.resourceDimensionList;
    }

    public RefreshAdvisorCheckRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public static class RefreshAdvisorCheckRequestResourceDimensionList extends TeaModel {
        @NameInMap("Cost")
        public Boolean cost;

        @NameInMap("Performance")
        public Boolean performance;

        @NameInMap("Product")
        public String product;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Reliablility")
        public Boolean reliablility;

        @NameInMap("Security")
        public Boolean security;

        @NameInMap("Service")
        public Boolean service;

        public static RefreshAdvisorCheckRequestResourceDimensionList build(java.util.Map<String, ?> map) throws Exception {
            RefreshAdvisorCheckRequestResourceDimensionList self = new RefreshAdvisorCheckRequestResourceDimensionList();
            return TeaModel.build(map, self);
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setCost(Boolean cost) {
            this.cost = cost;
            return this;
        }
        public Boolean getCost() {
            return this.cost;
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setPerformance(Boolean performance) {
            this.performance = performance;
            return this;
        }
        public Boolean getPerformance() {
            return this.performance;
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setReliablility(Boolean reliablility) {
            this.reliablility = reliablility;
            return this;
        }
        public Boolean getReliablility() {
            return this.reliablility;
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setSecurity(Boolean security) {
            this.security = security;
            return this;
        }
        public Boolean getSecurity() {
            return this.security;
        }

        public RefreshAdvisorCheckRequestResourceDimensionList setService(Boolean service) {
            this.service = service;
            return this;
        }
        public Boolean getService() {
            return this.service;
        }

    }

}
