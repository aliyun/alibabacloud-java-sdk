// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class QueryOrganizationDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryOrganizationDeletableResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOrganizationDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationDeletableResponseBody self = new QueryOrganizationDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public QueryOrganizationDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrganizationDeletableResponseBody setResult(QueryOrganizationDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryOrganizationDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public QueryOrganizationDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOrganizationDeletableResponseBodyResult extends TeaModel {
        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("Description")
        public String description;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Name")
        public String name;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryOrganizationDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryOrganizationDeletableResponseBodyResult self = new QueryOrganizationDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryOrganizationDeletableResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public QueryOrganizationDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public QueryOrganizationDeletableResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryOrganizationDeletableResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public QueryOrganizationDeletableResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryOrganizationDeletableResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public QueryOrganizationDeletableResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryOrganizationDeletableResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryOrganizationDeletableResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
