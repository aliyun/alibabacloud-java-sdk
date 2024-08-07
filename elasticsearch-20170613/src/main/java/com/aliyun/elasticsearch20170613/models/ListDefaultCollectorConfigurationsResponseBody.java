// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8BAE3C32-8E4A-47D6-B4B0-95B5DE643BF5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListDefaultCollectorConfigurationsResponseBodyResult> result;

    public static ListDefaultCollectorConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultCollectorConfigurationsResponseBody self = new ListDefaultCollectorConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDefaultCollectorConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDefaultCollectorConfigurationsResponseBody setResult(java.util.List<ListDefaultCollectorConfigurationsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDefaultCollectorConfigurationsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListDefaultCollectorConfigurationsResponseBodyResult extends TeaModel {
        /**
         * <p>The content of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>key: log\n  title: Log file content\n  description: &gt;\n    Contains log file lines.\n  fields:\n ......</li>
         * </ul>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The name of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>fields.yml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static ListDefaultCollectorConfigurationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDefaultCollectorConfigurationsResponseBodyResult self = new ListDefaultCollectorConfigurationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDefaultCollectorConfigurationsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListDefaultCollectorConfigurationsResponseBodyResult setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

}
