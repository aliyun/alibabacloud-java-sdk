// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class QueryTaskListResponseBody extends TeaModel {
    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li><p><strong>OK</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>isv.INVALID_PARAMETERS</strong>: The specified parameter is invalid.</p>
     * </li>
     * <li><p><strong>isp.SYSTEM_ERROR</strong>: A system error occurred.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For more information, see the &quot;Error codes&quot; section of this topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryTaskListResponseBodyData data;

    /**
     * <p>The status code description.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>68A40250-50CD-034C-B728-0BD******177</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskListResponseBody self = new QueryTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTaskListResponseBody setData(QueryTaskListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTaskListResponseBodyData getData() {
        return this.data;
    }

    public QueryTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTaskListResponseBodyData extends TeaModel {
        /**
         * <p>The details of the tasks.</p>
         */
        @NameInMap("Data")
        public java.util.List<String> data;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>62</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static QueryTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskListResponseBodyData self = new QueryTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTaskListResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public QueryTaskListResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryTaskListResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
