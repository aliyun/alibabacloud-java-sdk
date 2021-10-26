// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CheckInstanceSupportStageNameResponseBody extends TeaModel {
    @NameInMap("IsSupport")
    public Boolean isSupport;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckInstanceSupportStageNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceSupportStageNameResponseBody self = new CheckInstanceSupportStageNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstanceSupportStageNameResponseBody setIsSupport(Boolean isSupport) {
        this.isSupport = isSupport;
        return this;
    }
    public Boolean getIsSupport() {
        return this.isSupport;
    }

    public CheckInstanceSupportStageNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
