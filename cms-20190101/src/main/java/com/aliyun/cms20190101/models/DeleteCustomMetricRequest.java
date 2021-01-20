// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteCustomMetricRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("MetricName")
    public String metricName;

    @NameInMap("Md5")
    public String md5;

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

    public DeleteCustomMetricRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DeleteCustomMetricRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public DeleteCustomMetricRequest setUUID(String UUID) {
        this.UUID = UUID;
        return this;
    }
    public String getUUID() {
        return this.UUID;
    }

}
