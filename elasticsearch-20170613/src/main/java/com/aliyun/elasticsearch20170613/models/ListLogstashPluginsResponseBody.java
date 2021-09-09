// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListLogstashPluginsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

        public ListLogstashPluginsResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListLogstashPluginsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
