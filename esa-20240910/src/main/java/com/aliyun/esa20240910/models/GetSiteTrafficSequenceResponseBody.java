// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteTrafficSequenceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The traffic sequences of the site.</p>
     */
    @NameInMap("TrafficSequences")
    public java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequences> trafficSequences;

    public static GetSiteTrafficSequenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteTrafficSequenceResponseBody self = new GetSiteTrafficSequenceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteTrafficSequenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSiteTrafficSequenceResponseBody setTrafficSequences(java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequences> trafficSequences) {
        this.trafficSequences = trafficSequences;
        return this;
    }
    public java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequences> getTrafficSequences() {
        return this.trafficSequences;
    }

    public static class GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs extends TeaModel {
        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>480339095269376</p>
         */
        @NameInMap("ConfigId")
        public Long configId;

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>global: global configuration.</li>
         * <li>rule: rule configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        @NameInMap("ConfigType")
        public String configType;

        public static GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs self = new GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs();
            return TeaModel.build(map, self);
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs setConfigType(String configType) {
            this.configType = configType;
            return this;
        }
        public String getConfigType() {
            return this.configType;
        }

    }

    public static class GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList extends TeaModel {
        /**
         * <p>The list of configurations for the site feature associated with the traffic sequence.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Configs")
        public java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs> configs;

        /**
         * <p>The feature name.</p>
         * 
         * <strong>example:</strong>
         * <p>redirect_rules</p>
         */
        @NameInMap("FunctionName")
        public String functionName;

        /**
         * <p>Indicates whether the site has a corresponding configuration. Valid values:</p>
         * <ul>
         * <li>true: The site has a corresponding configuration.</li>
         * <li>false: The site does not have a corresponding configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasConfig")
        public Boolean hasConfig;

        public static GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList build(java.util.Map<String, ?> map) throws Exception {
            GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList self = new GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList();
            return TeaModel.build(map, self);
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList setConfigs(java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionListConfigs> getConfigs() {
            return this.configs;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList setHasConfig(Boolean hasConfig) {
            this.hasConfig = hasConfig;
            return this;
        }
        public Boolean getHasConfig() {
            return this.hasConfig;
        }

    }

    public static class GetSiteTrafficSequenceResponseBodyTrafficSequences extends TeaModel {
        /**
         * <p>The list of site features associated with the traffic sequence.</p>
         */
        @NameInMap("FunctionList")
        public java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList> functionList;

        /**
         * <p>The order of the current sequence in the entire traffic sequence.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Order")
        public String order;

        /**
         * <p>The traffic sequence routing.</p>
         * 
         * <strong>example:</strong>
         * <p>/safe/ddos/basic</p>
         */
        @NameInMap("Router")
        public String router;

        /**
         * <p>The sequence code.</p>
         * 
         * <strong>example:</strong>
         * <p>ddos</p>
         */
        @NameInMap("SequenceCode")
        public String sequenceCode;

        /**
         * <p>The sequence name.</p>
         * 
         * <strong>example:</strong>
         * <p>DDOS</p>
         */
        @NameInMap("SequenceName")
        public String sequenceName;

        public static GetSiteTrafficSequenceResponseBodyTrafficSequences build(java.util.Map<String, ?> map) throws Exception {
            GetSiteTrafficSequenceResponseBodyTrafficSequences self = new GetSiteTrafficSequenceResponseBodyTrafficSequences();
            return TeaModel.build(map, self);
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequences setFunctionList(java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList> functionList) {
            this.functionList = functionList;
            return this;
        }
        public java.util.List<GetSiteTrafficSequenceResponseBodyTrafficSequencesFunctionList> getFunctionList() {
            return this.functionList;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequences setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequences setRouter(String router) {
            this.router = router;
            return this;
        }
        public String getRouter() {
            return this.router;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequences setSequenceCode(String sequenceCode) {
            this.sequenceCode = sequenceCode;
            return this;
        }
        public String getSequenceCode() {
            return this.sequenceCode;
        }

        public GetSiteTrafficSequenceResponseBodyTrafficSequences setSequenceName(String sequenceName) {
            this.sequenceName = sequenceName;
            return this;
        }
        public String getSequenceName() {
            return this.sequenceName;
        }

    }

}
