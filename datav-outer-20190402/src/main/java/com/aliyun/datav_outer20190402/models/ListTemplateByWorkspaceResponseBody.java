// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListTemplateByWorkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<ListTemplateByWorkspaceResponseBodyTemplates> templates;

    public static ListTemplateByWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateByWorkspaceResponseBody self = new ListTemplateByWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateByWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateByWorkspaceResponseBody setTemplates(java.util.List<ListTemplateByWorkspaceResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplateByWorkspaceResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListTemplateByWorkspaceResponseBodyTemplates extends TeaModel {
        @NameInMap("ID")
        public Float ID;

        @NameInMap("Name")
        public String name;

        @NameInMap("Snapshot")
        public String snapshot;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("Size")
        public String size;

        public static ListTemplateByWorkspaceResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateByWorkspaceResponseBodyTemplates self = new ListTemplateByWorkspaceResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplateByWorkspaceResponseBodyTemplates setID(Float ID) {
            this.ID = ID;
            return this;
        }
        public Float getID() {
            return this.ID;
        }

        public ListTemplateByWorkspaceResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplateByWorkspaceResponseBodyTemplates setSnapshot(String snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public String getSnapshot() {
            return this.snapshot;
        }

        public ListTemplateByWorkspaceResponseBodyTemplates setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public ListTemplateByWorkspaceResponseBodyTemplates setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
