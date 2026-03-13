// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListAsyncTaskOutput extends TeaModel {
    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>MTIzNCNhYmM=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The asynchronous tasks.</p>
     */
    @NameInMap("tasks")
    public java.util.List<AsyncTask> tasks;

    public static ListAsyncTaskOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTaskOutput self = new ListAsyncTaskOutput();
        return TeaModel.build(map, self);
    }

    public ListAsyncTaskOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAsyncTaskOutput setTasks(java.util.List<AsyncTask> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<AsyncTask> getTasks() {
        return this.tasks;
    }

}
