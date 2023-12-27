// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RefreshErObjectCachesRequest extends TeaModel {
    @NameInMap("Force")
    public Boolean force;

    @NameInMap("MergeDomainName")
    public String mergeDomainName;

    @NameInMap("ObjectPath")
    public String objectPath;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("RoutineId")
    public String routineId;

    public static RefreshErObjectCachesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshErObjectCachesRequest self = new RefreshErObjectCachesRequest();
        return TeaModel.build(map, self);
    }

    public RefreshErObjectCachesRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public RefreshErObjectCachesRequest setMergeDomainName(String mergeDomainName) {
        this.mergeDomainName = mergeDomainName;
        return this;
    }
    public String getMergeDomainName() {
        return this.mergeDomainName;
    }

    public RefreshErObjectCachesRequest setObjectPath(String objectPath) {
        this.objectPath = objectPath;
        return this;
    }
    public String getObjectPath() {
        return this.objectPath;
    }

    public RefreshErObjectCachesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public RefreshErObjectCachesRequest setRoutineId(String routineId) {
        this.routineId = routineId;
        return this;
    }
    public String getRoutineId() {
        return this.routineId;
    }

}
