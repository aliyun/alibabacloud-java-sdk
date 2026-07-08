// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListInterveneCntResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public ListInterveneCntResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates success: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInterveneCntResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterveneCntResponseBody self = new ListInterveneCntResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterveneCntResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInterveneCntResponseBody setData(ListInterveneCntResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInterveneCntResponseBodyData getData() {
        return this.data;
    }

    public ListInterveneCntResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInterveneCntResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInterveneCntResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterveneCntResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInterveneCntResponseBodyData extends TeaModel {
        /**
         * <p>List of count information</p>
         */
        @NameInMap("CntList")
        public java.util.List<?> cntList;

        /**
         * <p>Intervention service status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageCnt")
        public Integer pageCnt;

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Integer pageIndex;

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListInterveneCntResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInterveneCntResponseBodyData self = new ListInterveneCntResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInterveneCntResponseBodyData setCntList(java.util.List<?> cntList) {
            this.cntList = cntList;
            return this;
        }
        public java.util.List<?> getCntList() {
            return this.cntList;
        }

        public ListInterveneCntResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public ListInterveneCntResponseBodyData setPageCnt(Integer pageCnt) {
            this.pageCnt = pageCnt;
            return this;
        }
        public Integer getPageCnt() {
            return this.pageCnt;
        }

        public ListInterveneCntResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public ListInterveneCntResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
