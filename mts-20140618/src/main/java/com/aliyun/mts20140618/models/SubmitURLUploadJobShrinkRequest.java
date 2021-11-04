// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitURLUploadJobShrinkRequest extends TeaModel {
    @NameInMap("Notify")
    public String notify;

    @NameInMap("Region")
    public String region;

    @NameInMap("SourceFileURL")
    public String sourceFileURL;

    @NameInMap("TargetStorage")
    public String targetStorageShrink;

    @NameInMap("UserData")
    public String userData;

    public static SubmitURLUploadJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitURLUploadJobShrinkRequest self = new SubmitURLUploadJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitURLUploadJobShrinkRequest setNotify(String notify) {
        this.notify = notify;
        return this;
    }
    public String getNotify() {
        return this.notify;
    }

    public SubmitURLUploadJobShrinkRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public SubmitURLUploadJobShrinkRequest setSourceFileURL(String sourceFileURL) {
        this.sourceFileURL = sourceFileURL;
        return this;
    }
    public String getSourceFileURL() {
        return this.sourceFileURL;
    }

    public SubmitURLUploadJobShrinkRequest setTargetStorageShrink(String targetStorageShrink) {
        this.targetStorageShrink = targetStorageShrink;
        return this;
    }
    public String getTargetStorageShrink() {
        return this.targetStorageShrink;
    }

    public SubmitURLUploadJobShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
