// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetApprovalSchemaResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EFE7EBB2-449D-5BBB-B381-CA7839BC1649</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The approval template.</p>
     */
    @NameInMap("Schema")
    public GetApprovalSchemaResponseBodySchema schema;

    public static GetApprovalSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalSchemaResponseBody self = new GetApprovalSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApprovalSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApprovalSchemaResponseBody setSchema(GetApprovalSchemaResponseBodySchema schema) {
        this.schema = schema;
        return this;
    }
    public GetApprovalSchemaResponseBodySchema getSchema() {
        return this.schema;
    }

    public static class GetApprovalSchemaResponseBodySchema extends TeaModel {
        /**
         * <p>The time when the approval template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-14 11:57:51</p>
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
         * <p>Indicates whether the template is an official template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><p><strong>DomainBlacklist</strong>: Domain name blacklist.</p>
         * </li>
         * <li><p><strong>DomainWhitelist</strong>: Domain name whitelist.</p>
         * </li>
         * <li><p><strong>SoftwareBlock</strong>: Software blocking.</p>
         * </li>
         * <li><p><strong>AppUninstall</strong>: Application uninstallation.</p>
         * </li>
         * <li><p><strong>DlpSend</strong>: Outbound file transfer.</p>
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
         * <p>The ID of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>approval-schema-090134f1ebff****</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        /**
         * <p>The name of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The version of the approval template.</p>
         * 
         * <strong>example:</strong>
         * <p>1715680940</p>
         */
        @NameInMap("SchemaVersion")
        public Long schemaVersion;

        public static GetApprovalSchemaResponseBodySchema build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalSchemaResponseBodySchema self = new GetApprovalSchemaResponseBodySchema();
            return TeaModel.build(map, self);
        }

        public GetApprovalSchemaResponseBodySchema setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetApprovalSchemaResponseBodySchema setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApprovalSchemaResponseBodySchema setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetApprovalSchemaResponseBodySchema setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public GetApprovalSchemaResponseBodySchema setSchemaContent(String schemaContent) {
            this.schemaContent = schemaContent;
            return this;
        }
        public String getSchemaContent() {
            return this.schemaContent;
        }

        public GetApprovalSchemaResponseBodySchema setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

        public GetApprovalSchemaResponseBodySchema setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetApprovalSchemaResponseBodySchema setSchemaVersion(Long schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public Long getSchemaVersion() {
            return this.schemaVersion;
        }

    }

}
