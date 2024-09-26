// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsResponseBody extends TeaModel {
    /**
     * <p>The responses code.</p>
     * <blockquote>
     * <p> The status code 200 indicates that the request was successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of detection points that are affected by the site monitoring tasks.</p>
     */
    @NameInMap("Data")
    public EnableSiteMonitorsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3fcd12e7-d387-42ee-b77e-661c775bb17f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static EnableSiteMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsResponseBody self = new EnableSiteMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSiteMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnableSiteMonitorsResponseBody setData(EnableSiteMonitorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnableSiteMonitorsResponseBodyData getData() {
        return this.data;
    }

    public EnableSiteMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableSiteMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSiteMonitorsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class EnableSiteMonitorsResponseBodyData extends TeaModel {
        /**
         * <p>The number of detection points.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("count")
        public Integer count;

        public static EnableSiteMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnableSiteMonitorsResponseBodyData self = new EnableSiteMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnableSiteMonitorsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
