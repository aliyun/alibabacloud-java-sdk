// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAppVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1432****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    public static GetAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppVersionRequest self = new GetAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetAppVersionRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

}
