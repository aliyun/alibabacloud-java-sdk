// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiNetworkConfigSearchEngine extends TeaModel {
    /**
     * <p>Required. The API key to authenticate requests to the search engine service.</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>The search content mode, which determines how the service interprets the query and returns results.</p>
     */
    @NameInMap("contentMode")
    public String contentMode;

    /**
     * <p>The number of search results to return. If this parameter is omitted, the service uses a default value.</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The endpoint URL for the search engine service.</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>The industry context for tailoring search results to a specific domain.</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <p>Optional. A key-value map for service-specific parameters not covered by the standard configuration.</p>
     */
    @NameInMap("optionArgs")
    public java.util.Map<String, String> optionArgs;

    /**
     * <p>The starting offset for the search results, used for pagination. For example, a value of 10 skips the first 10 results. The default is 0.</p>
     */
    @NameInMap("start")
    public Integer start;

    /**
     * <p>The time range for filtering results by their creation or modification date.</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    /**
     * <p>The request timeout in milliseconds. If a request exceeds this time, the service terminates it.</p>
     */
    @NameInMap("timeoutMillisecond")
    public Integer timeoutMillisecond;

    /**
     * <p>Specifies the search engine service to use.</p>
     */
    @NameInMap("type")
    public String type;

    public static AiNetworkConfigSearchEngine build(java.util.Map<String, ?> map) throws Exception {
        AiNetworkConfigSearchEngine self = new AiNetworkConfigSearchEngine();
        return TeaModel.build(map, self);
    }

    public AiNetworkConfigSearchEngine setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public AiNetworkConfigSearchEngine setContentMode(String contentMode) {
        this.contentMode = contentMode;
        return this;
    }
    public String getContentMode() {
        return this.contentMode;
    }

    public AiNetworkConfigSearchEngine setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AiNetworkConfigSearchEngine setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public AiNetworkConfigSearchEngine setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public AiNetworkConfigSearchEngine setOptionArgs(java.util.Map<String, String> optionArgs) {
        this.optionArgs = optionArgs;
        return this;
    }
    public java.util.Map<String, String> getOptionArgs() {
        return this.optionArgs;
    }

    public AiNetworkConfigSearchEngine setStart(Integer start) {
        this.start = start;
        return this;
    }
    public Integer getStart() {
        return this.start;
    }

    public AiNetworkConfigSearchEngine setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public AiNetworkConfigSearchEngine setTimeoutMillisecond(Integer timeoutMillisecond) {
        this.timeoutMillisecond = timeoutMillisecond;
        return this;
    }
    public Integer getTimeoutMillisecond() {
        return this.timeoutMillisecond;
    }

    public AiNetworkConfigSearchEngine setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
