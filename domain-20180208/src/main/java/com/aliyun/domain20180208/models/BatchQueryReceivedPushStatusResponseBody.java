// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchQueryReceivedPushStatusResponseBody extends TeaModel {
    /**
     * <p>RAM鉴权失败时的标准化错误详情，JSON字符串，包含NoPermissionType、PolicyType、AuthPrincipalType、EncodedDiagnosticMessage等字段</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;domain:BatchQueryReceivedPushStatus&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;}</p>
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
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>业务数据模块</p>
     */
    @NameInMap("Module")
    public BatchQueryReceivedPushStatusResponseBodyModule module;

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

    public static BatchQueryReceivedPushStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryReceivedPushStatusResponseBody self = new BatchQueryReceivedPushStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryReceivedPushStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public BatchQueryReceivedPushStatusResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public BatchQueryReceivedPushStatusResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchQueryReceivedPushStatusResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryReceivedPushStatusResponseBody setModule(BatchQueryReceivedPushStatusResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BatchQueryReceivedPushStatusResponseBodyModule getModule() {
        return this.module;
    }

    public BatchQueryReceivedPushStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryReceivedPushStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryReceivedPushStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class BatchQueryReceivedPushStatusResponseBodyModulePushResults extends TeaModel {
        /**
         * <p>域名列表，逗号分隔</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,test.net</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>外部业务ID，卖家发起时指定</p>
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
         * <p>枚举值：PENDING（待接收）、ACCEPTED（已接收）、REJECTED（已拒绝）、EXPIRED（已过期）、CANCELLED（已取消）</p>
         * 
         * <strong>example:</strong>
         * <p>ACCEPTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>状态描述，买家视角</p>
         * 
         * <strong>example:</strong>
         * <p>已接收</p>
         */
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static BatchQueryReceivedPushStatusResponseBodyModulePushResults build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryReceivedPushStatusResponseBodyModulePushResults self = new BatchQueryReceivedPushStatusResponseBodyModulePushResults();
            return TeaModel.build(map, self);
        }

        public BatchQueryReceivedPushStatusResponseBodyModulePushResults setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public BatchQueryReceivedPushStatusResponseBodyModulePushResults setOutBizId(String outBizId) {
            this.outBizId = outBizId;
            return this;
        }
        public String getOutBizId() {
            return this.outBizId;
        }

        public BatchQueryReceivedPushStatusResponseBodyModulePushResults setPushNo(String pushNo) {
            this.pushNo = pushNo;
            return this;
        }
        public String getPushNo() {
            return this.pushNo;
        }

        public BatchQueryReceivedPushStatusResponseBodyModulePushResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public BatchQueryReceivedPushStatusResponseBodyModulePushResults setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class BatchQueryReceivedPushStatusResponseBodyModule extends TeaModel {
        /**
         * <p>Push接收状态结果列表</p>
         */
        @NameInMap("PushResults")
        public java.util.List<BatchQueryReceivedPushStatusResponseBodyModulePushResults> pushResults;

        public static BatchQueryReceivedPushStatusResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryReceivedPushStatusResponseBodyModule self = new BatchQueryReceivedPushStatusResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BatchQueryReceivedPushStatusResponseBodyModule setPushResults(java.util.List<BatchQueryReceivedPushStatusResponseBodyModulePushResults> pushResults) {
            this.pushResults = pushResults;
            return this;
        }
        public java.util.List<BatchQueryReceivedPushStatusResponseBodyModulePushResults> getPushResults() {
            return this.pushResults;
        }

    }

}
