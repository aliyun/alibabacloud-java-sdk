// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class BatchUpdateFileTagShrinkRequest extends TeaModel {
    /**
     * <p>A list of files to update.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileInfos")
    public String fileInfosShrink;

    /**
     * <p>The update mode. Valid values are APPEND and OVERWRITE.</p>
     * 
     * <strong>example:</strong>
     * <p>OVERWRITE</p>
     */
    @NameInMap("UpdateMode")
    public String updateMode;

    public static BatchUpdateFileTagShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileTagShrinkRequest self = new BatchUpdateFileTagShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileTagShrinkRequest setFileInfosShrink(String fileInfosShrink) {
        this.fileInfosShrink = fileInfosShrink;
        return this;
    }
    public String getFileInfosShrink() {
        return this.fileInfosShrink;
    }

    public BatchUpdateFileTagShrinkRequest setUpdateMode(String updateMode) {
        this.updateMode = updateMode;
        return this;
    }
    public String getUpdateMode() {
        return this.updateMode;
    }

}
