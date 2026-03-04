// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListNotificationRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListNotificationRecordsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>0630E5DF-CEB0-445B-8626-D5C7481181C3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListNotificationRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationRecordsResponseBody self = new ListNotificationRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNotificationRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNotificationRecordsResponseBody setData(java.util.List<ListNotificationRecordsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNotificationRecordsResponseBodyData> getData() {
        return this.data;
    }

    public ListNotificationRecordsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNotificationRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNotificationRecordsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListNotificationRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListNotificationRecordsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{
         *     &quot;agentId&quot;: &quot;agent@ccc-test&quot;,
         *     &quot;callType&quot;: &quot;OUTBOUND&quot;,
         *     &quot;callee&quot;: &quot;13<strong><strong>00&quot;,
         *     &quot;caller&quot;: &quot;05</strong></strong>81&quot;,
         *     &quot;channelId&quot;: &quot;ch-user-13<strong><strong>00-05</strong></strong>81-1772619731285-job-<em><strong><strong>&quot;,
         *     &quot;contactId&quot;: &quot;job-</strong></strong></em>&quot;,
         *     &quot;eventTime&quot;: &quot;2026-03-04T10:22:11.309Z&quot;,
         *     &quot;eventType&quot;: &quot;Dialing&quot;,
         *     &quot;instanceId&quot;: &quot;ccc-test&quot;,
         *     &quot;mediaType&quot;: &quot;AUDIO&quot;,
         *     &quot;skillGroupId&quot;: &quot;skill@ccc-test&quot;
         * }</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-468a63a2-<strong><strong>-</strong></strong>-****-b1ecf726d4be</p>
         */
        @NameInMap("NotificationKey")
        public String notificationKey;

        /**
         * <strong>example:</strong>
         * <p>Dialing</p>
         */
        @NameInMap("NotificationType")
        public String notificationType;

        public static ListNotificationRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNotificationRecordsResponseBodyData self = new ListNotificationRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNotificationRecordsResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListNotificationRecordsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListNotificationRecordsResponseBodyData setNotificationKey(String notificationKey) {
            this.notificationKey = notificationKey;
            return this;
        }
        public String getNotificationKey() {
            return this.notificationKey;
        }

        public ListNotificationRecordsResponseBodyData setNotificationType(String notificationType) {
            this.notificationType = notificationType;
            return this;
        }
        public String getNotificationType() {
            return this.notificationType;
        }

    }

}
