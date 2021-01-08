// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DescribeExposureSettingsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public DescribeExposureSettingsResponseBodyResult result;

    public static DescribeExposureSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposureSettingsResponseBody self = new DescribeExposureSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposureSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExposureSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposureSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExposureSettingsResponseBody setResult(DescribeExposureSettingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeExposureSettingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeExposureSettingsResponseBodyResult extends TeaModel {
        @NameInMap("DurationSeconds")
        public Integer durationSeconds;

        @NameInMap("ScenarioBased")
        public Boolean scenarioBased;

        public static DescribeExposureSettingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeExposureSettingsResponseBodyResult self = new DescribeExposureSettingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeExposureSettingsResponseBodyResult setDurationSeconds(Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Integer getDurationSeconds() {
            return this.durationSeconds;
        }

        public DescribeExposureSettingsResponseBodyResult setScenarioBased(Boolean scenarioBased) {
            this.scenarioBased = scenarioBased;
            return this;
        }
        public Boolean getScenarioBased() {
            return this.scenarioBased;
        }

    }

}
