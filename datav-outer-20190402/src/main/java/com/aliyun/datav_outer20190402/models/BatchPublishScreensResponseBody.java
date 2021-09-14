// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchPublishScreensResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Screens")
    public java.util.List<BatchPublishScreensResponseBodyScreens> screens;

    public static BatchPublishScreensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchPublishScreensResponseBody self = new BatchPublishScreensResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchPublishScreensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchPublishScreensResponseBody setScreens(java.util.List<BatchPublishScreensResponseBodyScreens> screens) {
        this.screens = screens;
        return this;
    }
    public java.util.List<BatchPublishScreensResponseBodyScreens> getScreens() {
        return this.screens;
    }

    public static class BatchPublishScreensResponseBodyScreens extends TeaModel {
        @NameInMap("Token")
        public String token;

        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("Share")
        public String share;

        @NameInMap("SnapshotId")
        public Integer snapshotId;

        public static BatchPublishScreensResponseBodyScreens build(java.util.Map<String, ?> map) throws Exception {
            BatchPublishScreensResponseBodyScreens self = new BatchPublishScreensResponseBodyScreens();
            return TeaModel.build(map, self);
        }

        public BatchPublishScreensResponseBodyScreens setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public BatchPublishScreensResponseBodyScreens setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public BatchPublishScreensResponseBodyScreens setShare(String share) {
            this.share = share;
            return this;
        }
        public String getShare() {
            return this.share;
        }

        public BatchPublishScreensResponseBodyScreens setSnapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Integer getSnapshotId() {
            return this.snapshotId;
        }

    }

}
