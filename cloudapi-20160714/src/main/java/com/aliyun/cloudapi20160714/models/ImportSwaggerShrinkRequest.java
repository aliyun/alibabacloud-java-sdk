// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerShrinkRequest extends TeaModel {
    /**
     * <p>The Swagger text content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;A Swagger API definition in YAML&quot;</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The Swagger text format:</p>
     * <ul>
     * <li>json</li>
     * <li>yaml</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yaml</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>The pre-inspection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The global conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("GlobalCondition")
    public String globalConditionShrink;

    /**
     * <p>The ID of the API group to which the Swagger is imported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0009db9c828549768a200320714b8930</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to overwrite the existing API.</p>
     * <p>APIs with the same HTTP request type and backend request path are considered the same.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ImportSwaggerShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSwaggerShrinkRequest self = new ImportSwaggerShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportSwaggerShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportSwaggerShrinkRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ImportSwaggerShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportSwaggerShrinkRequest setGlobalConditionShrink(String globalConditionShrink) {
        this.globalConditionShrink = globalConditionShrink;
        return this;
    }
    public String getGlobalConditionShrink() {
        return this.globalConditionShrink;
    }

    public ImportSwaggerShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ImportSwaggerShrinkRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public ImportSwaggerShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
