// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ModifyClusterTagsRequest extends TeaModel {
    /**
     * <p>The data of the labels that you want to modify.</p>
     */
    @NameInMap("body")
    public java.util.List<Tag> body;

    public static ModifyClusterTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterTagsRequest self = new ModifyClusterTagsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterTagsRequest setBody(java.util.List<Tag> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Tag> getBody() {
        return this.body;
    }

}
