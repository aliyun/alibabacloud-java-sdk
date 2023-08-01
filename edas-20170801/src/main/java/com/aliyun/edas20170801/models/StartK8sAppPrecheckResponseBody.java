// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class StartK8sAppPrecheckResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public StartK8sAppPrecheckResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StartK8sAppPrecheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartK8sAppPrecheckResponseBody self = new StartK8sAppPrecheckResponseBody();
        return TeaModel.build(map, self);
    }

    public StartK8sAppPrecheckResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public StartK8sAppPrecheckResponseBody setData(StartK8sAppPrecheckResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StartK8sAppPrecheckResponseBodyData getData() {
        return this.data;
    }

    public StartK8sAppPrecheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartK8sAppPrecheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class StartK8sAppPrecheckResponseBodyData extends TeaModel {
        /**
         * <p>The jobs and the details about the jobs.</p>
         */
        @NameInMap("Jobs")
        public java.util.List<String> jobs;

        public static StartK8sAppPrecheckResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StartK8sAppPrecheckResponseBodyData self = new StartK8sAppPrecheckResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StartK8sAppPrecheckResponseBodyData setJobs(java.util.List<String> jobs) {
            this.jobs = jobs;
            return this;
        }
        public java.util.List<String> getJobs() {
            return this.jobs;
        }

    }

}
