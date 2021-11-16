// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateMaterialsResponseBody extends TeaModel {
    // 关联素材地址
    @NameInMap("MaterialUrls")
    public String materialUrls;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetTemplateMaterialsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateMaterialsResponseBody self = new GetTemplateMaterialsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateMaterialsResponseBody setMaterialUrls(String materialUrls) {
        this.materialUrls = materialUrls;
        return this;
    }
    public String getMaterialUrls() {
        return this.materialUrls;
    }

    public GetTemplateMaterialsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
