// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class DeleteResourceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Source")
    public String source;

    public static DeleteResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRequest self = new DeleteResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteResourceRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public DeleteResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DeleteResourceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
