// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalSchemasForApprovalProcessesResponseBody extends TeaModel {
    @NameInMap("Processes")
    public java.util.List<ListApprovalSchemasForApprovalProcessesResponseBodyProcesses> processes;

    /**
     * <strong>example:</strong>
     * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListApprovalSchemasForApprovalProcessesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalSchemasForApprovalProcessesResponseBody self = new ListApprovalSchemasForApprovalProcessesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApprovalSchemasForApprovalProcessesResponseBody setProcesses(java.util.List<ListApprovalSchemasForApprovalProcessesResponseBodyProcesses> processes) {
        this.processes = processes;
        return this;
    }
    public java.util.List<ListApprovalSchemasForApprovalProcessesResponseBodyProcesses> getProcesses() {
        return this.processes;
    }

    public ListApprovalSchemasForApprovalProcessesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-03-15 14:44:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
         */
        @NameInMap("SchemaContent")
        public String schemaContent;

        /**
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <strong>example:</strong>
         * <p>1715680940</p>
         */
        @NameInMap("SchemaVersion")
        public Long schemaVersion;

        public static ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas self = new ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas();
            return TeaModel.build(map, self);
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setSchemaContent(String schemaContent) {
            this.schemaContent = schemaContent;
            return this;
        }
        public String getSchemaContent() {
            return this.schemaContent;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

    }

    public static class ListApprovalSchemasForApprovalProcessesResponseBodyProcesses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>approval-process-35ee09077ee9****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Schemas")
        public java.util.List<ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas> schemas;

        public static ListApprovalSchemasForApprovalProcessesResponseBodyProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalSchemasForApprovalProcessesResponseBodyProcesses self = new ListApprovalSchemasForApprovalProcessesResponseBodyProcesses();
            return TeaModel.build(map, self);
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcesses setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListApprovalSchemasForApprovalProcessesResponseBodyProcesses setSchemas(java.util.List<ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas> schemas) {
            this.schemas = schemas;
            return this;
        }
        public java.util.List<ListApprovalSchemasForApprovalProcessesResponseBodyProcessesSchemas> getSchemas() {
            return this.schemas;
        }

    }

}
