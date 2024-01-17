// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SynCreateAppForInnerResponseBody extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("RequestId")
    public String requestId;

    public static SynCreateAppForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SynCreateAppForInnerResponseBody self = new SynCreateAppForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public SynCreateAppForInnerResponseBody setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SynCreateAppForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
