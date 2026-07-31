// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSemanticViewNamesResponseBody extends TeaModel {
    /**
     * <p>The returned result data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListSemanticViewNamesResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSemanticViewNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticViewNamesResponseBody self = new ListSemanticViewNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSemanticViewNamesResponseBody setData(java.util.List<ListSemanticViewNamesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSemanticViewNamesResponseBodyData> getData() {
        return this.data;
    }

    public ListSemanticViewNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSemanticViewNamesResponseBodyData extends TeaModel {
        /**
         * <p>The annotation of the semantic view.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个定义销售额相关指标的视图</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the semantic view.</p>
         * 
         * <strong>example:</strong>
         * <p>revenue_analysis</p>
         */
        @NameInMap("ViewName")
        public String viewName;

        /**
         * <p>The schema in which the semantic view resides.</p>
         * 
         * <strong>example:</strong>
         * <p>sales_db</p>
         */
        @NameInMap("ViewSchema")
        public String viewSchema;

        public static ListSemanticViewNamesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSemanticViewNamesResponseBodyData self = new ListSemanticViewNamesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSemanticViewNamesResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListSemanticViewNamesResponseBodyData setViewName(String viewName) {
            this.viewName = viewName;
            return this;
        }
        public String getViewName() {
            return this.viewName;
        }

        public ListSemanticViewNamesResponseBodyData setViewSchema(String viewSchema) {
            this.viewSchema = viewSchema;
            return this;
        }
        public String getViewSchema() {
            return this.viewSchema;
        }

    }

}
