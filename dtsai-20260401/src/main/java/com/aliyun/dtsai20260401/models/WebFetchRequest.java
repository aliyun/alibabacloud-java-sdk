// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsai20260401.models;

import com.aliyun.tea.*;

public class WebFetchRequest extends TeaModel {
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The output format. Valid values:</p>
     * <ul>
     * <li><p><strong>markdown</strong>: Markdown format.</p>
     * </li>
     * <li><p><strong>html</strong>: HTML format.</p>
     * </li>
     * <li><p><strong>text</strong>: Plain text format.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>markdown</p>
     */
    @NameInMap("OutputFormat")
    public String outputFormat;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The URL of the target web page to crawl.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/projects/spring-boot">https://xxx/projects/spring-boot</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static WebFetchRequest build(java.util.Map<String, ?> map) throws Exception {
        WebFetchRequest self = new WebFetchRequest();
        return TeaModel.build(map, self);
    }

    public WebFetchRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public WebFetchRequest setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }
    public String getOutputFormat() {
        return this.outputFormat;
    }

    public WebFetchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WebFetchRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
