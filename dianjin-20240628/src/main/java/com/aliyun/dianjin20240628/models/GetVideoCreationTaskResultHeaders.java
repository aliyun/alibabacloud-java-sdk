// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetVideoCreationTaskResultHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("X-Load-Test")
    public Boolean xLoadTest;

    public static GetVideoCreationTaskResultHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetVideoCreationTaskResultHeaders self = new GetVideoCreationTaskResultHeaders();
        return TeaModel.build(map, self);
    }

    public GetVideoCreationTaskResultHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetVideoCreationTaskResultHeaders setXLoadTest(Boolean xLoadTest) {
        this.xLoadTest = xLoadTest;
        return this;
    }
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

}
