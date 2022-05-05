// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsRequest extends TeaModel {
    @NameInMap("Page")
    public Long page;

    // 告警机器人名称
    @NameInMap("RobotName")
    public String robotName;

    @NameInMap("Size")
    public Long size;

    public static DescribeIMRobotsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMRobotsRequest self = new DescribeIMRobotsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIMRobotsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeIMRobotsRequest setRobotName(String robotName) {
        this.robotName = robotName;
        return this;
    }
    public String getRobotName() {
        return this.robotName;
    }

    public DescribeIMRobotsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
