// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class GetProductVersionResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetProductVersionResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetProductVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionResponseBody self = new GetProductVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductVersionResponseBody setData(GetProductVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductVersionResponseBodyData getData() {
        return this.data;
    }

    public GetProductVersionResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductVersionResponseBodyData extends TeaModel {
        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("deletedAt")
        public String deletedAt;

        @NameInMap("document")
        public String document;

        @NameInMap("platforms")
        public String platforms;

        @NameInMap("productUID")
        public String productUID;

        @NameInMap("readme")
        public String readme;

        @NameInMap("uid")
        public String uid;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("version")
        public String version;

        public static GetProductVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductVersionResponseBodyData self = new GetProductVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductVersionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetProductVersionResponseBodyData setDeletedAt(String deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }
        public String getDeletedAt() {
            return this.deletedAt;
        }

        public GetProductVersionResponseBodyData setDocument(String document) {
            this.document = document;
            return this;
        }
        public String getDocument() {
            return this.document;
        }

        public GetProductVersionResponseBodyData setPlatforms(String platforms) {
            this.platforms = platforms;
            return this;
        }
        public String getPlatforms() {
            return this.platforms;
        }

        public GetProductVersionResponseBodyData setProductUID(String productUID) {
            this.productUID = productUID;
            return this;
        }
        public String getProductUID() {
            return this.productUID;
        }

        public GetProductVersionResponseBodyData setReadme(String readme) {
            this.readme = readme;
            return this;
        }
        public String getReadme() {
            return this.readme;
        }

        public GetProductVersionResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductVersionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetProductVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
