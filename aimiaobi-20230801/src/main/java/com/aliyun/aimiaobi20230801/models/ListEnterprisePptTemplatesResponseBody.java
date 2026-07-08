// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListEnterprisePptTemplatesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>An array of enterprise-specific PPT template objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListEnterprisePptTemplatesResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The maximum number of results per page, as specified in the request. Note: This parameter is not yet in effect.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next page of results. An empty value indicates that no more data is available. Note: This parameter is not yet in effect.</p>
     * 
     * <strong>example:</strong>
     * <p>CAESGgoSChAKDGNvbXBsZXRlVGltZRABCgQiAggAGAAiQAoJANEQ4AACjMDLgAAADFTNzMyZDMwMzAzMDM4NzA3MjZjN2E2NDYyNzUzODMxMzY3ODM0NmIzNTZkNjc=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The unique request ID. Provide this ID when you contact technical support.</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned on the current page (the \&quot;page size\&quot;).</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Indicates whether the request succeeded. <code>true</code> indicates success, and <code>false</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that match the query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListEnterprisePptTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterprisePptTemplatesResponseBody self = new ListEnterprisePptTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterprisePptTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEnterprisePptTemplatesResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListEnterprisePptTemplatesResponseBody setData(java.util.List<ListEnterprisePptTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListEnterprisePptTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public ListEnterprisePptTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEnterprisePptTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEnterprisePptTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEnterprisePptTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEnterprisePptTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterprisePptTemplatesResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListEnterprisePptTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEnterprisePptTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListEnterprisePptTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The URL of the cover image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx.com/a.png">http://xxx.com/a.png</a></p>
         */
        @NameInMap("CoverImg")
        public String coverImg;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public Long id;

        public static ListEnterprisePptTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEnterprisePptTemplatesResponseBodyData self = new ListEnterprisePptTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEnterprisePptTemplatesResponseBodyData setCoverImg(String coverImg) {
            this.coverImg = coverImg;
            return this;
        }
        public String getCoverImg() {
            return this.coverImg;
        }

        public ListEnterprisePptTemplatesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
