// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAutomateResponseConfigCounterResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public DescribeAutomateResponseConfigCounterResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
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
    public Boolean success;

    public static DescribeAutomateResponseConfigCounterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutomateResponseConfigCounterResponseBody self = new DescribeAutomateResponseConfigCounterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutomateResponseConfigCounterResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeAutomateResponseConfigCounterResponseBody setData(DescribeAutomateResponseConfigCounterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAutomateResponseConfigCounterResponseBodyData getData() {
        return this.data;
    }

    public DescribeAutomateResponseConfigCounterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAutomateResponseConfigCounterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAutomateResponseConfigCounterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAutomateResponseConfigCounterResponseBodyData extends TeaModel {
        /**
         * <p>The total number of rules.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("All")
        public Long all;

        /**
         * <p>The number of enabled rules.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Online")
        public Long online;

        public static DescribeAutomateResponseConfigCounterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAutomateResponseConfigCounterResponseBodyData self = new DescribeAutomateResponseConfigCounterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAutomateResponseConfigCounterResponseBodyData setAll(Long all) {
            this.all = all;
            return this;
        }
        public Long getAll() {
            return this.all;
        }

        public DescribeAutomateResponseConfigCounterResponseBodyData setOnline(Long online) {
            this.online = online;
            return this;
        }
        public Long getOnline() {
            return this.online;
        }

    }

}
