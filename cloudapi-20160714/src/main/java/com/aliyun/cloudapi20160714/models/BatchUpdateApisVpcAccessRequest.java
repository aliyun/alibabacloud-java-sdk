// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class BatchUpdateApisVpcAccessRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OldVpcId")
    public String oldVpcId;

    @NameInMap("OldInstanceId")
    public String oldInstanceId;

    @NameInMap("OldPort")
    public Integer oldPort;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DisplayInstanceId")
    public String displayInstanceId;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("ServiceAddress")
    public String serviceAddress;

    @NameInMap("Api")
    public java.util.List<BatchUpdateApisVpcAccessRequestApi> api;

    public static BatchUpdateApisVpcAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateApisVpcAccessRequest self = new BatchUpdateApisVpcAccessRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateApisVpcAccessRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public BatchUpdateApisVpcAccessRequest setOldVpcId(String oldVpcId) {
        this.oldVpcId = oldVpcId;
        return this;
    }
    public String getOldVpcId() {
        return this.oldVpcId;
    }

    public BatchUpdateApisVpcAccessRequest setOldInstanceId(String oldInstanceId) {
        this.oldInstanceId = oldInstanceId;
        return this;
    }
    public String getOldInstanceId() {
        return this.oldInstanceId;
    }

    public BatchUpdateApisVpcAccessRequest setOldPort(Integer oldPort) {
        this.oldPort = oldPort;
        return this;
    }
    public Integer getOldPort() {
        return this.oldPort;
    }

    public BatchUpdateApisVpcAccessRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public BatchUpdateApisVpcAccessRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchUpdateApisVpcAccessRequest setDisplayInstanceId(String displayInstanceId) {
        this.displayInstanceId = displayInstanceId;
        return this;
    }
    public String getDisplayInstanceId() {
        return this.displayInstanceId;
    }

    public BatchUpdateApisVpcAccessRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public BatchUpdateApisVpcAccessRequest setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
        return this;
    }
    public String getServiceAddress() {
        return this.serviceAddress;
    }

    public BatchUpdateApisVpcAccessRequest setApi(java.util.List<BatchUpdateApisVpcAccessRequestApi> api) {
        this.api = api;
        return this;
    }
    public java.util.List<BatchUpdateApisVpcAccessRequestApi> getApi() {
        return this.api;
    }

    public static class BatchUpdateApisVpcAccessRequestApi extends TeaModel {
        @NameInMap("StageId")
        public String stageId;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ApiUid")
        public String apiUid;

        public static BatchUpdateApisVpcAccessRequestApi build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateApisVpcAccessRequestApi self = new BatchUpdateApisVpcAccessRequestApi();
            return TeaModel.build(map, self);
        }

        public BatchUpdateApisVpcAccessRequestApi setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public BatchUpdateApisVpcAccessRequestApi setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BatchUpdateApisVpcAccessRequestApi setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

    }

}
