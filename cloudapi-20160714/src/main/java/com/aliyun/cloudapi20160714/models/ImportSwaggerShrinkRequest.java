// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerShrinkRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <p>382271</p>
     */
    @NameInMap("DataFormat")
    public String dataFormat;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Creates an API by importing Swagger-compliant data.</p>
     */
    @NameInMap("GlobalCondition")
    public String globalConditionShrink;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>8e274ec61cf6468e83b68371956831cb</p>
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
