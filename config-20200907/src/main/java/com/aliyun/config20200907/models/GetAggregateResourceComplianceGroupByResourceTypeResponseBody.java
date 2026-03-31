// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The queried evaluation results.</p>
     */
    @NameInMap("ComplianceResult")
    public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult complianceResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0CE6AEE1-B3D8-530A-9302-6606B20503BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateResourceComplianceGroupByResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByResourceTypeResponseBody self = new GetAggregateResourceComplianceGroupByResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponseBody setComplianceResult(GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances extends TeaModel {
        /**
         * <p>The evaluation result. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resource is evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resource is evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to the resource.</li>
         * <li>INSUFFICIENT_DATA: No data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The number of statistical results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        public static GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances self = new GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList extends TeaModel {
        /**
         * <p>The queried evaluation results.</p>
         */
        @NameInMap("Compliances")
        public java.util.List<GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances> compliances;

        /**
         * <p>The type of the evaluated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        public static GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList self = new GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList setCompliances(java.util.List<GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances> getCompliances() {
            return this.compliances;
        }

        public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult extends TeaModel {
        /**
         * <p>The evaluation results grouped by resource type.</p>
         */
        @NameInMap("ComplianceResultList")
        public java.util.List<GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList> complianceResultList;

        public static GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult self = new GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResult setComplianceResultList(java.util.List<GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList> complianceResultList) {
            this.complianceResultList = complianceResultList;
            return this;
        }
        public java.util.List<GetAggregateResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList> getComplianceResultList() {
            return this.complianceResultList;
        }

    }

}
