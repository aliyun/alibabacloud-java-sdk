// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetQualityEntityResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetQualityEntityResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>401</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>You have no permission.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6d739ef6-098a-47****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetQualityEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityEntityResponseBody self = new GetQualityEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityEntityResponseBody setData(java.util.List<GetQualityEntityResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetQualityEntityResponseBodyData> getData() {
        return this.data;
    }

    public GetQualityEntityResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetQualityEntityResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetQualityEntityResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityEntityResponseBodyData extends TeaModel {
        /**
         * <p>The time when the partition filter expression was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1593964800000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The level of the partition filter expression. Valid values:</p>
         * <ul>
         * <li><p>0 (SQL-level): A data quality check is triggered after each SQL statement is run.</p>
         * </li>
         * <li><p>1 (Task-level): A data quality check is triggered after all SQL statements are run.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EntityLevel")
        public Integer entityLevel;

        /**
         * <p>The type of the engine or data source.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The subscribers who receive alert notifications. The value is the ID of an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1822931****</p>
         */
        @NameInMap("Followers")
        public String followers;

        /**
         * <p>Indicates whether the partition filter expression is associated with a scheduling node. Valid values:</p>
         * <ul>
         * <li><p>true: The partition filter expression is associated with a scheduling node.</p>
         * </li>
         * <li><p>false: The partition filter expression is not associated with a scheduling node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasRelativeNode")
        public Boolean hasRelativeNode;

        /**
         * <p>The ID of the partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>4003918</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=$[yyyymmdd-1]</p>
         */
        @NameInMap("MatchExpression")
        public String matchExpression;

        /**
         * <p>The time when the partition filter expression was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1593964800000</p>
         */
        @NameInMap("ModifyTime")
        public Long modifyTime;

        /**
         * <p>The user who updates the partition filter expression. The value is the ID of an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1822931****</p>
         */
        @NameInMap("ModifyUser")
        public String modifyUser;

        /**
         * <p>The owner who configures the partition filter expression. The value is the ID of an Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1822931****</p>
         */
        @NameInMap("OnDuty")
        public String onDuty;

        /**
         * <p>The name of the Alibaba Cloud account of the owner.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OnDutyAccountName")
        public String onDutyAccountName;

        /**
         * <p>The name of the engine or data source.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The scheduling node that is associated with the partition filter expression. This parameter includes the following sub-parameters:</p>
         * <ul>
         * <li><p>ProjectName: The name of the workspace to which the scheduling node belongs.</p>
         * </li>
         * <li><p>NodeID: The ID of the scheduling node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectName&quot;:&quot;xc_DP****&quot;,&quot;nodeId&quot;:7000026****}]</p>
         */
        @NameInMap("RelativeNode")
        public String relativeNode;

        /**
         * <p>The SQL-level partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Sql")
        public Integer sql;

        /**
         * <p>The name of the partitioned table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_dqc_de****</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The task node.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Task")
        public Integer task;

        public static GetQualityEntityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityEntityResponseBodyData self = new GetQualityEntityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityEntityResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetQualityEntityResponseBodyData setEntityLevel(Integer entityLevel) {
            this.entityLevel = entityLevel;
            return this;
        }
        public Integer getEntityLevel() {
            return this.entityLevel;
        }

        public GetQualityEntityResponseBodyData setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetQualityEntityResponseBodyData setFollowers(String followers) {
            this.followers = followers;
            return this;
        }
        public String getFollowers() {
            return this.followers;
        }

        public GetQualityEntityResponseBodyData setHasRelativeNode(Boolean hasRelativeNode) {
            this.hasRelativeNode = hasRelativeNode;
            return this;
        }
        public Boolean getHasRelativeNode() {
            return this.hasRelativeNode;
        }

        public GetQualityEntityResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetQualityEntityResponseBodyData setMatchExpression(String matchExpression) {
            this.matchExpression = matchExpression;
            return this;
        }
        public String getMatchExpression() {
            return this.matchExpression;
        }

        public GetQualityEntityResponseBodyData setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public GetQualityEntityResponseBodyData setModifyUser(String modifyUser) {
            this.modifyUser = modifyUser;
            return this;
        }
        public String getModifyUser() {
            return this.modifyUser;
        }

        public GetQualityEntityResponseBodyData setOnDuty(String onDuty) {
            this.onDuty = onDuty;
            return this;
        }
        public String getOnDuty() {
            return this.onDuty;
        }

        public GetQualityEntityResponseBodyData setOnDutyAccountName(String onDutyAccountName) {
            this.onDutyAccountName = onDutyAccountName;
            return this;
        }
        public String getOnDutyAccountName() {
            return this.onDutyAccountName;
        }

        public GetQualityEntityResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetQualityEntityResponseBodyData setRelativeNode(String relativeNode) {
            this.relativeNode = relativeNode;
            return this;
        }
        public String getRelativeNode() {
            return this.relativeNode;
        }

        public GetQualityEntityResponseBodyData setSql(Integer sql) {
            this.sql = sql;
            return this;
        }
        public Integer getSql() {
            return this.sql;
        }

        public GetQualityEntityResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetQualityEntityResponseBodyData setTask(Integer task) {
            this.task = task;
            return this;
        }
        public Integer getTask() {
            return this.task;
        }

    }

}
