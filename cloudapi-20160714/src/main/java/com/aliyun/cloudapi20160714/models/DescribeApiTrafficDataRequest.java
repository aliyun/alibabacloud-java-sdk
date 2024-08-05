// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiTrafficDataRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>d6f679aeb3be4b91b3688e887ca1fe16</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The end time in UTC. Format: YYYY-MM-DDThh:mm:ssZ</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-23T09:28:48Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the API group.</p>
     * 
     * <strong>example:</strong>
     * <p>63be9002440b4778a61122f14c2b2bbb</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>TEST</strong>: the test environment</li>
     * <li>PRE: the pre-release environment</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RELEASE</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The start time in UTC. Format: YYYY-MM-DDThh:mm:ssZ</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-07-23T08:28:48Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeApiTrafficDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiTrafficDataRequest self = new DescribeApiTrafficDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiTrafficDataRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiTrafficDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApiTrafficDataRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiTrafficDataRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiTrafficDataRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApiTrafficDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
