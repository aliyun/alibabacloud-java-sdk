// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnRefreshTaskByIdRequest extends TeaModel {
    /**
     * <p>The ID of the task that you want to query. The following signature algorithms require different message digest algorithms:</p>
     * <ul>
     * <li>Perform the <a href="https://help.aliyun.com/document_detail/130620.html">RefreshDcdnObjectCaches</a> operation to query refresh task IDs.</li>
     * <li>Perform the <a href="https://help.aliyun.com/document_detail/130636.html">PreloadDcdnObjectCaches</a> operation to query prefetch task IDs.</li>
     * </ul>
     * <blockquote>
     * <p>You can specify at most 10 task IDs in each call. Separate IDs with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>113681**</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeDcdnRefreshTaskByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnRefreshTaskByIdRequest self = new DescribeDcdnRefreshTaskByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnRefreshTaskByIdRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
