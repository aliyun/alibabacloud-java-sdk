// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetGameVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 版本ID
    @NameInMap("VersionId")
    public String versionId;

    // 版本名称
    @NameInMap("VersionName")
    public String versionName;

    // 版本号
    @NameInMap("VersionNumber")
    public String versionNumber;

    public static GetGameVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGameVersionResponseBody self = new GetGameVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGameVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGameVersionResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public GetGameVersionResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public GetGameVersionResponseBody setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }
    public String getVersionNumber() {
        return this.versionNumber;
    }

}
