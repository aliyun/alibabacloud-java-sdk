// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetArtifactResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetArtifactResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetArtifactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetArtifactResponseBody self = new GetArtifactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetArtifactResponseBody setData(GetArtifactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetArtifactResponseBodyData getData() {
        return this.data;
    }

    public GetArtifactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetArtifactResponseBodyData extends TeaModel {
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

        public static GetArtifactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetArtifactResponseBodyData self = new GetArtifactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetArtifactResponseBodyData setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public GetArtifactResponseBodyData setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public GetArtifactResponseBodyData setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public GetArtifactResponseBodyData setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public GetArtifactResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetArtifactResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetArtifactResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
