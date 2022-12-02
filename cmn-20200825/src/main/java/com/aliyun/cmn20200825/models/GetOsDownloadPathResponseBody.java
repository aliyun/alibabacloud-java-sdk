// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsDownloadPathResponseBody extends TeaModel {
    @NameInMap("OsVersion")
    public GetOsDownloadPathResponseBodyOsVersion osVersion;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOsDownloadPathResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOsDownloadPathResponseBody self = new GetOsDownloadPathResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOsDownloadPathResponseBody setOsVersion(GetOsDownloadPathResponseBodyOsVersion osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public GetOsDownloadPathResponseBodyOsVersion getOsVersion() {
        return this.osVersion;
    }

    public GetOsDownloadPathResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOsDownloadPathResponseBodyOsVersion extends TeaModel {
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
