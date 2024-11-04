// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateFileTagRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static UpdateFileTagRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileTagRequest self = new UpdateFileTagRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileTagRequest setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
