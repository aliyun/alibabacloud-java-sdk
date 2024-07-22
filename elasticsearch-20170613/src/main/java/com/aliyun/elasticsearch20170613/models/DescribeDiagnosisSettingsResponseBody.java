// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5E82B8A8-EED7-4557-A6E9-D1AD3E58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The return results.</p>
     */
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
        /**
         * <p>Scenarios of intelligent maintenance.</p>
         * 
         * <strong>example:</strong>
         * <p>Business Search</p>
         */
        @NameInMap("scene")
        public String scene;

        /**
         * <p>The timestamp of the last update for Intelligent Maintenance scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>1588994035385</p>
         */
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
