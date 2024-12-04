// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RemoveTaskInstanceDependenciesShrinkRequest extends TeaModel {
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
    public String upstreamTaskInstanceIdsShrink;

    public static RemoveTaskInstanceDependenciesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTaskInstanceDependenciesShrinkRequest self = new RemoveTaskInstanceDependenciesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTaskInstanceDependenciesShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public RemoveTaskInstanceDependenciesShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public RemoveTaskInstanceDependenciesShrinkRequest setUpstreamTaskInstanceIdsShrink(String upstreamTaskInstanceIdsShrink) {
        this.upstreamTaskInstanceIdsShrink = upstreamTaskInstanceIdsShrink;
        return this;
    }
    public String getUpstreamTaskInstanceIdsShrink() {
        return this.upstreamTaskInstanceIdsShrink;
    }

}
