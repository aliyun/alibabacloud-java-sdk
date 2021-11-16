// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateDataSourceRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("DataSourceId")
    public Long dataSourceId;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvType")
    public Integer envType;

    @NameInMap("Status")
    public String status;

    public static UpdateDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSourceRequest self = new UpdateDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSourceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateDataSourceRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public UpdateDataSourceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataSourceRequest setEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }
    public Integer getEnvType() {
        return this.envType;
    }

    public UpdateDataSourceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
