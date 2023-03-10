// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeStsGrantStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The authorization status of Anti-DDoS Pro or Anti-DDoS Premium.</p>
     */
    @NameInMap("StsGrant")
    public DescribeStsGrantStatusResponseBodyStsGrant stsGrant;

    public static DescribeStsGrantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStsGrantStatusResponseBody self = new DescribeStsGrantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStsGrantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStsGrantStatusResponseBody setStsGrant(DescribeStsGrantStatusResponseBodyStsGrant stsGrant) {
        this.stsGrant = stsGrant;
        return this;
    }
    public DescribeStsGrantStatusResponseBodyStsGrant getStsGrant() {
        return this.stsGrant;
    }

    public static class DescribeStsGrantStatusResponseBodyStsGrant extends TeaModel {
        /**
         * <p>The authorization status. Valid values:</p>
         * <br>
         * <p>*   **0**: Anti-DDoS Pro or Anti-DDoS Premium is not authorized to access other cloud services.</p>
         * <p>*   **1**: Anti-DDoS Pro or Anti-DDoS Premium is authorized to access other cloud services.</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeStsGrantStatusResponseBodyStsGrant build(java.util.Map<String, ?> map) throws Exception {
            DescribeStsGrantStatusResponseBodyStsGrant self = new DescribeStsGrantStatusResponseBodyStsGrant();
            return TeaModel.build(map, self);
        }

        public DescribeStsGrantStatusResponseBodyStsGrant setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
