// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class CheckServiceDeployableResponseBody extends TeaModel {
    @NameInMap("CheckResults")
    public java.util.List<CheckServiceDeployableResponseBodyCheckResults> checkResults;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckServiceDeployableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceDeployableResponseBody self = new CheckServiceDeployableResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceDeployableResponseBody setCheckResults(java.util.List<CheckServiceDeployableResponseBodyCheckResults> checkResults) {
        this.checkResults = checkResults;
        return this;
    }
    public java.util.List<CheckServiceDeployableResponseBodyCheckResults> getCheckResults() {
        return this.checkResults;
    }

    public CheckServiceDeployableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckServiceDeployableResponseBodyCheckResults extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>Balance</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Value")
        public String value;

        public static CheckServiceDeployableResponseBodyCheckResults build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceDeployableResponseBodyCheckResults self = new CheckServiceDeployableResponseBodyCheckResults();
            return TeaModel.build(map, self);
        }

        public CheckServiceDeployableResponseBodyCheckResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckServiceDeployableResponseBodyCheckResults setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CheckServiceDeployableResponseBodyCheckResults setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
