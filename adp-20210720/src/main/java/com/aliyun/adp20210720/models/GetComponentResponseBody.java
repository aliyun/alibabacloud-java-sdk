// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetComponentResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetComponentResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComponentResponseBody self = new GetComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComponentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComponentResponseBody setData(GetComponentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComponentResponseBodyData getData() {
        return this.data;
    }

    public GetComponentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetComponentResponseBodyData extends TeaModel {
        @NameInMap("category")
        public String category;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public String documents;

        @NameInMap("name")
        public String name;

        @NameInMap("public")
        public Boolean _public;

        @NameInMap("singleton")
        public Boolean singleton;

        @NameInMap("source")
        public String source;

        @NameInMap("uid")
        public String uid;

        public static GetComponentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetComponentResponseBodyData self = new GetComponentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetComponentResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetComponentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetComponentResponseBodyData setDocuments(String documents) {
            this.documents = documents;
            return this;
        }
        public String getDocuments() {
            return this.documents;
        }

        public GetComponentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComponentResponseBodyData set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public GetComponentResponseBodyData setSingleton(Boolean singleton) {
            this.singleton = singleton;
            return this;
        }
        public Boolean getSingleton() {
            return this.singleton;
        }

        public GetComponentResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetComponentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
