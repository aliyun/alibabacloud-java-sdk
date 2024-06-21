// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The chatbot IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RobotIds")
    public String robotIds;

    /**
     * <p>The name of the IM chatbot.</p>
     * 
     * <strong>example:</strong>
     * <p>Chatbot name</p>
     */
    @NameInMap("RobotName")
    public String robotName;

    /**
     * <p>The number of IM chatbots to return on each page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
