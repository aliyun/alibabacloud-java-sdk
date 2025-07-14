// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListTransferFilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>trt-03tdwg4tcuwdzv****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ListTransferFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTransferFilesRequest self = new ListTransferFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListTransferFilesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTransferFilesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTransferFilesRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
