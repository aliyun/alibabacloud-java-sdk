// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetUploadInfoRequest extends TeaModel {
    /**
     * <p>The ID of the business region where the file is uploaded. If this parameter is not specified, the default OSS region configured for the service is used.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <p>The type of the file to upload. Currently, only TASK is supported, which indicates an image task file.</p>
     * 
     * <strong>example:</strong>
     * <p>TASK</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static GetUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadInfoRequest self = new GetUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadInfoRequest setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetUploadInfoRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
