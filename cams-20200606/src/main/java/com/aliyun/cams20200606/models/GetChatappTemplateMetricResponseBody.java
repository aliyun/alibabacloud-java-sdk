// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateMetricResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetChatappTemplateMetricResponseBodyData> data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappTemplateMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateMetricResponseBody self = new GetChatappTemplateMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateMetricResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetChatappTemplateMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatappTemplateMetricResponseBody setData(java.util.List<GetChatappTemplateMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetChatappTemplateMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetChatappTemplateMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatappTemplateMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatappTemplateMetricResponseBodyDataCliented extends TeaModel {
        /**
         * <p>Button name</p>
         */
        @NameInMap("ButtonContent")
        public String buttonContent;

        /**
         * <p>Clicked count</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The type of button.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetChatappTemplateMetricResponseBodyDataCliented build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateMetricResponseBodyDataCliented self = new GetChatappTemplateMetricResponseBodyDataCliented();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateMetricResponseBodyDataCliented setButtonContent(String buttonContent) {
            this.buttonContent = buttonContent;
            return this;
        }
        public String getButtonContent() {
            return this.buttonContent;
        }

        public GetChatappTemplateMetricResponseBodyDataCliented setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetChatappTemplateMetricResponseBodyDataCliented setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetChatappTemplateMetricResponseBodyData extends TeaModel {
        /**
         * <p>Click Statistics</p>
         */
        @NameInMap("Cliented")
        public java.util.List<GetChatappTemplateMetricResponseBodyDataCliented> cliented;

        /**
         * <p>Delivered count</p>
         */
        @NameInMap("DeliveredCount")
        public Integer deliveredCount;

        /**
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The language that is used in the message template. For more information, see [Language codes](~~463420~~).</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>Read count</p>
         */
        @NameInMap("ReadCount")
        public Integer readCount;

        /**
         * <p>Sent count</p>
         */
        @NameInMap("SentCount")
        public Integer sentCount;

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The code of the message template.</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        public static GetChatappTemplateMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateMetricResponseBodyData self = new GetChatappTemplateMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateMetricResponseBodyData setCliented(java.util.List<GetChatappTemplateMetricResponseBodyDataCliented> cliented) {
            this.cliented = cliented;
            return this;
        }
        public java.util.List<GetChatappTemplateMetricResponseBodyDataCliented> getCliented() {
            return this.cliented;
        }

        public GetChatappTemplateMetricResponseBodyData setDeliveredCount(Integer deliveredCount) {
            this.deliveredCount = deliveredCount;
            return this;
        }
        public Integer getDeliveredCount() {
            return this.deliveredCount;
        }

        public GetChatappTemplateMetricResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetChatappTemplateMetricResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetChatappTemplateMetricResponseBodyData setReadCount(Integer readCount) {
            this.readCount = readCount;
            return this;
        }
        public Integer getReadCount() {
            return this.readCount;
        }

        public GetChatappTemplateMetricResponseBodyData setSentCount(Integer sentCount) {
            this.sentCount = sentCount;
            return this;
        }
        public Integer getSentCount() {
            return this.sentCount;
        }

        public GetChatappTemplateMetricResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public GetChatappTemplateMetricResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

    }

}
