// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class UpdateFormationCrawlerScheduleStateRequest extends TeaModel {
    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>247</p>
     */
    @NameInMap("CrawlerTaskId")
    public Long crawlerTaskId;

    /**
     * <p>The name of the crawler task.</p>
     * <p>This parameter is required.</p>
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
     * <p>am-bp1565u55p32****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the region ID of the cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scheduling state. Valid values:</p>
     * <ul>
     * <li><p>NORMAL: resume.</p>
     * </li>
     * <li><p>DISABLED: pause.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DISABLED</p>
     */
    @NameInMap("ScheduleState")
    public String scheduleState;

    public static UpdateFormationCrawlerScheduleStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormationCrawlerScheduleStateRequest self = new UpdateFormationCrawlerScheduleStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFormationCrawlerScheduleStateRequest setCrawlerTaskId(Long crawlerTaskId) {
        this.crawlerTaskId = crawlerTaskId;
        return this;
    }
    public Long getCrawlerTaskId() {
        return this.crawlerTaskId;
    }

    public UpdateFormationCrawlerScheduleStateRequest setCrawlerTaskName(String crawlerTaskName) {
        this.crawlerTaskName = crawlerTaskName;
        return this;
    }
    public String getCrawlerTaskName() {
        return this.crawlerTaskName;
    }

    public UpdateFormationCrawlerScheduleStateRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateFormationCrawlerScheduleStateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateFormationCrawlerScheduleStateRequest setScheduleState(String scheduleState) {
        this.scheduleState = scheduleState;
        return this;
    }
    public String getScheduleState() {
        return this.scheduleState;
    }

}
