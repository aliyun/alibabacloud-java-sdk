// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class EnableRecycleBinRequest extends TeaModel {
    @NameInMap("FileSystemId")
    public String fileSystemId;

    @NameInMap("ReservedDays")
    public Long reservedDays;

    public static EnableRecycleBinRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableRecycleBinRequest self = new EnableRecycleBinRequest();
        return TeaModel.build(map, self);
    }

    public EnableRecycleBinRequest setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public EnableRecycleBinRequest setReservedDays(Long reservedDays) {
        this.reservedDays = reservedDays;
        return this;
    }
    public Long getReservedDays() {
        return this.reservedDays;
    }

}
