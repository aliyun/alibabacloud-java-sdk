// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateSparkTemplateFileRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    public static UpdateSparkTemplateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSparkTemplateFileRequest self = new UpdateSparkTemplateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSparkTemplateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateSparkTemplateFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateSparkTemplateFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateSparkTemplateFileRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

}
