// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteFileUploadRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TrailCenter</p>
     */
    @NameInMap("CallFrom")
    public String callFrom;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f-8*******01m</p>
     */
    @NameInMap("FileId")
    public String fileId;

    public static DeleteFileUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileUploadRequest self = new DeleteFileUploadRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFileUploadRequest setCallFrom(String callFrom) {
        this.callFrom = callFrom;
        return this;
    }
    public String getCallFrom() {
        return this.callFrom;
    }

    public DeleteFileUploadRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public DeleteFileUploadRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

}
