// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ListScreenByWorkspaceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScreenInstances")
    public ListScreenByWorkspaceResponseBodyScreenInstances screenInstances;

    public static ListScreenByWorkspaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScreenByWorkspaceResponseBody self = new ListScreenByWorkspaceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScreenByWorkspaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScreenByWorkspaceResponseBody setScreenInstances(ListScreenByWorkspaceResponseBodyScreenInstances screenInstances) {
        this.screenInstances = screenInstances;
        return this;
    }
    public ListScreenByWorkspaceResponseBodyScreenInstances getScreenInstances() {
        return this.screenInstances;
    }

    public static class ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance extends TeaModel {
        @NameInMap("Template")
        public String template;

        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("ShareUrl")
        public String shareUrl;

        @NameInMap("UpdatedAt")
        public String updatedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Thumbnail")
        public String thumbnail;

        @NameInMap("ID")
        public String ID;

        public static ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance build(java.util.Map<String, ?> map) throws Exception {
            ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance self = new ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance();
            return TeaModel.build(map, self);
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setShareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
            return this;
        }
        public String getShareUrl() {
            return this.shareUrl;
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
            return this;
        }
        public String getThumbnail() {
            return this.thumbnail;
        }

        public ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance setID(String ID) {
            this.ID = ID;
            return this;
        }
        public String getID() {
            return this.ID;
        }

    }

    public static class ListScreenByWorkspaceResponseBodyScreenInstances extends TeaModel {
        @NameInMap("ScreenInstance")
        public java.util.List<ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance> screenInstance;

        public static ListScreenByWorkspaceResponseBodyScreenInstances build(java.util.Map<String, ?> map) throws Exception {
            ListScreenByWorkspaceResponseBodyScreenInstances self = new ListScreenByWorkspaceResponseBodyScreenInstances();
            return TeaModel.build(map, self);
        }

        public ListScreenByWorkspaceResponseBodyScreenInstances setScreenInstance(java.util.List<ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance> screenInstance) {
            this.screenInstance = screenInstance;
            return this;
        }
        public java.util.List<ListScreenByWorkspaceResponseBodyScreenInstancesScreenInstance> getScreenInstance() {
            return this.screenInstance;
        }

    }

}
