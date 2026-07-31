// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class StopFormationCrawlerRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
     */
    @NameInMap("CrawlerTaskId")
    public Long crawlerTaskId;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-crawler-dbname</p>
     */
    @NameInMap("CrawlerTaskName")
    public String crawlerTaskName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>am-bp1xxxxxxxx47</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query available region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StopFormationCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        StopFormationCrawlerRequest self = new StopFormationCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public StopFormationCrawlerRequest setCrawlerTaskId(Long crawlerTaskId) {
        this.crawlerTaskId = crawlerTaskId;
        return this;
    }
    public Long getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    public StopFormationCrawlerRequest setCrawlerTaskName(String crawlerTaskName) {
        this.crawlerTaskName = crawlerTaskName;
        return this;
    }
    public String getCrawlerTaskName() {
        return this.crawlerTaskName;
    }

    public StopFormationCrawlerRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public StopFormationCrawlerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
