// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataArchiveOrderDetailResponseBody extends TeaModel {
    /**
     * <p>The details of data archiving tickets.</p>
     */
    @NameInMap("DataArchiveOrderDetail")
    public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail dataArchiveOrderDetail;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>User [19929582****] not exist</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request, which is used to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4161CE36-28DF-5191-8A6F-A17076A0B124</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Tracks service requests.</p>
     * 
     * <strong>example:</strong>
     * <p>0a06e1e316757357507896067d3780</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static GetDataArchiveOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataArchiveOrderDetailResponseBody self = new GetDataArchiveOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataArchiveOrderDetailResponseBody setDataArchiveOrderDetail(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail dataArchiveOrderDetail) {
        this.dataArchiveOrderDetail = dataArchiveOrderDetail;
        return this;
    }
    public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail getDataArchiveOrderDetail() {
        return this.dataArchiveOrderDetail;
    }

    public GetDataArchiveOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataArchiveOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataArchiveOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataArchiveOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDataArchiveOrderDetailResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo extends TeaModel {
        /**
         * <p>The ID of the user who created the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>59****</p>
         */
        @NameInMap("CreatorId")
        public String creatorId;

        /**
         * <p>The start time for scheduling. The task flow is not scheduled before this point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>1970-01-01</p>
         */
        @NameInMap("CronBeginDate")
        public String cronBeginDate;

        /**
         * <p>The end time for scheduling. The task flow is not scheduled after this point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>9999-01-01</p>
         */
        @NameInMap("CronEndDate")
        public String cronEndDate;

        /**
         * <p>Indicates whether the archiving task is a scheduled task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CronTrigger")
        public Boolean cronTrigger;

        /**
         * <p>Indicates whether the task is used to develop warehouses.</p>
         * <blockquote>
         * <p> This field is a retained field that is not in use.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DWDevelop")
        public Boolean DWDevelop;

        /**
         * <p>The name of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>data-archive-9099197</p>
         */
        @NameInMap("DagName")
        public String dagName;

        /**
         * <p>The ID of the owner of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>13****</p>
         */
        @NameInMap("DagOwnerId")
        public String dagOwnerId;

        /**
         * <p>The ID of the deployment record.</p>
         * 
         * <strong>example:</strong>
         * <p>93***</p>
         */
        @NameInMap("DeployId")
        public Long deployId;

        /**
         * <p>The description of the workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>order id:9099197</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the editable workflow version.</p>
         * 
         * <strong>example:</strong>
         * <p>24***</p>
         */
        @NameInMap("EditDagId")
        public Long editDagId;

        /**
         * <p>The time when the workflow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-15 16:00:48</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the workflow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-06-15 16:00:48</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>24***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Indicates whether the workflow is public. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not public.</li>
         * <li><strong>1</strong>: public.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsPublic")
        public Long isPublic;

        /**
         * <p>Indicates whether the task is a historical task. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Legacy")
        public Boolean legacy;

        /**
         * <p>Indicates whether the task was created by the system. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("System")
        public Boolean system;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5***</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>Indicates whether the workflow is triggered to run once. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("TriggerOnce")
        public Boolean triggerOnce;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCronBeginDate(String cronBeginDate) {
            this.cronBeginDate = cronBeginDate;
            return this;
        }
        public String getCronBeginDate() {
            return this.cronBeginDate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCronEndDate(String cronEndDate) {
            this.cronEndDate = cronEndDate;
            return this;
        }
        public String getCronEndDate() {
            return this.cronEndDate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setCronTrigger(Boolean cronTrigger) {
            this.cronTrigger = cronTrigger;
            return this;
        }
        public Boolean getCronTrigger() {
            return this.cronTrigger;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDWDevelop(Boolean DWDevelop) {
            this.DWDevelop = DWDevelop;
            return this;
        }
        public Boolean getDWDevelop() {
            return this.DWDevelop;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDagName(String dagName) {
            this.dagName = dagName;
            return this;
        }
        public String getDagName() {
            return this.dagName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDagOwnerId(String dagOwnerId) {
            this.dagOwnerId = dagOwnerId;
            return this;
        }
        public String getDagOwnerId() {
            return this.dagOwnerId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDeployId(Long deployId) {
            this.deployId = deployId;
            return this;
        }
        public Long getDeployId() {
            return this.deployId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setEditDagId(Long editDagId) {
            this.editDagId = editDagId;
            return this;
        }
        public Long getEditDagId() {
            return this.editDagId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setIsPublic(Long isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Long getIsPublic() {
            return this.isPublic;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setLegacy(Boolean legacy) {
            this.legacy = legacy;
            return this;
        }
        public Boolean getLegacy() {
            return this.legacy;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setSystem(Boolean system) {
            this.system = system;
            return this;
        }
        public Boolean getSystem() {
            return this.system;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo setTriggerOnce(Boolean triggerOnce) {
            this.triggerOnce = triggerOnce;
            return this;
        }
        public Boolean getTriggerOnce() {
            return this.triggerOnce;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup extends TeaModel {
        /**
         * <p>The type of the instance engine. For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The description of the security rule set.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_mysql default</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the instance is managed in Flexible Management or Stable Change mode. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("FreeOrStable")
        public Boolean freeOrStable;

        /**
         * <p>The time when the security rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-24 14:12:32</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the security rule was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-25 14:12:32</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The type of the control mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>COMMON</strong>: The instance is managed in Security Collaboration mode.</li>
         * <li><strong>NONE_CONTROL</strong>: The instance is managed in Flexible Management mode.</li>
         * <li><strong>STABLE</strong>: The instance is managed in Stable Change mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMMON</p>
         */
        @NameInMap("GroupMode")
        public String groupMode;

        /**
         * <p>The name of the security rule that corresponds to the control mode.</p>
         * 
         * <strong>example:</strong>
         * <p>adb_mysql default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The ID of the security rule.</p>
         * 
         * <strong>example:</strong>
         * <p>24***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The user ID of the last modified security rule.</p>
         * 
         * <strong>example:</strong>
         * <p>12****</p>
         */
        @NameInMap("LastMenderId")
        public Long lastMenderId;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setFreeOrStable(Boolean freeOrStable) {
            this.freeOrStable = freeOrStable;
            return this;
        }
        public Boolean getFreeOrStable() {
            return this.freeOrStable;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGroupMode(String groupMode) {
            this.groupMode = groupMode;
            return this;
        }
        public String getGroupMode() {
            return this.groupMode;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup setLastMenderId(Long lastMenderId) {
            this.lastMenderId = lastMenderId;
            return this;
        }
        public Long getLastMenderId() {
            return this.lastMenderId;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo extends TeaModel {
        /**
         * <p>The alias of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testAccDMSEnterpriseLogicDatabase853****</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The timeout period of queries on the database.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("AlterTimeout")
        public Long alterTimeout;

        /**
         * <p>Indicates whether access control is enabled for data assets. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AssetControl")
        public Boolean assetControl;

        /**
         * <p>The name of the instance in the instance list.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>Indicates whether the instance is added to the DMS whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>whitelist_done</p>
         */
        @NameInMap("ClusterNode")
        public String clusterNode;

        /**
         * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation to query the ID of the database.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the ID of a physical database or the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the ID of a logical database.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>348****</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <p>The type of the database. For information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The ID of the database administrator (DBA) of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16****</p>
         */
        @NameInMap("DbaId")
        public Long dbaId;

        /**
         * <p>The nickname of the DBA of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>DBA</p>
         */
        @NameInMap("DbaName")
        public String dbaName;

        /**
         * <p>The complete endpoint of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test@rm-2ze756u8837****.mysql.rds.aliyuncs.com:3306 [test]</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The encoding format of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li><strong>product</strong>: production environment</li>
         * <li><strong>dev</strong>: development environment</li>
         * <li><strong>pre</strong>: staging environment</li>
         * <li><strong>test</strong>: test environment</li>
         * <li><strong>sit</strong>: system integration testing (SIT) environment</li>
         * <li><strong>uat</strong>: user acceptance testing (UAT) environment</li>
         * <li><strong>pet</strong>: stress testing environment</li>
         * <li><strong>stag</strong>: STAG environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the instance needs special attention. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Follow")
        public Boolean follow;

        /**
         * <p>The endpoint that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze756u8837****.mysql.rds.aliyuncs.com</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The region in which the database instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Idc")
        public String idc;

        /**
         * <p>The name of the region in which the database instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("IdcTitle")
        public String idcTitle;

        /**
         * <p>The ID of the instance to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>175****</p>
         */
        @NameInMap("InstanceId")
        public Long instanceId;

        /**
         * <p>The source of the database instance.Valid values:</p>
         * <ul>
         * <li><strong>RDS</strong>: an ApsaraDB RDS instance.</li>
         * <li><strong>ECS_OWN</strong>: a self-managed database deployed on an Elastic Compute Service (ECS) instance.</li>
         * <li><strong>PUBLIC_OWN</strong>: a self-managed database instance that is connected over the Internet.</li>
         * <li><strong>VPC_ID</strong>: a self-managed database instance in a virtual private cloud (VPC) that is connected over Express Connect circuits.</li>
         * <li><strong>GATEWAY</strong>: a database instance connected by using a database gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("InstanceSource")
        public String instanceSource;

        /**
         * <p>The time when the database information was last obtained.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14 18:34:45</p>
         */
        @NameInMap("LastSyncTime")
        public String lastSyncTime;

        /**
         * <p>The instance level.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Indicates whether the database is logical. Valid values:</p>
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
         * <p>The IDs of the owners of the databases, which are stored as an array. You can call the <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> or <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> operation to query the IDs of the owners.</p>
         * <blockquote>
         * <p> The value of OwnerIds is the same as the value of UserId</p>
         * </blockquote>
         */
        @NameInMap("OwnerIds")
        public java.util.List<Long> ownerIds;

        /**
         * <p>The usernames of the database owners.</p>
         */
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        /**
         * <p>The port that is used to connect to the database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test@rm-2ze756u8837****.mysql.rds.aliyuncs.com:3306 [test]</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The details of the control mode of the instance.</p>
         */
        @NameInMap("StandardGroup")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup standardGroup;

        /**
         * <p>The status of the database. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The database is running as expected.</li>
         * <li><strong>DISABLE</strong>: The database is disabled.</li>
         * <li><strong>OFFLINE</strong>: The database is unpublished.</li>
         * <li><strong>NOT_EXIST</strong>: The database does not exist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The number of tables.</p>
         * 
         * <strong>example:</strong>
         * <p>201</p>
         */
        @NameInMap("TableCount")
        public Long tableCount;

        /**
         * <p>The name of TNS.</p>
         * 
         * <strong>example:</strong>
         * <p>TNS_4010</p>
         */
        @NameInMap("TnsName")
        public String tnsName;

        /**
         * <p>The unit type.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("UnitType")
        public String unitType;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setAlterTimeout(Long alterTimeout) {
            this.alterTimeout = alterTimeout;
            return this;
        }
        public Long getAlterTimeout() {
            return this.alterTimeout;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setAssetControl(Boolean assetControl) {
            this.assetControl = assetControl;
            return this;
        }
        public Boolean getAssetControl() {
            return this.assetControl;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setClusterNode(String clusterNode) {
            this.clusterNode = clusterNode;
            return this;
        }
        public String getClusterNode() {
            return this.clusterNode;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbaId(Long dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public Long getDbaId() {
            return this.dbaId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setFollow(Boolean follow) {
            this.follow = follow;
            return this;
        }
        public Boolean getFollow() {
            return this.follow;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setIdc(String idc) {
            this.idc = idc;
            return this;
        }
        public String getIdc() {
            return this.idc;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setIdcTitle(String idcTitle) {
            this.idcTitle = idcTitle;
            return this;
        }
        public String getIdcTitle() {
            return this.idcTitle;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setInstanceSource(String instanceSource) {
            this.instanceSource = instanceSource;
            return this;
        }
        public String getInstanceSource() {
            return this.instanceSource;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = lastSyncTime;
            return this;
        }
        public String getLastSyncTime() {
            return this.lastSyncTime;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setOwnerIds(java.util.List<Long> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setStandardGroup(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup standardGroup) {
            this.standardGroup = standardGroup;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfoStandardGroup getStandardGroup() {
            return this.standardGroup;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setTableCount(Long tableCount) {
            this.tableCount = tableCount;
            return this;
        }
        public Long getTableCount() {
            return this.tableCount;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setTnsName(String tnsName) {
            this.tnsName = tnsName;
            return this;
        }
        public String getTnsName() {
            return this.tnsName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances extends TeaModel {
        /**
         * <p>The business time of the task flow. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14 16:00:57</p>
         */
        @NameInMap("BusinessTime")
        public String businessTime;

        /**
         * <p>The ID of the task. You can call the <a href="https://help.aliyun.com/document_detail/424565.html">ListTaskFlow</a> or <a href="https://help.aliyun.com/document_detail/426672.html">ListLhTaskFlowAndScenario</a> operation to query the task flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>37***</p>
         */
        @NameInMap("DagId")
        public Long dagId;

        /**
         * <p>The end time of the task flow. The time is in the yyyy-MM-DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-04 15:14:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the task flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14 16:00:57</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the task flow was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-14 16:00:57</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the historical task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>32***</p>
         */
        @NameInMap("HistoryDagId")
        public Long historyDagId;

        /**
         * <p>The instance ID of the running task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>24***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The running scenario of the last task flow.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;nodes&quot;: [
         *             48**
         *       ],
         *       &quot;edges&quot;: {}
         * }</p>
         */
        @NameInMap("LastRunningContext")
        public String lastRunningContext;

        /**
         * <p>The running details of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-15 16:37:48[GMT+08:00] INFO - Resource Control is active!\n2023-05-15 16:37:48[GMT+08:00] INFO - Starting job j_4834 at Mon May 15 16:37:48 CST 2023</p>
         */
        @NameInMap("Msg")
        public String msg;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: waiting for execution.</li>
         * <li><strong>1</strong>: running.</li>
         * <li><strong>2</strong>: suspended.</li>
         * <li><strong>3</strong>: failed.</li>
         * <li><strong>4</strong>: successful.</li>
         * <li><strong>5</strong>: complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5***</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The mode in which the task flow was triggered. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task flow was triggered based on a schedule.</li>
         * <li><strong>1</strong>: The task flow was manually triggered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TriggerType")
        public Long triggerType;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setBusinessTime(String businessTime) {
            this.businessTime = businessTime;
            return this;
        }
        public String getBusinessTime() {
            return this.businessTime;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setDagId(Long dagId) {
            this.dagId = dagId;
            return this;
        }
        public Long getDagId() {
            return this.dagId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setHistoryDagId(Long historyDagId) {
            this.historyDagId = historyDagId;
            return this;
        }
        public Long getHistoryDagId() {
            return this.historyDagId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setLastRunningContext(String lastRunningContext) {
            this.lastRunningContext = lastRunningContext;
            return this;
        }
        public String getLastRunningContext() {
            return this.lastRunningContext;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setTriggerType(Long triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Long getTriggerType() {
            return this.triggerType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult extends TeaModel {
        /**
         * <p>The type of scheduled triggering.</p>
         * 
         * <strong>example:</strong>
         * <p>NOT_SET</p>
         */
        @NameInMap("CronFireType")
        public String cronFireType;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult setCronFireType(String cronFireType) {
            this.cronFireType = cronFireType;
            return this;
        }
        public String getCronFireType() {
            return this.cronFireType;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData extends TeaModel {
        /**
         * <p>The information about the workflow.</p>
         */
        @NameInMap("DagInfo")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo dagInfo;

        /**
         * <p>The database information related to data archiving tickets.</p>
         */
        @NameInMap("DbBaseInfo")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo dbBaseInfo;

        /**
         * <p>The total number of archiving tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InstanceTotal")
        public Long instanceTotal;

        /**
         * <p>The list of archiving tasks.</p>
         */
        @NameInMap("Instances")
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances> instances;

        /**
         * <p>The time when the next task is triggered.</p>
         */
        @NameInMap("NextFireTimeResult")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult nextFireTimeResult;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The name of the temporary table that is generated by the archiving task (indicated by the archiving task ID).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;803***&quot;: [
         *             &quot;tmp_dms_21321_20230704144336_temp_test_check&quot;
         *       ]
         * }</p>
         */
        @NameInMap("TempTableNameMap")
        public java.util.Map<String, ?> tempTableNameMap;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setDagInfo(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo dagInfo) {
            this.dagInfo = dagInfo;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDagInfo getDagInfo() {
            return this.dagInfo;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setDbBaseInfo(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo dbBaseInfo) {
            this.dbBaseInfo = dbBaseInfo;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataDbBaseInfo getDbBaseInfo() {
            return this.dbBaseInfo;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setInstanceTotal(Long instanceTotal) {
            this.instanceTotal = instanceTotal;
            return this;
        }
        public Long getInstanceTotal() {
            return this.instanceTotal;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setInstances(java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances> instances) {
            this.instances = instances;
            return this;
        }
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataInstances> getInstances() {
            return this.instances;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setNextFireTimeResult(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult nextFireTimeResult) {
            this.nextFireTimeResult = nextFireTimeResult;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraDataNextFireTimeResult getNextFireTimeResult() {
            return this.nextFireTimeResult;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData setTempTableNameMap(java.util.Map<String, ?> tempTableNameMap) {
            this.tempTableNameMap = tempTableNameMap;
            return this;
        }
        public java.util.Map<String, ?> getTempTableNameMap() {
            return this.tempTableNameMap;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes extends TeaModel {
        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>tm_insured_cb</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>id&lt;1000 or gmt_create&lt;\&quot;2023-05-14 16:00:57\&quot;</p>
         */
        @NameInMap("TableWhere")
        public String tableWhere;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes setTableWhere(String tableWhere) {
            this.tableWhere = tableWhere;
            return this;
        }
        public String getTableWhere() {
            return this.tableWhere;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam extends TeaModel {
        /**
         * <p>The type of the archiving destination.</p>
         * 
         * <strong>example:</strong>
         * <p>inner_oss</p>
         */
        @NameInMap("ArchiveMethod")
        public String archiveMethod;

        /**
         * <p>The schema of the database and table to be archived.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DbSchema")
        public String dbSchema;

        /**
         * <p>Indicates whether the database is logical.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The post behavior of archiving.</p>
         */
        @NameInMap("OrderAfter")
        public java.util.List<String> orderAfter;

        /**
         * <p>The running method, which indicates whether to run the task immediately or at a specific point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>now</p>
         */
        @NameInMap("RunMethod")
        public String runMethod;

        /**
         * <p>The ID of the source database.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        @NameInMap("SourceDatabaseId")
        public Long sourceDatabaseId;

        /**
         * <p>The list of the archived tables and the filter conditions.</p>
         */
        @NameInMap("TableIncludes")
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes> tableIncludes;

        /**
         * <p>The mapping of schemas.</p>
         */
        @NameInMap("TableMapping")
        public java.util.List<String> tableMapping;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The time variable defined for scheduled archiving.</p>
         */
        @NameInMap("Variables")
        public java.util.List<String> variables;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setArchiveMethod(String archiveMethod) {
            this.archiveMethod = archiveMethod;
            return this;
        }
        public String getArchiveMethod() {
            return this.archiveMethod;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setDbSchema(String dbSchema) {
            this.dbSchema = dbSchema;
            return this;
        }
        public String getDbSchema() {
            return this.dbSchema;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setOrderAfter(java.util.List<String> orderAfter) {
            this.orderAfter = orderAfter;
            return this;
        }
        public java.util.List<String> getOrderAfter() {
            return this.orderAfter;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setRunMethod(String runMethod) {
            this.runMethod = runMethod;
            return this;
        }
        public String getRunMethod() {
            return this.runMethod;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setSourceDatabaseId(Long sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }
        public Long getSourceDatabaseId() {
            return this.sourceDatabaseId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setTableIncludes(java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes> tableIncludes) {
            this.tableIncludes = tableIncludes;
            return this;
        }
        public java.util.List<GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParamTableIncludes> getTableIncludes() {
            return this.tableIncludes;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setTableMapping(java.util.List<String> tableMapping) {
            this.tableMapping = tableMapping;
            return this;
        }
        public java.util.List<String> getTableMapping() {
            return this.tableMapping;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam setVariables(java.util.List<String> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<String> getVariables() {
            return this.variables;
        }

    }

    public static class GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail extends TeaModel {
        /**
         * <p>The description of the data archiving tickets.</p>
         * 
         * <strong>example:</strong>
         * <p>Archiving of test results</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The user who submitted the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>dmstest</p>
         */
        @NameInMap("Committer")
        public String committer;

        /**
         * <p>The ID of the user who submitted the ticket. The ID is a user ID and not the ID of an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>26***</p>
         */
        @NameInMap("CommitterId")
        public Long committerId;

        /**
         * <p>The time when the ticket was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-15 16:00:48</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the ticket was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-23 16:00:48</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of data archiving tickets.</p>
         * 
         * <strong>example:</strong>
         * <p>868****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The additional information about the ticket.</p>
         */
        @NameInMap("PluginExtraData")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData pluginExtraData;

        /**
         * <p>The ticket creation parameter. The value is a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/429109.html">PluginType parameter</a>.</p>
         */
        @NameInMap("PluginParam")
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam pluginParam;

        /**
         * <p>The plug-in type that corresponds to the type of the ticket. The plug-in type for data archiving is DATA_ARCHIVE. For more information, see <a href="https://help.aliyun.com/document_detail/429109.html">PluginType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_ARCHIVE</p>
         */
        @NameInMap("PluginType")
        public String pluginType;

        /**
         * <p>The user IDs related to the ticket.</p>
         */
        @NameInMap("RelatedUserList")
        public java.util.List<Long> relatedUserList;

        /**
         * <p>The nicknames of the users that are related to the ticket.</p>
         */
        @NameInMap("RelatedUserNickList")
        public java.util.List<String> relatedUserNickList;

        /**
         * <p>The status code of the ticket. Valid values:</p>
         * <ul>
         * <li><strong>new</strong>: newly created.</li>
         * <li><strong>toaudit</strong>: being reviewed.</li>
         * <li><strong>Approved</strong>: approved.</li>
         * <li><strong>reject</strong>: rejected.</li>
         * <li><strong>processing</strong>: being executed.</li>
         * <li><strong>Success</strong>: successful.</li>
         * <li><strong>closed</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>processing</p>
         */
        @NameInMap("StatusCode")
        public String statusCode;

        /**
         * <p>The status description of the ticket.</p>
         * 
         * <strong>example:</strong>
         * <p>a ticket task is being executed.</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        /**
         * <p>The ID of the approval process. You can call the <a href="https://help.aliyun.com/document_detail/144642.html">GetOrderBaseInfo</a> operation to obtain the ID of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>29****</p>
         */
        @NameInMap("WorkflowInstanceId")
        public Long workflowInstanceId;

        /**
         * <p>The description of the approval process.</p>
         * 
         * <strong>example:</strong>
         * <p>approved</p>
         */
        @NameInMap("WorkflowStatusDesc")
        public String workflowStatusDesc;

        public static GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail self = new GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setCommitter(String committer) {
            this.committer = committer;
            return this;
        }
        public String getCommitter() {
            return this.committer;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setCommitterId(Long committerId) {
            this.committerId = committerId;
            return this;
        }
        public Long getCommitterId() {
            return this.committerId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setPluginExtraData(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData pluginExtraData) {
            this.pluginExtraData = pluginExtraData;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginExtraData getPluginExtraData() {
            return this.pluginExtraData;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setPluginParam(GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam pluginParam) {
            this.pluginParam = pluginParam;
            return this;
        }
        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetailPluginParam getPluginParam() {
            return this.pluginParam;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setRelatedUserList(java.util.List<Long> relatedUserList) {
            this.relatedUserList = relatedUserList;
            return this;
        }
        public java.util.List<Long> getRelatedUserList() {
            return this.relatedUserList;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setRelatedUserNickList(java.util.List<String> relatedUserNickList) {
            this.relatedUserNickList = relatedUserNickList;
            return this;
        }
        public java.util.List<String> getRelatedUserNickList() {
            return this.relatedUserNickList;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setStatusCode(String statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public String getStatusCode() {
            return this.statusCode;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setWorkflowInstanceId(Long workflowInstanceId) {
            this.workflowInstanceId = workflowInstanceId;
            return this;
        }
        public Long getWorkflowInstanceId() {
            return this.workflowInstanceId;
        }

        public GetDataArchiveOrderDetailResponseBodyDataArchiveOrderDetail setWorkflowStatusDesc(String workflowStatusDesc) {
            this.workflowStatusDesc = workflowStatusDesc;
            return this;
        }
        public String getWorkflowStatusDesc() {
            return this.workflowStatusDesc;
        }

    }

}
