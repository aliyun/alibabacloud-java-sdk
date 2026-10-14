// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateFileImportTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether field selection mode is enabled.</p>
     */
    @NameInMap("FieldSelectionEnabled")
    public Boolean fieldSelectionEnabled;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The selected fields.</p>
     */
    @NameInMap("SelectedFieldNames")
    public java.util.List<String> selectedFieldNames;

    /**
     * <p>The synchronization target type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eiam_v2_user_import,
     * application, identity_provider</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static GenerateFileImportTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileImportTemplateRequest self = new GenerateFileImportTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFileImportTemplateRequest setFieldSelectionEnabled(Boolean fieldSelectionEnabled) {
        this.fieldSelectionEnabled = fieldSelectionEnabled;
        return this;
    }
    public Boolean getFieldSelectionEnabled() {
        return this.fieldSelectionEnabled;
    }

    public GenerateFileImportTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateFileImportTemplateRequest setSelectedFieldNames(java.util.List<String> selectedFieldNames) {
        this.selectedFieldNames = selectedFieldNames;
        return this;
    }
    public java.util.List<String> getSelectedFieldNames() {
        return this.selectedFieldNames;
    }

    public GenerateFileImportTemplateRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
