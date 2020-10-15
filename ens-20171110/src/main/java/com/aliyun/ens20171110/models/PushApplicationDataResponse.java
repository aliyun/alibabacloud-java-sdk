// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PushResults")
    @Validation(required = true)
    public PushApplicationDataResponsePushResults pushResults;

    public static PushApplicationDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PushApplicationDataResponse self = new PushApplicationDataResponse();
        return TeaModel.build(map, self);
    }

    public PushApplicationDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushApplicationDataResponse setPushResults(PushApplicationDataResponsePushResults pushResults) {
        this.pushResults = pushResults;
        return this;
    }
    public PushApplicationDataResponsePushResults getPushResults() {
        return this.pushResults;
    }

    public static class PushApplicationDataResponsePushResultsPushResult extends TeaModel {
        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("ResultDescrip")
        @Validation(required = true)
        public String resultDescrip;

        @NameInMap("ResultCode")
        @Validation(required = true)
        public Integer resultCode;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static PushApplicationDataResponsePushResultsPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushApplicationDataResponsePushResultsPushResult self = new PushApplicationDataResponsePushResultsPushResult();
            return TeaModel.build(map, self);
        }

        public PushApplicationDataResponsePushResultsPushResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public PushApplicationDataResponsePushResultsPushResult setResultDescrip(String resultDescrip) {
            this.resultDescrip = resultDescrip;
            return this;
        }
        public String getResultDescrip() {
            return this.resultDescrip;
        }

        public PushApplicationDataResponsePushResultsPushResult setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

        public PushApplicationDataResponsePushResultsPushResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class PushApplicationDataResponsePushResults extends TeaModel {
        @NameInMap("PushResult")
        @Validation(required = true)
        public java.util.List<PushApplicationDataResponsePushResultsPushResult> pushResult;

        public static PushApplicationDataResponsePushResults build(java.util.Map<String, ?> map) throws Exception {
            PushApplicationDataResponsePushResults self = new PushApplicationDataResponsePushResults();
            return TeaModel.build(map, self);
        }

        public PushApplicationDataResponsePushResults setPushResult(java.util.List<PushApplicationDataResponsePushResultsPushResult> pushResult) {
            this.pushResult = pushResult;
            return this;
        }
        public java.util.List<PushApplicationDataResponsePushResultsPushResult> getPushResult() {
            return this.pushResult;
        }

    }

}
