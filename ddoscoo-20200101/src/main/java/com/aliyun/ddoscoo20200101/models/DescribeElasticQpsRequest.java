// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeElasticQpsRequest extends TeaModel {
    /**
     * <p>The end of the query time range, specified as a UNIX timestamp in seconds.</p>
     * <blockquote>
     * <p>The timestamp must be the start of a minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684339200</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The sampling interval, in seconds. The value must be a multiple of 60. The default value is 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The IP address of the Anti-DDoS instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>203.107.XX.XX</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The service region. Valid values:</p>
     * <ul>
     * <li><p><strong>cn</strong>: Chinese mainland.</p>
     * </li>
     * <li><p><strong>cn-hongkong</strong>: Outside Chinese mainland.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The start of the query time range, specified as a UNIX timestamp in seconds.</p>
     * <blockquote>
     * <p>The timestamp must be the start of a minute.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684252800</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeElasticQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeElasticQpsRequest self = new DescribeElasticQpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeElasticQpsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeElasticQpsRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeElasticQpsRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DescribeElasticQpsRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeElasticQpsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
