// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20141111.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainDetailResponseBody extends TeaModel {
    @NameInMap("GetDomainDetailModel")
    public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getDomainDetailModel;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Type")
        public String type;

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

    public static class DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources extends TeaModel {
        @NameInMap("Source")
        public java.util.List<String> source;

        public static DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources self = new DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources setSource(java.util.List<String> source) {
            this.source = source;
            return this;
        }
        public java.util.List<String> getSource() {
            return this.source;
        }

    }

    public static class DescribeCdnDomainDetailResponseBodyGetDomainDetailModel extends TeaModel {
        @NameInMap("CdnType")
        public String cdnType;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("Description")
        public String description;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("HttpsCname")
        public String httpsCname;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        @NameInMap("SourceModels")
        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels sourceModels;

        @NameInMap("SourcePort")
        public Integer sourcePort;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Sources")
        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources sources;

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

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
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

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setSourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            return this;
        }
        public Integer getSourcePort() {
            return this.sourcePort;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setSources(DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources sources) {
            this.sources = sources;
            return this;
        }
        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSources getSources() {
            return this.sources;
        }

    }

}
