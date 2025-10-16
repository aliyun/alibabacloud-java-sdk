// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAccessInstanceTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pdi-3bc2f91695ee48bd9377</p>
     */
    @NameInMap("AccessInstanceId")
    public String accessInstanceId;

    /**
     * <strong>example:</strong>
     * <p>AckClusterConnector</p>
     */
    @NameInMap("AccessInstanceType")
    public String accessInstanceType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>task-c92d4544ef7b6a42</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeAccessInstanceTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessInstanceTaskRequest self = new DescribeAccessInstanceTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessInstanceTaskRequest setAccessInstanceId(String accessInstanceId) {
        this.accessInstanceId = accessInstanceId;
        return this;
    }
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    public DescribeAccessInstanceTaskRequest setAccessInstanceType(String accessInstanceType) {
        this.accessInstanceType = accessInstanceType;
        return this;
    }
    public String getAccessInstanceType() {
        return this.accessInstanceType;
    }

    public DescribeAccessInstanceTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAccessInstanceTaskRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeAccessInstanceTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
