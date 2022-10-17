// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationResponseBody extends TeaModel {
    @NameInMap("Data")
    public RunCTRegistrationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RunCTRegistrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationResponseBody self = new RunCTRegistrationResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationResponseBody setData(RunCTRegistrationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RunCTRegistrationResponseBodyData getData() {
        return this.data;
    }

    public RunCTRegistrationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunCTRegistrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RunCTRegistrationResponseBodyData extends TeaModel {
        @NameInMap("DUrl")
        public String DUrl;

        @NameInMap("NUrl")
        public String NUrl;

        public static RunCTRegistrationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationResponseBodyData self = new RunCTRegistrationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationResponseBodyData setDUrl(String DUrl) {
            this.DUrl = DUrl;
            return this;
        }
        public String getDUrl() {
            return this.DUrl;
        }

        public RunCTRegistrationResponseBodyData setNUrl(String NUrl) {
            this.NUrl = NUrl;
            return this;
        }
        public String getNUrl() {
            return this.NUrl;
        }

    }

}
