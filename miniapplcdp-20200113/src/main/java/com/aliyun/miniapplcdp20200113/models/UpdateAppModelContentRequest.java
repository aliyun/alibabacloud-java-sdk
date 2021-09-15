// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class UpdateAppModelContentRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Content")
    public String content;

    @NameInMap("EncodeType")
    public String encodeType;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("SubType")
    public String subType;

    public static UpdateAppModelContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppModelContentRequest self = new UpdateAppModelContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppModelContentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAppModelContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateAppModelContentRequest setEncodeType(String encodeType) {
        this.encodeType = encodeType;
        return this;
    }
    public String getEncodeType() {
        return this.encodeType;
    }

    public UpdateAppModelContentRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public UpdateAppModelContentRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
