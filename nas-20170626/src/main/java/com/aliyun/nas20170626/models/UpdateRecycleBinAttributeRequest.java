// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateRecycleBinAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the file system.</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The retention period of the files in the recycle bin. Unit: days.</p>
     * <br>
     * <p>Valid values: 1 to 180.</p>
     * <br>
     * <p>Default value: 3.</p>
     */
    @NameInMap("ReservedDays")
    public Long reservedDays;

    public static UpdateRecycleBinAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecycleBinAttributeRequest self = new UpdateRecycleBinAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRecycleBinAttributeRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public UpdateRecycleBinAttributeRequest setReservedDays(Long reservedDays) {
        this.reservedDays = reservedDays;
        return this;
    }
    public Long getReservedDays() {
        return this.reservedDays;
    }

}
