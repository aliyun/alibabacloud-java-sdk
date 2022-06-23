// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAdaptationRequest extends TeaModel {
    @NameInMap("AdaptApplyId")
    public Long adaptApplyId;

    @NameInMap("AppVersionId")
    public String appVersionId;

    public static GetAdaptationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdaptationRequest self = new GetAdaptationRequest();
        return TeaModel.build(map, self);
    }

    public GetAdaptationRequest setAdaptApplyId(Long adaptApplyId) {
        this.adaptApplyId = adaptApplyId;
        return this;
    }
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    public GetAdaptationRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

}
