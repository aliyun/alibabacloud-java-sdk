// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListClientPluginsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientPlugins")
    public java.util.List<ListClientPluginsResponseBodyClientPlugins> clientPlugins;

    public static ListClientPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClientPluginsResponseBody self = new ListClientPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClientPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClientPluginsResponseBody setClientPlugins(java.util.List<ListClientPluginsResponseBodyClientPlugins> clientPlugins) {
        this.clientPlugins = clientPlugins;
        return this;
    }
    public java.util.List<ListClientPluginsResponseBodyClientPlugins> getClientPlugins() {
        return this.clientPlugins;
    }

    public static class ListClientPluginsResponseBodyClientPlugins extends TeaModel {
        @NameInMap("PkgName")
        public String pkgName;

        @NameInMap("Name")
        public String name;

        public static ListClientPluginsResponseBodyClientPlugins build(java.util.Map<String, ?> map) throws Exception {
            ListClientPluginsResponseBodyClientPlugins self = new ListClientPluginsResponseBodyClientPlugins();
            return TeaModel.build(map, self);
        }

        public ListClientPluginsResponseBodyClientPlugins setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public ListClientPluginsResponseBodyClientPlugins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
