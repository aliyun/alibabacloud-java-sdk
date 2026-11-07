// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
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
     * <p>spring-cloud-a</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The programming language of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>JAVA</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the MSE namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The region to which the application belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
     * <p>The deployment method of the application. ACK indicates Container Service for Kubernetes (ACK).</p>
     * 
     * <strong>example:</strong>
     * <p>ACK</p>
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

    /**
     * <p>The Alibaba Cloud tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateApplicationRequestTags> tags;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateApplicationRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateApplicationRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateApplicationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateApplicationRequest setSentinelEnable(String sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public String getSentinelEnable() {
        return this.sentinelEnable;
    }

    public CreateApplicationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateApplicationRequest setSwitchEnable(String switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public String getSwitchEnable() {
        return this.switchEnable;
    }

    public CreateApplicationRequest setTags(java.util.List<CreateApplicationRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateApplicationRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateApplicationRequestTags extends TeaModel {
        /**
         * <p>The custom tag key entered by the user. It can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. It can be up to 128 characters in length, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateApplicationRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationRequestTags self = new CreateApplicationRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateApplicationRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateApplicationRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
