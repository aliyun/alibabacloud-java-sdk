// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class GetMetaProductListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MetaData")
    public GetMetaProductListResponseBodyMetaData metaData;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaProductListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaProductListResponseBody self = new GetMetaProductListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaProductListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMetaProductListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaProductListResponseBody setMetaData(GetMetaProductListResponseBodyMetaData metaData) {
        this.metaData = metaData;
        return this;
    }
    public GetMetaProductListResponseBodyMetaData getMetaData() {
        return this.metaData;
    }

    public GetMetaProductListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetMetaProductListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaProductListResponseBodyMetaDataProductsNormal extends TeaModel {
        @NameInMap("TopicQuota")
        public String topicQuota;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DiskSize")
        public String diskSize;

        @NameInMap("IoMax")
        public Long ioMax;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("RegionId")
        public String regionId;

        public static GetMetaProductListResponseBodyMetaDataProductsNormal build(java.util.Map<String, ?> map) throws Exception {
            GetMetaProductListResponseBodyMetaDataProductsNormal self = new GetMetaProductListResponseBodyMetaDataProductsNormal();
            return TeaModel.build(map, self);
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setTopicQuota(String topicQuota) {
            this.topicQuota = topicQuota;
            return this;
        }
        public String getTopicQuota() {
            return this.topicQuota;
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setDiskSize(String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public String getDiskSize() {
            return this.diskSize;
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setIoMax(Long ioMax) {
            this.ioMax = ioMax;
            return this;
        }
        public Long getIoMax() {
            return this.ioMax;
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetMetaProductListResponseBodyMetaDataProductsNormal setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetMetaProductListResponseBodyMetaDataProductsProfessional extends TeaModel {
        @NameInMap("TopicQuota")
        public String topicQuota;

        @NameInMap("SpecType")
        public String specType;

        @NameInMap("DeployType")
        public String deployType;

        @NameInMap("DiskSize")
        public String diskSize;

        @NameInMap("IoMax")
        public Integer ioMax;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("RegionId")
        public String regionId;

        public static GetMetaProductListResponseBodyMetaDataProductsProfessional build(java.util.Map<String, ?> map) throws Exception {
            GetMetaProductListResponseBodyMetaDataProductsProfessional self = new GetMetaProductListResponseBodyMetaDataProductsProfessional();
            return TeaModel.build(map, self);
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setTopicQuota(String topicQuota) {
            this.topicQuota = topicQuota;
            return this;
        }
        public String getTopicQuota() {
            return this.topicQuota;
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setDiskSize(String diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public String getDiskSize() {
            return this.diskSize;
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setIoMax(Integer ioMax) {
            this.ioMax = ioMax;
            return this;
        }
        public Integer getIoMax() {
            return this.ioMax;
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public GetMetaProductListResponseBodyMetaDataProductsProfessional setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetMetaProductListResponseBodyMetaData extends TeaModel {
        @NameInMap("ProductsNormal")
        public java.util.List<GetMetaProductListResponseBodyMetaDataProductsNormal> productsNormal;

        @NameInMap("ProductsProfessional")
        public java.util.List<GetMetaProductListResponseBodyMetaDataProductsProfessional> productsProfessional;

        @NameInMap("Names")
        public java.util.Map<String, ?> names;

        public static GetMetaProductListResponseBodyMetaData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaProductListResponseBodyMetaData self = new GetMetaProductListResponseBodyMetaData();
            return TeaModel.build(map, self);
        }

        public GetMetaProductListResponseBodyMetaData setProductsNormal(java.util.List<GetMetaProductListResponseBodyMetaDataProductsNormal> productsNormal) {
            this.productsNormal = productsNormal;
            return this;
        }
        public java.util.List<GetMetaProductListResponseBodyMetaDataProductsNormal> getProductsNormal() {
            return this.productsNormal;
        }

        public GetMetaProductListResponseBodyMetaData setProductsProfessional(java.util.List<GetMetaProductListResponseBodyMetaDataProductsProfessional> productsProfessional) {
            this.productsProfessional = productsProfessional;
            return this;
        }
        public java.util.List<GetMetaProductListResponseBodyMetaDataProductsProfessional> getProductsProfessional() {
            return this.productsProfessional;
        }

        public GetMetaProductListResponseBodyMetaData setNames(java.util.Map<String, ?> names) {
            this.names = names;
            return this;
        }
        public java.util.Map<String, ?> getNames() {
            return this.names;
        }

    }

}
