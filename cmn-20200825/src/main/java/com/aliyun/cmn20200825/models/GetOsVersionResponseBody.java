// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsVersionResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 数组，返回示例目录。
    @NameInMap("OsVersion")
    public java.util.List<GetOsVersionResponseBodyOsVersion> osVersion;

    public static GetOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOsVersionResponseBody self = new GetOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOsVersionResponseBody setOsVersion(java.util.List<GetOsVersionResponseBodyOsVersion> osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public java.util.List<GetOsVersionResponseBodyOsVersion> getOsVersion() {
        return this.osVersion;
    }

    public static class GetOsVersionResponseBodyOsVersion extends TeaModel {
        // 下载路径
        @NameInMap("DownloadPath")
        public String downloadPath;

        public static GetOsVersionResponseBodyOsVersion build(java.util.Map<String, ?> map) throws Exception {
            GetOsVersionResponseBodyOsVersion self = new GetOsVersionResponseBodyOsVersion();
            return TeaModel.build(map, self);
        }

        public GetOsVersionResponseBodyOsVersion setDownloadPath(String downloadPath) {
            this.downloadPath = downloadPath;
            return this;
        }
        public String getDownloadPath() {
            return this.downloadPath;
        }

    }

}
