// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("LiveDomainModels")
    public DescribeLiveDomainMappingResponseBodyLiveDomainModels liveDomainModels;

    public static DescribeLiveDomainMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMappingResponseBody self = new DescribeLiveDomainMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainMappingResponseBody setLiveDomainModels(DescribeLiveDomainMappingResponseBodyLiveDomainModels liveDomainModels) {
        this.liveDomainModels = liveDomainModels;
        return this;
    }
    public DescribeLiveDomainMappingResponseBodyLiveDomainModels getLiveDomainModels() {
        return this.liveDomainModels;
    }

    public static class DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DomainName")
        public String domainName;

        public static DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel self = new DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

    }

    public static class DescribeLiveDomainMappingResponseBodyLiveDomainModels extends TeaModel {
        @NameInMap("LiveDomainModel")
        public java.util.List<DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel> liveDomainModel;

        public static DescribeLiveDomainMappingResponseBodyLiveDomainModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMappingResponseBodyLiveDomainModels self = new DescribeLiveDomainMappingResponseBodyLiveDomainModels();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMappingResponseBodyLiveDomainModels setLiveDomainModel(java.util.List<DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel> liveDomainModel) {
            this.liveDomainModel = liveDomainModel;
            return this;
        }
        public java.util.List<DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel> getLiveDomainModel() {
            return this.liveDomainModel;
        }

    }

}
