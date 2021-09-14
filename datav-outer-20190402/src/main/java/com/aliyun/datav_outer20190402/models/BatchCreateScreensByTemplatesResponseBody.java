// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchCreateScreensByTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Screens")
    public java.util.List<BatchCreateScreensByTemplatesResponseBodyScreens> screens;

    public static BatchCreateScreensByTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateScreensByTemplatesResponseBody self = new BatchCreateScreensByTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateScreensByTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateScreensByTemplatesResponseBody setScreens(java.util.List<BatchCreateScreensByTemplatesResponseBodyScreens> screens) {
        this.screens = screens;
        return this;
    }
    public java.util.List<BatchCreateScreensByTemplatesResponseBodyScreens> getScreens() {
        return this.screens;
    }

    public static class BatchCreateScreensByTemplatesResponseBodyScreens extends TeaModel {
        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Thumbnail")
        public String thumbnail;

        public static BatchCreateScreensByTemplatesResponseBodyScreens build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateScreensByTemplatesResponseBodyScreens self = new BatchCreateScreensByTemplatesResponseBodyScreens();
            return TeaModel.build(map, self);
        }

        public BatchCreateScreensByTemplatesResponseBodyScreens setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public BatchCreateScreensByTemplatesResponseBodyScreens setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchCreateScreensByTemplatesResponseBodyScreens setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

    }

}
