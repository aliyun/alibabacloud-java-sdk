// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAdminStsCredentialRequest extends TeaModel {
    @NameInMap("FileType")
    public Integer fileType;

    @NameInMap("IsManual")
    public Boolean isManual;

    public static GetAdminStsCredentialRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdminStsCredentialRequest self = new GetAdminStsCredentialRequest();
        return TeaModel.build(map, self);
    }

    public GetAdminStsCredentialRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public GetAdminStsCredentialRequest setIsManual(Boolean isManual) {
        this.isManual = isManual;
        return this;
    }
    public Boolean getIsManual() {
        return this.isManual;
    }

}
