// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisSettingsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5E82B8A8-EED7-4557-A6E9-D1AD3E58****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
        @NameInMap("authorizationStatus")
        public Boolean authorizationStatus;

        @NameInMap("dailyLimit")
        public Integer dailyLimit;

        @NameInMap("dailyScheduleEnabled")
        public Boolean dailyScheduleEnabled;

        @NameInMap("diagnosisMode")
        public String diagnosisMode;

        /**
         * <p>The scenario of intelligent O&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>Business Search</p>
         */
        @NameInMap("scene")
        public String scene;

        @NameInMap("selectedItems")
        public java.util.List<String> selectedItems;

        /**
         * <p>The timestamp when the intelligent O&amp;M scenario was last updated.</p>
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

        public DescribeDiagnosisSettingsResponseBodyResult setAuthorizationStatus(Boolean authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public Boolean getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public DescribeDiagnosisSettingsResponseBodyResult setDailyLimit(Integer dailyLimit) {
            this.dailyLimit = dailyLimit;
            return this;
        }
        public Integer getDailyLimit() {
            return this.dailyLimit;
        }

        public DescribeDiagnosisSettingsResponseBodyResult setDailyScheduleEnabled(Boolean dailyScheduleEnabled) {
            this.dailyScheduleEnabled = dailyScheduleEnabled;
            return this;
        }
        public Boolean getDailyScheduleEnabled() {
            return this.dailyScheduleEnabled;
        }

        public DescribeDiagnosisSettingsResponseBodyResult setDiagnosisMode(String diagnosisMode) {
            this.diagnosisMode = diagnosisMode;
            return this;
        }
        public String getDiagnosisMode() {
            return this.diagnosisMode;
        }

        public DescribeDiagnosisSettingsResponseBodyResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public DescribeDiagnosisSettingsResponseBodyResult setSelectedItems(java.util.List<String> selectedItems) {
            this.selectedItems = selectedItems;
            return this;
        }
        public java.util.List<String> getSelectedItems() {
            return this.selectedItems;
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
