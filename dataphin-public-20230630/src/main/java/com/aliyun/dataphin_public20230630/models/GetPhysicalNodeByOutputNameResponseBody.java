// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetPhysicalNodeByOutputNameResponseBody extends TeaModel {
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
    public GetPhysicalNodeByOutputNameResponseBodyNodeInfo nodeInfo;

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
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

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
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

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
         * <strong>example:</strong>
         * <p>1311131</p>
         */
        @NameInMap("Id")
        public String id;

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
         * <strong>example:</strong>
         * <p>1324211</p>
         */
        @NameInMap("Id")
        public String id;

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
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Creator")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoCreator creator;

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
         * <p>n_2321</p>
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
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoModifier modifier;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>SHELL</p>
         */
        @NameInMap("OperatorType")
        public String operatorType;

        @NameInMap("Owner")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoOwner owner;

        /**
         * <strong>example:</strong>
         * <p>MIDDLE</p>
         */
        @NameInMap("Priority")
        public String priority;

        @NameInMap("ProjectInfo")
        public GetPhysicalNodeByOutputNameResponseBodyNodeInfoProjectInfo projectInfo;

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
