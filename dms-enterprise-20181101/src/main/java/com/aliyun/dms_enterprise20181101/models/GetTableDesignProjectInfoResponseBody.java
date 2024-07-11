// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDesignProjectInfoResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the schema design project.</p>
     */
    @NameInMap("ProjectInfo")
    public GetTableDesignProjectInfoResponseBodyProjectInfo projectInfo;

    /**
     * <p>The request ID. You can use the request ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>48778434-5796-571A-8455-A59146588401</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The alias of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>poc_test</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The database ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11****</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment in which the database instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>product</strong>: production environment.</li>
         * <li><strong>dev</strong>: development environment.</li>
         * <li><strong>pre</strong>: pre-release environment.</li>
         * <li><strong>test</strong>: test environment.</li>
         * <li><strong>sit</strong>: system integration testing (SIT) environment.</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment.</li>
         * <li><strong>pet</strong>: stress testing environment.</li>
         * <li><strong>stag</strong>: staging environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>bk_atc020</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:schema_name@127.0.XX.XX">schema_name@127.0.XX.XX</a></p>
         */
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
        /**
         * <p>The information about the change base database of the schema design ticket.</p>
         */
        @NameInMap("BaseDatabase")
        public GetTableDesignProjectInfoResponseBodyProjectInfoBaseDatabase baseDatabase;

        /**
         * <p>The ID of the user who created the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>71****</p>
         */
        @NameInMap("CreatorId")
        public Long creatorId;

        /**
         * <p>The description of the schema design project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the ticket was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-23 02:57:01</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the ticket was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-23 02:57:01</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ticket ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95****</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The state of the schema design project. Valid values:</p>
         * <ul>
         * <li><strong>DESIGN</strong>: The schema is being designed.</li>
         * <li><strong>PUBLISHED</strong>: The schema is published.</li>
         * <li><strong>CLOSE</strong>: The ticket is closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESIGN</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The name of the schema design project.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
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
