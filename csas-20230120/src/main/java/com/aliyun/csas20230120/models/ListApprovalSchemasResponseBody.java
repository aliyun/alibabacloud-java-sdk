// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalSchemasResponseBody extends TeaModel {
    /**
     * <p>The ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>102350E7-1A20-58F5-9D63-ABEA820AE6E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of approval templates.</p>
     */
    @NameInMap("Schemas")
    public java.util.List<ListApprovalSchemasResponseBodySchemas> schemas;

    /**
     * <p>The total number of approval templates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public String totalNum;

    public static ListApprovalSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalSchemasResponseBody self = new ListApprovalSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApprovalSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApprovalSchemasResponseBody setSchemas(java.util.List<ListApprovalSchemasResponseBodySchemas> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<ListApprovalSchemasResponseBodySchemas> getSchemas() {
        return this.schemas;
    }

    public ListApprovalSchemasResponseBody setTotalNum(String totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public String getTotalNum() {
        return this.totalNum;
    }

    public static class ListApprovalSchemasResponseBodySchemas extends TeaModel {
        /**
         * <p>The creation time of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15 14:44:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个模板</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates if it is an officially maintained template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><p><strong>DomainBlacklist</strong>: Domain blacklist.</p>
         * </li>
         * <li><p><strong>DomainWhitelist</strong>: Domain whitelist.</p>
         * </li>
         * <li><p><strong>SoftwareBlock</strong>: Software disable.</p>
         * </li>
         * <li><p><strong>AppUninstall</strong>: Terminal uninstall.</p>
         * </li>
         * <li><p><strong>DlpSend</strong>: File outbound.</p>
         * </li>
         * <li><p><strong>PeripheralBlock</strong>: Peripheral control.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <p>The content of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;form&quot;: {&quot;labelCol&quot;: 6,&quot;wrapperCol&quot;: 12}}</p>
         */
        @NameInMap("SchemaContent")
        public String schemaContent;

        /**
         * <p>The approval template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        /**
         * <p>The approval template name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The approval template version.</p>
         * 
         * <strong>example:</strong>
         * <p>1715680940</p>
         */
        @NameInMap("SchemaVersion")
        public Long schemaVersion;

        public static ListApprovalSchemasResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalSchemasResponseBodySchemas self = new ListApprovalSchemasResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public ListApprovalSchemasResponseBodySchemas setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListApprovalSchemasResponseBodySchemas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListApprovalSchemasResponseBodySchemas setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListApprovalSchemasResponseBodySchemas setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public ListApprovalSchemasResponseBodySchemas setSchemaContent(String schemaContent) {
            this.schemaContent = schemaContent;
            return this;
        }
        public String getSchemaContent() {
            return this.schemaContent;
        }

        public ListApprovalSchemasResponseBodySchemas setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

        public ListApprovalSchemasResponseBodySchemas setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListApprovalSchemasResponseBodySchemas setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

    }

}
