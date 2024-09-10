// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <blockquote>
     * <p> The status code 200 indicates a success.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of detection points that were monitored by the site monitoring tasks.</p>
     */
    @NameInMap("Data")
    public DisableSiteMonitorsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3fcd12e7-d387-42ee-b77e-661c775bb17f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li>true: successful.</li>
     * <li>false: failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DisableSiteMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSiteMonitorsResponseBody self = new DisableSiteMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSiteMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSiteMonitorsResponseBody setData(DisableSiteMonitorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisableSiteMonitorsResponseBodyData getData() {
        return this.data;
    }

    public DisableSiteMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSiteMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisableSiteMonitorsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DisableSiteMonitorsResponseBodyData extends TeaModel {
        /**
         * <p>The number of detection points.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("count")
        public Integer count;

        public static DisableSiteMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisableSiteMonitorsResponseBodyData self = new DisableSiteMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisableSiteMonitorsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
