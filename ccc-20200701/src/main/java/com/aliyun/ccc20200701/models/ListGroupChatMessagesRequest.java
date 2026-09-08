// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListGroupChatMessagesRequest extends TeaModel {
    /**
     * <p>Cloud Contact Center instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>chat-65382141036853491</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Token for the next page. This is a 32-character UUID. Leave this parameter empty when requesting the first page. For subsequent pages, use the NextPageToken value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>b2ad450b116e4f8396e58108acf5c020</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>Page size. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Sorting order. Default is descending.</p>
     * <p>Valid values:</p>
     * <p>ASC: ascending.</p>
     * <p>DESC: descending.</p>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListGroupChatMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupChatMessagesRequest self = new ListGroupChatMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupChatMessagesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListGroupChatMessagesRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListGroupChatMessagesRequest setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListGroupChatMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGroupChatMessagesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
