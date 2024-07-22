// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListComponentIndicesResponseBody extends TeaModel {
    @NameInMap("Headers")
    public ListComponentIndicesResponseBodyHeaders headers;

    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListComponentIndicesResponseBodyResult> result;

    public static ListComponentIndicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComponentIndicesResponseBody self = new ListComponentIndicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComponentIndicesResponseBody setHeaders(ListComponentIndicesResponseBodyHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ListComponentIndicesResponseBodyHeaders getHeaders() {
        return this.headers;
    }

    public ListComponentIndicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComponentIndicesResponseBody setResult(java.util.List<ListComponentIndicesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListComponentIndicesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListComponentIndicesResponseBodyHeaders extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("X-Total-Count")
        public Long xTotalCount;

        public static ListComponentIndicesResponseBodyHeaders build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyHeaders self = new ListComponentIndicesResponseBodyHeaders();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyHeaders setXTotalCount(Long xTotalCount) {
            this.xTotalCount = xTotalCount;
            return this;
        }
        public Long getXTotalCount() {
            return this.xTotalCount;
        }

    }

    public static class ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>synthetics</p>
         */
        @NameInMap("name")
        public String name;

        public static ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle self = new ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>best_compression</p>
         */
        @NameInMap("codec")
        public String codec;

        @NameInMap("lifecycle")
        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle lifecycle;

        public static ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex self = new ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex setLifecycle(ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }
        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndexLifecycle getLifecycle() {
            return this.lifecycle;
        }

    }

    public static class ListComponentIndicesResponseBodyResultContentTemplateSettings extends TeaModel {
        @NameInMap("index")
        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex index;

        public static ListComponentIndicesResponseBodyResultContentTemplateSettings build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyResultContentTemplateSettings self = new ListComponentIndicesResponseBodyResultContentTemplateSettings();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyResultContentTemplateSettings setIndex(ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex index) {
            this.index = index;
            return this;
        }
        public ListComponentIndicesResponseBodyResultContentTemplateSettingsIndex getIndex() {
            return this.index;
        }

    }

    public static class ListComponentIndicesResponseBodyResultContentTemplate extends TeaModel {
        @NameInMap("settings")
        public ListComponentIndicesResponseBodyResultContentTemplateSettings settings;

        public static ListComponentIndicesResponseBodyResultContentTemplate build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyResultContentTemplate self = new ListComponentIndicesResponseBodyResultContentTemplate();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyResultContentTemplate setSettings(ListComponentIndicesResponseBodyResultContentTemplateSettings settings) {
            this.settings = settings;
            return this;
        }
        public ListComponentIndicesResponseBodyResultContentTemplateSettings getSettings() {
            return this.settings;
        }

    }

    public static class ListComponentIndicesResponseBodyResultContent extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{ &quot;description&quot;: &quot;set number of shards to one&quot; }</p>
         */
        @NameInMap("_meta")
        public java.util.Map<String, ?> meta;

        @NameInMap("template")
        public ListComponentIndicesResponseBodyResultContentTemplate template;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("version")
        public Long version;

        public static ListComponentIndicesResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyResultContent self = new ListComponentIndicesResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyResultContent setMeta(java.util.Map<String, ?> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.Map<String, ?> getMeta() {
            return this.meta;
        }

        public ListComponentIndicesResponseBodyResultContent setTemplate(ListComponentIndicesResponseBodyResultContentTemplate template) {
            this.template = template;
            return this;
        }
        public ListComponentIndicesResponseBodyResultContentTemplate getTemplate() {
            return this.template;
        }

        public ListComponentIndicesResponseBodyResultContent setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class ListComponentIndicesResponseBodyResult extends TeaModel {
        @NameInMap("composed")
        public java.util.List<String> composed;

        @NameInMap("content")
        public ListComponentIndicesResponseBodyResultContent content;

        /**
         * <strong>example:</strong>
         * <p>synthetics-settings</p>
         */
        @NameInMap("name")
        public String name;

        public static ListComponentIndicesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListComponentIndicesResponseBodyResult self = new ListComponentIndicesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListComponentIndicesResponseBodyResult setComposed(java.util.List<String> composed) {
            this.composed = composed;
            return this;
        }
        public java.util.List<String> getComposed() {
            return this.composed;
        }

        public ListComponentIndicesResponseBodyResult setContent(ListComponentIndicesResponseBodyResultContent content) {
            this.content = content;
            return this;
        }
        public ListComponentIndicesResponseBodyResultContent getContent() {
            return this.content;
        }

        public ListComponentIndicesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
