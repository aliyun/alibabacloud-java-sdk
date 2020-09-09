// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class RunCTRegistrationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RunCTRegistrationResponseData data;

    public static RunCTRegistrationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCTRegistrationResponse self = new RunCTRegistrationResponse();
        return TeaModel.build(map, self);
    }

    public RunCTRegistrationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCTRegistrationResponse setData(RunCTRegistrationResponseData data) {
        this.data = data;
        return this;
    }
    public RunCTRegistrationResponseData getData() {
        return this.data;
    }

    public static class RunCTRegistrationResponseData extends TeaModel {
        @NameInMap("DUrl")
        @Validation(required = true)
        public String DUrl;

        @NameInMap("NUrl")
        @Validation(required = true)
        public String NUrl;

        public static RunCTRegistrationResponseData build(java.util.Map<String, ?> map) throws Exception {
            RunCTRegistrationResponseData self = new RunCTRegistrationResponseData();
            return TeaModel.build(map, self);
        }

        public RunCTRegistrationResponseData setDUrl(String DUrl) {
            this.DUrl = DUrl;
            return this;
        }
        public String getDUrl() {
            return this.DUrl;
        }

        public RunCTRegistrationResponseData setNUrl(String NUrl) {
            this.NUrl = NUrl;
            return this;
        }
        public String getNUrl() {
            return this.NUrl;
        }

    }

}
