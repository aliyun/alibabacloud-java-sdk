// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterShareRequest extends TeaModel {
    /**
     * <p>The comment for the share.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>Specifies whether to enable the write permission for the share.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enableWrite")
    public Boolean enableWrite;

    /**
     * <p>The name of the share.</p>
     * 
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

    public AlterShareRequest setEnableWrite(Boolean enableWrite) {
        this.enableWrite = enableWrite;
        return this;
    }
    public Boolean getEnableWrite() {
        return this.enableWrite;
    }

    public AlterShareRequest setShareName(String shareName) {
        this.shareName = shareName;
        return this;
    }
    public String getShareName() {
        return this.shareName;
    }

}
