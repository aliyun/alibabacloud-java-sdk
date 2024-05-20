// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DeleteAppVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    public static DeleteAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionRequest self = new DeleteAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

}
