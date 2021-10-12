// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("VersionId")
    @Validation(required = true)
    public String versionId;

    @NameInMap("VersionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("VersionNumber")
    @Validation(required = true)
    public String versionNumber;

    public static GetGameVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionResponse self = new GetGameVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetGameVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameVersionResponse setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetGameVersionResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public GetGameVersionResponse setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }
    public String getVersionNumber() {
        return this.versionNumber;
    }

}
