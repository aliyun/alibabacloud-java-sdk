// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginTemplatesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The templates.</p>
     */
    @NameInMap("Templates")
    public DescribePluginTemplatesResponseBodyTemplates templates;

    public static DescribePluginTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginTemplatesResponseBody self = new DescribePluginTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginTemplatesResponseBody setTemplates(DescribePluginTemplatesResponseBodyTemplates templates) {
        this.templates = templates;
        return this;
    }
    public DescribePluginTemplatesResponseBodyTemplates getTemplates() {
        return this.templates;
    }

    public static class DescribePluginTemplatesResponseBodyTemplatesTemplate extends TeaModel {
        /**
         * <p>The description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The document anchor point.</p>
         */
        @NameInMap("DocumentAnchor")
        public String documentAnchor;

        /**
         * <p>The ID of the document.</p>
         */
        @NameInMap("DocumentId")
        public String documentId;

        /**
         * <p>The sample.</p>
         */
        @NameInMap("Sample")
        public String sample;

        /**
         * <p>The title of the plug-in template title.</p>
         */
        @NameInMap("Title")
        public String title;

        public static DescribePluginTemplatesResponseBodyTemplatesTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginTemplatesResponseBodyTemplatesTemplate self = new DescribePluginTemplatesResponseBodyTemplatesTemplate();
            return TeaModel.build(map, self);
        }

        public DescribePluginTemplatesResponseBodyTemplatesTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginTemplatesResponseBodyTemplatesTemplate setDocumentAnchor(String documentAnchor) {
            this.documentAnchor = documentAnchor;
            return this;
        }
        public String getDocumentAnchor() {
            return this.documentAnchor;
        }

        public DescribePluginTemplatesResponseBodyTemplatesTemplate setDocumentId(String documentId) {
            this.documentId = documentId;
            return this;
        }
        public String getDocumentId() {
            return this.documentId;
        }

        public DescribePluginTemplatesResponseBodyTemplatesTemplate setSample(String sample) {
            this.sample = sample;
            return this;
        }
        public String getSample() {
            return this.sample;
        }

        public DescribePluginTemplatesResponseBodyTemplatesTemplate setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class DescribePluginTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("Template")
        public java.util.List<DescribePluginTemplatesResponseBodyTemplatesTemplate> template;

        public static DescribePluginTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginTemplatesResponseBodyTemplates self = new DescribePluginTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribePluginTemplatesResponseBodyTemplates setTemplate(java.util.List<DescribePluginTemplatesResponseBodyTemplatesTemplate> template) {
            this.template = template;
            return this;
        }
        public java.util.List<DescribePluginTemplatesResponseBodyTemplatesTemplate> getTemplate() {
            return this.template;
        }

    }

}
