// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class AddHDMInstanceRequest extends TeaModel {
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

    @NameInMap("FlushAccount")
    public String flushAccount;

    public static AddHDMInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHDMInstanceRequest self = new AddHDMInstanceRequest();
        return TeaModel.build(map, self);
    }

}
