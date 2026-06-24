// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryPendingPushListResponseBody extends TeaModel {
    /**
     * <p>RAM鉴权失败时的标准化错误详情，JSON字符串，包含NoPermissionType、PolicyType、AuthPrincipalType、EncodedDiagnosticMessage等字段</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;domain:QueryPendingPushList&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>是否允许重试</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>本次返回的最大记录条数</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>业务数据模块</p>
     */
    @NameInMap("Module")
    public QueryPendingPushListResponseBodyModule module;

    /**
     * <p>获取下一页需用到的凭证</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>唯一请求识别码</p>
     * 
     * <strong>example:</strong>
     * <p>2DEDFF32-7827-46B1-BE90-3DB8ABD91A58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPendingPushListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPendingPushListResponseBody self = new QueryPendingPushListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPendingPushListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryPendingPushListResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public QueryPendingPushListResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryPendingPushListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryPendingPushListResponseBody setModule(QueryPendingPushListResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryPendingPushListResponseBodyModule getModule() {
        return this.module;
    }

    public QueryPendingPushListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryPendingPushListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPendingPushListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPendingPushListResponseBodyModulePushList extends TeaModel {
        /**
         * <p>本次Push包含的域名数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DomainCount")
        public Integer domainCount;

        /**
         * <p>域名列表，逗号分隔摘要</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,test.net</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>超过该时间未操作将自动关闭</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-08T10:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>卖家发起时指定，用于双方业务关联</p>
         * 
         * <strong>example:</strong>
         * <p>biz_order_001</p>
         */
        @NameInMap("OutBizId")
        public String outBizId;

        /**
         * <p>Push编号</p>
         * 
         * <strong>example:</strong>
         * <p>push_20250101_abc123</p>
         */
        @NameInMap("PushNo")
        public String pushNo;

        /**
         * <p>Push发起时间</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T10:00:00Z</p>
         */
        @NameInMap("PushTime")
        public String pushTime;

        /**
         * <p>卖家发起Push时填写的备注信息</p>
         * 
         * <strong>example:</strong>
         * <p>代持域名转移，请尽快处理</p>
         */
        @NameInMap("SellerRemark")
        public String sellerRemark;

        /**
         * <p>交易金额，0表示免费Push</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TradeMoney")
        public String tradeMoney;

        public static QueryPendingPushListResponseBodyModulePushList build(java.util.Map<String, ?> map) throws Exception {
            QueryPendingPushListResponseBodyModulePushList self = new QueryPendingPushListResponseBodyModulePushList();
            return TeaModel.build(map, self);
        }

        public QueryPendingPushListResponseBodyModulePushList setDomainCount(Integer domainCount) {
            this.domainCount = domainCount;
            return this;
        }
        public Integer getDomainCount() {
            return this.domainCount;
        }

        public QueryPendingPushListResponseBodyModulePushList setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public QueryPendingPushListResponseBodyModulePushList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QueryPendingPushListResponseBodyModulePushList setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public QueryPendingPushListResponseBodyModulePushList setPushNo(String pushNo) {
            this.pushNo = pushNo;
            return this;
        }
        public String getPushNo() {
            return this.pushNo;
        }

        public QueryPendingPushListResponseBodyModulePushList setPushTime(String pushTime) {
            this.pushTime = pushTime;
            return this;
        }
        public String getPushTime() {
            return this.pushTime;
        }

        public QueryPendingPushListResponseBodyModulePushList setSellerRemark(String sellerRemark) {
            this.sellerRemark = sellerRemark;
            return this;
        }
        public String getSellerRemark() {
            return this.sellerRemark;
        }

        public QueryPendingPushListResponseBodyModulePushList setTradeMoney(String tradeMoney) {
            this.tradeMoney = tradeMoney;
            return this;
        }
        public String getTradeMoney() {
            return this.tradeMoney;
        }

    }

    public static class QueryPendingPushListResponseBodyModule extends TeaModel {
        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>每页大小</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>待接收Push列表</p>
         */
        @NameInMap("PushList")
        public java.util.List<QueryPendingPushListResponseBodyModulePushList> pushList;

        /**
         * <p>满足条件的总记录数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QueryPendingPushListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryPendingPushListResponseBodyModule self = new QueryPendingPushListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryPendingPushListResponseBodyModule setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public QueryPendingPushListResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPendingPushListResponseBodyModule setPushList(java.util.List<QueryPendingPushListResponseBodyModulePushList> pushList) {
            this.pushList = pushList;
            return this;
        }
        public java.util.List<QueryPendingPushListResponseBodyModulePushList> getPushList() {
            return this.pushList;
        }

        public QueryPendingPushListResponseBodyModule setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
