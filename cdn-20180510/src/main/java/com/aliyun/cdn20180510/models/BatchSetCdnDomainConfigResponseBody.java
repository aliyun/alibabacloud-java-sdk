// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigResponseBody extends TeaModel {
    /**
     * <p>The list of domain configurations.</p>
     */
    @NameInMap("DomainConfigList")
    public BatchSetCdnDomainConfigResponseBodyDomainConfigList domainConfigList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetCdnDomainConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainConfigResponseBody self = new BatchSetCdnDomainConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainConfigResponseBody setDomainConfigList(BatchSetCdnDomainConfigResponseBodyDomainConfigList domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public BatchSetCdnDomainConfigResponseBodyDomainConfigList getDomainConfigList() {
        return this.domainConfigList;
    }

    public BatchSetCdnDomainConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel extends TeaModel {
        /**
         * <p>The ID of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the feature.</p>
         * 
         * <strong>example:</strong>
         * <p>set_resp_header</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        public static BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel build(java.util.Map<String, ?> map) throws Exception {
            BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel self = new BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel();
            return TeaModel.build(map, self);
        }

        public BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

    public static class BatchSetCdnDomainConfigResponseBodyDomainConfigList extends TeaModel {
        @NameInMap("DomainConfigModel")
        public java.util.List<BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel> domainConfigModel;

        public static BatchSetCdnDomainConfigResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchSetCdnDomainConfigResponseBodyDomainConfigList self = new BatchSetCdnDomainConfigResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public BatchSetCdnDomainConfigResponseBodyDomainConfigList setDomainConfigModel(java.util.List<BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel> domainConfigModel) {
            this.domainConfigModel = domainConfigModel;
            return this;
        }
        public java.util.List<BatchSetCdnDomainConfigResponseBodyDomainConfigListDomainConfigModel> getDomainConfigModel() {
            return this.domainConfigModel;
        }

    }

}
