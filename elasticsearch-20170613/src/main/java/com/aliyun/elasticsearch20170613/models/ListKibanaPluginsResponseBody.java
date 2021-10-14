// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListKibanaPluginsResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListKibanaPluginsResponseBodyHeaders headers;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("description")
        public String description;

        @NameInMap("specificationUrl")
        public String specificationUrl;

        @NameInMap("state")
        public String state;

        @NameInMap("source")
        public String source;

        @NameInMap("name")
        public String name;

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

        public ListKibanaPluginsResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListKibanaPluginsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
