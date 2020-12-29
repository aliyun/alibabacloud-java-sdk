// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricOrganizationUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<DescribeFabricOrganizationUsersResponseBodyResult> result;

    public static DescribeFabricOrganizationUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricOrganizationUsersResponseBody self = new DescribeFabricOrganizationUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFabricOrganizationUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFabricOrganizationUsersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeFabricOrganizationUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeFabricOrganizationUsersResponseBody setResult(java.util.List<DescribeFabricOrganizationUsersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeFabricOrganizationUsersResponseBodyResult> getResult() {
        return this.result;
    }

    public static class DescribeFabricOrganizationUsersResponseBodyResult extends TeaModel {
        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("Attrs")
        public String attrs;

        @NameInMap("CallerBid")
        public String callerBid;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("CallerUid")
        public Long callerUid;

        @NameInMap("Username")
        public String username;

        @NameInMap("OrganizationId")
        public String organizationId;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeFabricOrganizationUsersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeFabricOrganizationUsersResponseBodyResult self = new DescribeFabricOrganizationUsersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setAttrs(String attrs) {
            this.attrs = attrs;
            return this;
        }
        public String getAttrs() {
            return this.attrs;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setCallerBid(String callerBid) {
            this.callerBid = callerBid;
            return this;
        }
        public String getCallerBid() {
            return this.callerBid;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setCallerUid(Long callerUid) {
            this.callerUid = callerUid;
            return this;
        }
        public Long getCallerUid() {
            return this.callerUid;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public DescribeFabricOrganizationUsersResponseBodyResult setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
