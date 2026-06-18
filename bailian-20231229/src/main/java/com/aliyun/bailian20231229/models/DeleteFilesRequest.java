// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class DeleteFilesRequest extends TeaModel {
    /**
     * <p>The list of IDs of the files to be deleted. A maximum of 20 files can be deleted in a single request.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileIds")
    public java.util.List<String> fileIds;

    public static DeleteFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFilesRequest self = new DeleteFilesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFilesRequest setFileIds(java.util.List<String> fileIds) {
        this.fileIds = fileIds;
        return this;
    }
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

}
