// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppCodeRequest extends TeaModel {
    /**
     * <p>The application AppCode.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0d13f021c5cd4997831a9717e75b0663</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111265074</p>
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
