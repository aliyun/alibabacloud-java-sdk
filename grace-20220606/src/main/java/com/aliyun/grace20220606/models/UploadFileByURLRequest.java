// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class UploadFileByURLRequest extends TeaModel {
    @NameInMap("displayName")
    public String displayName;

    @NameInMap("type")
    public String type;

    @NameInMap("url")
    public String url;

    public static UploadFileByURLRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadFileByURLRequest self = new UploadFileByURLRequest();
        return TeaModel.build(map, self);
    }

    public UploadFileByURLRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UploadFileByURLRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UploadFileByURLRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
