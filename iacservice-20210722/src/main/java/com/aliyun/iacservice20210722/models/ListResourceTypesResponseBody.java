// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Long maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("nextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceTypes")
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes;

    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListResourceTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceTypes(java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public ListResourceTypesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceTypesResponseBodyResourceTypesIdentityDefinition extends TeaModel {
        // 资源ARN
        @NameInMap("arnPattern")
        public String arnPattern;

        // 备选Id字段列表，有顺序
        @NameInMap("secondUniqueKeyFields")
        public java.util.List<String> secondUniqueKeyFields;

        // uniqueKey的字段列表，有顺序
        @NameInMap("uniqueKeyFields")
        public java.util.List<String> uniqueKeyFields;

        public static ListResourceTypesResponseBodyResourceTypesIdentityDefinition build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesIdentityDefinition self = new ListResourceTypesResponseBodyResourceTypesIdentityDefinition();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesIdentityDefinition setArnPattern(String arnPattern) {
            this.arnPattern = arnPattern;
            return this;
        }
        public String getArnPattern() {
            return this.arnPattern;
        }

        public ListResourceTypesResponseBodyResourceTypesIdentityDefinition setSecondUniqueKeyFields(java.util.List<String> secondUniqueKeyFields) {
            this.secondUniqueKeyFields = secondUniqueKeyFields;
            return this;
        }
        public java.util.List<String> getSecondUniqueKeyFields() {
            return this.secondUniqueKeyFields;
        }

        public ListResourceTypesResponseBodyResourceTypesIdentityDefinition setUniqueKeyFields(java.util.List<String> uniqueKeyFields) {
            this.uniqueKeyFields = uniqueKeyFields;
            return this;
        }
        public java.util.List<String> getUniqueKeyFields() {
            return this.uniqueKeyFields;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesInfo extends TeaModel {
        // 允许资源展示的站点  枚举:china(中国站)/intl(国际站)/japan(日本站)
        @NameInMap("availableSites")
        public java.util.List<String> availableSites;

        // 资源分类 枚举:normal(普通资源)/singleton(单例资源)/virtual(虚拟资源)/readonly(只读资源)
        @NameInMap("category")
        public String category;

        // 付费形式  枚举:paid(付费)/free(免费)
        @NameInMap("chargeType")
        public String chargeType;

        // 交付级别 枚举:center(中心化部署级别)/region(地域部署级别)/zone(可用区部署级别)
        @NameInMap("deliveryScope")
        public String deliveryScope;

        // 描述
        @NameInMap("description")
        public String description;

        // 资源类型的中文名称，如实例
        @NameInMap("title")
        public String title;

        public static ListResourceTypesResponseBodyResourceTypesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesInfo self = new ListResourceTypesResponseBodyResourceTypesInfo();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setAvailableSites(java.util.List<String> availableSites) {
            this.availableSites = availableSites;
            return this;
        }
        public java.util.List<String> getAvailableSites() {
            return this.availableSites;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setDeliveryScope(String deliveryScope) {
            this.deliveryScope = deliveryScope;
            return this;
        }
        public String getDeliveryScope() {
            return this.deliveryScope;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesResourceRelations extends TeaModel {
        // 资源关系描述 枚举：枚举:关联关系/依赖关系/子父关系
        @NameInMap("description")
        public String description;

        // 云产品B
        @NameInMap("product")
        public String product;

        // 资源关系  枚举:relevance(关联关系)/dependency(依赖关系)/childParent(子父关系)
        @NameInMap("relation")
        public String relation;

        // 资源类型B
        @NameInMap("resourceType")
        public String resourceType;

        public static ListResourceTypesResponseBodyResourceTypesResourceRelations build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesResourceRelations self = new ListResourceTypesResponseBodyResourceTypesResourceRelations();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesResourceRelations setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypesResponseBodyResourceTypesResourceRelations setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListResourceTypesResponseBodyResourceTypesResourceRelations setRelation(String relation) {
            this.relation = relation;
            return this;
        }
        public String getRelation() {
            return this.relation;
        }

        public ListResourceTypesResponseBodyResourceTypesResourceRelations setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesStatusDefinition extends TeaModel {
        // 状态code
        @NameInMap("code")
        public String code;

        // 描述
        @NameInMap("description")
        public String description;

        // 资源状态分类，必须对代表资源创建后的初始状态进行initial标识。枚举:initial(初始状态)
        @NameInMap("type")
        public String type;

        public static ListResourceTypesResponseBodyResourceTypesStatusDefinition build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesStatusDefinition self = new ListResourceTypesResponseBodyResourceTypesStatusDefinition();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesStatusDefinition setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListResourceTypesResponseBodyResourceTypesStatusDefinition setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypesResponseBodyResourceTypesStatusDefinition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypes extends TeaModel {
        @NameInMap("identityDefinition")
        public ListResourceTypesResponseBodyResourceTypesIdentityDefinition identityDefinition;

        @NameInMap("info")
        public ListResourceTypesResponseBodyResourceTypesInfo info;

        @NameInMap("productCode")
        public String productCode;

        @NameInMap("resourceProperties")
        public String resourceProperties;

        @NameInMap("resourceRelations")
        public java.util.List<ListResourceTypesResponseBodyResourceTypesResourceRelations> resourceRelations;

        @NameInMap("resourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("statusDefinition")
        public java.util.List<ListResourceTypesResponseBodyResourceTypesStatusDefinition> statusDefinition;

        public static ListResourceTypesResponseBodyResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypes self = new ListResourceTypesResponseBodyResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypes setIdentityDefinition(ListResourceTypesResponseBodyResourceTypesIdentityDefinition identityDefinition) {
            this.identityDefinition = identityDefinition;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesIdentityDefinition getIdentityDefinition() {
            return this.identityDefinition;
        }

        public ListResourceTypesResponseBodyResourceTypes setInfo(ListResourceTypesResponseBodyResourceTypesInfo info) {
            this.info = info;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesInfo getInfo() {
            return this.info;
        }

        public ListResourceTypesResponseBodyResourceTypes setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceProperties(String resourceProperties) {
            this.resourceProperties = resourceProperties;
            return this;
        }
        public String getResourceProperties() {
            return this.resourceProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceRelations(java.util.List<ListResourceTypesResponseBodyResourceTypesResourceRelations> resourceRelations) {
            this.resourceRelations = resourceRelations;
            return this;
        }
        public java.util.List<ListResourceTypesResponseBodyResourceTypesResourceRelations> getResourceRelations() {
            return this.resourceRelations;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public ListResourceTypesResponseBodyResourceTypes setStatusDefinition(java.util.List<ListResourceTypesResponseBodyResourceTypesStatusDefinition> statusDefinition) {
            this.statusDefinition = statusDefinition;
            return this;
        }
        public java.util.List<ListResourceTypesResponseBodyResourceTypesStatusDefinition> getStatusDefinition() {
            return this.statusDefinition;
        }

    }

}
