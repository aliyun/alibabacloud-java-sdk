// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByRegionResponseBody extends TeaModel {
    @NameInMap("ComplianceResult")
    public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult complianceResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateResourceComplianceGroupByRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByRegionResponseBody self = new GetAggregateResourceComplianceGroupByRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByRegionResponseBody setComplianceResult(GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public GetAggregateResourceComplianceGroupByRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances extends TeaModel {
        @NameInMap("ComplianceType")
        public String complianceType;

        @NameInMap("Count")
        public Long count;

        public static GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances self = new GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList extends TeaModel {
        @NameInMap("Compliances")
        public java.util.List<GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances> compliances;

        @NameInMap("RegionId")
        public String regionId;

        public static GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList self = new GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList setCompliances(java.util.List<GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultListCompliances> getCompliances() {
            return this.compliances;
        }

        public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult extends TeaModel {
        @NameInMap("ComplianceResultList")
        public java.util.List<GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList> complianceResultList;

        public static GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult self = new GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResult setComplianceResultList(java.util.List<GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList> complianceResultList) {
            this.complianceResultList = complianceResultList;
            return this;
        }
        public java.util.List<GetAggregateResourceComplianceGroupByRegionResponseBodyComplianceResultComplianceResultList> getComplianceResultList() {
            return this.complianceResultList;
        }

    }

}
