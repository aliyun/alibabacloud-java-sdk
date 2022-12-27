// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainDetailResponseBody extends TeaModel {
    // The detailed information about the accelerated domain name.
    @NameInMap("GetDomainDetailModel")
    public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getDomainDetailModel;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainDetailResponseBody self = new DescribeCdnDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainDetailResponseBody setGetDomainDetailModel(DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getDomainDetailModel) {
        this.getDomainDetailModel = getDomainDetailModel;
        return this;
    }
    public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getGetDomainDetailModel() {
        return this.getDomainDetailModel;
    }

    public DescribeCdnDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel extends TeaModel {
        // The address of the origin server.
        @NameInMap("Content")
        public String content;

        // The status of the origin server.
        @NameInMap("Enabled")
        public String enabled;

        // The port over which requests are redirected to the origin server. Ports 443 and 80 are supported.
        @NameInMap("Port")
        public Integer port;

        // The priority of the origin server if multiple origin servers are specified.
        @NameInMap("Priority")
        public String priority;

        // The type of the origin server. Valid values:
        // 
        // *   **ipaddr**: IP address
        // *   **domain**: domain name
        // *   **oss**: Object Storage Service (OSS) bucket endpoint
        @NameInMap("Type")
        public String type;

        // The weight of the origin server if multiple origin servers are specified.
        @NameInMap("Weight")
        public String weight;

        public static DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel self = new DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels extends TeaModel {
        @NameInMap("SourceModel")
        public java.util.List<DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel> sourceModel;

        public static DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels self = new DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels setSourceModel(java.util.List<DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel> sourceModel) {
            this.sourceModel = sourceModel;
            return this;
        }
        public java.util.List<DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel> getSourceModel() {
            return this.sourceModel;
        }

    }

    public static class DescribeCdnDomainDetailResponseBodyGetDomainDetailModel extends TeaModel {
        // The workload type of the accelerated domain name. Valid values:
        // 
        // *   **web**: images and small files.
        // *   **download**: large files.
        // *   **video**: on-demand video and audio streaming.
        @NameInMap("CdnType")
        public String cdnType;

        // The Canonical Name (CNAME) that is assigned to the accelerated domain name. You must add a CNAME record in the system of your DNS service provider to map the accelerated domain name to the CNAME.
        @NameInMap("Cname")
        public String cname;

        // The remarks of the accelerated domain name.
        @NameInMap("Description")
        public String description;

        // The accelerated domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The status of the accelerated domain name. Valid values:
        // 
        // *   **online**: The domain name is enabled.
        // *   **offline**: The domain is disabled.
        // *   **configuring**: The domain is being configured.
        // *   **configure_failed**: The domain failed to be configured.
        // *   **checking**: The domain name is under review.
        // *   **check_failed**: The domain name failed the review.
        @NameInMap("DomainStatus")
        public String domainStatus;

        // The time when the accelerated domain name was added to Alibaba Cloud CDN.
        @NameInMap("GmtCreated")
        public String gmtCreated;

        // The last time when the accelerated domain name was modified.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The CNAME for which HTTPS is enabled.
        @NameInMap("HttpsCname")
        public String httpsCname;

        // The ID of the resource group.
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        // The accelerated region.
        @NameInMap("Scope")
        public String scope;

        // Specifies whether to enable the Security Socket Layer (SSL) certificate. Valid values:
        // 
        // *   **on**: enables the SSL certificate.
        // *   **off**: disables the SSL certificate.
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        // The information about the origin server.
        @NameInMap("SourceModels")
        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels sourceModels;

        public static DescribeCdnDomainDetailResponseBodyGetDomainDetailModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainDetailResponseBodyGetDomainDetailModel self = new DescribeCdnDomainDetailResponseBodyGetDomainDetailModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setHttpsCname(String httpsCname) {
            this.httpsCname = httpsCname;
            return this;
        }
        public String getHttpsCname() {
            return this.httpsCname;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setSourceModels(DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels sourceModels) {
            this.sourceModels = sourceModels;
            return this;
        }
        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels getSourceModels() {
            return this.sourceModels;
        }

    }

}
