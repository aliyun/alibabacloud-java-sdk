// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <blockquote>
     * <p>The value 200 indicates success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of affected rows.</p>
     */
    @NameInMap("Data")
    public DeleteSiteMonitorsResponseBodyData data;

    /**
     * <p>The returned message. If the request is successful, a success message is returned. If the request fails, the failure reason is returned, such as <code>TaskId not found</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>Request succeeded.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123BCC5D-8B63-48EA-B747-9A8995BE7AA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful. The value true indicates success. The value false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DeleteSiteMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsResponseBody self = new DeleteSiteMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSiteMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSiteMonitorsResponseBody setData(DeleteSiteMonitorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSiteMonitorsResponseBodyData getData() {
        return this.data;
    }

    public DeleteSiteMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSiteMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSiteMonitorsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DeleteSiteMonitorsResponseBodyData extends TeaModel {
        /**
         * <p>The number of affected rows.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("count")
        public Integer count;

        public static DeleteSiteMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSiteMonitorsResponseBodyData self = new DeleteSiteMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSiteMonitorsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
