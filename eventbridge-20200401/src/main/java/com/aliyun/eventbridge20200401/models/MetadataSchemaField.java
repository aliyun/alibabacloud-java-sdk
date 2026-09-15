// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class MetadataSchemaField extends TeaModel {
    /**
     * <p>The name of the metadata field.</p>
     * 
     * <strong>example:</strong>
     * <p>department</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Valid values: STRING, LONG, DOUBLE, BOOLEAN, and DATETIME. This field is ignored when ValueMode is set to SYSTEM_VARIABLE. The system enforces the inherent type of the bound variable: DOCUMENT_NAME, FILE_TYPE, SOURCE_TYPE, and SOURCE_URI use STRING. FILE_SIZE, DOCUMENT_UPLOAD_TIME, and SOURCE_MODIFIED_TIME use LONG. An incorrect value specified by the user has no effect.</p>
     * 
     * <strong>example:</strong>
     * <p>STRING</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>When ValueMode is set to CONSTANT, this field specifies a fixed value. An empty value indicates that the value can be assigned during document upload. When ValueMode is set to SYSTEM_VARIABLE, this field specifies a system variable name. Valid system variable names: DOCUMENT_NAME, FILE_TYPE, FILE_SIZE, DOCUMENT_UPLOAD_TIME, SOURCE_TYPE, SOURCE_URI, and SOURCE_MODIFIED_TIME. The system maintains the values of system variables. For manual uploads, the source is fixed to UPLOAD, and SOURCE_URI and SOURCE_MODIFIED_TIME use the values declared by the user. For event stream imports, the system automatically maintains the values. For example, for an OSS import, the source is OSS, SOURCE_URI is oss://bucket/key, and SOURCE_MODIFIED_TIME is the object modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>EventHouse</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>This field is optional. If omitted, the user assigns the value during document upload. Valid values:</p>
     * <ul>
     * <li>CONSTANT: The field uses a constant. If Value is not empty, the fixed value is automatically applied to the document. If Value is empty, the value can be assigned during upload.</li>
     * <li>SYSTEM_VARIABLE: The field is bound to a system variable. Value specifies the variable name, and the system automatically populates the value from the document facts.</li>
     * </ul>
     * <p>A value explicitly provided by the user during document upload always takes precedence. The backend does not override user-specified values.</p>
     * 
     * <strong>example:</strong>
     * <p>CONSTANT</p>
     */
    @NameInMap("ValueMode")
    public String valueMode;

    public static MetadataSchemaField build(java.util.Map<String, ?> map) throws Exception {
        MetadataSchemaField self = new MetadataSchemaField();
        return TeaModel.build(map, self);
    }

    public MetadataSchemaField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MetadataSchemaField setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public MetadataSchemaField setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public MetadataSchemaField setValueMode(String valueMode) {
        this.valueMode = valueMode;
        return this;
    }
    public String getValueMode() {
        return this.valueMode;
    }

}
