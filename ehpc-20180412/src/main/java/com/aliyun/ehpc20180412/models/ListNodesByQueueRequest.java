// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListNodesByQueueRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable asynchronous query.</p>
     */
    @NameInMap("Async")
    public Boolean async;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the queue.</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    public static ListNodesByQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNodesByQueueRequest self = new ListNodesByQueueRequest();
        return TeaModel.build(map, self);
    }

    public ListNodesByQueueRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ListNodesByQueueRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListNodesByQueueRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNodesByQueueRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodesByQueueRequest setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

}
