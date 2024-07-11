// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CheckComponentsVersionResponseBody extends TeaModel {
    @NameInMap("Components")
    public CheckComponentsVersionResponseBodyComponents components;

    /**
     * <strong>example:</strong>
     * <p>E3537EB4-1100-41CA-A147-C74CCC8BB12C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckComponentsVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckComponentsVersionResponseBody self = new CheckComponentsVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckComponentsVersionResponseBody setComponents(CheckComponentsVersionResponseBodyComponents components) {
        this.components = components;
        return this;
    }
    public CheckComponentsVersionResponseBodyComponents getComponents() {
        return this.components;
    }

    public CheckComponentsVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckComponentsVersionResponseBodyComponentsComponent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>HBASE</p>
         */
        @NameInMap("Component")
        public String component;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLatestVersion")
        public String isLatestVersion;

        public static CheckComponentsVersionResponseBodyComponentsComponent build(java.util.Map<String, ?> map) throws Exception {
            CheckComponentsVersionResponseBodyComponentsComponent self = new CheckComponentsVersionResponseBodyComponentsComponent();
            return TeaModel.build(map, self);
        }

        public CheckComponentsVersionResponseBodyComponentsComponent setComponent(String component) {
            this.component = component;
            return this;
        }
        public String getComponent() {
            return this.component;
        }

        public CheckComponentsVersionResponseBodyComponentsComponent setIsLatestVersion(String isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }
        public String getIsLatestVersion() {
            return this.isLatestVersion;
        }

    }

    public static class CheckComponentsVersionResponseBodyComponents extends TeaModel {
        @NameInMap("Component")
        public java.util.List<CheckComponentsVersionResponseBodyComponentsComponent> component;

        public static CheckComponentsVersionResponseBodyComponents build(java.util.Map<String, ?> map) throws Exception {
            CheckComponentsVersionResponseBodyComponents self = new CheckComponentsVersionResponseBodyComponents();
            return TeaModel.build(map, self);
        }

        public CheckComponentsVersionResponseBodyComponents setComponent(java.util.List<CheckComponentsVersionResponseBodyComponentsComponent> component) {
            this.component = component;
            return this;
        }
        public java.util.List<CheckComponentsVersionResponseBodyComponentsComponent> getComponent() {
            return this.component;
        }

    }

}
