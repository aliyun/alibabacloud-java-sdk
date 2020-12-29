// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationMembersResponseBodyResult> result;

    public static DescribeFabricOrganizationMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationMembersResponseBody self = new DescribeFabricOrganizationMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationMembersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrganizationMembersResponseBody setResult(java.util.List<DescribeFabricOrganizationMembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationMembersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricOrganizationMembersResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("Description")
        public String description;

        @NameInMap("State")
        public String state;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("JoinedTime")
        public String joinedTime;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static DescribeFabricOrganizationMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationMembersResponseBodyResult self = new DescribeFabricOrganizationMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setJoinedTime(String joinedTime) {
            this.joinedTime = joinedTime;
            return this;
        }
        public String getJoinedTime() {
            return this.joinedTime;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeFabricOrganizationMembersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
