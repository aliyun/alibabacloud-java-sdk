// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductFoundationReferencesResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<ListProductFoundationReferencesResponseBodyData> data;

    @NameInMap("msg")
    public String msg;

    public static ListProductFoundationReferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProductFoundationReferencesResponseBody self = new ListProductFoundationReferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProductFoundationReferencesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProductFoundationReferencesResponseBody setData(java.util.List<ListProductFoundationReferencesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProductFoundationReferencesResponseBodyData> getData() {
        return this.data;
    }

    public ListProductFoundationReferencesResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class ListProductFoundationReferencesResponseBodyData extends TeaModel {
        @NameInMap("foundationReferenceUID")
        public String foundationReferenceUID;

        @NameInMap("foundationVersion")
        public String foundationVersion;

        @NameInMap("foundationVersionName")
        public String foundationVersionName;

        @NameInMap("foundationVersionType")
        public String foundationVersionType;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        @NameInMap("productVersionUID")
        public String productVersionUID;

        public static ListProductFoundationReferencesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProductFoundationReferencesResponseBodyData self = new ListProductFoundationReferencesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProductFoundationReferencesResponseBodyData setFoundationReferenceUID(String foundationReferenceUID) {
            this.foundationReferenceUID = foundationReferenceUID;
            return this;
        }
        public String getFoundationReferenceUID() {
            return this.foundationReferenceUID;
        }

        public ListProductFoundationReferencesResponseBodyData setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public ListProductFoundationReferencesResponseBodyData setFoundationVersionName(String foundationVersionName) {
            this.foundationVersionName = foundationVersionName;
            return this;
        }
        public String getFoundationVersionName() {
            return this.foundationVersionName;
        }

        public ListProductFoundationReferencesResponseBodyData setFoundationVersionType(String foundationVersionType) {
            this.foundationVersionType = foundationVersionType;
            return this;
        }
        public String getFoundationVersionType() {
            return this.foundationVersionType;
        }

        public ListProductFoundationReferencesResponseBodyData setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public ListProductFoundationReferencesResponseBodyData setProductVersionUID(String productVersionUID) {
            this.productVersionUID = productVersionUID;
            return this;
        }
        public String getProductVersionUID() {
            return this.productVersionUID;
        }

    }

}
