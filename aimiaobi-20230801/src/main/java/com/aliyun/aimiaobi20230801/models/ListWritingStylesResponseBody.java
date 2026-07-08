// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListWritingStylesResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of writing styles.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListWritingStylesResponseBodyData> data;

    /**
     * <p>The maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>数据不存在</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The next token.</p>
     * 
     * <strong>example:</strong>
     * <p>下一页token</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>58</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListWritingStylesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWritingStylesResponseBody self = new ListWritingStylesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWritingStylesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListWritingStylesResponseBody setData(java.util.List<ListWritingStylesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWritingStylesResponseBodyData> getData() {
        return this.data;
    }

    public ListWritingStylesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWritingStylesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWritingStylesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWritingStylesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWritingStylesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ListWritingStylesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListWritingStylesResponseBodyData extends TeaModel {
        /**
         * <p>The template definition for step-by-step writing.</p>
         */
        @NameInMap("DistributeStepTemplateDefine")
        public WritingStyleTemplateDefine distributeStepTemplateDefine;

        /**
         * <p>Indicates whether step-by-step writing is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DistributeWriting")
        public Boolean distributeWriting;

        /**
         * <p>The icon for the writing style, represented by a character.</p>
         * 
         * <strong>example:</strong>
         * <p>小图标</p>
         */
        @NameInMap("Emoji")
        public String emoji;

        /**
         * <p>The description of the writing style.</p>
         * 
         * <strong>example:</strong>
         * <p>文体描述</p>
         */
        @NameInMap("StyleDescription")
        public String styleDescription;

        /**
         * <p>The image for the writing style.</p>
         * 
         * <strong>example:</strong>
         * <p>文体图片</p>
         */
        @NameInMap("StyleImage")
        public String styleImage;

        /**
         * <p>The unique key of the writing style.</p>
         * 
         * <strong>example:</strong>
         * <p>文体唯一标识</p>
         */
        @NameInMap("StyleKey")
        public String styleKey;

        /**
         * <p>The name of the writing style.</p>
         * 
         * <strong>example:</strong>
         * <p>文体名称</p>
         */
        @NameInMap("StyleName")
        public String styleName;

        /**
         * <p>The template definition for the writing style.</p>
         */
        @NameInMap("TemplateDefine")
        public WritingStyleTemplateDefine templateDefine;

        public static ListWritingStylesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWritingStylesResponseBodyData self = new ListWritingStylesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWritingStylesResponseBodyData setDistributeStepTemplateDefine(WritingStyleTemplateDefine distributeStepTemplateDefine) {
            this.distributeStepTemplateDefine = distributeStepTemplateDefine;
            return this;
        }
        public WritingStyleTemplateDefine getDistributeStepTemplateDefine() {
            return this.distributeStepTemplateDefine;
        }

        public ListWritingStylesResponseBodyData setDistributeWriting(Boolean distributeWriting) {
            this.distributeWriting = distributeWriting;
            return this;
        }
        public Boolean getDistributeWriting() {
            return this.distributeWriting;
        }

        public ListWritingStylesResponseBodyData setEmoji(String emoji) {
            this.emoji = emoji;
            return this;
        }
        public String getEmoji() {
            return this.emoji;
        }

        public ListWritingStylesResponseBodyData setStyleDescription(String styleDescription) {
            this.styleDescription = styleDescription;
            return this;
        }
        public String getStyleDescription() {
            return this.styleDescription;
        }

        public ListWritingStylesResponseBodyData setStyleImage(String styleImage) {
            this.styleImage = styleImage;
            return this;
        }
        public String getStyleImage() {
            return this.styleImage;
        }

        public ListWritingStylesResponseBodyData setStyleKey(String styleKey) {
            this.styleKey = styleKey;
            return this;
        }
        public String getStyleKey() {
            return this.styleKey;
        }

        public ListWritingStylesResponseBodyData setStyleName(String styleName) {
            this.styleName = styleName;
            return this;
        }
        public String getStyleName() {
            return this.styleName;
        }

        public ListWritingStylesResponseBodyData setTemplateDefine(WritingStyleTemplateDefine templateDefine) {
            this.templateDefine = templateDefine;
            return this;
        }
        public WritingStyleTemplateDefine getTemplateDefine() {
            return this.templateDefine;
        }

    }

}
