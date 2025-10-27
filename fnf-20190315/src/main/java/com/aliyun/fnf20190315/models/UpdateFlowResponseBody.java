// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class UpdateFlowResponseBody extends TeaModel {
    /**
     * <p>The time when the flow was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T01:01:01.001Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The flow definition, which follows the FDL syntax standard. Considering compatibility, the system supports the two flow definition specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>version: v1.0\ntype: flow\nname: test\nsteps:\n  - type: pass\n    name: mypass</p>
     */
    @NameInMap("Definition")
    public String definition;

    /**
     * <p>The description of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>test definition</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Environment")
    public UpdateFlowResponseBodyEnvironment environment;

    /**
     * <p>The path of the external storage.</p>
     * 
     * <strong>example:</strong>
     * <p>/path</p>
     */
    @NameInMap("ExternalStorageLocation")
    public String externalStorageLocation;

    /**
     * <p>The unique ID of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>e589e092-e2c0-4dee-b306-3574ddfdddf5****</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The time when the flow was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-01-01T01:01:01.001Z</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The name of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>flow</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>testRequestID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Alibaba Cloud resource name (ARN) of the authorized role on which the execution of the flow relies. During the execution of the flow, the flow execution engine assumes the role to call API operations of relevant services.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::${accountID}:${role}</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The type of the flow.</p>
     * 
     * <strong>example:</strong>
     * <p>FDL</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlowResponseBody self = new UpdateFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFlowResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateFlowResponseBody setDefinition(String definition) {
        this.definition = definition;
        return this;
    }
    public String getDefinition() {
        return this.definition;
    }

    public UpdateFlowResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateFlowResponseBody setEnvironment(UpdateFlowResponseBodyEnvironment environment) {
        this.environment = environment;
        return this;
    }
    public UpdateFlowResponseBodyEnvironment getEnvironment() {
        return this.environment;
    }

    public UpdateFlowResponseBody setExternalStorageLocation(String externalStorageLocation) {
        this.externalStorageLocation = externalStorageLocation;
        return this;
    }
    public String getExternalStorageLocation() {
        return this.externalStorageLocation;
    }

    public UpdateFlowResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateFlowResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateFlowResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFlowResponseBody setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public UpdateFlowResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class UpdateFlowResponseBodyEnvironmentVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateFlowResponseBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowResponseBodyEnvironmentVariables self = new UpdateFlowResponseBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateFlowResponseBodyEnvironmentVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateFlowResponseBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateFlowResponseBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateFlowResponseBodyEnvironment extends TeaModel {
        @NameInMap("Variables")
        public java.util.List<UpdateFlowResponseBodyEnvironmentVariables> variables;

        public static UpdateFlowResponseBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateFlowResponseBodyEnvironment self = new UpdateFlowResponseBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateFlowResponseBodyEnvironment setVariables(java.util.List<UpdateFlowResponseBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateFlowResponseBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

}
