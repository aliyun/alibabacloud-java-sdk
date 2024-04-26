// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDesignProjectInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ProjectInfo")
    public GetTableDesignProjectInfoResponseBodyProjectInfo projectInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetTableDesignProjectInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableDesignProjectInfoResponseBody self = new GetTableDesignProjectInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableDesignProjectInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableDesignProjectInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableDesignProjectInfoResponseBody setProjectInfo(GetTableDesignProjectInfoResponseBodyProjectInfo projectInfo) {
        this.projectInfo = projectInfo;
        return this;
    }
    public GetTableDesignProjectInfoResponseBodyProjectInfo getProjectInfo() {
        return this.projectInfo;
    }

    public GetTableDesignProjectInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableDesignProjectInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DbId")
        public Integer dbId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SearchName")
        public String searchName;

        public static GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase self = new GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase();
            return TeaModel.build(map, self);
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class GetTableDesignProjectInfoResponseBodyProjectInfo extends TeaModel {
        @NameInMap("BaseDatabase")
        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase baseDatabase;

        @NameInMap("CreatorId")
        public Long creatorId;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Title")
        public String title;

        public static GetTableDesignProjectInfoResponseBodyProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetTableDesignProjectInfoResponseBodyProjectInfo self = new GetTableDesignProjectInfoResponseBodyProjectInfo();
            return TeaModel.build(map, self);
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setBaseDatabase(GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase baseDatabase) {
            this.baseDatabase = baseDatabase;
            return this;
        }
        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase getBaseDatabase() {
            return this.baseDatabase;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setCreatorId(Long creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public Long getCreatorId() {
            return this.creatorId;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTableDesignProjectInfoResponseBodyProjectInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
