// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetChildrenComponentVersionParametersListResponseBody extends TeaModel {
    @NameInMap("data")
    public GetChildrenComponentVersionParametersListResponseBodyData data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    @NameInMap("success")
    public Boolean success;

    public static GetChildrenComponentVersionParametersListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChildrenComponentVersionParametersListResponseBody self = new GetChildrenComponentVersionParametersListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChildrenComponentVersionParametersListResponseBody setData(GetChildrenComponentVersionParametersListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChildrenComponentVersionParametersListResponseBodyData getData() {
        return this.data;
    }

    public GetChildrenComponentVersionParametersListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetChildrenComponentVersionParametersListResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetChildrenComponentVersionParametersListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetChildrenComponentVersionParametersListResponseBodyDataAnnotations extends TeaModel {
        @NameInMap("additionalProp1")
        public String additionalProp1;

        @NameInMap("additionalProp2")
        public String additionalProp2;

        @NameInMap("additionalProp3")
        public String additionalProp3;

        public static GetChildrenComponentVersionParametersListResponseBodyDataAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetChildrenComponentVersionParametersListResponseBodyDataAnnotations self = new GetChildrenComponentVersionParametersListResponseBodyDataAnnotations();
            return TeaModel.build(map, self);
        }

        public GetChildrenComponentVersionParametersListResponseBodyDataAnnotations setAdditionalProp1(String additionalProp1) {
            this.additionalProp1 = additionalProp1;
            return this;
        }
        public String getAdditionalProp1() {
            return this.additionalProp1;
        }

        public GetChildrenComponentVersionParametersListResponseBodyDataAnnotations setAdditionalProp2(String additionalProp2) {
            this.additionalProp2 = additionalProp2;
            return this;
        }
        public String getAdditionalProp2() {
            return this.additionalProp2;
        }

        public GetChildrenComponentVersionParametersListResponseBodyDataAnnotations setAdditionalProp3(String additionalProp3) {
            this.additionalProp3 = additionalProp3;
            return this;
        }
        public String getAdditionalProp3() {
            return this.additionalProp3;
        }

    }

    public static class GetChildrenComponentVersionParametersListResponseBodyData extends TeaModel {
        @NameInMap("annotations")
        public GetChildrenComponentVersionParametersListResponseBodyDataAnnotations annotations;

        @NameInMap("category")
        public String category;

        @NameInMap("class")
        public String _class;

        @NameInMap("description")
        public String description;

        @NameInMap("documents")
        public java.util.List<String> documents;

        @NameInMap("name")
        public String name;

        @NameInMap("provider")
        public String provider;

        @NameInMap("uid")
        public String uid;

        public static GetChildrenComponentVersionParametersListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChildrenComponentVersionParametersListResponseBodyData self = new GetChildrenComponentVersionParametersListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setAnnotations(GetChildrenComponentVersionParametersListResponseBodyDataAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public GetChildrenComponentVersionParametersListResponseBodyDataAnnotations getAnnotations() {
            return this.annotations;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData set_class(String _class) {
            this._class = _class;
            return this;
        }
        public String get_class() {
            return this._class;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setDocuments(java.util.List<String> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<String> getDocuments() {
            return this.documents;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public GetChildrenComponentVersionParametersListResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
