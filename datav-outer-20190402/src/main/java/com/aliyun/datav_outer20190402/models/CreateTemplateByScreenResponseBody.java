// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class CreateTemplateByScreenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Template")
    public CreateTemplateByScreenResponseBodyTemplate template;

    public static CreateTemplateByScreenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateByScreenResponseBody self = new CreateTemplateByScreenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTemplateByScreenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTemplateByScreenResponseBody setTemplate(CreateTemplateByScreenResponseBodyTemplate template) {
        this.template = template;
        return this;
    }
    public CreateTemplateByScreenResponseBodyTemplate getTemplate() {
        return this.template;
    }

    public static class CreateTemplateByScreenResponseBodyTemplate extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        public static CreateTemplateByScreenResponseBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateTemplateByScreenResponseBodyTemplate self = new CreateTemplateByScreenResponseBodyTemplate();
            return TeaModel.build(map, self);
        }

        public CreateTemplateByScreenResponseBodyTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTemplateByScreenResponseBodyTemplate setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public CreateTemplateByScreenResponseBodyTemplate setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

    }

}
