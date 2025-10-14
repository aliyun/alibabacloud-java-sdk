// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CheckUpgradeItemResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UpgradeItem")
    public CheckUpgradeItemResponseBodyUpgradeItem upgradeItem;

    public static CheckUpgradeItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckUpgradeItemResponseBody self = new CheckUpgradeItemResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckUpgradeItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckUpgradeItemResponseBody setUpgradeItem(CheckUpgradeItemResponseBodyUpgradeItem upgradeItem) {
        this.upgradeItem = upgradeItem;
        return this;
    }
    public CheckUpgradeItemResponseBodyUpgradeItem getUpgradeItem() {
        return this.upgradeItem;
    }

    public static class CheckUpgradeItemResponseBodyUpgradeItem extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("CheckResult")
        public String checkResult;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("CheckStatus")
        public String checkStatus;

        /**
         * <strong>example:</strong>
         * <p>incident_upgrade</p>
         */
        @NameInMap("UpgradeItemId")
        public String upgradeItemId;

        public static CheckUpgradeItemResponseBodyUpgradeItem build(java.util.Map<String, ?> map) throws Exception {
            CheckUpgradeItemResponseBodyUpgradeItem self = new CheckUpgradeItemResponseBodyUpgradeItem();
            return TeaModel.build(map, self);
        }

        public CheckUpgradeItemResponseBodyUpgradeItem setCheckResult(String checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public String getCheckResult() {
            return this.checkResult;
        }

        public CheckUpgradeItemResponseBodyUpgradeItem setCheckStatus(String checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public String getCheckStatus() {
            return this.checkStatus;
        }

        public CheckUpgradeItemResponseBodyUpgradeItem setUpgradeItemId(String upgradeItemId) {
            this.upgradeItemId = upgradeItemId;
            return this;
        }
        public String getUpgradeItemId() {
            return this.upgradeItemId;
        }

    }

}
