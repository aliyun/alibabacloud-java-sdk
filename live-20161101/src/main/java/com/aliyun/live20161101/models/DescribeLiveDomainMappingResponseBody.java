// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainMappingResponseBody extends TeaModel {
    @NameInMap("LiveDomainModels")
    public DescribeLiveDomainMappingResponseBodyLiveDomainModels liveDomainModels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F6CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainMappingResponseBody self = new DescribeLiveDomainMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainMappingResponseBody setLiveDomainModels(DescribeLiveDomainMappingResponseBodyLiveDomainModels liveDomainModels) {
        this.liveDomainModels = liveDomainModels;
        return this;
    }
    public DescribeLiveDomainMappingResponseBodyLiveDomainModels getLiveDomainModels() {
        return this.liveDomainModels;
    }

    public DescribeLiveDomainMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Type")
        public String type;

        public static DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel self = new DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainMappingResponseBodyLiveDomainModelsLiveDomainModel setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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
