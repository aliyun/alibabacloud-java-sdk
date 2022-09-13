// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20220726.models;

import com.aliyun.tea.*;

public class AddIntlImageProductVersionShrinkRequest extends TeaModel {
    @NameInMap("AccessDetail")
    public AddIntlImageProductVersionShrinkRequestAccessDetail accessDetail;

    @NameInMap("Ak")
    public String ak;

    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("ImageConstraint")
    public String imageConstraintShrink;

    @NameInMap("ReleaseRegion")
    public String releaseRegion;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Secret")
    public String secret;

    @NameInMap("Uid")
    public String uid;

    public static AddIntlImageProductVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddIntlImageProductVersionShrinkRequest self = new AddIntlImageProductVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddIntlImageProductVersionShrinkRequest setAccessDetail(AddIntlImageProductVersionShrinkRequestAccessDetail accessDetail) {
        this.accessDetail = accessDetail;
        return this;
    }
    public AddIntlImageProductVersionShrinkRequestAccessDetail getAccessDetail() {
        return this.accessDetail;
    }

    public AddIntlImageProductVersionShrinkRequest setAk(String ak) {
        this.ak = ak;
        return this;
    }
    public String getAk() {
        return this.ak;
    }

    public AddIntlImageProductVersionShrinkRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public AddIntlImageProductVersionShrinkRequest setImageConstraintShrink(String imageConstraintShrink) {
        this.imageConstraintShrink = imageConstraintShrink;
        return this;
    }
    public String getImageConstraintShrink() {
        return this.imageConstraintShrink;
    }

    public AddIntlImageProductVersionShrinkRequest setReleaseRegion(String releaseRegion) {
        this.releaseRegion = releaseRegion;
        return this;
    }
    public String getReleaseRegion() {
        return this.releaseRegion;
    }

    public AddIntlImageProductVersionShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddIntlImageProductVersionShrinkRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public AddIntlImageProductVersionShrinkRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public static class AddIntlImageProductVersionShrinkRequestAccessDetail extends TeaModel {
        @NameInMap("Ak")
        public String ak;

        @NameInMap("AutoPublish")
        public Boolean autoPublish;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("Region")
        public String region;

        @NameInMap("ReleaseNote")
        public String releaseNote;

        @NameInMap("ReleaseRegionOption")
        public String releaseRegionOption;

        @NameInMap("Secret")
        public String secret;

        public static AddIntlImageProductVersionShrinkRequestAccessDetail build(java.util.Map<String, ?> map) throws Exception {
            AddIntlImageProductVersionShrinkRequestAccessDetail self = new AddIntlImageProductVersionShrinkRequestAccessDetail();
            return TeaModel.build(map, self);
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setAk(String ak) {
            this.ak = ak;
            return this;
        }
        public String getAk() {
            return this.ak;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setAutoPublish(Boolean autoPublish) {
            this.autoPublish = autoPublish;
            return this;
        }
        public Boolean getAutoPublish() {
            return this.autoPublish;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setReleaseNote(String releaseNote) {
            this.releaseNote = releaseNote;
            return this;
        }
        public String getReleaseNote() {
            return this.releaseNote;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setReleaseRegionOption(String releaseRegionOption) {
            this.releaseRegionOption = releaseRegionOption;
            return this;
        }
        public String getReleaseRegionOption() {
            return this.releaseRegionOption;
        }

        public AddIntlImageProductVersionShrinkRequestAccessDetail setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

    }

}
