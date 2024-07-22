// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPluginsResponseBody extends TeaModel {
    /**
     * <p>The request header.</p>
     */
    @NameInMap("Headers")
    public ListKibanaPluginsResponseBodyHeaders headers;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>11234B4A-34CE-473B-8E61-AD95702E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the plug-ins.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListKibanaPluginsResponseBodyResult> result;

    public static ListKibanaPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKibanaPluginsResponseBody self = new ListKibanaPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKibanaPluginsResponseBody setHeaders(ListKibanaPluginsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListKibanaPluginsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListKibanaPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKibanaPluginsResponseBody setResult(java.util.List<ListKibanaPluginsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListKibanaPluginsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListKibanaPluginsResponseBodyHeaders extends TeaModel {
        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListKibanaPluginsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListKibanaPluginsResponseBodyHeaders self = new ListKibanaPluginsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListKibanaPluginsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListKibanaPluginsResponseBodyResult extends TeaModel {
        /**
         * <p>The description of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>Customize DSL statements to query data.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>bsearch_querybuilder</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The URL of the introduction to the plug-in. The value null is supported.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx">https://xxxx</a></p>
         */
        @NameInMap("specificationUrl")
        public String specificationUrl;

        /**
         * <p>The installation status of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTALLED</p>
         */
        @NameInMap("state")
        public String state;

        public static ListKibanaPluginsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListKibanaPluginsResponseBodyResult self = new ListKibanaPluginsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListKibanaPluginsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListKibanaPluginsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListKibanaPluginsResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListKibanaPluginsResponseBodyResult setSpecificationUrl(String specificationUrl) {
            this.specificationUrl = specificationUrl;
            return this;
        }
        public String getSpecificationUrl() {
            return this.specificationUrl;
        }

        public ListKibanaPluginsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
