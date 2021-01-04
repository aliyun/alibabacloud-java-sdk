// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadCcRouteFileForParseRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("FileKey")
    public String fileKey;

    public static UploadCcRouteFileForParseRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCcRouteFileForParseRequest self = new UploadCcRouteFileForParseRequest();
        return TeaModel.build(map, self);
    }

    public UploadCcRouteFileForParseRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadCcRouteFileForParseRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadCcRouteFileForParseRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
