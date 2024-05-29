// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAuthPolicyRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: zh-CN and en-US. Default value: zh-CN. The value zh-CN indicates Chinese and the value en-US indicates English.</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application ID.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the authentication rule.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the Microservices Engine (MSE) namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The protocol type. Valid values:</p>
     * <br>
     * <p>*   **SPRING_CLOUD**</p>
     * <p>*   **DUBBO**</p>
     * <p>*   **istio**</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The service source.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Source")
    public String source;

    public static ListAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthPolicyRequest self = new ListAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthPolicyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ListAuthPolicyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListAuthPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAuthPolicyRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListAuthPolicyRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAuthPolicyRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAuthPolicyRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public ListAuthPolicyRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ListAuthPolicyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
