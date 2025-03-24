// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ModifyAppRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    /**
     * <strong>example:</strong>
     * <p>com.test.ios</p>
     */
    @NameInMap("BundleId")
    public String bundleId;

    @NameInMap("EncodedIcon")
    public String encodedIcon;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IndustryId")
    public Integer industryId;

    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>com.test.android</p>
     */
    @NameInMap("PackageName")
    public String packageName;

    public static ModifyAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppRequest self = new ModifyAppRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAppRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public ModifyAppRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public ModifyAppRequest setEncodedIcon(String encodedIcon) {
        this.encodedIcon = encodedIcon;
        return this;
    }
    public String getEncodedIcon() {
        return this.encodedIcon;
    }

    public ModifyAppRequest setIndustryId(Integer industryId) {
        this.industryId = industryId;
        return this;
    }
    public Integer getIndustryId() {
        return this.industryId;
    }

    public ModifyAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAppRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

}
