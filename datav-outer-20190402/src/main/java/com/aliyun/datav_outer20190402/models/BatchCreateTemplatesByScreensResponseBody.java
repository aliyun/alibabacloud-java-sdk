// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchCreateTemplatesByScreensResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<BatchCreateTemplatesByScreensResponseBodyTemplates> templates;

    public static BatchCreateTemplatesByScreensResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateTemplatesByScreensResponseBody self = new BatchCreateTemplatesByScreensResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateTemplatesByScreensResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateTemplatesByScreensResponseBody setTemplates(java.util.List<BatchCreateTemplatesByScreensResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<BatchCreateTemplatesByScreensResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class BatchCreateTemplatesByScreensResponseBodyTemplates extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateId")
        public Integer templateId;

        @NameInMap("Thumbnail")
        public String thumbnail;

        public static BatchCreateTemplatesByScreensResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateTemplatesByScreensResponseBodyTemplates self = new BatchCreateTemplatesByScreensResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public BatchCreateTemplatesByScreensResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public BatchCreateTemplatesByScreensResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BatchCreateTemplatesByScreensResponseBodyTemplates setTemplateId(Integer templateId) {
            this.templateId = templateId;
            return this;
        }
        public Integer getTemplateId() {
            return this.templateId;
        }

        public BatchCreateTemplatesByScreensResponseBodyTemplates setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

    }

}
