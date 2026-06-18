// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteFilesShrinkRequest extends TeaModel {
    /**
     * <p>The list of IDs of the files to be deleted. A maximum of 20 files can be deleted in a single request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileIds")
    public String fileIdsShrink;

    public static DeleteFilesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesShrinkRequest self = new DeleteFilesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFilesShrinkRequest setFileIdsShrink(String fileIdsShrink) {
        this.fileIdsShrink = fileIdsShrink;
        return this;
    }
    public String getFileIdsShrink() {
        return this.fileIdsShrink;
    }

}
