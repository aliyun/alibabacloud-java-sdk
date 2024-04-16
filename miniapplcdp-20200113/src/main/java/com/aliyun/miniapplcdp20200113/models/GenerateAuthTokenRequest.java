// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAuthTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("Source")
    public String source;

    public static GenerateAuthTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthTokenRequest self = new GenerateAuthTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAuthTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GenerateAuthTokenRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public GenerateAuthTokenRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
