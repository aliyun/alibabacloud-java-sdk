// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainConfigsResponseBody extends TeaModel {
    /**
     * <p>域名配置清单。</p>
     */
    @NameInMap("DomainConfigList")
    public BatchSetDcdnDomainConfigsResponseBodyDomainConfigList domainConfigList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetDcdnDomainConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainConfigsResponseBody self = new BatchSetDcdnDomainConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainConfigsResponseBody setDomainConfigList(BatchSetDcdnDomainConfigsResponseBodyDomainConfigList domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public BatchSetDcdnDomainConfigsResponseBodyDomainConfigList getDomainConfigList() {
        return this.domainConfigList;
    }

    public BatchSetDcdnDomainConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel extends TeaModel {
        /**
         * <p>配置ID，如果返回为0，则表示该条配置未配置成功，需要重新配置。</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>域名。</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>功能名称。</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        public static BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel build(java.util.Map<String, ?> map) throws Exception {
            BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel self = new BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel();
            return TeaModel.build(map, self);
        }

        public BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

    public static class BatchSetDcdnDomainConfigsResponseBodyDomainConfigList extends TeaModel {
        @NameInMap("DomainConfigModel")
        public java.util.List<BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel> domainConfigModel;

        public static BatchSetDcdnDomainConfigsResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchSetDcdnDomainConfigsResponseBodyDomainConfigList self = new BatchSetDcdnDomainConfigsResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public BatchSetDcdnDomainConfigsResponseBodyDomainConfigList setDomainConfigModel(java.util.List<BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel> domainConfigModel) {
            this.domainConfigModel = domainConfigModel;
            return this;
        }
        public java.util.List<BatchSetDcdnDomainConfigsResponseBodyDomainConfigListDomainConfigModel> getDomainConfigModel() {
            return this.domainConfigModel;
        }

    }

}
