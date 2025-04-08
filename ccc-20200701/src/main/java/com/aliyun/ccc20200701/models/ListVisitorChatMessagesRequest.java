// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListVisitorChatMessagesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cf584733-<em><strong>-</strong></em>-9699-cb77aa3b7aa6</p>
     */
    @NameInMap("AccessChannelId")
    public String accessChannelId;

    /**
     * <strong>example:</strong>
     * <p>9XYGTGWtq2wXzVikKuip_zeVGl6O4VJ-l-<em>-</em>-JPofhap4P7fAevuE=</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>1650316799000</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1737193352340::7463707254.EAUNIT</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    /**
     * <strong>example:</strong>
     * <p>1647325450000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>fcd020fe-****-1a272a174a7d</p>
     */
    @NameInMap("VisitorId")
    public String visitorId;

    public static ListVisitorChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVisitorChatMessagesRequest self = new ListVisitorChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListVisitorChatMessagesRequest setAccessChannelId(String accessChannelId) {
        this.accessChannelId = accessChannelId;
        return this;
    }
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    public ListVisitorChatMessagesRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListVisitorChatMessagesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListVisitorChatMessagesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVisitorChatMessagesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListVisitorChatMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVisitorChatMessagesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public ListVisitorChatMessagesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListVisitorChatMessagesRequest setVisitorId(String visitorId) {
        this.visitorId = visitorId;
        return this;
    }
    public String getVisitorId() {
        return this.visitorId;
    }

}
