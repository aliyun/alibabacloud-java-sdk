// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CancelKyuubiSparkApplicationResponseBody extends TeaModel {
    @NameInMap("body")
    public CancelKyuubiSparkApplicationResponseBodyBody body;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CancelKyuubiSparkApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelKyuubiSparkApplicationResponseBody self = new CancelKyuubiSparkApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelKyuubiSparkApplicationResponseBody setBody(CancelKyuubiSparkApplicationResponseBodyBody body) {
        this.body = body;
        return this;
    }
    public CancelKyuubiSparkApplicationResponseBodyBody getBody() {
        return this.body;
    }

    public CancelKyuubiSparkApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CancelKyuubiSparkApplicationResponseBodyBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>spark-339f844005b6404c95f9f7c7a13b****</p>
         */
        @NameInMap("applicationId")
        public String applicationId;

        @NameInMap("success")
        public Boolean success;

        public static CancelKyuubiSparkApplicationResponseBodyBody build(java.util.Map<String, ?> map) throws Exception {
            CancelKyuubiSparkApplicationResponseBodyBody self = new CancelKyuubiSparkApplicationResponseBodyBody();
            return TeaModel.build(map, self);
        }

        public CancelKyuubiSparkApplicationResponseBodyBody setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public CancelKyuubiSparkApplicationResponseBodyBody setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
