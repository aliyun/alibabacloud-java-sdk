// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddShowIntoShowListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>987DA143-A39C-5B5D-AF5B-3B07944A0036</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the episode.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e****</p>
     */
    @NameInMap("ShowId")
    public String showId;

    /**
     * <p>The list of resources that failed to be added and the reason for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>failedList[Show1, Show2...]</p>
     */
    @NameInMap("failedList")
    public String failedList;

    /**
     * <p>The IDs of the episodes that were added.</p>
     * 
     * <strong>example:</strong>
     * <p>f1933f16-5467-4308-b3a9-e8d451a90999,547436b8-c839-4469-a2c0-704c1ce5ce00</p>
     */
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
