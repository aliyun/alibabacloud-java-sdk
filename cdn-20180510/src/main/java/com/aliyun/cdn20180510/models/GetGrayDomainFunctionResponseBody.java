// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class GetGrayDomainFunctionResponseBody extends TeaModel {
    @NameInMap("DomainConfigList")
    public java.util.List<GetGrayDomainFunctionResponseBodyDomainConfigList> domainConfigList;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Progression")
    public String progression;

    /**
     * <strong>example:</strong>
     * <p>C80705BF-0F76-41FA-BAD1-5B59296A4E59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetGrayDomainFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGrayDomainFunctionResponseBody self = new GetGrayDomainFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGrayDomainFunctionResponseBody setDomainConfigList(java.util.List<GetGrayDomainFunctionResponseBodyDomainConfigList> domainConfigList) {
        this.domainConfigList = domainConfigList;
        return this;
    }
    public java.util.List<GetGrayDomainFunctionResponseBodyDomainConfigList> getDomainConfigList() {
        return this.domainConfigList;
    }

    public GetGrayDomainFunctionResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetGrayDomainFunctionResponseBody setProgression(String progression) {
        this.progression = progression;
        return this;
    }
    public String getProgression() {
        return this.progression;
    }

    public GetGrayDomainFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGrayDomainFunctionResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auth_type</p>
         */
        @NameInMap("ArgName")
        public String argName;

        /**
         * <strong>example:</strong>
         * <p>req</p>
         */
        @NameInMap("ArgValue")
        public String argValue;

        public static GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs build(java.util.Map<String, ?> map) throws Exception {
            GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs self = new GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs();
            return TeaModel.build(map, self);
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs setArgName(String argName) {
            this.argName = argName;
            return this;
        }
        public String getArgName() {
            return this.argName;
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs setArgValue(String argValue) {
            this.argValue = argValue;
            return this;
        }
        public String getArgValue() {
            return this.argValue;
        }

    }

    public static class GetGrayDomainFunctionResponseBodyDomainConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6295</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("FunctionArgs")
        public java.util.List<GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs> functionArgs;

        /**
         * <strong>example:</strong>
         * <p>ali_auth</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <strong>example:</strong>
         * <p>222728944812032</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetGrayDomainFunctionResponseBodyDomainConfigList build(java.util.Map<String, ?> map) throws Exception {
            GetGrayDomainFunctionResponseBodyDomainConfigList self = new GetGrayDomainFunctionResponseBodyDomainConfigList();
            return TeaModel.build(map, self);
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigList setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigList setFunctionArgs(java.util.List<GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs> functionArgs) {
            this.functionArgs = functionArgs;
            return this;
        }
        public java.util.List<GetGrayDomainFunctionResponseBodyDomainConfigListFunctionArgs> getFunctionArgs() {
            return this.functionArgs;
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetGrayDomainFunctionResponseBodyDomainConfigList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
