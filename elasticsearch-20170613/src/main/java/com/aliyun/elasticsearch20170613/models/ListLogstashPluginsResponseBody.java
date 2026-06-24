// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashPluginsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
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
         * <p>The plugin description.</p>
         * 
         * <strong>example:</strong>
         * <p>The clone filter is for duplicating events.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>logstash-filter-clone</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The plugin source.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The URL of the plugin documentation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.html">https://xxx.html</a></p>
         */
        @NameInMap("specificationUrl")
        public String specificationUrl;

        /**
         * <p>The plugin status. Valid values:</p>
         * <ul>
         * <li>INSTALLED: installed</li>
         * <li>UNINSTALLED: not installed</li>
         * <li>INSTALLING: being installed</li>
         * <li>UNINSTALLING: being uninstalled</li>
         * <li>UPGRADING: being upgraded</li>
         * <li>FAILED: installation failed</li>
         * <li>UNKNOWN: the cluster is disconnected and the creation status cannot be retrieved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INSTALLED</p>
         */
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
