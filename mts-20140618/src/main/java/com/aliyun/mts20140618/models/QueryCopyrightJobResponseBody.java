// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCopyrightJobResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryCopyrightJobResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5CA6E020-4102-4FFF-AA56-5ED7ECD811A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("StatusCode")
    public Long statusCode;

    public static QueryCopyrightJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCopyrightJobResponseBody self = new QueryCopyrightJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCopyrightJobResponseBody setData(java.util.List<QueryCopyrightJobResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCopyrightJobResponseBodyData> getData() {
        return this.data;
    }

    public QueryCopyrightJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCopyrightJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCopyrightJobResponseBody setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Long getStatusCode() {
        return this.statusCode;
    }

    public static class QueryCopyrightJobResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://callbacktest.com/callback">http://callbacktest.com/callback</a></p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <strong>example:</strong>
         * <p>1627357322</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1627357328</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;ivison-test&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;gambling.mp4&quot;}</p>
         */
        @NameInMap("Input")
        public String input;

        /**
         * <strong>example:</strong>
         * <p>bfb786c639894f4d80648792021e****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Level")
        public Long level;

        /**
         * <strong>example:</strong>
         * <p>平头哥半导体(上海)</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Bucket&quot;:&quot;ivison-test&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;out.mp4&quot;}</p>
         */
        @NameInMap("Output")
        public String output;

        /**
         * <strong>example:</strong>
         * <p>{&quot;Code&quot;:&quot;success&quot;,&quot;Message&quot;:&quot;ok&quot;}</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <strong>example:</strong>
         * <p>1346693***</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static QueryCopyrightJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCopyrightJobResponseBodyData self = new QueryCopyrightJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCopyrightJobResponseBodyData setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public QueryCopyrightJobResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCopyrightJobResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public QueryCopyrightJobResponseBodyData setInput(String input) {
            this.input = input;
            return this;
        }
        public String getInput() {
            return this.input;
        }

        public QueryCopyrightJobResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryCopyrightJobResponseBodyData setLevel(Long level) {
            this.level = level;
            return this;
        }
        public Long getLevel() {
            return this.level;
        }

        public QueryCopyrightJobResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCopyrightJobResponseBodyData setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public QueryCopyrightJobResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryCopyrightJobResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryCopyrightJobResponseBodyData setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryCopyrightJobResponseBodyData setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
