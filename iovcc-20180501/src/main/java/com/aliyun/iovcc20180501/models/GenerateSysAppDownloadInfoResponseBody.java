// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateSysAppDownloadInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SysAppDownloadInfo")
    public GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo sysAppDownloadInfo;

    public static GenerateSysAppDownloadInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSysAppDownloadInfoResponseBody self = new GenerateSysAppDownloadInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSysAppDownloadInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateSysAppDownloadInfoResponseBody setSysAppDownloadInfo(GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo sysAppDownloadInfo) {
        this.sysAppDownloadInfo = sysAppDownloadInfo;
        return this;
    }
    public GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo getSysAppDownloadInfo() {
        return this.sysAppDownloadInfo;
    }

    public static class GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo build(java.util.Map<String, ?> map) throws Exception {
            GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo self = new GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo();
            return TeaModel.build(map, self);
        }

        public GenerateSysAppDownloadInfoResponseBodySysAppDownloadInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
