// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NodeInfo")
    public GetPhysicalNodeResponseBodyNodeInfo nodeInfo;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPhysicalNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeResponseBody self = new GetPhysicalNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhysicalNodeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPhysicalNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhysicalNodeResponseBody setNodeInfo(GetPhysicalNodeResponseBodyNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }
    public GetPhysicalNodeResponseBodyNodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    public GetPhysicalNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalNodeResponseBodyNodeInfoCreator extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101312</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeResponseBodyNodeInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeResponseBodyNodeInfoCreator self = new GetPhysicalNodeResponseBodyNodeInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeResponseBodyNodeInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeResponseBodyNodeInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeResponseBodyNodeInfoModifier extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101312</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeResponseBodyNodeInfoModifier build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeResponseBodyNodeInfoModifier self = new GetPhysicalNodeResponseBodyNodeInfoModifier();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeResponseBodyNodeInfoModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeResponseBodyNodeInfoModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeResponseBodyNodeInfoOwner extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>101312</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeResponseBodyNodeInfoOwner build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeResponseBodyNodeInfoOwner self = new GetPhysicalNodeResponseBodyNodeInfoOwner();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeResponseBodyNodeInfoOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeResponseBodyNodeInfoOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeResponseBodyNodeInfoProjectInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>102132</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeResponseBodyNodeInfoProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeResponseBodyNodeInfoProjectInfo self = new GetPhysicalNodeResponseBodyNodeInfoProjectInfo();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeResponseBodyNodeInfoProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeResponseBodyNodeInfoProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeResponseBodyNodeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public GetPhysicalNodeResponseBodyNodeInfoCreator creator;

        /**
         * <strong>example:</strong>
         * <p>0 0 10 * * *</p>
         */
        @NameInMap("CronExpression")
        public String cronExpression;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DataSourceSchema")
        public String dataSourceSchema;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <strong>example:</strong>
         * <p>n_232132</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        @NameInMap("Modifier")
        public GetPhysicalNodeResponseBodyNodeInfoModifier modifier;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("OutputNameList")
        public java.util.List<String> outputNameList;

        @NameInMap("Owner")
        public GetPhysicalNodeResponseBodyNodeInfoOwner owner;

        /**
         * <strong>example:</strong>
         * <p>MIDDLE</p>
         */
        @NameInMap("Priority")
        public String priority;

        @NameInMap("ProjectInfo")
        public GetPhysicalNodeResponseBodyNodeInfoProjectInfo projectInfo;

        /**
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;any_success&quot;}</p>
         */
        @NameInMap("TriggerConfig")
        public String triggerConfig;

        public static GetPhysicalNodeResponseBodyNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeResponseBodyNodeInfo self = new GetPhysicalNodeResponseBodyNodeInfo();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeResponseBodyNodeInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setCreator(GetPhysicalNodeResponseBodyNodeInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetPhysicalNodeResponseBodyNodeInfoCreator getCreator() {
            return this.creator;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setCronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }
        public String getCronExpression() {
            return this.cronExpression;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setDataSourceSchema(String dataSourceSchema) {
            this.dataSourceSchema = dataSourceSchema;
            return this;
        }
        public String getDataSourceSchema() {
            return this.dataSourceSchema;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setModifier(GetPhysicalNodeResponseBodyNodeInfoModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public GetPhysicalNodeResponseBodyNodeInfoModifier getModifier() {
            return this.modifier;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setOutputNameList(java.util.List<String> outputNameList) {
            this.outputNameList = outputNameList;
            return this;
        }
        public java.util.List<String> getOutputNameList() {
            return this.outputNameList;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setOwner(GetPhysicalNodeResponseBodyNodeInfoOwner owner) {
            this.owner = owner;
            return this;
        }
        public GetPhysicalNodeResponseBodyNodeInfoOwner getOwner() {
            return this.owner;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setProjectInfo(GetPhysicalNodeResponseBodyNodeInfoProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public GetPhysicalNodeResponseBodyNodeInfoProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPhysicalNodeResponseBodyNodeInfo setTriggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

    }

}
