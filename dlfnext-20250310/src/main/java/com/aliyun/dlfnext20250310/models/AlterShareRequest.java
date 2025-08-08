// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterShareRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>share_name</p>
     */
    @NameInMap("shareName")
    public String shareName;

    public static AlterShareRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterShareRequest self = new AlterShareRequest();
        return TeaModel.build(map, self);
    }

    public AlterShareRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public AlterShareRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

}
