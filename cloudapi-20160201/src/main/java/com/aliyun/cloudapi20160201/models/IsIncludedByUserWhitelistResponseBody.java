// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class IsIncludedByUserWhitelistResponseBody extends TeaModel {
    @NameInMap("IsIncluded")
    public Boolean isIncluded;

    @NameInMap("RequestId")
    public String requestId;

    public static IsIncludedByUserWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IsIncludedByUserWhitelistResponseBody self = new IsIncludedByUserWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public IsIncludedByUserWhitelistResponseBody setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
        return this;
    }
    public Boolean getIsIncluded() {
        return this.isIncluded;
    }

    public IsIncludedByUserWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
