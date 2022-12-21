// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLhSpaceByNameResponseBody extends TeaModel {
    // The error code returned if the request fails.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned if the request fails.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The workspace for data warehouse development.
    @NameInMap("LakehouseSpace")
    public GetLhSpaceByNameResponseBodyLakehouseSpace lakehouseSpace;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
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
        // The ID of the user who creates the workspace.
        @NameInMap("CreatorId")
        public String creatorId;

        // The description of the workspace.
        @NameInMap("Description")
        public String description;

        // The ID of the development database.
        @NameInMap("DevDbId")
        public Integer devDbId;

        // The type of the database. Valid values:
        // 
        // *   **14**: AnalyticDB for MySQL
        // *   **18**: AnalyticDB for PostgreSQL
        @NameInMap("DwDbType")
        public String dwDbType;

        // The ID of the workspace.
        @NameInMap("Id")
        public Long id;

        // Indicates whether the workspace is deleted. Valid values:
        // 
        // *   **true**: The workspace is deleted.
        // *   **false**: The workspace is not deleted.
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        // The mode in which the workspace runs. Valid values:
        // 
        // *   **0**: basic mode
        // *   **1**: standard mode
        @NameInMap("Mode")
        public Integer mode;

        // The ID of the production database.
        @NameInMap("ProdDbId")
        public Integer prodDbId;

        // The configuration of the workspace. Valid values:
        // 
        // *   **skipManualRunCheck**: No security rule check is required in the trial run phase.
        // *   **skipPublishApprove**: No approval is required for publishing and O\&M.
        @NameInMap("SpaceConfig")
        public String spaceConfig;

        // The name of the workspace.
        @NameInMap("SpaceName")
        public String spaceName;

        // The ID of the tenant to which the workspace belongs.
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

        public GetLhSpaceByNameResponseBodyLakehouseSpace setDwDbType(String dwDbType) {
            this.dwDbType = dwDbType;
            return this;
        }
        public String getDwDbType() {
            return this.dwDbType;
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
