// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetResourceRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ImageProcessParameter")
    public String imageProcessParameter;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("Source")
    public String source;

    public static GetResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRequest self = new GetResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetResourceRequest setImageProcessParameter(String imageProcessParameter) {
        this.imageProcessParameter = imageProcessParameter;
        return this;
    }
    public String getImageProcessParameter() {
        return this.imageProcessParameter;
    }

    public GetResourceRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public GetResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetResourceRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
