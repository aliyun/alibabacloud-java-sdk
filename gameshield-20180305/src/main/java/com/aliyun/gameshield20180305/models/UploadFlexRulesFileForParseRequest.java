// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadFlexRulesFileForParseRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("FileKey")
    public String fileKey;

    public static UploadFlexRulesFileForParseRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFlexRulesFileForParseRequest self = new UploadFlexRulesFileForParseRequest();
        return TeaModel.build(map, self);
    }

    public UploadFlexRulesFileForParseRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadFlexRulesFileForParseRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
