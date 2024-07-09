// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainDetailResponseBody extends TeaModel {
    /**
     * <p>The details about the accelerated domain name.</p>
     */
    @NameInMap("GetDomainDetailModel")
    public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getDomainDetailModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>18CF38AA-1275-451D-A12B-4EC0BF1C5E30</p>
     */
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
        /**
         * <p>The address of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Enabled")
        public String enabled;

        /**
         * <p>The port over which requests are redirected to the origin server. Ports 443 and 80 are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The priority.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The type of the origin server. Valid values:</p>
         * <ul>
         * <li><strong>ipaddr</strong>: an origin IP address</li>
         * <li><strong>domain</strong>: an origin domain name</li>
         * <li><strong>oss</strong>: the domain name of an Object Storage Service (OSS) bucket</li>
         * <li><strong>fc_domain:</strong> a Function Compute domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The weight of the origin server if multiple origin servers have been specified.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The workload type of the accelerated domain name. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: images and small files</li>
         * <li><strong>download</strong>: large files</li>
         * <li><strong>video</strong>: on-demand video and audio streaming</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        @NameInMap("CdnType")
        public String cdnType;

        /**
         * <p>The CNAME that is assigned to the accelerated domain name. You must add the CNAME record in the system of your DNS service provider to map the accelerated domain name to the CNAME.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.w.kunlunle.com</p>
         */
        @NameInMap("Cname")
        public String cname;

        /**
         * <p>The description of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Streaming domain</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of the accelerated domain name. Valid values:</p>
         * <ul>
         * <li><strong>online</strong></li>
         * <li><strong>offline</strong></li>
         * <li><strong>configuring</strong></li>
         * <li><strong>configure_failed</strong></li>
         * <li><strong>checking</strong></li>
         * <li><strong>check_failed</strong></li>
         * <li><strong>stopping</strong></li>
         * <li><strong>deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("DomainStatus")
        public String domainStatus;

        /**
         * <p>The time when the domain name was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-06-25T03:30:50Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <p>The time when the domain name was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-06-25T03:30:50Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The CNAME for which HTTPS is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com.w.kunlunle.com</p>
         */
        @NameInMap("HttpsCname")
        public String httpsCname;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd1234abcd1234</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The acceleration region.</p>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>Indicates whether the SSL certificate is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        /**
         * <p>The information about the origin server.</p>
         */
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
