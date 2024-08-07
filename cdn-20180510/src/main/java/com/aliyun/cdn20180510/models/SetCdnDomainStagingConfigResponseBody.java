// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigResponseBody extends TeaModel {
    /**
     * <p>The list of domain configurations.</p>
     */
    @NameInMap("DomainConfigList")
    public java.util.List<SetCdnDomainStagingConfigResponseBodyDomainConfigList> domainConfigList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetCdnDomainStagingConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainStagingConfigResponseBody self = new SetCdnDomainStagingConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainStagingConfigResponseBody setDomainConfigList(java.util.List<SetCdnDomainStagingConfigResponseBodyDomainConfigList> domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public java.util.List<SetCdnDomainStagingConfigResponseBodyDomainConfigList> getDomainConfigList() {
        return this.domainConfigList;
    }

    public SetCdnDomainStagingConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SetCdnDomainStagingConfigResponseBodyDomainConfigList extends TeaModel {
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

        public static SetCdnDomainStagingConfigResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            SetCdnDomainStagingConfigResponseBodyDomainConfigList self = new SetCdnDomainStagingConfigResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public SetCdnDomainStagingConfigResponseBodyDomainConfigList setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public SetCdnDomainStagingConfigResponseBodyDomainConfigList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public SetCdnDomainStagingConfigResponseBodyDomainConfigList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
