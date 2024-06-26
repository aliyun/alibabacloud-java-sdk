// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteEditingProjectsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>fb2101bf24bf41cb318787dc</strong></strong>,<strong><strong>87dcfb2101bf24bf41cb3187</strong></strong></p>
     */
    @NameInMap("ProjectIds")
    public String projectIds;

    public static DeleteEditingProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEditingProjectsRequest self = new DeleteEditingProjectsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEditingProjectsRequest setProjectIds(String projectIds) {
        this.projectIds = projectIds;
        return this;
    }
    public String getProjectIds() {
        return this.projectIds;
    }

}
