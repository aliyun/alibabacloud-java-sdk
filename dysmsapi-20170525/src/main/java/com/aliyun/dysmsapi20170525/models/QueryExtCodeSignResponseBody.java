// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryExtCodeSignResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryExtCodeSignResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryExtCodeSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryExtCodeSignResponseBody self = new QueryExtCodeSignResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryExtCodeSignResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryExtCodeSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryExtCodeSignResponseBody setData(QueryExtCodeSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryExtCodeSignResponseBodyData getData() {
        return this.data;
    }

    public QueryExtCodeSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryExtCodeSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryExtCodeSignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryExtCodeSignResponseBodyDataList extends TeaModel {
        /**
         * <p>是否可回收</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>扩展码A3</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("ExtCode")
        public String extCode;

        /**
         * <p>近1个月发送成功条数（只读）</p>
         * 
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("SendCount")
        public Long sendCount;

        /**
         * <p>签名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SignName")
        public String signName;

        /**
         * <p>来源</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Source")
        public String source;

        public static QueryExtCodeSignResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryExtCodeSignResponseBodyDataList self = new QueryExtCodeSignResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryExtCodeSignResponseBodyDataList setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public QueryExtCodeSignResponseBodyDataList setExtCode(String extCode) {
            this.extCode = extCode;
            return this;
        }
        public String getExtCode() {
            return this.extCode;
        }

        public QueryExtCodeSignResponseBodyDataList setSendCount(Long sendCount) {
            this.sendCount = sendCount;
            return this;
        }
        public Long getSendCount() {
            return this.sendCount;
        }

        public QueryExtCodeSignResponseBodyDataList setSignName(String signName) {
            this.signName = signName;
            return this;
        }
        public String getSignName() {
            return this.signName;
        }

        public QueryExtCodeSignResponseBodyDataList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class QueryExtCodeSignResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryExtCodeSignResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QueryExtCodeSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryExtCodeSignResponseBodyData self = new QueryExtCodeSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryExtCodeSignResponseBodyData setList(java.util.List<QueryExtCodeSignResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryExtCodeSignResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryExtCodeSignResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QueryExtCodeSignResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryExtCodeSignResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
