// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PublishGrayDomainConfigRequest extends TeaModel {
    @NameInMap("CustomCountryId")
    public Integer customCountryId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("CustomPercent")
    public Integer customPercent;

    @NameInMap("CustomProvinceId")
    public Integer customProvinceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>publishByCustom</p>
     */
    @NameInMap("PublishMode")
    public String publishMode;

    public static PublishGrayDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishGrayDomainConfigRequest self = new PublishGrayDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public PublishGrayDomainConfigRequest setCustomCountryId(Integer customCountryId) {
        this.customCountryId = customCountryId;
        return this;
    }
    public Integer getCustomCountryId() {
        return this.customCountryId;
    }

    public PublishGrayDomainConfigRequest setCustomPercent(Integer customPercent) {
        this.customPercent = customPercent;
        return this;
    }
    public Integer getCustomPercent() {
        return this.customPercent;
    }

    public PublishGrayDomainConfigRequest setCustomProvinceId(Integer customProvinceId) {
        this.customProvinceId = customProvinceId;
        return this;
    }
    public Integer getCustomProvinceId() {
        return this.customProvinceId;
    }

    public PublishGrayDomainConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public PublishGrayDomainConfigRequest setPublishMode(String publishMode) {
        this.publishMode = publishMode;
        return this;
    }
    public String getPublishMode() {
        return this.publishMode;
    }

}
