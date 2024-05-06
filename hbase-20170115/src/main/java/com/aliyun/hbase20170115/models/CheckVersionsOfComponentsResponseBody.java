// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CheckVersionsOfComponentsResponseBody extends TeaModel {
    @NameInMap("Components")
    public CheckVersionsOfComponentsResponseBodyComponents components;

    @NameInMap("RequestId")
    public String requestId;

    public static CheckVersionsOfComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckVersionsOfComponentsResponseBody self = new CheckVersionsOfComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckVersionsOfComponentsResponseBody setComponents(CheckVersionsOfComponentsResponseBodyComponents components) {
        this.components = components;
        return this;
    }
    public CheckVersionsOfComponentsResponseBodyComponents getComponents() {
        return this.components;
    }

    public CheckVersionsOfComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckVersionsOfComponentsResponseBodyComponentsComponents extends TeaModel {
        @NameInMap("Component")
        public String component;

        @NameInMap("IsLatestVersion")
        public String isLatestVersion;

        public static CheckVersionsOfComponentsResponseBodyComponentsComponents build(java.util.Map<String, ?> map) throws Exception {
            CheckVersionsOfComponentsResponseBodyComponentsComponents self = new CheckVersionsOfComponentsResponseBodyComponentsComponents();
            return TeaModel.build(map, self);
        }

        public CheckVersionsOfComponentsResponseBodyComponentsComponents setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public CheckVersionsOfComponentsResponseBodyComponentsComponents setIsLatestVersion(String isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public String getIsLatestVersion() {
            return this.isLatestVersion;
        }

    }

    public static class CheckVersionsOfComponentsResponseBodyComponents extends TeaModel {
        @NameInMap("Components")
        public java.util.List<CheckVersionsOfComponentsResponseBodyComponentsComponents> components;

        public static CheckVersionsOfComponentsResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            CheckVersionsOfComponentsResponseBodyComponents self = new CheckVersionsOfComponentsResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public CheckVersionsOfComponentsResponseBodyComponents setComponents(java.util.List<CheckVersionsOfComponentsResponseBodyComponentsComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<CheckVersionsOfComponentsResponseBodyComponentsComponents> getComponents() {
            return this.components;
        }

    }

}
