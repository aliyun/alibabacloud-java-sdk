// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class PushApplicationDataResponseBody extends TeaModel {
    /**
     * <p>The push results of data files.</p>
     */
    @NameInMap("PushResults")
    public PushApplicationDataResponseBodyPushResults pushResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PushApplicationDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushApplicationDataResponseBody self = new PushApplicationDataResponseBody();
        return TeaModel.build(map, self);
    }

    public PushApplicationDataResponseBody setPushResults(PushApplicationDataResponseBodyPushResults pushResults) {
        this.pushResults = pushResults;
        return this;
    }
    public PushApplicationDataResponseBodyPushResults getPushResults() {
        return this.pushResults;
    }

    public PushApplicationDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PushApplicationDataResponseBodyPushResultsPushResult extends TeaModel {
        /**
         * <p>The name of the data file.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The push result. The value is of the enumeration type. Valid values:</p>
         * <br>
         * <p>*   0: The push operation is successful.</p>
         * <p>*   100: The push operation has been performed and the file is pushed.</p>
         * <p>*   200: The push operation has been performed and the file is being pushed to specific file servers.</p>
         * <p>*   300: The push operation failed. You must trigger the push operation again. The ResultDescrip parameter indicates the error description.</p>
         */
        @NameInMap("ResultCode")
        public Integer resultCode;

        /**
         * <p>The description of the push status.</p>
         */
        @NameInMap("ResultDescrip")
        public String resultDescrip;

        /**
         * <p>The version number of the data file.</p>
         */
        @NameInMap("Version")
        public String version;

        public static PushApplicationDataResponseBodyPushResultsPushResult build(java.util.Map<String, ?> map) throws Exception {
            PushApplicationDataResponseBodyPushResultsPushResult self = new PushApplicationDataResponseBodyPushResultsPushResult();
            return TeaModel.build(map, self);
        }

        public PushApplicationDataResponseBodyPushResultsPushResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PushApplicationDataResponseBodyPushResultsPushResult setResultCode(Integer resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public Integer getResultCode() {
            return this.resultCode;
        }

        public PushApplicationDataResponseBodyPushResultsPushResult setResultDescrip(String resultDescrip) {
            this.resultDescrip = resultDescrip;
            return this;
        }
        public String getResultDescrip() {
            return this.resultDescrip;
        }

        public PushApplicationDataResponseBodyPushResultsPushResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class PushApplicationDataResponseBodyPushResults extends TeaModel {
        @NameInMap("PushResult")
        public java.util.List<PushApplicationDataResponseBodyPushResultsPushResult> pushResult;

        public static PushApplicationDataResponseBodyPushResults build(java.util.Map<String, ?> map) throws Exception {
            PushApplicationDataResponseBodyPushResults self = new PushApplicationDataResponseBodyPushResults();
            return TeaModel.build(map, self);
        }

        public PushApplicationDataResponseBodyPushResults setPushResult(java.util.List<PushApplicationDataResponseBodyPushResultsPushResult> pushResult) {
            this.pushResult = pushResult;
            return this;
        }
        public java.util.List<PushApplicationDataResponseBodyPushResultsPushResult> getPushResult() {
            return this.pushResult;
        }

    }

}
