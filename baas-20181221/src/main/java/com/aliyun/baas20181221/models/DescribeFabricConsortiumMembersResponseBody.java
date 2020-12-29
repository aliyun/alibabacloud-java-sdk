// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricConsortiumMembersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricConsortiumMembersResponseBodyResult> result;

    public static DescribeFabricConsortiumMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricConsortiumMembersResponseBody self = new DescribeFabricConsortiumMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricConsortiumMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricConsortiumMembersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricConsortiumMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricConsortiumMembersResponseBody setResult(java.util.List<DescribeFabricConsortiumMembersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricConsortiumMembersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricConsortiumMembersResponseBodyResult extends TeaModel {
        @NameInMap("Domain")
        public String domain;

        @NameInMap("Description")
        public String description;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("JoinedTime")
        public String joinedTime;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static DescribeFabricConsortiumMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricConsortiumMembersResponseBodyResult self = new DescribeFabricConsortiumMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricConsortiumMembersResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricConsortiumMembersResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeFabricConsortiumMembersResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeFabricConsortiumMembersResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricConsortiumMembersResponseBodyResult setJoinedTime(String joinedTime) {
            this.joinedTime = joinedTime;
            return this;
        }
        public String getJoinedTime() {
            return this.joinedTime;
        }

        public DescribeFabricConsortiumMembersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
