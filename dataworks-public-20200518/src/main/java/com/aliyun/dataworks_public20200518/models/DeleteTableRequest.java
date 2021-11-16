// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableRequest extends TeaModel {
    @NameInMap("AppGuid")
    public String appGuid;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TableName")
    public String tableName;

    public static DeleteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableRequest self = new DeleteTableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTableRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

    public DeleteTableRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public DeleteTableRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteTableRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
