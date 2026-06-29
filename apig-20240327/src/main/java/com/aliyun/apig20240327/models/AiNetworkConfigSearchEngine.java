// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiNetworkConfigSearchEngine extends TeaModel {
    /**
     * <p>The API key of the search engine.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <p>Quark-specific: the content mode.</p>
     * 
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("contentMode")
    public String contentMode;

    /**
     * <p>The number of results returned per search.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("count")
    public Integer count;

    /**
     * <p>The endpoint of the search engine.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cloud-iqs.aliyuncs.com">https://cloud-iqs.aliyuncs.com</a></p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>Quark-specific: the industry filter.</p>
     * 
     * <strong>example:</strong>
     * <p>互联网</p>
     */
    @NameInMap("industry")
    public String industry;

    /**
     * <p>The search engine-specific parameters in key-value pair format.</p>
     */
    @NameInMap("optionArgs")
    public java.util.Map<String, String> optionArgs;

    /**
     * <p>The offset of search results.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("start")
    public Integer start;

    /**
     * <p>Quark-specific: the time range filter.</p>
     * 
     * <strong>example:</strong>
     * <p>7d</p>
     */
    @NameInMap("timeRange")
    public String timeRange;

    /**
     * <p>The API call timeout period, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("timeoutMillisecond")
    public Integer timeoutMillisecond;

    /**
     * <p>The search engine type.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunQuark</p>
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
