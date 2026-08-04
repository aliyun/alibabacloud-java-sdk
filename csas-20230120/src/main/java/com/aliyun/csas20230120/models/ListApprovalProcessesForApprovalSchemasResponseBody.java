// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalProcessesForApprovalSchemasResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of approval templates.</p>
     */
    @NameInMap("Schemas")
    public java.util.List<ListApprovalProcessesForApprovalSchemasResponseBodySchemas> schemas;

    public static ListApprovalProcessesForApprovalSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalProcessesForApprovalSchemasResponseBody self = new ListApprovalProcessesForApprovalSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApprovalProcessesForApprovalSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApprovalProcessesForApprovalSchemasResponseBody setSchemas(java.util.List<ListApprovalProcessesForApprovalSchemasResponseBodySchemas> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<ListApprovalProcessesForApprovalSchemasResponseBodySchemas> getSchemas() {
        return this.schemas;
    }

    public static class ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses extends TeaModel {
        /**
         * <p>The time when the approval flow was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-25 10:44:09</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the approval flow.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个审批流程</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the approval flow.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-process-dc61e92ba5c5****</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>The name of the approval flow.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("ProcessName")
        public String processName;

        public static ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses self = new ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses setProcessName(String processName) {
            this.processName = processName;
            return this;
        }
        public String getProcessName() {
            return this.processName;
        }

    }

    public static class ListApprovalProcessesForApprovalSchemasResponseBodySchemas extends TeaModel {
        /**
         * <p>A collection of approval flows.</p>
         */
        @NameInMap("Processes")
        public java.util.List<ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses> processes;

        /**
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static ListApprovalProcessesForApprovalSchemasResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalProcessesForApprovalSchemasResponseBodySchemas self = new ListApprovalProcessesForApprovalSchemasResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public ListApprovalProcessesForApprovalSchemasResponseBodySchemas setProcesses(java.util.List<ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses> processes) {
            this.processes = processes;
            return this;
        }
        public java.util.List<ListApprovalProcessesForApprovalSchemasResponseBodySchemasProcesses> getProcesses() {
            return this.processes;
        }

        public ListApprovalProcessesForApprovalSchemasResponseBodySchemas setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

}
