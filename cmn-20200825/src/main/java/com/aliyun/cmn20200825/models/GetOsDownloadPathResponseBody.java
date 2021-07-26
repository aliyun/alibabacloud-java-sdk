// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsDownloadPathResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 系统版本
    @NameInMap("OsVersion")
    public GetOsDownloadPathResponseBodyOsVersion osVersion;

    public static GetOsDownloadPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOsDownloadPathResponseBody self = new GetOsDownloadPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOsDownloadPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOsDownloadPathResponseBody setOsVersion(GetOsDownloadPathResponseBodyOsVersion osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public GetOsDownloadPathResponseBodyOsVersion getOsVersion() {
        return this.osVersion;
    }

    public static class GetOsDownloadPathResponseBodyOsVersion extends TeaModel {
        // 系统版本下载路径
        @NameInMap("DownloadPath")
        public String downloadPath;

        public static GetOsDownloadPathResponseBodyOsVersion build(java.util.Map<String, ?> map) throws Exception {
            GetOsDownloadPathResponseBodyOsVersion self = new GetOsDownloadPathResponseBodyOsVersion();
            return TeaModel.build(map, self);
        }

        public GetOsDownloadPathResponseBodyOsVersion setDownloadPath(String downloadPath) {
            this.downloadPath = downloadPath;
            return this;
        }
        public String getDownloadPath() {
            return this.downloadPath;
        }

    }

}
