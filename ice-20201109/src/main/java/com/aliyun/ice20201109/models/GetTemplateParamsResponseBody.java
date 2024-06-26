// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateParamsResponseBody extends TeaModel {
    @NameInMap("ParamList")
    public java.util.List<GetTemplateParamsResponseBodyParamList> paramList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>419c8741c1b4325f035b</strong></strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParamsResponseBody self = new GetTemplateParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTemplateParamsResponseBody setParamList(java.util.List<GetTemplateParamsResponseBodyParamList> paramList) {
        this.paramList = paramList;
        return this;
    }
    public java.util.List<GetTemplateParamsResponseBodyParamList> getParamList() {
        return this.paramList;
    }

    public GetTemplateParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTemplateParamsResponseBody setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class GetTemplateParamsResponseBodyParamList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("CoverUrl")
        public String coverUrl;

        /**
         * <strong>example:</strong>
         * <p>video1</p>
         */
        @NameInMap("Key")
        public String key;

        @NameInMap("MediaUrl")
        public String mediaUrl;

        /**
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTemplateParamsResponseBodyParamList build(java.util.Map<String, ?> map) throws Exception {
            GetTemplateParamsResponseBodyParamList self = new GetTemplateParamsResponseBodyParamList();
            return TeaModel.build(map, self);
        }

        public GetTemplateParamsResponseBodyParamList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTemplateParamsResponseBodyParamList setCoverUrl(String coverUrl) {
            this.coverUrl = coverUrl;
            return this;
        }
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public GetTemplateParamsResponseBodyParamList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTemplateParamsResponseBodyParamList setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
            return this;
        }
        public String getMediaUrl() {
            return this.mediaUrl;
        }

        public GetTemplateParamsResponseBodyParamList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
