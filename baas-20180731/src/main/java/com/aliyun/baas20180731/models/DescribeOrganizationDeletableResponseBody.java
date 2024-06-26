// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationDeletableResponseBody extends TeaModel {
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
    public DescribeOrganizationDeletableResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationDeletableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationDeletableResponseBody self = new DescribeOrganizationDeletableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationDeletableResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationDeletableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationDeletableResponseBody setResult(DescribeOrganizationDeletableResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeOrganizationDeletableResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeOrganizationDeletableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationDeletableResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("CodeName")
        public String codeName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Deletable")
        public Boolean deletable;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>orgname</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa2-1eqnj5o5w****</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>zone</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeOrganizationDeletableResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationDeletableResponseBodyResult self = new DescribeOrganizationDeletableResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationDeletableResponseBodyResult setCodeName(String codeName) {
            this.codeName = codeName;
            return this;
        }
        public String getCodeName() {
            return this.codeName;
        }

        public DescribeOrganizationDeletableResponseBodyResult setDeletable(Boolean deletable) {
            this.deletable = deletable;
            return this;
        }
        public Boolean getDeletable() {
            return this.deletable;
        }

        public DescribeOrganizationDeletableResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOrganizationDeletableResponseBodyResult setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeOrganizationDeletableResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationDeletableResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeOrganizationDeletableResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOrganizationDeletableResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribeOrganizationDeletableResponseBodyResult setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
