// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListUserPluginResponseBody extends TeaModel {
    /**
     * <p>The response headers.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;totalCount\&quot;: 1, \&quot;X-Total-Count\&quot;: 1}</p>
     */
    @NameInMap("Headers")
    public java.util.Map<String, ?> headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5EEF8FAE-EEDD***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result array.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListUserPluginResponseBodyResult> result;

    public static ListUserPluginResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPluginResponseBody self = new ListUserPluginResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPluginResponseBody setHeaders(java.util.Map<String, ?> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, ?> getHeaders() {
        return this.headers;
    }

    public ListUserPluginResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPluginResponseBody setResult(java.util.List<ListUserPluginResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserPluginResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListUserPluginResponseBodyResultBingoPlugins extends TeaModel {
        /**
         * <p>The plug-in description.</p>
         * 
         * <strong>example:</strong>
         * <p>The plugin***</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The Elasticsearch version of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("elasticsearchVersion")
        public String elasticsearchVersion;

        /**
         * <p>The unique identifier of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>CAEQaRiBgIDI2tie6hkiIGIwM2I3MjZmNjk3YzR***</p>
         */
        @NameInMap("fileVersion")
        public String fileVersion;

        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>dynamic-name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The plug-in source. Valid values:</p>
         * <ul>
         * <li>USER: custom plug-in.</li>
         * <li>SYSTEM: system preset plug-in.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The plug-in status. Valid values: </p>
         * <ul>
         * <li>INSTALLED</li>
         * <li>UNINSTALLED</li>
         * <li>INSTALLING</li>
         * <li>UNINSTALLING</li>
         * <li>UPGRADING</li>
         * <li>FAILED</li>
         * <li>UNKNOWN</li>
         * <li>UPLOADING</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UNINSTALLED</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The plug-in version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListUserPluginResponseBodyResultBingoPlugins build(java.util.Map<String, ?> map) throws Exception {
            ListUserPluginResponseBodyResultBingoPlugins self = new ListUserPluginResponseBodyResultBingoPlugins();
            return TeaModel.build(map, self);
        }

        public ListUserPluginResponseBodyResultBingoPlugins setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUserPluginResponseBodyResultBingoPlugins setElasticsearchVersion(String elasticsearchVersion) {
            this.elasticsearchVersion = elasticsearchVersion;
            return this;
        }
        public String getElasticsearchVersion() {
            return this.elasticsearchVersion;
        }

        public ListUserPluginResponseBodyResultBingoPlugins setFileVersion(String fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }
        public String getFileVersion() {
            return this.fileVersion;
        }

        public ListUserPluginResponseBodyResultBingoPlugins setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserPluginResponseBodyResultBingoPlugins setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUserPluginResponseBodyResultBingoPlugins setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListUserPluginResponseBodyResultBingoPlugins setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListUserPluginResponseBodyResult extends TeaModel {
        /**
         * <p>The list of plug-ins with the same name.</p>
         */
        @NameInMap("bingoPlugins")
        public java.util.List<ListUserPluginResponseBodyResultBingoPlugins> bingoPlugins;

        /**
         * <p>The plug-in name.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The plug-in source.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The plug-in status.</p>
         * 
         * <strong>example:</strong>
         * <p>UNINSTALLED</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The plug-in version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListUserPluginResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserPluginResponseBodyResult self = new ListUserPluginResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserPluginResponseBodyResult setBingoPlugins(java.util.List<ListUserPluginResponseBodyResultBingoPlugins> bingoPlugins) {
            this.bingoPlugins = bingoPlugins;
            return this;
        }
        public java.util.List<ListUserPluginResponseBodyResultBingoPlugins> getBingoPlugins() {
            return this.bingoPlugins;
        }

        public ListUserPluginResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserPluginResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListUserPluginResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListUserPluginResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
