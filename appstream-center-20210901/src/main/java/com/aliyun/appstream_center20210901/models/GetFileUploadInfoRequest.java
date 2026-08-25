// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetFileUploadInfoRequest extends TeaModel {
    /**
     * <p>The file type. Currently supported values: BrowserBookmarks and BrowserRestrictionUrls.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BrowserBookmarks</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static GetFileUploadInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileUploadInfoRequest self = new GetFileUploadInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetFileUploadInfoRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
