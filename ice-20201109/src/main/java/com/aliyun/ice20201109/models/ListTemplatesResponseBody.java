// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListTemplatesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of templates.</p>
     */
    @NameInMap("Templates")
    public java.util.List<ListTemplatesResponseBodyTemplates> templates;

    /**
     * <p>The total number of entries that meet the request conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesResponseBody self = new ListTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplatesResponseBody setTemplates(java.util.List<ListTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public ListTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <p>The editing parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Media1&quot;:&quot;mediaId&quot;,&quot;Text1&quot;:&quot;text&quot;}</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The template configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Refer to Timeline template configuration details</p>
         */
        @NameInMap("Config")
        public String config;

        /**
         * <p>The cover URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The creation source.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("CreateSource")
        public String createSource;

        /**
         * <p>The creation time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The modification source.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The modification time. The time is in ISO 8601 format and uses UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-26T04:11:10Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud editing template</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The preview media.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("PreviewMedia")
        public String previewMedia;

        /**
         * <p>The preview media status.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("PreviewMediaStatus")
        public String previewMediaStatus;

        /**
         * <p>The template status.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The templatetype.</p>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListTemplatesResponseBodyTemplates self = new ListTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListTemplatesResponseBodyTemplates setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public ListTemplatesResponseBodyTemplates setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public ListTemplatesResponseBodyTemplates setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public ListTemplatesResponseBodyTemplates setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public ListTemplatesResponseBodyTemplates setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListTemplatesResponseBodyTemplates setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public ListTemplatesResponseBodyTemplates setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplatesResponseBodyTemplates setPreviewMedia(String previewMedia) {
            this.previewMedia = previewMedia;
            return this;
        }
        public String getPreviewMedia() {
            return this.previewMedia;
        }

        public ListTemplatesResponseBodyTemplates setPreviewMediaStatus(String previewMediaStatus) {
            this.previewMediaStatus = previewMediaStatus;
            return this;
        }
        public String getPreviewMediaStatus() {
            return this.previewMediaStatus;
        }

        public ListTemplatesResponseBodyTemplates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTemplatesResponseBodyTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
