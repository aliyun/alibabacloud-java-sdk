// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListAppCatalogResponseBody extends TeaModel {
    @NameInMap("Catalogs")
    public java.util.List<ListAppCatalogResponseBodyCatalogs> catalogs;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAppCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppCatalogResponseBody self = new ListAppCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppCatalogResponseBody setCatalogs(java.util.List<ListAppCatalogResponseBodyCatalogs> catalogs) {
        this.catalogs = catalogs;
        return this;
    }
    public java.util.List<ListAppCatalogResponseBodyCatalogs> getCatalogs() {
        return this.catalogs;
    }

    public ListAppCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAppCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAppCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAppCatalogResponseBodyCatalogs extends TeaModel {
        @NameInMap("Icon")
        public String icon;

        @NameInMap("IconFocusUrl")
        public String iconFocusUrl;

        @NameInMap("IconNormalUrl")
        public String iconNormalUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ListAppCatalogResponseBodyCatalogs build(java.util.Map<String, ?> map) throws Exception {
            ListAppCatalogResponseBodyCatalogs self = new ListAppCatalogResponseBodyCatalogs();
            return TeaModel.build(map, self);
        }

        public ListAppCatalogResponseBodyCatalogs setIcon(String icon) {
            this.icon = icon;
            return this;
        }
        public String getIcon() {
            return this.icon;
        }

        public ListAppCatalogResponseBodyCatalogs setIconFocusUrl(String iconFocusUrl) {
            this.iconFocusUrl = iconFocusUrl;
            return this;
        }
        public String getIconFocusUrl() {
            return this.iconFocusUrl;
        }

        public ListAppCatalogResponseBodyCatalogs setIconNormalUrl(String iconNormalUrl) {
            this.iconNormalUrl = iconNormalUrl;
            return this;
        }
        public String getIconNormalUrl() {
            return this.iconNormalUrl;
        }

        public ListAppCatalogResponseBodyCatalogs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAppCatalogResponseBodyCatalogs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
