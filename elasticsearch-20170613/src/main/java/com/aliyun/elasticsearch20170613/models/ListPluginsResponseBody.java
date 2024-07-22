// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPluginsResponseBody extends TeaModel {
    /**
     * <p>The description of the plug-in.</p>
     */
    @NameInMap("Headers")
    public ListPluginsResponseBodyHeaders headers;

    /**
     * <p>The return results.</p>
     * 
     * <strong>example:</strong>
     * <p>5A5D8E74-565C-43DC-B031-29289FA9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the plug-in.</p>
     */
    @NameInMap("Result")
    public java.util.List<ListPluginsResponseBodyResult> result;

    public static ListPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsResponseBody self = new ListPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginsResponseBody setHeaders(ListPluginsResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListPluginsResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPluginsResponseBody setResult(java.util.List<ListPluginsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPluginsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListPluginsResponseBodyHeaders extends TeaModel {
        /**
         * <p>The address of the plug-in description document.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("X-Total-Count")
        public Integer xTotalCount;

        public static ListPluginsResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyHeaders self = new ListPluginsResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyHeaders setXTotalCount(Integer xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Integer getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListPluginsResponseBodyResult extends TeaModel {
        /**
         * <p>The source type of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>IK analysis plug-in for Elasticsearch.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>analysis-ik</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxx.html">https://xxxx.html</a></p>
         */
        @NameInMap("specificationUrl")
        public String specificationUrl;

        /**
         * <strong>example:</strong>
         * <p>INSTALLED</p>
         */
        @NameInMap("state")
        public String state;

        public static ListPluginsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyResult self = new ListPluginsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPluginsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPluginsResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPluginsResponseBodyResult setSpecificationUrl(String specificationUrl) {
            this.specificationUrl = specificationUrl;
            return this;
        }
        public String getSpecificationUrl() {
            return this.specificationUrl;
        }

        public ListPluginsResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
