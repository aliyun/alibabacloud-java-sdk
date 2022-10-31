// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveShowFromShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowId")
    public String showId;

    @NameInMap("failedList")
    public String failedList;

    @NameInMap("successfulShowIds")
    public String successfulShowIds;

    public static RemoveShowFromShowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveShowFromShowListResponseBody self = new RemoveShowFromShowListResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveShowFromShowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveShowFromShowListResponseBody setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public RemoveShowFromShowListResponseBody setFailedList(String failedList) {
        this.failedList = failedList;
        return this;
    }
    public String getFailedList() {
        return this.failedList;
    }

    public RemoveShowFromShowListResponseBody setSuccessfulShowIds(String successfulShowIds) {
        this.successfulShowIds = successfulShowIds;
        return this;
    }
    public String getSuccessfulShowIds() {
        return this.successfulShowIds;
    }

}
