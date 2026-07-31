// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateFormationCrawlerRequest extends TeaModel {
    /**
     * <p>The JSON string that contains the complete crawler configuration. This is the most important parameter. For the internal JSON structure, see the CrawlerInfo structure definition section.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;sourceType&quot;: &quot;OSSWAREHOUSE&quot;,
     *   &quot;dbName&quot;: &quot;your_target_db&quot;,
     *   &quot;sourceInfo&quot;: {
     *     &quot;ossSourceInfo&quot;: {
     *       &quot;sourceMode&quot;: &quot;WAREHOUSE&quot;,
     *       &quot;ossLocations&quot;: [&quot;oss://your-bucket/your-path/&quot;],
     *       &quot;exclusions&quot;: [],
     *       &quot;inclusions&quot;: []
     *     }
     *   },
     *   &quot;classifiers&quot;: [&quot;csv&quot;],
     *   &quot;schemaChangePolicy&quot;: {
     *     &quot;updateRule&quot;: &quot;ONLY_ADD_COLUMN&quot;,
     *     &quot;deleteRule&quot;: &quot;IGNORE&quot;
     *   },
     *   &quot;frequency&quot;: {
     *     &quot;type&quot;: &quot;monthly&quot;,
     *     &quot;cron&quot;: &quot;0+00+00+1+<em>+?+</em>&quot;
     *   },
     *   &quot;configuration&quot;: &quot;adb.crawler.csv.columns.specify.delimiter.char=auto\nadb.crawler.csv.columns.specify.quote.char=auto\n&quot;
     * }</p>
     */
    @NameInMap("CrawlerInfo")
    public String crawlerInfo;

    /**
     * <p>The ADB instance ID. This specifies the resource-level scope of the operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp*****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateFormationCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFormationCrawlerRequest self = new CreateFormationCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public CreateFormationCrawlerRequest setCrawlerInfo(String crawlerInfo) {
        this.crawlerInfo = crawlerInfo;
        return this;
    }
    public String getCrawlerInfo() {
        return this.crawlerInfo;
    }

    public CreateFormationCrawlerRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateFormationCrawlerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
