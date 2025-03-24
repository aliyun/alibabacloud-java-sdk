// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class CreateAppRequest extends TeaModel {
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
    public String industryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>com.test.android</p>
     */
    @NameInMap("PackageName")
    public String packageName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static CreateAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppRequest self = new CreateAppRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppRequest setBundleId(String bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public String getBundleId() {
        return this.bundleId;
    }

    public CreateAppRequest setEncodedIcon(String encodedIcon) {
        this.encodedIcon = encodedIcon;
        return this;
    }
    public String getEncodedIcon() {
        return this.encodedIcon;
    }

    public CreateAppRequest setIndustryId(String industryId) {
        this.industryId = industryId;
        return this;
    }
    public String getIndustryId() {
        return this.industryId;
    }

    public CreateAppRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAppRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public CreateAppRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CreateAppRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
