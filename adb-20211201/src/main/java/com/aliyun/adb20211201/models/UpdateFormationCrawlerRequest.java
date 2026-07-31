// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateFormationCrawlerRequest extends TeaModel {
    /**
     * <p>The JSON string that contains the complete configuration of the crawler. This is the most important parameter. For more information about the internal JSON structure, see the CrawlerInfo structure definition section.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CrawlerInfo")
    public String crawlerInfo;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("CrawlerTaskId")
    public String crawlerTaskId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1r053byu48p****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the regions and zones supported by AnalyticDB for MySQL, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateFormationCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormationCrawlerRequest self = new UpdateFormationCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFormationCrawlerRequest setCrawlerInfo(String crawlerInfo) {
        this.crawlerInfo = crawlerInfo;
        return this;
    }
    public String getCrawlerInfo() {
        return this.crawlerInfo;
    }

    public UpdateFormationCrawlerRequest setCrawlerTaskId(String crawlerTaskId) {
        this.crawlerTaskId = crawlerTaskId;
        return this;
    }
    public String getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    public UpdateFormationCrawlerRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateFormationCrawlerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
