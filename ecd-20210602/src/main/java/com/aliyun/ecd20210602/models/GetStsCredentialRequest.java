// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetStsCredentialRequest extends TeaModel {
    @NameInMap("FileType")
    public String fileType;

    public static GetStsCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsCredentialRequest self = new GetStsCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetStsCredentialRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
