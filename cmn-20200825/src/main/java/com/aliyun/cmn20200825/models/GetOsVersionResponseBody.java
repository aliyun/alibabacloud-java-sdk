// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetOsVersionResponseBody extends TeaModel {
    @NameInMap("OsVersion")
    public java.util.List<GetOsVersionResponseBodyOsVersion> osVersion;

    @NameInMap("RequestId")
    public String requestId;

    public static GetOsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOsVersionResponseBody self = new GetOsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOsVersionResponseBody setOsVersion(java.util.List<GetOsVersionResponseBodyOsVersion> osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public java.util.List<GetOsVersionResponseBodyOsVersion> getOsVersion() {
        return this.osVersion;
    }

    public GetOsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetOsVersionResponseBodyOsVersion extends TeaModel {
        /**
         * <p>系统版本</p>
         */
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
