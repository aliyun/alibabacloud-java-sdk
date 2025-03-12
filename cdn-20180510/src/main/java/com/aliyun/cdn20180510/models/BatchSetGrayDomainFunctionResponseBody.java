// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetGrayDomainFunctionResponseBody extends TeaModel {
    @NameInMap("DomainConfigList")
    public java.util.List<BatchSetGrayDomainFunctionResponseBodyDomainConfigList> domainConfigList;

    /**
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchSetGrayDomainFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSetGrayDomainFunctionResponseBody self = new BatchSetGrayDomainFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSetGrayDomainFunctionResponseBody setDomainConfigList(java.util.List<BatchSetGrayDomainFunctionResponseBodyDomainConfigList> domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public java.util.List<BatchSetGrayDomainFunctionResponseBodyDomainConfigList> getDomainConfigList() {
        return this.domainConfigList;
    }

    public BatchSetGrayDomainFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchSetGrayDomainFunctionResponseBodyDomainConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>set_resp_header</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        public static BatchSetGrayDomainFunctionResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            BatchSetGrayDomainFunctionResponseBodyDomainConfigList self = new BatchSetGrayDomainFunctionResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public BatchSetGrayDomainFunctionResponseBodyDomainConfigList setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public BatchSetGrayDomainFunctionResponseBodyDomainConfigList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public BatchSetGrayDomainFunctionResponseBodyDomainConfigList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

    }

}
