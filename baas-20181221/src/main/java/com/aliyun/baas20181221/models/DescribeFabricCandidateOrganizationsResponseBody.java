// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricCandidateOrganizationsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricCandidateOrganizationsResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricCandidateOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricCandidateOrganizationsResponseBody self = new DescribeFabricCandidateOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricCandidateOrganizationsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricCandidateOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricCandidateOrganizationsResponseBody setResult(java.util.List<DescribeFabricCandidateOrganizationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricCandidateOrganizationsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeFabricCandidateOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricCandidateOrganizationsResponseBodyResult extends TeaModel {
        @NameInMap("ClusterState")
        public String clusterState;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("ServiceState")
        public String serviceState;

        public static DescribeFabricCandidateOrganizationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricCandidateOrganizationsResponseBodyResult self = new DescribeFabricCandidateOrganizationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricCandidateOrganizationsResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public DescribeFabricCandidateOrganizationsResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricCandidateOrganizationsResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricCandidateOrganizationsResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

    }

}
