// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RemoveShowFromShowListResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
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
     * <p>The IDs of episodes that failed to be removed and the relevant failure information.</p>
     * 
     * <strong>example:</strong>
     * <p>failedList[Show1, Show2...]</p>
     */
    @NameInMap("failedList")
    public String failedList;

    /**
     * <p>The IDs of episodes that were removed.</p>
     * 
     * <strong>example:</strong>
     * <p>f1933f16-5467-4308-b3a9-e8d451a90999</p>
     */
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
