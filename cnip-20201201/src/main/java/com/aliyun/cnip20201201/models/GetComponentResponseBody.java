// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetComponentResponseBody extends TeaModel {
    @NameInMap("data")
    public GetComponentResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComponentResponseBody self = new GetComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComponentResponseBody setData(GetComponentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetComponentResponseBodyData getData() {
        return this.data;
    }

    public GetComponentResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetComponentResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetComponentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComponentResponseBodyDataAnnotations extends TeaModel {
        @NameInMap("additionalProp1")
        public String additionalProp1;

        @NameInMap("additionalProp2")
        public String additionalProp2;

        @NameInMap("additionalProp3")
        public String additionalProp3;

        public static GetComponentResponseBodyDataAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetComponentResponseBodyDataAnnotations self = new GetComponentResponseBodyDataAnnotations();
            return TeaModel.build(map, self);
        }

        public GetComponentResponseBodyDataAnnotations setAdditionalProp1(String additionalProp1) {
            this.additionalProp1 = additionalProp1;
            return this;
        }
        public String getAdditionalProp1() {
            return this.additionalProp1;
        }

        public GetComponentResponseBodyDataAnnotations setAdditionalProp2(String additionalProp2) {
            this.additionalProp2 = additionalProp2;
            return this;
        }
        public String getAdditionalProp2() {
            return this.additionalProp2;
        }

        public GetComponentResponseBodyDataAnnotations setAdditionalProp3(String additionalProp3) {
            this.additionalProp3 = additionalProp3;
            return this;
        }
        public String getAdditionalProp3() {
            return this.additionalProp3;
        }

    }

    public static class GetComponentResponseBodyData extends TeaModel {
        @NameInMap("annotations")
        public GetComponentResponseBodyDataAnnotations annotations;

        @NameInMap("category")
        public String category;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public String documents;

        @NameInMap("name")
        public String name;

        @NameInMap("provider")
        public String provider;

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

        public GetComponentResponseBodyData setAnnotations(GetComponentResponseBodyDataAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public GetComponentResponseBodyDataAnnotations getAnnotations() {
            return this.annotations;
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

        public GetComponentResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
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
