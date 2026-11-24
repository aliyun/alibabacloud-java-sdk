// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class GeneralRephotographyDetectionResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The recapture detection result.</p>
     */
    @NameInMap("Data")
    public GeneralRephotographyDetectionResponseBodyData data;

    /**
     * <p>The response message or failure description.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>70CBEFDF-BB17-1EB3-8A21-569F3124738F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GeneralRephotographyDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneralRephotographyDetectionResponseBody self = new GeneralRephotographyDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneralRephotographyDetectionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GeneralRephotographyDetectionResponseBody setData(GeneralRephotographyDetectionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneralRephotographyDetectionResponseBodyData getData() {
        return this.data;
    }

    public GeneralRephotographyDetectionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GeneralRephotographyDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneralRephotographyDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GeneralRephotographyDetectionResponseBodyDataResult extends TeaModel {
        /**
         * <p>Indicates whether the image is recaptured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFake")
        public Boolean isFake;

        /**
         * <p>Fixed to general.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        @NameInMap("Type")
        public String type;

        public static GeneralRephotographyDetectionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GeneralRephotographyDetectionResponseBodyDataResult self = new GeneralRephotographyDetectionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GeneralRephotographyDetectionResponseBodyDataResult setIsFake(Boolean isFake) {
            this.isFake = isFake;
            return this;
        }
        public Boolean getIsFake() {
            return this.isFake;
        }

        public GeneralRephotographyDetectionResponseBodyDataResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GeneralRephotographyDetectionResponseBodyData extends TeaModel {
        /**
         * <p>The business result. This is an empty object if the call fails.</p>
         */
        @NameInMap("Result")
        public GeneralRephotographyDetectionResponseBodyDataResult result;

        /**
         * <p>The usage information. The value is <code>{&quot;ProcessingCount&quot;:1}</code> if the call is successful, or an empty object if the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProcessingCount&quot;:1}</p>
         */
        @NameInMap("UsageMap")
        public java.util.Map<String, Long> usageMap;

        public static GeneralRephotographyDetectionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneralRephotographyDetectionResponseBodyData self = new GeneralRephotographyDetectionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneralRephotographyDetectionResponseBodyData setResult(GeneralRephotographyDetectionResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GeneralRephotographyDetectionResponseBodyDataResult getResult() {
            return this.result;
        }

        public GeneralRephotographyDetectionResponseBodyData setUsageMap(java.util.Map<String, Long> usageMap) {
            this.usageMap = usageMap;
            return this;
        }
        public java.util.Map<String, Long> getUsageMap() {
            return this.usageMap;
        }

    }

}
