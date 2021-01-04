// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadL4RulesFileForParseRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("FileKey")
    public String fileKey;

    public static UploadL4RulesFileForParseRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadL4RulesFileForParseRequest self = new UploadL4RulesFileForParseRequest();
        return TeaModel.build(map, self);
    }

    public UploadL4RulesFileForParseRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadL4RulesFileForParseRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadL4RulesFileForParseRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
