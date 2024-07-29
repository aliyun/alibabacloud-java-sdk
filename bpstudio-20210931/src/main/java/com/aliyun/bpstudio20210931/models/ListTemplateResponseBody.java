// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details about templates.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListTemplateResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NextToken")
    public Integer nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A07FFDF2-78FA-1B48-9E38-88E833A93187</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateResponseBody self = new ListTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTemplateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListTemplateResponseBody setData(java.util.List<ListTemplateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTemplateResponseBodyData> getData() {
        return this.data;
    }

    public ListTemplateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTemplateResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTemplateResponseBodyData extends TeaModel {
        /**
         * <p>The time when the template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-18 16:41:31</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The URL of the architecture image.</p>
         * 
         * <strong>example:</strong>
         * <p>bp-studio-template/sr-U37UD2YQCRJ75X5V.png</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>cadt-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyjt3c5om3hi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The ID of the tag that is added to the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagId")
        public Integer tagId;

        /**
         * <p>The name of the tag that is added to the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Official template</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>CJQ6H0XUEQ20IYJQ</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static ListTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateResponseBodyData self = new ListTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTemplateResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListTemplateResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public ListTemplateResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTemplateResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListTemplateResponseBodyData setTagId(Integer tagId) {
            this.tagId = tagId;
            return this;
        }
        public Integer getTagId() {
            return this.tagId;
        }

        public ListTemplateResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public ListTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
