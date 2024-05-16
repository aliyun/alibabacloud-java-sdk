// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppCodeRequest self = new DeleteAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppCodeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public DeleteAppCodeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
