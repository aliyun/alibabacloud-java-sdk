// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListTemplateByIdsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListTemplateByIdsResponseBodyTemplates> templates;

    public static ListTemplateByIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateByIdsResponseBody self = new ListTemplateByIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateByIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateByIdsResponseBody setTemplates(java.util.List<ListTemplateByIdsResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplateByIdsResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListTemplateByIdsResponseBodyTemplates extends TeaModel {
        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("Size")
        public String size;

        @NameInMap("Name")
        public String name;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Config")
        public String config;

        @NameInMap("ID")
        public String ID;

        public static ListTemplateByIdsResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateByIdsResponseBodyTemplates self = new ListTemplateByIdsResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplateByIdsResponseBodyTemplates setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public ListTemplateByIdsResponseBodyTemplates setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListTemplateByIdsResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplateByIdsResponseBodyTemplates setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public ListTemplateByIdsResponseBodyTemplates setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListTemplateByIdsResponseBodyTemplates setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

    }

}
