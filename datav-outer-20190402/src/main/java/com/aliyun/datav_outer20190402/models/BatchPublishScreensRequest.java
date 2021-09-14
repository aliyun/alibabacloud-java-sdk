// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchPublishScreensRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Screens")
    public java.util.List<BatchPublishScreensRequestScreens> screens;

    public static BatchPublishScreensRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPublishScreensRequest self = new BatchPublishScreensRequest();
        return TeaModel.build(map, self);
    }

    public BatchPublishScreensRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public BatchPublishScreensRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BatchPublishScreensRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BatchPublishScreensRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BatchPublishScreensRequest setScreens(java.util.List<BatchPublishScreensRequestScreens> screens) {
        this.screens = screens;
        return this;
    }
    public java.util.List<BatchPublishScreensRequestScreens> getScreens() {
        return this.screens;
    }

    public static class BatchPublishScreensRequestScreens extends TeaModel {
        @NameInMap("Password")
        public String password;

        @NameInMap("AuthTime")
        public Integer authTime;

        @NameInMap("CreateSnapshot")
        public Boolean createSnapshot;

        @NameInMap("EnableShare")
        public Boolean enableShare;

        @NameInMap("NeedToken")
        public Boolean needToken;

        @NameInMap("ScreenId")
        public Integer screenId;

        @NameInMap("SnapshotId")
        public Integer snapshotId;

        public static BatchPublishScreensRequestScreens build(java.util.Map<String, ?> map) throws Exception {
            BatchPublishScreensRequestScreens self = new BatchPublishScreensRequestScreens();
            return TeaModel.build(map, self);
        }

        public BatchPublishScreensRequestScreens setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public BatchPublishScreensRequestScreens setAuthTime(Integer authTime) {
            this.authTime = authTime;
            return this;
        }
        public Integer getAuthTime() {
            return this.authTime;
        }

        public BatchPublishScreensRequestScreens setCreateSnapshot(Boolean createSnapshot) {
            this.createSnapshot = createSnapshot;
            return this;
        }
        public Boolean getCreateSnapshot() {
            return this.createSnapshot;
        }

        public BatchPublishScreensRequestScreens setEnableShare(Boolean enableShare) {
            this.enableShare = enableShare;
            return this;
        }
        public Boolean getEnableShare() {
            return this.enableShare;
        }

        public BatchPublishScreensRequestScreens setNeedToken(Boolean needToken) {
            this.needToken = needToken;
            return this;
        }
        public Boolean getNeedToken() {
            return this.needToken;
        }

        public BatchPublishScreensRequestScreens setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

        public BatchPublishScreensRequestScreens setSnapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public Integer getSnapshotId() {
            return this.snapshotId;
        }

    }

}
