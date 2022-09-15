// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetProductResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProductResponseBody self = new GetProductResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProductResponseBody setData(GetProductResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProductResponseBodyData getData() {
        return this.data;
    }

    public GetProductResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetProductResponseBodyDataIcons extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("url")
        public String url;

        public static GetProductResponseBodyDataIcons build(java.util.Map<String, ?> map) throws Exception {
            GetProductResponseBodyDataIcons self = new GetProductResponseBodyDataIcons();
            return TeaModel.build(map, self);
        }

        public GetProductResponseBodyDataIcons setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductResponseBodyDataIcons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductResponseBodyDataIcons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetProductResponseBodyData extends TeaModel {
        @NameInMap("categories")
        public java.util.List<String> categories;

        @NameInMap("description")
        public String description;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("icons")
        public java.util.List<GetProductResponseBodyDataIcons> icons;

        @NameInMap("name")
        public String name;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendor")
        public String vendor;

        public static GetProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProductResponseBodyData self = new GetProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProductResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public GetProductResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProductResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetProductResponseBodyData setIcons(java.util.List<GetProductResponseBodyDataIcons> icons) {
            this.icons = icons;
            return this;
        }
        public java.util.List<GetProductResponseBodyDataIcons> getIcons() {
            return this.icons;
        }

        public GetProductResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProductResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetProductResponseBodyData setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
