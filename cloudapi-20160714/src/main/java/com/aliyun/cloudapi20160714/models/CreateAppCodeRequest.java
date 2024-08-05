// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateAppCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3aaf905a0a1f4f0eabc6d891dfa08afc</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111203109</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static CreateAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppCodeRequest self = new CreateAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppCodeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public CreateAppCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
