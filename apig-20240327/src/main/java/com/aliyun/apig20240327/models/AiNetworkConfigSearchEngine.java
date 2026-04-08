// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AiNetworkConfigSearchEngine extends TeaModel {
    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("contentMode")
    public String contentMode;

    @NameInMap("count")
    public Integer count;

    @NameInMap("endpoint")
    public String endpoint;

    @NameInMap("industry")
    public String industry;

    @NameInMap("optionArgs")
    public java.util.Map<String, String> optionArgs;

    @NameInMap("start")
    public Integer start;

    @NameInMap("timeRange")
    public String timeRange;

    @NameInMap("timeoutMillisecond")
    public Integer timeoutMillisecond;

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
