// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySecretTransferDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySecretTransferDetailsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QuerySecretTransferDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySecretTransferDetailsResponseBody self = new QuerySecretTransferDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySecretTransferDetailsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QuerySecretTransferDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySecretTransferDetailsResponseBody setData(QuerySecretTransferDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySecretTransferDetailsResponseBodyData getData() {
        return this.data;
    }

    public QuerySecretTransferDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySecretTransferDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySecretTransferDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySecretTransferDetailsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>杭州</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>号码不存在</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>&quot;2026-11-20 00:00:00&quot;</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>&quot;2026-11-20 00:00:00&quot;</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>46</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <strong>example:</strong>
         * <p>138XXXXXX</p>
         */
        @NameInMap("SecretNo")
        public String secretNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        public static QuerySecretTransferDetailsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretTransferDetailsResponseBodyDataList self = new QuerySecretTransferDetailsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QuerySecretTransferDetailsResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setSecretNo(String secretNo) {
            this.secretNo = secretNo;
            return this;
        }
        public String getSecretNo() {
            return this.secretNo;
        }

        public QuerySecretTransferDetailsResponseBodyDataList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

    }

    public static class QuerySecretTransferDetailsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QuerySecretTransferDetailsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Long pageNo;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("Total")
        public Long total;

        public static QuerySecretTransferDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySecretTransferDetailsResponseBodyData self = new QuerySecretTransferDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySecretTransferDetailsResponseBodyData setList(java.util.List<QuerySecretTransferDetailsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QuerySecretTransferDetailsResponseBodyDataList> getList() {
            return this.list;
        }

        public QuerySecretTransferDetailsResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public QuerySecretTransferDetailsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QuerySecretTransferDetailsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
