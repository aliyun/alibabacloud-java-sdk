// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListInstagramPageResponseBody extends TeaModel {
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
    public ListInstagramPageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>dsfdsf-3jfj***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstagramPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstagramPageResponseBody self = new ListInstagramPageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstagramPageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListInstagramPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstagramPageResponseBody setData(ListInstagramPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListInstagramPageResponseBodyData getData() {
        return this.data;
    }

    public ListInstagramPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstagramPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstagramPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstagramPageResponseBodyDataAgentInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>aaa,bbb</p>
         */
        @NameInMap("AgentKeywords")
        public String agentKeywords;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("AgentNoKeywords")
        public String agentNoKeywords;

        public static ListInstagramPageResponseBodyDataAgentInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstagramPageResponseBodyDataAgentInfo self = new ListInstagramPageResponseBodyDataAgentInfo();
            return TeaModel.build(map, self);
        }

        public ListInstagramPageResponseBodyDataAgentInfo setAgentKeywords(String agentKeywords) {
            this.agentKeywords = agentKeywords;
            return this;
        }
        public String getAgentKeywords() {
            return this.agentKeywords;
        }

        public ListInstagramPageResponseBodyDataAgentInfo setAgentNoKeywords(String agentNoKeywords) {
            this.agentNoKeywords = agentNoKeywords;
            return this;
        }
        public String getAgentNoKeywords() {
            return this.agentNoKeywords;
        }

    }

    public static class ListInstagramPageResponseBodyDataBeebotInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        @NameInMap("BeebotInstanceId")
        public String beebotInstanceId;

        /**
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("BeebotNamespaceId")
        public String beebotNamespaceId;

        public static ListInstagramPageResponseBodyDataBeebotInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstagramPageResponseBodyDataBeebotInfo self = new ListInstagramPageResponseBodyDataBeebotInfo();
            return TeaModel.build(map, self);
        }

        public ListInstagramPageResponseBodyDataBeebotInfo setBeebotInstanceId(String beebotInstanceId) {
            this.beebotInstanceId = beebotInstanceId;
            return this;
        }
        public String getBeebotInstanceId() {
            return this.beebotInstanceId;
        }

        public ListInstagramPageResponseBodyDataBeebotInfo setBeebotNamespaceId(String beebotNamespaceId) {
            this.beebotNamespaceId = beebotNamespaceId;
            return this;
        }
        public String getBeebotNamespaceId() {
            return this.beebotNamespaceId;
        }

    }

    public static class ListInstagramPageResponseBodyDataInstagramInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>176546546464</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <strong>example:</strong>
         * <p>matrryhtr</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>connected</p>
         */
        @NameInMap("ConnectionStatus")
        public String connectionStatus;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("HttpFlag")
        public String httpFlag;

        /**
         * <strong>example:</strong>
         * <p>213254324532523</p>
         */
        @NameInMap("PageId")
        public String pageId;

        /**
         * <strong>example:</strong>
         * <p>iwhaclecloud-2</p>
         */
        @NameInMap("PageName")
        public String pageName;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("QueueFlag")
        public String queueFlag;

        /**
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <strong>example:</strong>
         * <p><a href="HTTP://WWW.***.COM">HTTP://WWW.***.COM</a></p>
         */
        @NameInMap("StatusCallbackUrl")
        public String statusCallbackUrl;

        /**
         * <strong>example:</strong>
         * <p>AAA</p>
         */
        @NameInMap("StatusQueue")
        public String statusQueue;

        /**
         * <strong>example:</strong>
         * <p><a href="HTTP://WWW.***.COM">HTTP://WWW.***.COM</a></p>
         */
        @NameInMap("UpCallbackUrl")
        public String upCallbackUrl;

        /**
         * <strong>example:</strong>
         * <p>BBB</p>
         */
        @NameInMap("UpQueue")
        public String upQueue;

        public static ListInstagramPageResponseBodyDataInstagramInfo build(java.util.Map<String, ?> map) throws Exception {
            ListInstagramPageResponseBodyDataInstagramInfo self = new ListInstagramPageResponseBodyDataInstagramInfo();
            return TeaModel.build(map, self);
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setConnectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            return this;
        }
        public String getConnectionStatus() {
            return this.connectionStatus;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setHttpFlag(String httpFlag) {
            this.httpFlag = httpFlag;
            return this;
        }
        public String getHttpFlag() {
            return this.httpFlag;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setPageId(String pageId) {
            this.pageId = pageId;
            return this;
        }
        public String getPageId() {
            return this.pageId;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setPageName(String pageName) {
            this.pageName = pageName;
            return this;
        }
        public String getPageName() {
            return this.pageName;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setQueueFlag(String queueFlag) {
            this.queueFlag = queueFlag;
            return this;
        }
        public String getQueueFlag() {
            return this.queueFlag;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setStatusCallbackUrl(String statusCallbackUrl) {
            this.statusCallbackUrl = statusCallbackUrl;
            return this;
        }
        public String getStatusCallbackUrl() {
            return this.statusCallbackUrl;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setStatusQueue(String statusQueue) {
            this.statusQueue = statusQueue;
            return this;
        }
        public String getStatusQueue() {
            return this.statusQueue;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setUpCallbackUrl(String upCallbackUrl) {
            this.upCallbackUrl = upCallbackUrl;
            return this;
        }
        public String getUpCallbackUrl() {
            return this.upCallbackUrl;
        }

        public ListInstagramPageResponseBodyDataInstagramInfo setUpQueue(String upQueue) {
            this.upQueue = upQueue;
            return this;
        }
        public String getUpQueue() {
            return this.upQueue;
        }

    }

    public static class ListInstagramPageResponseBodyData extends TeaModel {
        @NameInMap("AgentInfo")
        public ListInstagramPageResponseBodyDataAgentInfo agentInfo;

        @NameInMap("BeebotInfo")
        public ListInstagramPageResponseBodyDataBeebotInfo beebotInfo;

        @NameInMap("InstagramInfo")
        public ListInstagramPageResponseBodyDataInstagramInfo instagramInfo;

        public static ListInstagramPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstagramPageResponseBodyData self = new ListInstagramPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstagramPageResponseBodyData setAgentInfo(ListInstagramPageResponseBodyDataAgentInfo agentInfo) {
            this.agentInfo = agentInfo;
            return this;
        }
        public ListInstagramPageResponseBodyDataAgentInfo getAgentInfo() {
            return this.agentInfo;
        }

        public ListInstagramPageResponseBodyData setBeebotInfo(ListInstagramPageResponseBodyDataBeebotInfo beebotInfo) {
            this.beebotInfo = beebotInfo;
            return this;
        }
        public ListInstagramPageResponseBodyDataBeebotInfo getBeebotInfo() {
            return this.beebotInfo;
        }

        public ListInstagramPageResponseBodyData setInstagramInfo(ListInstagramPageResponseBodyDataInstagramInfo instagramInfo) {
            this.instagramInfo = instagramInfo;
            return this;
        }
        public ListInstagramPageResponseBodyDataInstagramInfo getInstagramInfo() {
            return this.instagramInfo;
        }

    }

}
