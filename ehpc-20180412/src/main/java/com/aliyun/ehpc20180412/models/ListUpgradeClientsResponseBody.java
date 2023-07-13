// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUpgradeClientsResponseBody extends TeaModel {
    /**
     * <p>The time when the operation was performed.</p>
     */
    @NameInMap("ClientRecords")
    public java.util.List<ListUpgradeClientsResponseBodyClientRecords> clientRecords;

    @NameInMap("CurrentVersion")
    public String currentVersion;

    /**
     * <p>The version of the E-HPC client after the upgrade.</p>
     */
    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>The version of the E-HPC client before the upgrade.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUpgradeClientsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUpgradeClientsResponseBody self = new ListUpgradeClientsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUpgradeClientsResponseBody setClientRecords(java.util.List<ListUpgradeClientsResponseBodyClientRecords> clientRecords) {
        this.clientRecords = clientRecords;
        return this;
    }
    public java.util.List<ListUpgradeClientsResponseBodyClientRecords> getClientRecords() {
        return this.clientRecords;
    }

    public ListUpgradeClientsResponseBody setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    public ListUpgradeClientsResponseBody setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public String getLatestVersion() {
        return this.latestVersion;
    }

    public ListUpgradeClientsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUpgradeClientsResponseBodyClientRecords extends TeaModel {
        @NameInMap("NewVersion")
        public String newVersion;

        @NameInMap("OldVersion")
        public String oldVersion;

        @NameInMap("SubUid")
        public String subUid;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static ListUpgradeClientsResponseBodyClientRecords build(java.util.Map<String, ?> map) throws Exception {
            ListUpgradeClientsResponseBodyClientRecords self = new ListUpgradeClientsResponseBodyClientRecords();
            return TeaModel.build(map, self);
        }

        public ListUpgradeClientsResponseBodyClientRecords setNewVersion(String newVersion) {
            this.newVersion = newVersion;
            return this;
        }
        public String getNewVersion() {
            return this.newVersion;
        }

        public ListUpgradeClientsResponseBodyClientRecords setOldVersion(String oldVersion) {
            this.oldVersion = oldVersion;
            return this;
        }
        public String getOldVersion() {
            return this.oldVersion;
        }

        public ListUpgradeClientsResponseBodyClientRecords setSubUid(String subUid) {
            this.subUid = subUid;
            return this;
        }
        public String getSubUid() {
            return this.subUid;
        }

        public ListUpgradeClientsResponseBodyClientRecords setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
