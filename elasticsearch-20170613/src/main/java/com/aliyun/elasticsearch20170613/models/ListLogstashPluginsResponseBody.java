// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashPluginsResponseBody extends TeaModel {
    /**
     * <p>The address of the documentation for the plug-in.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the plug-in. Valid values:</p>
     * <br>
     * <p>*   INSTALLED: Installed</p>
     * <p>*   UNINSTALLED: Not installed</p>
     * <p>*   INSTALLING: The instance is being installed.</p>
     * <p>*   UNINSTALLING: The instance is being uninstalled.</p>
     * <p>*   UPGRADING: The backup gateway is being upgraded.</p>
     * <p>*   FAILED: Installation failed</p>
     * <p>*   UNKNOWN: The cluster is lost and cannot be created.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListLogstashPluginsResponseBodyResult> result;

    public static ListLogstashPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogstashPluginsResponseBody self = new ListLogstashPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogstashPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogstashPluginsResponseBody setResult(java.util.List<ListLogstashPluginsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListLogstashPluginsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListLogstashPluginsResponseBodyResult extends TeaModel {
        /**
         * <p>The source of the plug-in.</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

        @NameInMap("source")
        public String source;

        /**
         * <p>The name of the plug-in.</p>
         */
        @NameInMap("specificationUrl")
        public String specificationUrl;

        @NameInMap("state")
        public String state;

        public static ListLogstashPluginsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLogstashPluginsResponseBodyResult self = new ListLogstashPluginsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLogstashPluginsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListLogstashPluginsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLogstashPluginsResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListLogstashPluginsResponseBodyResult setSpecificationUrl(String specificationUrl) {
            this.specificationUrl = specificationUrl;
            return this;
        }
        public String getSpecificationUrl() {
            return this.specificationUrl;
        }

        public ListLogstashPluginsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
