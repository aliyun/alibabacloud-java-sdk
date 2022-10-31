// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddShowIntoShowListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ShowId")
    public String showId;

    @NameInMap("failedList")
    public String failedList;

    @NameInMap("successfulShowIds")
    public String successfulShowIds;

    public static AddShowIntoShowListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddShowIntoShowListResponseBody self = new AddShowIntoShowListResponseBody();
        return TeaModel.build(map, self);
    }

    public AddShowIntoShowListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddShowIntoShowListResponseBody setShowId(String showId) {
        this.showId = showId;
        return this;
    }
    public String getShowId() {
        return this.showId;
    }

    public AddShowIntoShowListResponseBody setFailedList(String failedList) {
        this.failedList = failedList;
        return this;
    }
    public String getFailedList() {
        return this.failedList;
    }

    public AddShowIntoShowListResponseBody setSuccessfulShowIds(String successfulShowIds) {
        this.successfulShowIds = successfulShowIds;
        return this;
    }
    public String getSuccessfulShowIds() {
        return this.successfulShowIds;
    }

}
