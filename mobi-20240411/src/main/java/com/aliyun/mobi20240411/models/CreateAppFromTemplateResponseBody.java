// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mobi20240411.models;

import com.aliyun.tea.*;

public class CreateAppFromTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateAppFromTemplateResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>36F552F7-E61E-556A-9957-8284318D1B9C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAppFromTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAppFromTemplateResponseBody self = new CreateAppFromTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAppFromTemplateResponseBody setData(CreateAppFromTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateAppFromTemplateResponseBodyData getData() {
        return this.data;
    }

    public CreateAppFromTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAppFromTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>172050620*****</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>2024-03-26T10:22Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-03-26T10:22Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Icon")
        public String icon;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1731664463*****</p>
         */
        @NameInMap("WorkspaceId")
        public String workspaceId;

        public static CreateAppFromTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateAppFromTemplateResponseBodyData self = new CreateAppFromTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateAppFromTemplateResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateAppFromTemplateResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAppFromTemplateResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateAppFromTemplateResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateAppFromTemplateResponseBodyData setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public CreateAppFromTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAppFromTemplateResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
