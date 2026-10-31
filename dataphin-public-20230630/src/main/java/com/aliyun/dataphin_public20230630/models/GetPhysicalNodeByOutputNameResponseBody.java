// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeByOutputNameResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request is normal.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The node details.</p>
     */
    @NameInMap("NodeInfo")
    public GetPhysicalNodeByOutputNameResponseBodyNodeInfo nodeInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
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
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
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
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1324211</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
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
         * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The creator of the node.</p>
         */
        @NameInMap("Creator")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator creator;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The node source. Valid values:</p>
         * <ul>
         * <li>DATA_PROCESS: code development</li>
         * <li>BLACK_BOX: black box</li>
         * <li>ONE_ID: extraction</li>
         * <li>PIPELINE: pipeline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("From")
        public String from;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n_2321</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("LastModifiedTime")
        public Long lastModifiedTime;

        /**
         * <p>The modifier of the node.</p>
         */
        @NameInMap("Modifier")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier modifier;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node subtype. Valid values:</p>
         * <ul>
         * <li>MAX_COMPUTE_SQL</li>
         * <li>HIVE_SQL</li>
         * <li>SHELL</li>
         * <li>PYTHON</li>
         * <li>ONE_SERVICE_SQL</li>
         * <li>DATABASE_SQL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        /**
         * <p>The owner of the node.</p>
         */
        @NameInMap("Owner")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner owner;

        /**
         * <p>The priority. Valid values:</p>
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
         * <p>The project to which the node belongs.</p>
         */
        @NameInMap("ProjectInfo")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo projectInfo;

        /**
         * <p>The scheduling cycle type. Valid values:</p>
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
         * <p>The scheduling status of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The trigger configuration, which is used to implement field dependencies for logical tables.</p>
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
