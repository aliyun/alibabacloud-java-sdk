// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeDiagnosisSettingsResponseBodyResult result;

    public static DescribeDiagnosisSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisSettingsResponseBody self = new DescribeDiagnosisSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDiagnosisSettingsResponseBody setResult(DescribeDiagnosisSettingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeDiagnosisSettingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeDiagnosisSettingsResponseBodyResult extends TeaModel {
        @NameInMap("scene")
        public String scene;

        @NameInMap("updateTime")
        public Long updateTime;

        public static DescribeDiagnosisSettingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDiagnosisSettingsResponseBodyResult self = new DescribeDiagnosisSettingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeDiagnosisSettingsResponseBodyResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeDiagnosisSettingsResponseBodyResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
