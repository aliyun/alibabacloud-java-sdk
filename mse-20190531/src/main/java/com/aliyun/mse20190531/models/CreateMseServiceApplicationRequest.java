// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateMseServiceApplicationRequest extends TeaModel {
    /**
     * <p>The language of the returned information. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bsd-xxyp-open-goods-server</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ExtraInfo")
    public String extraInfo;

    /**
     * <p>The programming language of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>JAVA</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The version of the Microservices Engine (MSE) cluster to be activated. Valid values:</p>
     * <ul>
     * <li>mse_pro: Professional Edition.</li>
     * <li>mse_dev: Developer Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mse_pro</p>
     */
    @NameInMap("MseVersion")
    public String mseVersion;

    /**
     * <p>The region where the cluster is located, including but not limited to:</p>
     * <ul>
     * <li>cn-hangzhou: Hangzhou</li>
     * <li>cn-beijing: Beijing</li>
     * <li>cn-shanghai: Shanghai</li>
     * <li>cn-zhangjiakou: Zhangjiakou</li>
     * <li>cn-shenzhen: Shenzhen</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Specifies whether to enable Sentinel.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SentinelEnable")
    public String sentinelEnable;

    /**
     * <p>The source.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Specifies whether to enable Switch.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SwitchEnable")
    public String switchEnable;

    public static CreateMseServiceApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMseServiceApplicationRequest self = new CreateMseServiceApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateMseServiceApplicationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateMseServiceApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateMseServiceApplicationRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateMseServiceApplicationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateMseServiceApplicationRequest setMseVersion(String mseVersion) {
        this.mseVersion = mseVersion;
        return this;
    }
    public String getMseVersion() {
        return this.mseVersion;
    }

    public CreateMseServiceApplicationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateMseServiceApplicationRequest setSentinelEnable(String sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public String getSentinelEnable() {
        return this.sentinelEnable;
    }

    public CreateMseServiceApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateMseServiceApplicationRequest setSwitchEnable(String switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public String getSwitchEnable() {
        return this.switchEnable;
    }

}
