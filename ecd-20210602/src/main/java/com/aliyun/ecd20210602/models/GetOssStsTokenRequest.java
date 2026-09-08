// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetOssStsTokenRequest extends TeaModel {
    /**
     * <p>The file type.</p>
     * 
     * <strong>example:</strong>
     * <p>SKILL</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static GetOssStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssStsTokenRequest self = new GetOssStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetOssStsTokenRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
