// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessApplicationResponseBody extends TeaModel {
    /**
     * <p>The office application.</p>
     */
    @NameInMap("Application")
    public GetPrivateAccessApplicationResponseBodyApplication application;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3ACC5EDC-2B7D-5032-8C58-D7615D66C1D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPrivateAccessApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessApplicationResponseBody self = new GetPrivateAccessApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessApplicationResponseBody setApplication(GetPrivateAccessApplicationResponseBodyApplication application) {
        this.application = application;
        return this;
    }
    public GetPrivateAccessApplicationResponseBodyApplication getApplication() {
        return this.application;
    }

    public GetPrivateAccessApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPrivateAccessApplicationResponseBodyApplicationPortRanges extends TeaModel {
        /**
         * <p>The start port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static GetPrivateAccessApplicationResponseBodyApplicationPortRanges build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateAccessApplicationResponseBodyApplicationPortRanges self = new GetPrivateAccessApplicationResponseBodyApplicationPortRanges();
            return TeaModel.build(map, self);
        }

        public GetPrivateAccessApplicationResponseBodyApplicationPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public GetPrivateAccessApplicationResponseBodyApplicationPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

    public static class GetPrivateAccessApplicationResponseBodyApplication extends TeaModel {
        /**
         * <p>The addresses of the office applications.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The ID of the office application.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-application-e12860ef6c48****</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The browser access mode. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("BrowserAccessStatus")
        public String browserAccessStatus;

        /**
         * <p>The IDs of connectors.</p>
         */
        @NameInMap("ConnectorIds")
        public java.util.List<String> connectorIds;

        /**
         * <p>The creation time of the office application.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-30 16:50:32</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the office application.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The browser access mode parameter. The parameter indicates the configurations of Layer 7 applications.</p>
         */
        @NameInMap("L7Config")
        public PAL7Config l7Config;

        /**
         * <p>The browser access mode parameter. The parameter indicates the domain name that the proxy gateway uses.</p>
         * 
         * <strong>example:</strong>
         * <p>app.example.com</p>
         */
        @NameInMap("L7ProxyDomainAutomatic")
        public String l7ProxyDomainAutomatic;

        /**
         * <p>The browser access mode parameter. The parameter indicates the custom domain name of the proxy gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>app.example.com</p>
         */
        @NameInMap("L7ProxyDomainCustom")
        public String l7ProxyDomainCustom;

        /**
         * <p>The name of the office application.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_application_name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The IDs of the private access policies.</p>
         */
        @NameInMap("PolicyIds")
        public java.util.List<String> policyIds;

        /**
         * <p>The port ranges of the office applications. Multiple port ranges cannot be duplicated or overlapped.</p>
         */
        @NameInMap("PortRanges")
        public java.util.List<GetPrivateAccessApplicationResponseBodyApplicationPortRanges> portRanges;

        /**
         * <p>The protocol that is used by the office application. Valid values:</p>
         * <ul>
         * <li><strong>All</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>All</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The status of the office application. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong></li>
         * <li><strong>Disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The IDs of the tags for the office applications.</p>
         */
        @NameInMap("TagIds")
        public java.util.List<String> tagIds;

        public static GetPrivateAccessApplicationResponseBodyApplication build(java.util.Map<String, ?> map) throws Exception {
            GetPrivateAccessApplicationResponseBodyApplication self = new GetPrivateAccessApplicationResponseBodyApplication();
            return TeaModel.build(map, self);
        }

        public GetPrivateAccessApplicationResponseBodyApplication setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setBrowserAccessStatus(String browserAccessStatus) {
            this.browserAccessStatus = browserAccessStatus;
            return this;
        }
        public String getBrowserAccessStatus() {
            return this.browserAccessStatus;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setConnectorIds(java.util.List<String> connectorIds) {
            this.connectorIds = connectorIds;
            return this;
        }
        public java.util.List<String> getConnectorIds() {
            return this.connectorIds;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setL7Config(PAL7Config l7Config) {
            this.l7Config = l7Config;
            return this;
        }
        public PAL7Config getL7Config() {
            return this.l7Config;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setL7ProxyDomainAutomatic(String l7ProxyDomainAutomatic) {
            this.l7ProxyDomainAutomatic = l7ProxyDomainAutomatic;
            return this;
        }
        public String getL7ProxyDomainAutomatic() {
            return this.l7ProxyDomainAutomatic;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setL7ProxyDomainCustom(String l7ProxyDomainCustom) {
            this.l7ProxyDomainCustom = l7ProxyDomainCustom;
            return this;
        }
        public String getL7ProxyDomainCustom() {
            return this.l7ProxyDomainCustom;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setPolicyIds(java.util.List<String> policyIds) {
            this.policyIds = policyIds;
            return this;
        }
        public java.util.List<String> getPolicyIds() {
            return this.policyIds;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setPortRanges(java.util.List<GetPrivateAccessApplicationResponseBodyApplicationPortRanges> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public java.util.List<GetPrivateAccessApplicationResponseBodyApplicationPortRanges> getPortRanges() {
            return this.portRanges;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPrivateAccessApplicationResponseBodyApplication setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

    }

}
