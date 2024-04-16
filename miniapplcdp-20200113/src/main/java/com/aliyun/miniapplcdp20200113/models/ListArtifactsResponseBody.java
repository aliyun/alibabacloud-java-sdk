// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListArtifactsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListArtifactsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListArtifactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListArtifactsResponseBody self = new ListArtifactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListArtifactsResponseBody setData(ListArtifactsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListArtifactsResponseBodyData getData() {
        return this.data;
    }

    public ListArtifactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListArtifactsResponseBodyDataItems extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("ArtifactType")
        public String artifactType;

        @NameInMap("Available")
        public Boolean available;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Url")
        public String url;

        public static ListArtifactsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsResponseBodyDataItems self = new ListArtifactsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListArtifactsResponseBodyDataItems setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListArtifactsResponseBodyDataItems setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public ListArtifactsResponseBodyDataItems setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListArtifactsResponseBodyDataItems setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListArtifactsResponseBodyDataItems setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListArtifactsResponseBodyDataItems setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListArtifactsResponseBodyDataItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListArtifactsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<ListArtifactsResponseBodyDataItems> items;

        public static ListArtifactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListArtifactsResponseBodyData self = new ListArtifactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListArtifactsResponseBodyData setItems(java.util.List<ListArtifactsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListArtifactsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
