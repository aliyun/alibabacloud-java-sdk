// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationDeletableResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeFabricOrganizationDeletableResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeFabricOrganizationDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationDeletableResponseBody self = new DescribeFabricOrganizationDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationDeletableResponseBody setResult(DescribeFabricOrganizationDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeFabricOrganizationDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeFabricOrganizationDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeFabricOrganizationDeletableResponseBodyResult extends TeaModel {
        @NameInMap("CodeName")
        public String codeName;

        @NameInMap("Deletable")
        public Boolean deletable;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("OrganizationDescription")
        public String organizationDescription;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("OrganizationName")
        public String organizationName;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("State")
        public String state;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeFabricOrganizationDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationDeletableResponseBodyResult self = new DescribeFabricOrganizationDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setOrganizationDescription(String organizationDescription) {
            this.organizationDescription = organizationDescription;
            return this;
        }
        public String getOrganizationDescription() {
            return this.organizationDescription;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setOrganizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }
        public String getOrganizationName() {
            return this.organizationName;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeFabricOrganizationDeletableResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
