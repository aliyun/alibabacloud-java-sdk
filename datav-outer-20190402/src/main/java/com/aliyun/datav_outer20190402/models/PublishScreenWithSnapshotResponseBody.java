// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class PublishScreenWithSnapshotResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Screen")
    public PublishScreenWithSnapshotResponseBodyScreen screen;

    public static PublishScreenWithSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishScreenWithSnapshotResponseBody self = new PublishScreenWithSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishScreenWithSnapshotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PublishScreenWithSnapshotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishScreenWithSnapshotResponseBody setScreen(PublishScreenWithSnapshotResponseBodyScreen screen) {
        this.screen = screen;
        return this;
    }
    public PublishScreenWithSnapshotResponseBodyScreen getScreen() {
        return this.screen;
    }

    public static class PublishScreenWithSnapshotResponseBodyScreen extends TeaModel {
        @NameInMap("Token")
        public String token;

        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("SnapshotId")
        public Integer snapshotId;

        public static PublishScreenWithSnapshotResponseBodyScreen build(java.util.Map<String, ?> map) throws Exception {
            PublishScreenWithSnapshotResponseBodyScreen self = new PublishScreenWithSnapshotResponseBodyScreen();
            return TeaModel.build(map, self);
        }

        public PublishScreenWithSnapshotResponseBodyScreen setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public PublishScreenWithSnapshotResponseBodyScreen setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public PublishScreenWithSnapshotResponseBodyScreen setSnapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Integer getSnapshotId() {
            return this.snapshotId;
        }

    }

}
