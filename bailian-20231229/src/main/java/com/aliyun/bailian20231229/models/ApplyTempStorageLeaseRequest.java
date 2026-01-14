// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyTempStorageLeaseRequest extends TeaModel {
    /**
     * <p>The file name, including the file extension.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.txt</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>The size of the file, in bytes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("SizeInBytes")
    public Long sizeInBytes;

    public static ApplyTempStorageLeaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyTempStorageLeaseRequest self = new ApplyTempStorageLeaseRequest();
        return TeaModel.build(map, self);
    }

    public ApplyTempStorageLeaseRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ApplyTempStorageLeaseRequest setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

}
