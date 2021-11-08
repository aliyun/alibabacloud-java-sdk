// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ListTemplateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListTemplateResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 模板的图片链接
        @NameInMap("ImageURL")
        public String imageURL;

        // 模板的名称
        @NameInMap("Name")
        public String name;

        // 资源组ID
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // 模板的标签的ID
        @NameInMap("TagId")
        public Integer tagId;

        // 模板标签的名称
        @NameInMap("TagName")
        public String tagName;

        // 模板的ID
        @NameInMap("TemplateId")
        public String templateId;

        // 模板的拓扑图
        @NameInMap("TopoURL")
        public String topoURL;

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

        public ListTemplateResponseBodyData setTopoURL(String topoURL) {
            this.topoURL = topoURL;
            return this;
        }
        public String getTopoURL() {
            return this.topoURL;
        }

    }

}
