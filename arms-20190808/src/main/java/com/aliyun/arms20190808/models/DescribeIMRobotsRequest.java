// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsRequest extends TeaModel {
    // The number of pages to query.
    @NameInMap("Page")
    public Long page;

    @NameInMap("RobotIds")
    public String robotIds;

    // The name of the IM robot.
    @NameInMap("RobotName")
    public String robotName;

    // The number of IM robots displayed on each page.
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

    public DescribeIMRobotsRequest setRobotIds(String robotIds) {
        this.robotIds = robotIds;
        return this;
    }
    public String getRobotIds() {
        return this.robotIds;
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
