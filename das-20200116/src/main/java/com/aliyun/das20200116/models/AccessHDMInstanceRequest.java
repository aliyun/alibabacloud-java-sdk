// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AccessHDMInstanceRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("__context")
    public String context;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("InstanceArea")
    public String instanceArea;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public String ip;

    @NameInMap("Port")
    public String port;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("Username")
    public String username;

    @NameInMap("Password")
    public String password;

    @NameInMap("InstanceAlias")
    public String instanceAlias;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Region")
    public String region;

    @NameInMap("CallerBid")
    public String callerBid;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("OwnerIdSignature")
    public String ownerIdSignature;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("CallerUid")
    public String callerUid;

    @NameInMap("Target")
    public String target;

    @NameInMap("Product")
    public String product;

    @NameInMap("External")
    public String external;

    public static AccessHDMInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessHDMInstanceRequest self = new AccessHDMInstanceRequest();
        return TeaModel.build(map, self);
    }

}
