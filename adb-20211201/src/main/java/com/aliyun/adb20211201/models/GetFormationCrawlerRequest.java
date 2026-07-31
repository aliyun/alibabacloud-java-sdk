// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetFormationCrawlerRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>247</p>
     */
    @NameInMap("CrawlerTaskId")
    public Long crawlerTaskId;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-crawler-dbname</p>
     */
    @NameInMap("CrawlerTaskName")
    public String crawlerTaskName;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1xxxxxxxx47</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the supported regions and zones, including region IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetFormationCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFormationCrawlerRequest self = new GetFormationCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public GetFormationCrawlerRequest setCrawlerTaskId(Long crawlerTaskId) {
        this.crawlerTaskId = crawlerTaskId;
        return this;
    }
    public Long getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    public GetFormationCrawlerRequest setCrawlerTaskName(String crawlerTaskName) {
        this.crawlerTaskName = crawlerTaskName;
        return this;
    }
    public String getCrawlerTaskName() {
        return this.crawlerTaskName;
    }

    public GetFormationCrawlerRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetFormationCrawlerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
