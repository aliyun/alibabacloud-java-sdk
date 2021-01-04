// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadFlexAccRulesFileForParseRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("FileKey")
    public String fileKey;

    public static UploadFlexAccRulesFileForParseRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFlexAccRulesFileForParseRequest self = new UploadFlexAccRulesFileForParseRequest();
        return TeaModel.build(map, self);
    }

    public UploadFlexAccRulesFileForParseRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadFlexAccRulesFileForParseRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
