// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>>  The status code 200 indicates that the call was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the site monitoring tasks that were deleted.</p>
     */
    @NameInMap("Data")
    public DeleteSiteMonitorsResponseBodyData data;

    /**
     * <p>The returned message. If the call was successful, the value success is returned. If the call failed, an error message such as `TaskId not found` is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. The value true indicates success. The value false indicates failure.</p>
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
         * <p>The number of the site monitoring tasks that were deleted.</p>
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
