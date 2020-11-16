// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("LiveDomainModels")
    @Validation(required = true)
    public DescribeLiveDomainMappingResponseLiveDomainModels liveDomainModels;

    public static DescribeLiveDomainMappingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMappingResponse self = new DescribeLiveDomainMappingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMappingResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainMappingResponse setLiveDomainModels(DescribeLiveDomainMappingResponseLiveDomainModels liveDomainModels) {
        this.liveDomainModels = liveDomainModels;
        return this;
    }
    public DescribeLiveDomainMappingResponseLiveDomainModels getLiveDomainModels() {
        return this.liveDomainModels;
    }

    public static class DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel self = new DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeLiveDomainMappingResponseLiveDomainModels extends TeaModel {
        @NameInMap("LiveDomainModel")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel> liveDomainModel;

        public static DescribeLiveDomainMappingResponseLiveDomainModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMappingResponseLiveDomainModels self = new DescribeLiveDomainMappingResponseLiveDomainModels();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMappingResponseLiveDomainModels setLiveDomainModel(java.util.List<DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel> liveDomainModel) {
            this.liveDomainModel = liveDomainModel;
            return this;
        }
        public java.util.List<DescribeLiveDomainMappingResponseLiveDomainModelsLiveDomainModel> getLiveDomainModel() {
            return this.liveDomainModel;
        }

    }

}
