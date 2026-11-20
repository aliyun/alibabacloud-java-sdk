// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Group extends TeaModel {
    /**
     * <p>The access token for the traffic ingress of the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>MzJiMDI5MDliODc0MTlkYmI0ZDhlYmExYjczYTIyZTE3Zm********</p>
     */
    @NameInMap("AccessToken")
    public String accessToken;

    /**
     * <p>The UID of the account that created the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>20123*******</p>
     */
    @NameInMap("CallerUid")
    public String callerUid;

    /**
     * <p>The ID of the cluster where the service group is located.</p>
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
     * <p>The list of labels for the service group.</p>
     */
    @NameInMap("Labels")
    public java.util.List<GroupLabels> labels;

    /**
     * <p>The name of the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The virtual private cloud (VPC) configuration of the service group.</p>
     */
    @NameInMap("Network")
    public GroupNetwork network;

    /**
     * <p>The UID of the parent account that created the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>11234*******</p>
     */
    @NameInMap("ParentUid")
    public String parentUid;

    /**
     * <p>The queue services included in the service group.</p>
     * 
     * <strong>example:</strong>
     * <p>qservice</p>
     */
    @NameInMap("QueueService")
    public String queueService;

    /**
     * <p>The traffic mode.</p>
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

    public Group setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
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

    public Group setLabels(java.util.List<GroupLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GroupLabels> getLabels() {
        return this.labels;
    }

    public Group setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Group setNetwork(GroupNetwork network) {
        this.network = network;
        return this;
    }
    public GroupNetwork getNetwork() {
        return this.network;
    }

    public Group setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
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

    public static class GroupLabels extends TeaModel {
        /**
         * <p>The label key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <p>The label value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("LabelValue")
        public String labelValue;

        public static GroupLabels build(java.util.Map<String, ?> map) throws Exception {
            GroupLabels self = new GroupLabels();
            return TeaModel.build(map, self);
        }

        public GroupLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public GroupLabels setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

    public static class GroupNetwork extends TeaModel {
        /**
         * <p>The dedicated gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-248xxxxxxvlkhtbrda</p>
         */
        @NameInMap("GatewayId")
        public String gatewayId;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-584xxxxxx7h08llvoww5tv5gl</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xxxxxxwmssgq28gye8</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1xxxxxx0qrykjr9b</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GroupNetwork build(java.util.Map<String, ?> map) throws Exception {
            GroupNetwork self = new GroupNetwork();
            return TeaModel.build(map, self);
        }

        public GroupNetwork setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GroupNetwork setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GroupNetwork setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GroupNetwork setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
