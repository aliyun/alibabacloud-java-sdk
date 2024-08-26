// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class CheckMaxYearOfServerLockResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxYear")
    public Integer maxYear;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckMaxYearOfServerLockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckMaxYearOfServerLockResponseBody self = new CheckMaxYearOfServerLockResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckMaxYearOfServerLockResponseBody setMaxYear(Integer maxYear) {
        this.maxYear = maxYear;
        return this;
    }
    public Integer getMaxYear() {
        return this.maxYear;
    }

    public CheckMaxYearOfServerLockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
