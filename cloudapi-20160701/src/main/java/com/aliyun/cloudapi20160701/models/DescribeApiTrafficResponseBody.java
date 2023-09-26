// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficResponseBody extends TeaModel {
    @NameInMap("Downloads")
    public DescribeApiTrafficResponseBodyDownloads downloads;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Uploads")
    public DescribeApiTrafficResponseBodyUploads uploads;

    public static DescribeApiTrafficResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficResponseBody self = new DescribeApiTrafficResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficResponseBody setDownloads(DescribeApiTrafficResponseBodyDownloads downloads) {
        this.downloads = downloads;
        return this;
    }
    public DescribeApiTrafficResponseBodyDownloads getDownloads() {
        return this.downloads;
    }

    public DescribeApiTrafficResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiTrafficResponseBody setUploads(DescribeApiTrafficResponseBodyUploads uploads) {
        this.uploads = uploads;
        return this;
    }
    public DescribeApiTrafficResponseBodyUploads getUploads() {
        return this.uploads;
    }

    public static class DescribeApiTrafficResponseBodyDownloadsDownload extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiTrafficResponseBodyDownloadsDownload build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficResponseBodyDownloadsDownload self = new DescribeApiTrafficResponseBodyDownloadsDownload();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficResponseBodyDownloadsDownload setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiTrafficResponseBodyDownloadsDownload setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiTrafficResponseBodyDownloads extends TeaModel {
        @NameInMap("Download")
        public java.util.List<DescribeApiTrafficResponseBodyDownloadsDownload> download;

        public static DescribeApiTrafficResponseBodyDownloads build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficResponseBodyDownloads self = new DescribeApiTrafficResponseBodyDownloads();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficResponseBodyDownloads setDownload(java.util.List<DescribeApiTrafficResponseBodyDownloadsDownload> download) {
            this.download = download;
            return this;
        }
        public java.util.List<DescribeApiTrafficResponseBodyDownloadsDownload> getDownload() {
            return this.download;
        }

    }

    public static class DescribeApiTrafficResponseBodyUploadsUpload extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Value")
        public String value;

        public static DescribeApiTrafficResponseBodyUploadsUpload build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficResponseBodyUploadsUpload self = new DescribeApiTrafficResponseBodyUploadsUpload();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficResponseBodyUploadsUpload setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public DescribeApiTrafficResponseBodyUploadsUpload setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeApiTrafficResponseBodyUploads extends TeaModel {
        @NameInMap("Upload")
        public java.util.List<DescribeApiTrafficResponseBodyUploadsUpload> upload;

        public static DescribeApiTrafficResponseBodyUploads build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiTrafficResponseBodyUploads self = new DescribeApiTrafficResponseBodyUploads();
            return TeaModel.build(map, self);
        }

        public DescribeApiTrafficResponseBodyUploads setUpload(java.util.List<DescribeApiTrafficResponseBodyUploadsUpload> upload) {
            this.upload = upload;
            return this;
        }
        public java.util.List<DescribeApiTrafficResponseBodyUploadsUpload> getUpload() {
            return this.upload;
        }

    }

}
