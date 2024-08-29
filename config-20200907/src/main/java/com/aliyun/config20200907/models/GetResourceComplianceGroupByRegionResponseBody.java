// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceGroupByRegionResponseBody extends TeaModel {
    /**
     * <p>The queried evaluation results.</p>
     */
    @NameInMap("ComplianceResult")
    public GetResourceComplianceGroupByRegionResponseBodyComplianceResult complianceResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0FDF8006-34A0-5334-8C79-48F64EAB34F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceComplianceGroupByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceGroupByRegionResponseBody self = new GetResourceComplianceGroupByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceGroupByRegionResponseBody setComplianceResult(GetResourceComplianceGroupByRegionResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public GetResourceComplianceGroupByRegionResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public GetResourceComplianceGroupByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances extends TeaModel {
        /**
         * <p>The evaluation result. Valid values:</p>
         * <ul>
         * <li>COMPLIANT: The resources are evaluated as compliant.</li>
         * <li>NON_COMPLIANT: The resources are evaluated as non-compliant.</li>
         * <li>NOT_APPLICABLE: The rule does not apply to the resources.</li>
         * <li>INSUFFICIENT_DATA: No resource data is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The total number of evaluation results.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        public static GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances self = new GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList extends TeaModel {
        /**
         * <p>The queried evaluation results.</p>
         */
        @NameInMap("Compliances")
        public java.util.List<GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances> compliances;

        /**
         * <p>The region ID of the evaluated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList self = new GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList setCompliances(java.util.List<GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances> getCompliances() {
            return this.compliances;
        }

        public GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetResourceComplianceGroupByRegionResponseBodyComplianceResult extends TeaModel {
        /**
         * <p>The evaluation results grouped by region.</p>
         */
        @NameInMap("ComplianceResultList")
        public java.util.List<GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList> complianceResultList;

        public static GetResourceComplianceGroupByRegionResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceGroupByRegionResponseBodyComplianceResult self = new GetResourceComplianceGroupByRegionResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceGroupByRegionResponseBodyComplianceResult setComplianceResultList(java.util.List<GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList> complianceResultList) {
            this.complianceResultList = complianceResultList;
            return this;
        }
        public java.util.List<GetResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList> getComplianceResultList() {
            return this.complianceResultList;
        }

    }

}
