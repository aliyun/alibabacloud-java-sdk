// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class GetScreenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Screen")
    public GetScreenResponseBodyScreen screen;

    public static GetScreenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetScreenResponseBody self = new GetScreenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetScreenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScreenResponseBody setScreen(GetScreenResponseBodyScreen screen) {
        this.screen = screen;
        return this;
    }
    public GetScreenResponseBodyScreen getScreen() {
        return this.screen;
    }

    public static class GetScreenResponseBodyScreen extends TeaModel {
        @NameInMap("Interaction")
        public String interaction;

        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("Share")
        public String share;

        @NameInMap("Js")
        public String js;

        @NameInMap("ProjectId")
        public Integer projectId;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Config")
        public String config;

        public static GetScreenResponseBodyScreen build(java.util.Map<String, ?> map) throws Exception {
            GetScreenResponseBodyScreen self = new GetScreenResponseBodyScreen();
            return TeaModel.build(map, self);
        }

        public GetScreenResponseBodyScreen setInteraction(String interaction) {
            this.interaction = interaction;
            return this;
        }
        public String getInteraction() {
            return this.interaction;
        }

        public GetScreenResponseBodyScreen setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public GetScreenResponseBodyScreen setShare(String share) {
            this.share = share;
            return this;
        }
        public String getShare() {
            return this.share;
        }

        public GetScreenResponseBodyScreen setJs(String js) {
            this.js = js;
            return this;
        }
        public String getJs() {
            return this.js;
        }

        public GetScreenResponseBodyScreen setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetScreenResponseBodyScreen setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetScreenResponseBodyScreen setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetScreenResponseBodyScreen setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public GetScreenResponseBodyScreen setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
