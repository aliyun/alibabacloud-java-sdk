// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeConsortiumAdminStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeConsortiumAdminStatusResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeConsortiumAdminStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConsortiumAdminStatusResponseBody self = new DescribeConsortiumAdminStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConsortiumAdminStatusResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeConsortiumAdminStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConsortiumAdminStatusResponseBody setResult(java.util.List<DescribeConsortiumAdminStatusResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeConsortiumAdminStatusResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeConsortiumAdminStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeConsortiumAdminStatusResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ConsortiumAdministrator")
        public Boolean consortiumAdministrator;

        /**
         * <strong>example:</strong>
         * <p>consortium-lianmenyumingyi-hc5d1bwlulg7</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        public static DescribeConsortiumAdminStatusResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeConsortiumAdminStatusResponseBodyResult self = new DescribeConsortiumAdminStatusResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeConsortiumAdminStatusResponseBodyResult setConsortiumAdministrator(Boolean consortiumAdministrator) {
            this.consortiumAdministrator = consortiumAdministrator;
            return this;
        }
        public Boolean getConsortiumAdministrator() {
            return this.consortiumAdministrator;
        }

        public DescribeConsortiumAdminStatusResponseBodyResult setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

    }

}
