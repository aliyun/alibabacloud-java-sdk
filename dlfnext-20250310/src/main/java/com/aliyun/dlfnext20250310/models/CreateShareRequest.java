// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class CreateShareRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>share_name</p>
     */
    @NameInMap("shareName")
    public String shareName;

    public static CreateShareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateShareRequest self = new CreateShareRequest();
        return TeaModel.build(map, self);
    }

    public CreateShareRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateShareRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

}
