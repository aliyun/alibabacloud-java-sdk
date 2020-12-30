// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckMaxYearOfServerLockResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxYear")
    public Integer maxYear;

    public static CheckMaxYearOfServerLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMaxYearOfServerLockResponseBody self = new CheckMaxYearOfServerLockResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMaxYearOfServerLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckMaxYearOfServerLockResponseBody setMaxYear(Integer maxYear) {
        this.maxYear = maxYear;
        return this;
    }
    public Integer getMaxYear() {
        return this.maxYear;
    }

}
