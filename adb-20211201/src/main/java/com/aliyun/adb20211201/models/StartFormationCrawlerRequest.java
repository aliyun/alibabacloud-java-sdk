// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StartFormationCrawlerRequest extends TeaModel {
    /**
     * <p>The ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>247</p>
     */
    @NameInMap("CrawlerTaskId")
    public Long crawlerTaskId;

    /**
     * <p>The name of the task.</p>
     * 
     * <strong>example:</strong>
     * <p>test-crawler-dbname</p>
     */
    @NameInMap("CrawlerTaskName")
    public String crawlerTaskName;

    /**
     * <p>The ID of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1pke2pcfavw****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the IDs of available regions.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartFormationCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        StartFormationCrawlerRequest self = new StartFormationCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public StartFormationCrawlerRequest setCrawlerTaskId(Long crawlerTaskId) {
        this.crawlerTaskId = crawlerTaskId;
        return this;
    }
    public Long getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    public StartFormationCrawlerRequest setCrawlerTaskName(String crawlerTaskName) {
        this.crawlerTaskName = crawlerTaskName;
        return this;
    }
    public String getCrawlerTaskName() {
        return this.crawlerTaskName;
    }

    public StartFormationCrawlerRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public StartFormationCrawlerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
