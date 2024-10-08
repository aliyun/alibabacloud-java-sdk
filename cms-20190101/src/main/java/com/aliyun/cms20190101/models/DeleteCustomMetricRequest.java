// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteCustomMetricRequest extends TeaModel {
    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3607****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The MD5 value of the HTTP request body. The MD5 value is a 128-bit hash value used to verify the uniqueness of the reported monitoring data.</p>
     * <blockquote>
     * <p> <code>Md5</code> is returned when you query the reported monitoring data of a metric.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>38796C8CFFEB8F89BB2A626C7BD7****</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The name of the metric.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AdvanceCredit</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request for reporting monitoring data.</p>
     * <blockquote>
     * <p> <code>UUID</code> is returned when you query the reported monitoring data of a metric. We recommend that you specify the <code>Md5</code> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5497633c-66c5-4eae-abaa-89db5adb****</p>
     */
    @NameInMap("UUID")
    public String UUID;

    public static DeleteCustomMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomMetricRequest self = new DeleteCustomMetricRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomMetricRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteCustomMetricRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public DeleteCustomMetricRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DeleteCustomMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteCustomMetricRequest setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
