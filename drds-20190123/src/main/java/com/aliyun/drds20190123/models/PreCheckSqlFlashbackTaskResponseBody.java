// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PreCheckSqlFlashbackTaskResponseBody extends TeaModel {
    @NameInMap("CheckResult")
    public PreCheckSqlFlashbackTaskResponseBodyCheckResult checkResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PreCheckSqlFlashbackTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCheckSqlFlashbackTaskResponseBody self = new PreCheckSqlFlashbackTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCheckSqlFlashbackTaskResponseBody setCheckResult(PreCheckSqlFlashbackTaskResponseBodyCheckResult checkResult) {
        this.checkResult = checkResult;
        return this;
    }
    public PreCheckSqlFlashbackTaskResponseBodyCheckResult getCheckResult() {
        return this.checkResult;
    }

    public PreCheckSqlFlashbackTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreCheckSqlFlashbackTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PreCheckSqlFlashbackTaskResponseBodyCheckResult extends TeaModel {
        @NameInMap("BinlogExists")
        public Boolean binlogExists;

        @NameInMap("BinlogRowQueryEventEnabled")
        public Boolean binlogRowQueryEventEnabled;

        @NameInMap("CanUpgradeSupportBinlogRowQueryEvents")
        public Boolean canUpgradeSupportBinlogRowQueryEvents;

        @NameInMap("HasTable")
        public Boolean hasTable;

        @NameInMap("SupportBinlogRowQueryEvents")
        public Boolean supportBinlogRowQueryEvents;

        public static PreCheckSqlFlashbackTaskResponseBodyCheckResult build(java.util.Map<String, ?> map) throws Exception {
            PreCheckSqlFlashbackTaskResponseBodyCheckResult self = new PreCheckSqlFlashbackTaskResponseBodyCheckResult();
            return TeaModel.build(map, self);
        }

        public PreCheckSqlFlashbackTaskResponseBodyCheckResult setBinlogExists(Boolean binlogExists) {
            this.binlogExists = binlogExists;
            return this;
        }
        public Boolean getBinlogExists() {
            return this.binlogExists;
        }

        public PreCheckSqlFlashbackTaskResponseBodyCheckResult setBinlogRowQueryEventEnabled(Boolean binlogRowQueryEventEnabled) {
            this.binlogRowQueryEventEnabled = binlogRowQueryEventEnabled;
            return this;
        }
        public Boolean getBinlogRowQueryEventEnabled() {
            return this.binlogRowQueryEventEnabled;
        }

        public PreCheckSqlFlashbackTaskResponseBodyCheckResult setCanUpgradeSupportBinlogRowQueryEvents(Boolean canUpgradeSupportBinlogRowQueryEvents) {
            this.canUpgradeSupportBinlogRowQueryEvents = canUpgradeSupportBinlogRowQueryEvents;
            return this;
        }
        public Boolean getCanUpgradeSupportBinlogRowQueryEvents() {
            return this.canUpgradeSupportBinlogRowQueryEvents;
        }

        public PreCheckSqlFlashbackTaskResponseBodyCheckResult setHasTable(Boolean hasTable) {
            this.hasTable = hasTable;
            return this;
        }
        public Boolean getHasTable() {
            return this.hasTable;
        }

        public PreCheckSqlFlashbackTaskResponseBodyCheckResult setSupportBinlogRowQueryEvents(Boolean supportBinlogRowQueryEvents) {
            this.supportBinlogRowQueryEvents = supportBinlogRowQueryEvents;
            return this;
        }
        public Boolean getSupportBinlogRowQueryEvents() {
            return this.supportBinlogRowQueryEvents;
        }

    }

}
