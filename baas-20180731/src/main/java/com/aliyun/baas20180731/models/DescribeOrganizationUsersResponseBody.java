// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationUsersResponseBody extends TeaModel {
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
    public java.util.List<DescribeOrganizationUsersResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationUsersResponseBody self = new DescribeOrganizationUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationUsersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationUsersResponseBody setResult(java.util.List<DescribeOrganizationUsersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationUsersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationUsersResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a</p>
         */
        @NameInMap("Attrs")
        public String attrs;

        /**
         * <strong>example:</strong>
         * <p>23425</p>
         */
        @NameInMap("CallerBid")
        public String callerBid;

        /**
         * <strong>example:</strong>
         * <p>35645</p>
         */
        @NameInMap("CallerUid")
        public Long callerUid;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
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
         * <p>username</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeOrganizationUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationUsersResponseBodyResult self = new DescribeOrganizationUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationUsersResponseBodyResult setAttrs(String attrs) {
            this.attrs = attrs;
            return this;
        }
        public String getAttrs() {
            return this.attrs;
        }

        public DescribeOrganizationUsersResponseBodyResult setCallerBid(String callerBid) {
            this.callerBid = callerBid;
            return this;
        }
        public String getCallerBid() {
            return this.callerBid;
        }

        public DescribeOrganizationUsersResponseBodyResult setCallerUid(Long callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public Long getCallerUid() {
            return this.callerUid;
        }

        public DescribeOrganizationUsersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeOrganizationUsersResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeOrganizationUsersResponseBodyResult setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DescribeOrganizationUsersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeOrganizationUsersResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeOrganizationUsersResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
