// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListImageTagsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidAppInstanceGroup.NotFound</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of built-in image tags.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListImageTagsResponseBodyData> data;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The error message returned when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>ptnJAAAAAAAxNzE5OTEwNQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListImageTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImageTagsResponseBody self = new ListImageTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImageTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListImageTagsResponseBody setData(java.util.List<ListImageTagsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListImageTagsResponseBodyData> getData() {
        return this.data;
    }

    public ListImageTagsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListImageTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListImageTagsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListImageTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListImageTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListImageTagsResponseBodyData extends TeaModel {
        /**
         * <p>The tag categorization.</p>
         * 
         * <strong>example:</strong>
         * <p>Solution</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>AIGC</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static ListImageTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListImageTagsResponseBodyData self = new ListImageTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListImageTagsResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListImageTagsResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

}
