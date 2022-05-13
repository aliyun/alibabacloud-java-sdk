// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DownloadRecordingsResponseBody extends TeaModel {
    @NameInMap("DownloadUrls")
    public java.util.List<DownloadRecordingsResponseBodyDownloadUrls> downloadUrls;

    @NameInMap("RequestId")
    public String requestId;

    public static DownloadRecordingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingsResponseBody self = new DownloadRecordingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingsResponseBody setDownloadUrls(java.util.List<DownloadRecordingsResponseBodyDownloadUrls> downloadUrls) {
        this.downloadUrls = downloadUrls;
        return this;
    }
    public java.util.List<DownloadRecordingsResponseBodyDownloadUrls> getDownloadUrls() {
        return this.downloadUrls;
    }

    public DownloadRecordingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DownloadRecordingsResponseBodyDownloadUrls extends TeaModel {
        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Url")
        public String url;

        public static DownloadRecordingsResponseBodyDownloadUrls build(java.util.Map<String, ?> map) throws Exception {
            DownloadRecordingsResponseBodyDownloadUrls self = new DownloadRecordingsResponseBodyDownloadUrls();
            return TeaModel.build(map, self);
        }

        public DownloadRecordingsResponseBodyDownloadUrls setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public DownloadRecordingsResponseBodyDownloadUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
