// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ForeignInstance extends TeaModel {
    @NameInMap("DataLinkName")
    public String dataLinkName;

    @NameInMap("Host")
    public String host;

    @NameInMap("InstanceSource")
    public String instanceSource;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Port")
    public Integer port;

    @NameInMap("Properties")
    public java.util.Map<String, String> properties;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Sid")
    public String sid;

    public static ForeignInstance build(java.util.Map<String, ?> map) throws Exception {
        ForeignInstance self = new ForeignInstance();
        return TeaModel.build(map, self);
    }

    public ForeignInstance setDataLinkName(String dataLinkName) {
        this.dataLinkName = dataLinkName;
        return this;
    }
    public String getDataLinkName() {
        return this.dataLinkName;
    }

    public ForeignInstance setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public ForeignInstance setInstanceSource(String instanceSource) {
        this.instanceSource = instanceSource;
        return this;
    }
    public String getInstanceSource() {
        return this.instanceSource;
    }

    public ForeignInstance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public ForeignInstance setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ForeignInstance setProperties(java.util.Map<String, String> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    public ForeignInstance setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ForeignInstance setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

}
