// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeCandidateOrganizationsResponseBody extends TeaModel {
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
    public java.util.List<DescribeCandidateOrganizationsResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCandidateOrganizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCandidateOrganizationsResponseBody self = new DescribeCandidateOrganizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCandidateOrganizationsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeCandidateOrganizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCandidateOrganizationsResponseBody setResult(java.util.List<DescribeCandidateOrganizationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeCandidateOrganizationsResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeCandidateOrganizationsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCandidateOrganizationsResponseBodyResult extends TeaModel {
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

        public static DescribeCandidateOrganizationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeCandidateOrganizationsResponseBodyResult self = new DescribeCandidateOrganizationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeCandidateOrganizationsResponseBodyResult setClusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }
        public String getClusterState() {
            return this.clusterState;
        }

        public DescribeCandidateOrganizationsResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeCandidateOrganizationsResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeCandidateOrganizationsResponseBodyResult setServiceState(String serviceState) {
            this.serviceState = serviceState;
            return this;
        }
        public String getServiceState() {
            return this.serviceState;
        }

    }

}
