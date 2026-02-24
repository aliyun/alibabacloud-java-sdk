// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetResourceComplianceGroupByResourceTypeResponseBody extends TeaModel {
    @NameInMap("ComplianceResult")
    public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult complianceResult;

    @NameInMap("RequestId")
    public String requestId;

    public static GetResourceComplianceGroupByResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceComplianceGroupByResourceTypeResponseBody self = new GetResourceComplianceGroupByResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceComplianceGroupByResourceTypeResponseBody setComplianceResult(GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult complianceResult) {
        this.complianceResult = complianceResult;
        return this;
    }
    public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult getComplianceResult() {
        return this.complianceResult;
    }

    public GetResourceComplianceGroupByResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances extends TeaModel {
        @NameInMap("ComplianceType")
        public String complianceType;

        @NameInMap("Count")
        public Long count;

        public static GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances self = new GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList extends TeaModel {
        @NameInMap("Compliances")
        public java.util.List<GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances> compliances;

        @NameInMap("ResourceType")
        public String resourceType;

        public static GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList self = new GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList setCompliances(java.util.List<GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances> compliances) {
            this.compliances = compliances;
            return this;
        }
        public java.util.List<GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultListCompliances> getCompliances() {
            return this.compliances;
        }

        public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

    public static class GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult extends TeaModel {
        @NameInMap("ComplianceResultList")
        public java.util.List<GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList> complianceResultList;

        public static GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult build(java.util.Map<String, ?> map) throws Exception {
            GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult self = new GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult();
            return TeaModel.build(map, self);
        }

        public GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResult setComplianceResultList(java.util.List<GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList> complianceResultList) {
            this.complianceResultList = complianceResultList;
            return this;
        }
        public java.util.List<GetResourceComplianceGroupByResourceTypeResponseBodyComplianceResultComplianceResultList> getComplianceResultList() {
            return this.complianceResultList;
        }

    }

}
