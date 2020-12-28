// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeTraceByConfigurationRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("StartTs")
    public String startTs;

    @NameInMap("EndTs")
    public String endTs;

    public static DescribeTraceByConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceByConfigurationRequest self = new DescribeTraceByConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceByConfigurationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DescribeTraceByConfigurationRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DescribeTraceByConfigurationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DescribeTraceByConfigurationRequest setStartTs(String startTs) {
        this.startTs = startTs;
        return this;
    }
    public String getStartTs() {
        return this.startTs;
    }

    public DescribeTraceByConfigurationRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
    }

}
