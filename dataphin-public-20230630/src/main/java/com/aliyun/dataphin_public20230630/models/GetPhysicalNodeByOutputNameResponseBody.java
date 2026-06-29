// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeByOutputNameResponseBody extends TeaModel {
    /**
     * <p>Error code. OK indicates a successful request.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code returned by the backend</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Node details</p>
     */
    @NameInMap("NodeInfo")
    public GetPhysicalNodeByOutputNameResponseBodyNodeInfo nodeInfo;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetPhysicalNodeByOutputNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalNodeByOutputNameResponseBody self = new GetPhysicalNodeByOutputNameResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalNodeByOutputNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPhysicalNodeByOutputNameResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetPhysicalNodeByOutputNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPhysicalNodeByOutputNameResponseBody setNodeInfo(GetPhysicalNodeByOutputNameResponseBodyNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }
    public GetPhysicalNodeByOutputNameResponseBodyNodeInfo getNodeInfo() {
        return this.nodeInfo;
    }

    public GetPhysicalNodeByOutputNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalNodeByOutputNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator extends TeaModel {
        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Username</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator self = new GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier extends TeaModel {
        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Username</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier self = new GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner extends TeaModel {
        /**
         * <p>User ID</p>
         * 
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Username</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner self = new GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo extends TeaModel {
        /**
         * <p>Project ID</p>
         * 
         * <strong>example:</strong>
         * <p>1324211</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Project name</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo self = new GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPhysicalNodeByOutputNameResponseBodyNodeInfo extends TeaModel {
        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Node creator</p>
         */
        @NameInMap("Creator")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator creator;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Node source</p>
         * <ul>
         * <li>DATA_PROCESS: Code development</li>
         * <li>BLACK_BOX: Black box</li>
         * <li>ONE_ID: Extraction</li>
         * <li>PIPELINE: Pipeline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>Node ID</p>
         * 
         * <strong>example:</strong>
         * <p>n_2321</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Last modified time</p>
         * 
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>Node modifier</p>
         */
        @NameInMap("Modifier")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier modifier;

        /**
         * <p>Name</p>
         * 
         * <strong>example:</strong>
         * <p>xx测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Node subtype</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL, etc.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>Node owner</p>
         */
        @NameInMap("Owner")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner owner;

        /**
         * <p>Priority</p>
         * <ul>
         * <li>HIGHEST</li>
         * <li>HIGH</li>
         * <li>MIDDLE</li>
         * <li>LOW</li>
         * <li>LOWEST</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MIDDLE</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>Project to which the node belongs</p>
         */
        @NameInMap("ProjectInfo")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo projectInfo;

        /**
         * <p>Scheduling period type</p>
         * <ul>
         * <li>MINUTELY</li>
         * <li>HOURLY</li>
         * <li>DAILY</li>
         * <li>WEEKLY</li>
         * <li>MONTHLY</li>
         * <li>YEARLY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>Node scheduling status</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Trigger configuration, used to implement field dependencies on logical tables</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;expression&quot;:&quot;any_success&quot;}</p>
         */
        @NameInMap("TriggerConfig")
        public String triggerConfig;

        public static GetPhysicalNodeByOutputNameResponseBodyNodeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalNodeByOutputNameResponseBodyNodeInfo self = new GetPhysicalNodeByOutputNameResponseBodyNodeInfo();
            return TeaModel.build(map, self);
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setCreator(GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator creator) {
            this.creator = creator;
            return this;
        }
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator getCreator() {
            return this.creator;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setLastModifiedTime(Long lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setModifier(GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier modifier) {
            this.modifier = modifier;
            return this;
        }
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier getModifier() {
            return this.modifier;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setOperatorType(String operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public String getOperatorType() {
            return this.operatorType;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setOwner(GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner owner) {
            this.owner = owner;
            return this;
        }
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner getOwner() {
            return this.owner;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setProjectInfo(GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo projectInfo) {
            this.projectInfo = projectInfo;
            return this;
        }
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo getProjectInfo() {
            return this.projectInfo;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPhysicalNodeByOutputNameResponseBodyNodeInfo setTriggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }
        public String getTriggerConfig() {
            return this.triggerConfig;
        }

    }

}
