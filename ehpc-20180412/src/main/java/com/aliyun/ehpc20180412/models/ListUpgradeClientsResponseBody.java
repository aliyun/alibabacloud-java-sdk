// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListUpgradeClientsResponseBody extends TeaModel {
    /**
     * <p>The update records of ehpcutil in the cluster.</p>
     */
    @NameInMap("ClientRecords")
    public java.util.List<ListUpgradeClientsResponseBodyClientRecords> clientRecords;

    /**
     * <p>The current version of ehpcutil in the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.21</p>
     */
    @NameInMap("CurrentVersion")
    public String currentVersion;

    /**
     * <p>The latest version of ehpcutil that is released.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.22</p>
     */
    @NameInMap("LatestVersion")
    public String latestVersion;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>89A1AC0F-4A6C-4F3D-98F9-BEF9A823****</p>
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
        /**
         * <p>The version of ehpcutil after the update.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.21</p>
         */
        @NameInMap("NewVersion")
        public String newVersion;

        /**
         * <p>The version of ehpcutil before the update.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.16</p>
         */
        @NameInMap("OldVersion")
        public String oldVersion;

        /**
         * <p>The user ID (UID) whose ehpcutil is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>129******84</p>
         */
        @NameInMap("SubUid")
        public String subUid;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-26T06:26:57.000Z</p>
         */
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
