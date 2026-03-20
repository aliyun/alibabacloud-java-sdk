// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Group extends TeaModel {
    /**
     * <p>The token that is used to access the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The region where the service group resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The time when the service group was created. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-05-19T14:19:42Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The public endpoint of the service group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://1110*****.cn-hangzhou.pai-eas.aliyuncs.com/api/predict/test_group">http://1110*****.cn-hangzhou.pai-eas.aliyuncs.com/api/predict/test_group</a></p>
     */
    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    /**
     * <p>The internal endpoint of the service group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://1110*****.vpc.cn-hangzhou.pai-eas.aliyuncs.com/api/predict/test_group">http://1110*****.vpc.cn-hangzhou.pai-eas.aliyuncs.com/api/predict/test_group</a></p>
     */
    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    /**
     * <p>The name of the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The queue service that is included in the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>qservice</p>
     */
    @NameInMap("QueueService")
    public String queueService;

    /**
     * <p>The traffic mode.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>auto: The traffic is automatically allocated based on the number of instances.</li>
     * <li>customized: The traffic is allocated based on the custom weight.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("TrafficMode")
    public String trafficMode;

    /**
     * <p>The time when the service group was updated. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-29T11:13:20Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    public static Group build(java.util.Map<String, ?> map) throws Exception {
        Group self = new Group();
        return TeaModel.build(map, self);
    }

    public Group setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public Group setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public Group setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Group setInternetEndpoint(String internetEndpoint) {
        this.internetEndpoint = internetEndpoint;
        return this;
    }
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    public Group setIntranetEndpoint(String intranetEndpoint) {
        this.intranetEndpoint = intranetEndpoint;
        return this;
    }
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Group setQueueService(String queueService) {
        this.queueService = queueService;
        return this;
    }
    public String getQueueService() {
        return this.queueService;
    }

    public Group setTrafficMode(String trafficMode) {
        this.trafficMode = trafficMode;
        return this;
    }
    public String getTrafficMode() {
        return this.trafficMode;
    }

    public Group setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
