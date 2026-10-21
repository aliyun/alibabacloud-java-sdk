// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetUserConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The user.</p>
     */
    @NameInMap("User")
    public GetUserConfigResponseBodyUser user;

    public static GetUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserConfigResponseBody self = new GetUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserConfigResponseBody setUser(GetUserConfigResponseBodyUser user) {
        this.user = user;
        return this;
    }
    public GetUserConfigResponseBodyUser getUser() {
        return this.user;
    }

    public static class GetUserConfigResponseBodyUser extends TeaModel {
        /**
         * <p>The current Cloud Threat Detection and Response (CTDR) version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("CtdrVersion")
        public String ctdrVersion;

        /**
         * <p>The upgrade status. Valid values:</p>
         * <ul>
         * <li>pending: Pending upgrade.</li>
         * <li>upgrading: Upgrading.</li>
         * <li>success: Upgrade succeeded.</li>
         * <li>failed: Upgrade failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("DataStorageVersion")
        public String dataStorageVersion;

        /**
         * <p>The log management version.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("UpgradeCtdrVersion")
        public String upgradeCtdrVersion;

        /**
         * <p>The CTDR version to upgrade to.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        @NameInMap("UpgradeStatus")
        public String upgradeStatus;

        public static GetUserConfigResponseBodyUser build(java.util.Map<String, ?> map) throws Exception {
            GetUserConfigResponseBodyUser self = new GetUserConfigResponseBodyUser();
            return TeaModel.build(map, self);
        }

        public GetUserConfigResponseBodyUser setCtdrVersion(String ctdrVersion) {
            this.ctdrVersion = ctdrVersion;
            return this;
        }
        public String getCtdrVersion() {
            return this.ctdrVersion;
        }

        public GetUserConfigResponseBodyUser setDataStorageVersion(String dataStorageVersion) {
            this.dataStorageVersion = dataStorageVersion;
            return this;
        }
        public String getDataStorageVersion() {
            return this.dataStorageVersion;
        }

        public GetUserConfigResponseBodyUser setUpgradeCtdrVersion(String upgradeCtdrVersion) {
            this.upgradeCtdrVersion = upgradeCtdrVersion;
            return this;
        }
        public String getUpgradeCtdrVersion() {
            return this.upgradeCtdrVersion;
        }

        public GetUserConfigResponseBodyUser setUpgradeStatus(String upgradeStatus) {
            this.upgradeStatus = upgradeStatus;
            return this;
        }
        public String getUpgradeStatus() {
            return this.upgradeStatus;
        }

    }

}
