// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class UpdateRecycleBinAttributeRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

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
