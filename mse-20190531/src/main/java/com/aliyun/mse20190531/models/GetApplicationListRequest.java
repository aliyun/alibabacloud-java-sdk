// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetApplicationListRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>hkhon1po62@c3df23522b*****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The application name.</p>
     * 
     * <strong>example:</strong>
     * <p>rest-container</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The programming language, such as Java or Go.</p>
     * 
     * <strong>example:</strong>
     * <p>Java</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The microservice namespace to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Specifies whether to enable the Sentinel component.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SentinelEnable")
    public Boolean sentinelEnable;

    /**
     * <p>The source of the application. The value is fixed as edasmsc.</p>
     * 
     * <strong>example:</strong>
     * <p>edasmsc</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Specifies whether to enable the switch.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SwitchEnable")
    public Boolean switchEnable;

    /**
     * <p>Alibaba Cloud tags. You can perform filtering by Alibaba Cloud tag.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetApplicationListRequestTags> tags;

    public static GetApplicationListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationListRequest self = new GetApplicationListRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationListRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetApplicationListRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetApplicationListRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetApplicationListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetApplicationListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetApplicationListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetApplicationListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetApplicationListRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetApplicationListRequest setSentinelEnable(Boolean sentinelEnable) {
        this.sentinelEnable = sentinelEnable;
        return this;
    }
    public Boolean getSentinelEnable() {
        return this.sentinelEnable;
    }

    public GetApplicationListRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetApplicationListRequest setSwitchEnable(Boolean switchEnable) {
        this.switchEnable = switchEnable;
        return this;
    }
    public Boolean getSwitchEnable() {
        return this.switchEnable;
    }

    public GetApplicationListRequest setTags(java.util.List<GetApplicationListRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetApplicationListRequestTags> getTags() {
        return this.tags;
    }

    public static class GetApplicationListRequestTags extends TeaModel {
        /**
         * <p>The custom tag key. It can contain up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>tagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetApplicationListRequestTags build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationListRequestTags self = new GetApplicationListRequestTags();
            return TeaModel.build(map, self);
        }

        public GetApplicationListRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetApplicationListRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
