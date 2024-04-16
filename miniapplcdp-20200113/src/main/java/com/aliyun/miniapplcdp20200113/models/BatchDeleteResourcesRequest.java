// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchDeleteResourcesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ResourceIdList")
    public String resourceIdList;

    @NameInMap("Source")
    public String source;

    public static BatchDeleteResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteResourcesRequest self = new BatchDeleteResourcesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteResourcesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BatchDeleteResourcesRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public BatchDeleteResourcesRequest setResourceIdList(String resourceIdList) {
        this.resourceIdList = resourceIdList;
        return this;
    }
    public String getResourceIdList() {
        return this.resourceIdList;
    }

    public BatchDeleteResourcesRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
