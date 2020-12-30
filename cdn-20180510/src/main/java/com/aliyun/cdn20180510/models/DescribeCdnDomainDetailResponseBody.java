// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GetDomainDetailModel")
    public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getDomainDetailModel;

    public static DescribeCdnDomainDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainDetailResponseBody self = new DescribeCdnDomainDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCdnDomainDetailResponseBody setGetDomainDetailModel(DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getDomainDetailModel) {
        this.getDomainDetailModel = getDomainDetailModel;
        return this;
    }
    public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel getGetDomainDetailModel() {
        return this.getDomainDetailModel;
    }

    public static class DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Weight")
        public String weight;

        @NameInMap("Enabled")
        public String enabled;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("Content")
        public String content;

        public static DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel self = new DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel();
            return TeaModel.build(map, self);
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

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setEnabled(String enabled) {
            this.enabled = enabled;
            return this;
        }
        public String getEnabled() {
            return this.enabled;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModelsSourceModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
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
        @NameInMap("HttpsCname")
        public String httpsCname;

        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("Description")
        public String description;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("DomainStatus")
        public String domainStatus;

        @NameInMap("Cname")
        public String cname;

        @NameInMap("CdnType")
        public String cdnType;

        @NameInMap("SourceModels")
        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModelSourceModels sourceModels;

        public static DescribeCdnDomainDetailResponseBodyGetDomainDetailModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainDetailResponseBodyGetDomainDetailModel self = new DescribeCdnDomainDetailResponseBodyGetDomainDetailModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setHttpsCname(String httpsCname) {
            this.httpsCname = httpsCname;
            return this;
        }
        public String getHttpsCname() {
            return this.httpsCname;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setDomainStatus(String domainStatus) {
            this.domainStatus = domainStatus;
            return this;
        }
        public String getDomainStatus() {
            return this.domainStatus;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setCname(String cname) {
            this.cname = cname;
            return this;
        }
        public String getCname() {
            return this.cname;
        }

        public DescribeCdnDomainDetailResponseBodyGetDomainDetailModel setCdnType(String cdnType) {
            this.cdnType = cdnType;
            return this;
        }
        public String getCdnType() {
            return this.cdnType;
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
