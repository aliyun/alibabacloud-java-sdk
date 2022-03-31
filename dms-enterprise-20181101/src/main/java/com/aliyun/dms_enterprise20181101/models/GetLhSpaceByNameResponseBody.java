// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLhSpaceByNameResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LakehouseSpace")
    public GetLhSpaceByNameResponseBodyLakehouseSpace lakehouseSpace;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetLhSpaceByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLhSpaceByNameResponseBody self = new GetLhSpaceByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLhSpaceByNameResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLhSpaceByNameResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLhSpaceByNameResponseBody setLakehouseSpace(GetLhSpaceByNameResponseBodyLakehouseSpace lakehouseSpace) {
        this.lakehouseSpace = lakehouseSpace;
        return this;
    }
    public GetLhSpaceByNameResponseBodyLakehouseSpace getLakehouseSpace() {
        return this.lakehouseSpace;
    }

    public GetLhSpaceByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLhSpaceByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLhSpaceByNameResponseBodyLakehouseSpace extends TeaModel {
        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("DevDbId")
        public Integer devDbId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Mode")
        public Integer mode;

        @NameInMap("ProdDbId")
        public Integer prodDbId;

        @NameInMap("SpaceConfig")
        public String spaceConfig;

        @NameInMap("SpaceName")
        public String spaceName;

        @NameInMap("TenantId")
        public String tenantId;

        public static GetLhSpaceByNameResponseBodyLakehouseSpace build(java.util.Map<String, ?> map) throws Exception {
            GetLhSpaceByNameResponseBodyLakehouseSpace self = new GetLhSpaceByNameResponseBodyLakehouseSpace();
            return TeaModel.build(map, self);
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setDevDbId(Integer devDbId) {
            this.devDbId = devDbId;
            return this;
        }
        public Integer getDevDbId() {
            return this.devDbId;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setProdDbId(Integer prodDbId) {
            this.prodDbId = prodDbId;
            return this;
        }
        public Integer getProdDbId() {
            return this.prodDbId;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setSpaceConfig(String spaceConfig) {
            this.spaceConfig = spaceConfig;
            return this;
        }
        public String getSpaceConfig() {
            return this.spaceConfig;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setSpaceName(String spaceName) {
            this.spaceName = spaceName;
            return this;
        }
        public String getSpaceName() {
            return this.spaceName;
        }

        public GetLhSpaceByNameResponseBodyLakehouseSpace setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
