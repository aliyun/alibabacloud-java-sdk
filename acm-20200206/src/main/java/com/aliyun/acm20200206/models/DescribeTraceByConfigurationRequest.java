// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeTraceByConfigurationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("EndTs")
    public String endTs;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Group")
    public String group;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("StartTs")
    public String startTs;

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

    public DescribeTraceByConfigurationRequest setEndTs(String endTs) {
        this.endTs = endTs;
        return this;
    }
    public String getEndTs() {
        return this.endTs;
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

}
