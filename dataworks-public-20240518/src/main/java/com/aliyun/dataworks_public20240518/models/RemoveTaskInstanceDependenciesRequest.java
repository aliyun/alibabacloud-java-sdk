// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveTaskInstanceDependenciesRequest extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>this is a comment</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The IDs of ancestor instances of the instance</p>
     */
    @NameInMap("UpstreamTaskInstanceIds")
    public java.util.List<Long> upstreamTaskInstanceIds;

    public static RemoveTaskInstanceDependenciesRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTaskInstanceDependenciesRequest self = new RemoveTaskInstanceDependenciesRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTaskInstanceDependenciesRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RemoveTaskInstanceDependenciesRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RemoveTaskInstanceDependenciesRequest setUpstreamTaskInstanceIds(java.util.List<Long> upstreamTaskInstanceIds) {
        this.upstreamTaskInstanceIds = upstreamTaskInstanceIds;
        return this;
    }
    public java.util.List<Long> getUpstreamTaskInstanceIds() {
        return this.upstreamTaskInstanceIds;
    }

}
