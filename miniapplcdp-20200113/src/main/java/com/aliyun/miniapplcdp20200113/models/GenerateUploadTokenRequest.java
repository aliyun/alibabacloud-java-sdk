// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateUploadTokenRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GenerateUploadTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadTokenRequest self = new GenerateUploadTokenRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadTokenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
