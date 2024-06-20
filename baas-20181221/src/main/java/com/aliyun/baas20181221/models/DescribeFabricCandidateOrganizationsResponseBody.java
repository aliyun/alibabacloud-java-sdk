// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricCandidateOrganizationsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeFabricCandidateOrganizationsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("ClusterState")
        public String clusterState;

        /**
         * <strong>example:</strong>
         * <p>peers-1oxw31d04****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>org1</p>
         */
        @NameInMap("OrganizationName")
        public String organizationName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
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
