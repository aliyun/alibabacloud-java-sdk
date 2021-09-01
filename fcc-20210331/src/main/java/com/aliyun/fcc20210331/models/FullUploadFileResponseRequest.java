// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class FullUploadFileResponseRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("FileName")
    public String fileName;

    public static FullUploadFileResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        FullUploadFileResponseRequest self = new FullUploadFileResponseRequest();
        return TeaModel.build(map, self);
    }

    public FullUploadFileResponseRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public FullUploadFileResponseRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
