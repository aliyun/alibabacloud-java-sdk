// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListDsMenusResponseBody extends TeaModel {
    @NameInMap("Ext")
    public String ext;

    @NameInMap("Menus")
    public java.util.List<ListDsMenusResponseBodyMenus> menus;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDsMenusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDsMenusResponseBody self = new ListDsMenusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDsMenusResponseBody setExt(String ext) {
        this.ext = ext;
        return this;
    }
    public String getExt() {
        return this.ext;
    }

    public ListDsMenusResponseBody setMenus(java.util.List<ListDsMenusResponseBodyMenus> menus) {
        this.menus = menus;
        return this;
    }
    public java.util.List<ListDsMenusResponseBodyMenus> getMenus() {
        return this.menus;
    }

    public ListDsMenusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDsMenusResponseBodyMenus extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Title")
        public String title;

        @NameInMap("TitleEn")
        public String titleEn;

        @NameInMap("Url")
        public String url;

        public static ListDsMenusResponseBodyMenus build(java.util.Map<String, ?> map) throws Exception {
            ListDsMenusResponseBodyMenus self = new ListDsMenusResponseBodyMenus();
            return TeaModel.build(map, self);
        }

        public ListDsMenusResponseBodyMenus setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListDsMenusResponseBodyMenus setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListDsMenusResponseBodyMenus setTitleEn(String titleEn) {
            this.titleEn = titleEn;
            return this;
        }
        public String getTitleEn() {
            return this.titleEn;
        }

        public ListDsMenusResponseBodyMenus setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
