// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeCustomerIssueCategoryResponseBody extends TeaModel {
    @NameInMap("IssueCategoryModelList")
    public java.util.List<IssueCategoryModelList> issueCategoryModelList;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCustomerIssueCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerIssueCategoryResponseBody self = new DescribeCustomerIssueCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerIssueCategoryResponseBody setIssueCategoryModelList(java.util.List<IssueCategoryModelList> issueCategoryModelList) {
        this.issueCategoryModelList = issueCategoryModelList;
        return this;
    }
    public java.util.List<IssueCategoryModelList> getIssueCategoryModelList() {
        return this.issueCategoryModelList;
    }

    public DescribeCustomerIssueCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class IssueCategoryModelList extends TeaModel {
        @NameInMap("IssueCategoryId")
        public Long issueCategoryId;

        @NameInMap("IssueCategoryName")
        public String issueCategoryName;

        @NameInMap("IssueCategoryParentId")
        public Long issueCategoryParentId;

        @NameInMap("Layer")
        public Long layer;

        @NameInMap("MappingTools")
        public String mappingTools;

        @NameInMap("MetricSetId")
        public String metricSetId;

        @NameInMap("ResourceType")
        public String resourceType;

        public static IssueCategoryModelList build(java.util.Map<String, ?> map) throws Exception {
            IssueCategoryModelList self = new IssueCategoryModelList();
            return TeaModel.build(map, self);
        }

        public IssueCategoryModelList setIssueCategoryId(Long issueCategoryId) {
            this.issueCategoryId = issueCategoryId;
            return this;
        }
        public Long getIssueCategoryId() {
            return this.issueCategoryId;
        }

        public IssueCategoryModelList setIssueCategoryName(String issueCategoryName) {
            this.issueCategoryName = issueCategoryName;
            return this;
        }
        public String getIssueCategoryName() {
            return this.issueCategoryName;
        }

        public IssueCategoryModelList setIssueCategoryParentId(Long issueCategoryParentId) {
            this.issueCategoryParentId = issueCategoryParentId;
            return this;
        }
        public Long getIssueCategoryParentId() {
            return this.issueCategoryParentId;
        }

        public IssueCategoryModelList setLayer(Long layer) {
            this.layer = layer;
            return this;
        }
        public Long getLayer() {
            return this.layer;
        }

        public IssueCategoryModelList setMappingTools(String mappingTools) {
            this.mappingTools = mappingTools;
            return this;
        }
        public String getMappingTools() {
            return this.mappingTools;
        }

        public IssueCategoryModelList setMetricSetId(String metricSetId) {
            this.metricSetId = metricSetId;
            return this;
        }
        public String getMetricSetId() {
            return this.metricSetId;
        }

        public IssueCategoryModelList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
