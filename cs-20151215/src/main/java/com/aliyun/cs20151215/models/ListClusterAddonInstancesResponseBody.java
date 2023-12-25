// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterAddonInstancesResponseBody extends TeaModel {
    @NameInMap("addons")
    public java.util.List<ListClusterAddonInstancesResponseBodyAddons> addons;

    public static ListClusterAddonInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClusterAddonInstancesResponseBody self = new ListClusterAddonInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClusterAddonInstancesResponseBody setAddons(java.util.List<ListClusterAddonInstancesResponseBodyAddons> addons) {
        this.addons = addons;
        return this;
    }
    public java.util.List<ListClusterAddonInstancesResponseBodyAddons> getAddons() {
        return this.addons;
    }

    public static class ListClusterAddonInstancesResponseBodyAddons extends TeaModel {
        @NameInMap("name")
        public String name;

        @NameInMap("state")
        public String state;

        @NameInMap("version")
        public String version;

        public static ListClusterAddonInstancesResponseBodyAddons build(java.util.Map<String, ?> map) throws Exception {
            ListClusterAddonInstancesResponseBodyAddons self = new ListClusterAddonInstancesResponseBodyAddons();
            return TeaModel.build(map, self);
        }

        public ListClusterAddonInstancesResponseBodyAddons setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClusterAddonInstancesResponseBodyAddons setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListClusterAddonInstancesResponseBodyAddons setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
