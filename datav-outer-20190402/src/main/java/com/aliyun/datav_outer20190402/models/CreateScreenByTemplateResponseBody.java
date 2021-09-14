// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateScreenByTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Screen")
    public CreateScreenByTemplateResponseBodyScreen screen;

    public static CreateScreenByTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScreenByTemplateResponseBody self = new CreateScreenByTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScreenByTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScreenByTemplateResponseBody setScreen(CreateScreenByTemplateResponseBodyScreen screen) {
        this.screen = screen;
        return this;
    }
    public CreateScreenByTemplateResponseBodyScreen getScreen() {
        return this.screen;
    }

    public static class CreateScreenByTemplateResponseBodyScreen extends TeaModel {
        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("TemplateId")
        public Integer templateId;

        public static CreateScreenByTemplateResponseBodyScreen build(java.util.Map<String, ?> map) throws Exception {
            CreateScreenByTemplateResponseBodyScreen self = new CreateScreenByTemplateResponseBodyScreen();
            return TeaModel.build(map, self);
        }

        public CreateScreenByTemplateResponseBodyScreen setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public CreateScreenByTemplateResponseBodyScreen setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateScreenByTemplateResponseBodyScreen setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public CreateScreenByTemplateResponseBodyScreen setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

    }

}
