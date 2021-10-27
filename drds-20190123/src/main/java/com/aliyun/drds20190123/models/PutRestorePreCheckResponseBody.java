// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class PutRestorePreCheckResponseBody extends TeaModel {
    @NameInMap("PrecheckBackupResult")
    public PutRestorePreCheckResponseBodyPrecheckBackupResult precheckBackupResult;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PutRestorePreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutRestorePreCheckResponseBody self = new PutRestorePreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public PutRestorePreCheckResponseBody setPrecheckBackupResult(PutRestorePreCheckResponseBodyPrecheckBackupResult precheckBackupResult) {
        this.precheckBackupResult = precheckBackupResult;
        return this;
    }
    public PutRestorePreCheckResponseBodyPrecheckBackupResult getPrecheckBackupResult() {
        return this.precheckBackupResult;
    }

    public PutRestorePreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutRestorePreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PutRestorePreCheckResponseBodyPrecheckBackupResultListList extends TeaModel {
        @NameInMap("CheckFailReason")
        public String checkFailReason;

        @NameInMap("CheckItemContent")
        public String checkItemContent;

        @NameInMap("CheckItemName")
        public String checkItemName;

        @NameInMap("CheckResult")
        public String checkResult;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("Result")
        public Boolean result;

        public static PutRestorePreCheckResponseBodyPrecheckBackupResultListList build(java.util.Map<String, ?> map) throws Exception {
            PutRestorePreCheckResponseBodyPrecheckBackupResultListList self = new PutRestorePreCheckResponseBodyPrecheckBackupResultListList();
            return TeaModel.build(map, self);
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultListList setCheckFailReason(String checkFailReason) {
            this.checkFailReason = checkFailReason;
            return this;
        }
        public String getCheckFailReason() {
            return this.checkFailReason;
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultListList setCheckItemContent(String checkItemContent) {
            this.checkItemContent = checkItemContent;
            return this;
        }
        public String getCheckItemContent() {
            return this.checkItemContent;
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultListList setCheckItemName(String checkItemName) {
            this.checkItemName = checkItemName;
            return this;
        }
        public String getCheckItemName() {
            return this.checkItemName;
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultListList setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultListList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultListList setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

    public static class PutRestorePreCheckResponseBodyPrecheckBackupResultList extends TeaModel {
        @NameInMap("List")
        public java.util.List<PutRestorePreCheckResponseBodyPrecheckBackupResultListList> list;

        public static PutRestorePreCheckResponseBodyPrecheckBackupResultList build(java.util.Map<String, ?> map) throws Exception {
            PutRestorePreCheckResponseBodyPrecheckBackupResultList self = new PutRestorePreCheckResponseBodyPrecheckBackupResultList();
            return TeaModel.build(map, self);
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResultList setList(java.util.List<PutRestorePreCheckResponseBodyPrecheckBackupResultListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<PutRestorePreCheckResponseBodyPrecheckBackupResultListList> getList() {
            return this.list;
        }

    }

    public static class PutRestorePreCheckResponseBodyPrecheckBackupResult extends TeaModel {
        @NameInMap("List")
        public PutRestorePreCheckResponseBodyPrecheckBackupResultList list;

        @NameInMap("Result")
        public Boolean result;

        public static PutRestorePreCheckResponseBodyPrecheckBackupResult build(java.util.Map<String, ?> map) throws Exception {
            PutRestorePreCheckResponseBodyPrecheckBackupResult self = new PutRestorePreCheckResponseBodyPrecheckBackupResult();
            return TeaModel.build(map, self);
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResult setList(PutRestorePreCheckResponseBodyPrecheckBackupResultList list) {
            this.list = list;
            return this;
        }
        public PutRestorePreCheckResponseBodyPrecheckBackupResultList getList() {
            return this.list;
        }

        public PutRestorePreCheckResponseBodyPrecheckBackupResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
