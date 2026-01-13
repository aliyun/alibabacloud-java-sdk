// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListDatabaseExtensionsResponseBody extends TeaModel {
    /**
     * <p>Extension list.</p>
     */
    @NameInMap("Extensions")
    public java.util.List<ListDatabaseExtensionsResponseBodyExtensions> extensions;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDatabaseExtensionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseExtensionsResponseBody self = new ListDatabaseExtensionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseExtensionsResponseBody setExtensions(java.util.List<ListDatabaseExtensionsResponseBodyExtensions> extensions) {
        this.extensions = extensions;
        return this;
    }
    public java.util.List<ListDatabaseExtensionsResponseBodyExtensions> getExtensions() {
        return this.extensions;
    }

    public ListDatabaseExtensionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDatabaseExtensionsResponseBodyExtensions extends TeaModel {
        /**
         * <p>The description of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>zhparser</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The extension name.</p>
         * 
         * <strong>example:</strong>
         * <p>zhparser</p>
         */
        @NameInMap("ExtensionName")
        public String extensionName;

        /**
         * <p>The status of the extension.</p>
         * 
         * <strong>example:</strong>
         * <p>installed</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDatabaseExtensionsResponseBodyExtensions build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseExtensionsResponseBodyExtensions self = new ListDatabaseExtensionsResponseBodyExtensions();
            return TeaModel.build(map, self);
        }

        public ListDatabaseExtensionsResponseBodyExtensions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDatabaseExtensionsResponseBodyExtensions setExtensionName(String extensionName) {
            this.extensionName = extensionName;
            return this;
        }
        public String getExtensionName() {
            return this.extensionName;
        }

        public ListDatabaseExtensionsResponseBodyExtensions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
