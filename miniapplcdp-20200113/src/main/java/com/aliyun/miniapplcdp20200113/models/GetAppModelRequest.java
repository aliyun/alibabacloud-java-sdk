// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetAppModelRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("SchemaVersion")
    public String schemaVersion;

    @NameInMap("Source")
    public String source;

    @NameInMap("SubType")
    public String subType;

    public static GetAppModelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppModelRequest self = new GetAppModelRequest();
        return TeaModel.build(map, self);
    }

    public GetAppModelRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppModelRequest setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
        return this;
    }
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    public GetAppModelRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetAppModelRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

}
