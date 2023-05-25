// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerRequest extends TeaModel {
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
    public java.util.Map<String, ?> globalCondition;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>8e274ec61cf6468e83b68371956831cb</p>
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
