// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpgradeInfoResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpgradeInfoResponseBodyResult result;

    public static UpgradeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeInfoResponseBody self = new UpgradeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeInfoResponseBody setResult(UpgradeInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpgradeInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpgradeInfoResponseBodyResultUpgradeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1.7.3</p>
         */
        @NameInMap("CurRepoVersion")
        public String curRepoVersion;

        /**
         * <strong>example:</strong>
         * <p>1.7.3</p>
         */
        @NameInMap("UpdateRepoVersion")
        public String updateRepoVersion;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Upgrade")
        public Boolean upgrade;

        /**
         * <strong>example:</strong>
         * <p>2.2.4</p>
         */
        @NameInMap("curApackVersion")
        public String curApackVersion;

        /**
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("curEsVersion")
        public String curEsVersion;

        /**
         * <strong>example:</strong>
         * <p>2.2.4</p>
         */
        @NameInMap("upgradeApackVersion")
        public String upgradeApackVersion;

        /**
         * <strong>example:</strong>
         * <p>8.17.0</p>
         */
        @NameInMap("upgradeEsVersion")
        public String upgradeEsVersion;

        public static UpgradeInfoResponseBodyResultUpgradeInfo build(java.util.Map<String, ?> map) throws Exception {
            UpgradeInfoResponseBodyResultUpgradeInfo self = new UpgradeInfoResponseBodyResultUpgradeInfo();
            return TeaModel.build(map, self);
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setCurRepoVersion(String curRepoVersion) {
            this.curRepoVersion = curRepoVersion;
            return this;
        }
        public String getCurRepoVersion() {
            return this.curRepoVersion;
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setUpdateRepoVersion(String updateRepoVersion) {
            this.updateRepoVersion = updateRepoVersion;
            return this;
        }
        public String getUpdateRepoVersion() {
            return this.updateRepoVersion;
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setCurApackVersion(String curApackVersion) {
            this.curApackVersion = curApackVersion;
            return this;
        }
        public String getCurApackVersion() {
            return this.curApackVersion;
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setCurEsVersion(String curEsVersion) {
            this.curEsVersion = curEsVersion;
            return this;
        }
        public String getCurEsVersion() {
            return this.curEsVersion;
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setUpgradeApackVersion(String upgradeApackVersion) {
            this.upgradeApackVersion = upgradeApackVersion;
            return this;
        }
        public String getUpgradeApackVersion() {
            return this.upgradeApackVersion;
        }

        public UpgradeInfoResponseBodyResultUpgradeInfo setUpgradeEsVersion(String upgradeEsVersion) {
            this.upgradeEsVersion = upgradeEsVersion;
            return this;
        }
        public String getUpgradeEsVersion() {
            return this.upgradeEsVersion;
        }

    }

    public static class UpgradeInfoResponseBodyResult extends TeaModel {
        @NameInMap("UpgradeInfo")
        public UpgradeInfoResponseBodyResultUpgradeInfo upgradeInfo;

        public static UpgradeInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpgradeInfoResponseBodyResult self = new UpgradeInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpgradeInfoResponseBodyResult setUpgradeInfo(UpgradeInfoResponseBodyResultUpgradeInfo upgradeInfo) {
            this.upgradeInfo = upgradeInfo;
            return this;
        }
        public UpgradeInfoResponseBodyResultUpgradeInfo getUpgradeInfo() {
            return this.upgradeInfo;
        }

    }

}
