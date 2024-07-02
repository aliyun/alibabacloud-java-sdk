// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ApplyFileUploadLeaseRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>19657c391f6c70bcea63c154d8606bb3</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("SizeInBytes")
    public String sizeInBytes;

    public static ApplyFileUploadLeaseRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFileUploadLeaseRequest self = new ApplyFileUploadLeaseRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFileUploadLeaseRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ApplyFileUploadLeaseRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public ApplyFileUploadLeaseRequest setSizeInBytes(String sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
        return this;
    }
    public String getSizeInBytes() {
        return this.sizeInBytes;
    }

}
