// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLhSpaceByNameResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The workspace for data warehouse development.</p>
     */
    @NameInMap("LakehouseSpace")
    public GetLhSpaceByNameResponseBodyLakehouseSpace lakehouseSpace;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
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
        /**
         * <p>The ID of the user who creates the workspace.</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The description of the workspace.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the development database.</p>
         */
        @NameInMap("DevDbId")
        public Integer devDbId;

        /**
         * <p>The type of the database. Valid values:</p>
         * <br>
         * <p>*   **14**: AnalyticDB for MySQL</p>
         * <p>*   **18**: AnalyticDB for PostgreSQL</p>
         */
        @NameInMap("DwDbType")
        public String dwDbType;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the workspace is deleted. Valid values:</p>
         * <br>
         * <p>*   **true**: The workspace is deleted.</p>
         * <p>*   **false**: The workspace is not deleted.</p>
         */
        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        /**
         * <p>The mode in which the workspace runs. Valid values:</p>
         * <br>
         * <p>*   **0**: basic mode</p>
         * <p>*   **1**: standard mode</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The ID of the production database.</p>
         */
        @NameInMap("ProdDbId")
        public Integer prodDbId;

        /**
         * <p>The configuration of the workspace. Valid values:</p>
         * <br>
         * <p>*   **skipManualRunCheck**: No security rule check is required in the trial run phase.</p>
         * <p>*   **skipPublishApprove**: No approval is required for publishing and O\&M.</p>
         */
        @NameInMap("SpaceConfig")
        public String spaceConfig;

        /**
         * <p>The name of the workspace.</p>
         */
        @NameInMap("SpaceName")
        public String spaceName;

        /**
         * <p>The ID of the tenant to which the workspace belongs.</p>
         */
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
