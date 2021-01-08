// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ModifyExposureSettingsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ModifyExposureSettingsResponseBodyResult result;

    public static ModifyExposureSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyExposureSettingsResponseBody self = new ModifyExposureSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyExposureSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyExposureSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyExposureSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyExposureSettingsResponseBody setResult(ModifyExposureSettingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyExposureSettingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ModifyExposureSettingsResponseBodyResult extends TeaModel {
        @NameInMap("DurationSeconds")
        public Integer durationSeconds;

        @NameInMap("ScenarioBased")
        public Boolean scenarioBased;

        public static ModifyExposureSettingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyExposureSettingsResponseBodyResult self = new ModifyExposureSettingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyExposureSettingsResponseBodyResult setDurationSeconds(Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Integer getDurationSeconds() {
            return this.durationSeconds;
        }

        public ModifyExposureSettingsResponseBodyResult setScenarioBased(Boolean scenarioBased) {
            this.scenarioBased = scenarioBased;
            return this;
        }
        public Boolean getScenarioBased() {
            return this.scenarioBased;
        }

    }

}
