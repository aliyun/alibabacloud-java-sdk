// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryFaceImageTemplateResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static QueryFaceImageTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceImageTemplateResponseBody self = new QueryFaceImageTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceImageTemplateResponseBody setData(QueryFaceImageTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceImageTemplateResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceImageTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFaceImageTemplateResponseBodyDataElements extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateURL")
        public String templateURL;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceImageTemplateResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceImageTemplateResponseBodyDataElements self = new QueryFaceImageTemplateResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public QueryFaceImageTemplateResponseBodyDataElements setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setTemplateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }
        public String getTemplateURL() {
            return this.templateURL;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryFaceImageTemplateResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElements> elements;

        public static QueryFaceImageTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceImageTemplateResponseBodyData self = new QueryFaceImageTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceImageTemplateResponseBodyData setElements(java.util.List<QueryFaceImageTemplateResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
