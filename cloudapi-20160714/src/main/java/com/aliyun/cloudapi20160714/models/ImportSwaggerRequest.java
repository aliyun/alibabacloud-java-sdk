// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerRequest extends TeaModel {
    /**
     * <p>The Swagger text content.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The Swagger text format:</p>
     * <br>
     * <p>*   json</p>
     * <p>*   yaml</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    /**
     * <p>The pre-inspection.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The global conditions.</p>
     */
    @NameInMap("GlobalCondition")
    public java.util.Map<String, ?> globalCondition;

    /**
     * <p>The ID of the API group to which the Swagger is imported.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Specifies whether to overwrite the existing API.</p>
     * <br>
     * <p>APIs with the same HTTP request type and backend request path are considered the same.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ImportSwaggerRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSwaggerRequest self = new ImportSwaggerRequest();
        return TeaModel.build(map, self);
    }

    public ImportSwaggerRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ImportSwaggerRequest setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public ImportSwaggerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ImportSwaggerRequest setGlobalCondition(java.util.Map<String, ?> globalCondition) {
        this.globalCondition = globalCondition;
        return this;
    }
    public java.util.Map<String, ?> getGlobalCondition() {
        return this.globalCondition;
    }

    public ImportSwaggerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ImportSwaggerRequest setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public ImportSwaggerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
