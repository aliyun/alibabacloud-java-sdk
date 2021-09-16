// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeConnectionStatusRequest extends TeaModel {
    @NameInMap("SourceEndpointArchitecture")
    public String sourceEndpointArchitecture;

    @NameInMap("SourceEndpointInstanceType")
    public String sourceEndpointInstanceType;

    @NameInMap("SourceEndpointInstanceID")
    public String sourceEndpointInstanceID;

    @NameInMap("SourceEndpointEngineName")
    public String sourceEndpointEngineName;

    @NameInMap("SourceEndpointRegion")
    public String sourceEndpointRegion;

    @NameInMap("SourceEndpointIP")
    public String sourceEndpointIP;

    @NameInMap("SourceEndpointPort")
    public String sourceEndpointPort;

    @NameInMap("SourceEndpointOracleSID")
    public String sourceEndpointOracleSID;

    @NameInMap("SourceEndpointDatabaseName")
    public String sourceEndpointDatabaseName;

    @NameInMap("SourceEndpointUserName")
    public String sourceEndpointUserName;

    @NameInMap("SourceEndpointPassword")
    public String sourceEndpointPassword;

    @NameInMap("DestinationEndpointInstanceType")
    public String destinationEndpointInstanceType;

    @NameInMap("DestinationEndpointInstanceID")
    public String destinationEndpointInstanceID;

    @NameInMap("DestinationEndpointEngineName")
    public String destinationEndpointEngineName;

    @NameInMap("DestinationEndpointRegion")
    public String destinationEndpointRegion;

    @NameInMap("DestinationEndpointIP")
    public String destinationEndpointIP;

    @NameInMap("DestinationEndpointPort")
    public String destinationEndpointPort;

    @NameInMap("DestinationEndpointDatabaseName")
    public String destinationEndpointDatabaseName;

    @NameInMap("DestinationEndpointUserName")
    public String destinationEndpointUserName;

    @NameInMap("DestinationEndpointPassword")
    public String destinationEndpointPassword;

    @NameInMap("DestinationEndpointOracleSID")
    public String destinationEndpointOracleSID;

    @NameInMap("DestinationEndpointArchitecture")
    public String destinationEndpointArchitecture;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeConnectionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConnectionStatusRequest self = new DescribeConnectionStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConnectionStatusRequest setSourceEndpointArchitecture(String sourceEndpointArchitecture) {
        this.sourceEndpointArchitecture = sourceEndpointArchitecture;
        return this;
    }
    public String getSourceEndpointArchitecture() {
        return this.sourceEndpointArchitecture;
    }

    public DescribeConnectionStatusRequest setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
        this.sourceEndpointInstanceType = sourceEndpointInstanceType;
        return this;
    }
    public String getSourceEndpointInstanceType() {
        return this.sourceEndpointInstanceType;
    }

    public DescribeConnectionStatusRequest setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
        this.sourceEndpointInstanceID = sourceEndpointInstanceID;
        return this;
    }
    public String getSourceEndpointInstanceID() {
        return this.sourceEndpointInstanceID;
    }

    public DescribeConnectionStatusRequest setSourceEndpointEngineName(String sourceEndpointEngineName) {
        this.sourceEndpointEngineName = sourceEndpointEngineName;
        return this;
    }
    public String getSourceEndpointEngineName() {
        return this.sourceEndpointEngineName;
    }

    public DescribeConnectionStatusRequest setSourceEndpointRegion(String sourceEndpointRegion) {
        this.sourceEndpointRegion = sourceEndpointRegion;
        return this;
    }
    public String getSourceEndpointRegion() {
        return this.sourceEndpointRegion;
    }

    public DescribeConnectionStatusRequest setSourceEndpointIP(String sourceEndpointIP) {
        this.sourceEndpointIP = sourceEndpointIP;
        return this;
    }
    public String getSourceEndpointIP() {
        return this.sourceEndpointIP;
    }

    public DescribeConnectionStatusRequest setSourceEndpointPort(String sourceEndpointPort) {
        this.sourceEndpointPort = sourceEndpointPort;
        return this;
    }
    public String getSourceEndpointPort() {
        return this.sourceEndpointPort;
    }

    public DescribeConnectionStatusRequest setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
        this.sourceEndpointOracleSID = sourceEndpointOracleSID;
        return this;
    }
    public String getSourceEndpointOracleSID() {
        return this.sourceEndpointOracleSID;
    }

    public DescribeConnectionStatusRequest setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
        this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
        return this;
    }
    public String getSourceEndpointDatabaseName() {
        return this.sourceEndpointDatabaseName;
    }

    public DescribeConnectionStatusRequest setSourceEndpointUserName(String sourceEndpointUserName) {
        this.sourceEndpointUserName = sourceEndpointUserName;
        return this;
    }
    public String getSourceEndpointUserName() {
        return this.sourceEndpointUserName;
    }

    public DescribeConnectionStatusRequest setSourceEndpointPassword(String sourceEndpointPassword) {
        this.sourceEndpointPassword = sourceEndpointPassword;
        return this;
    }
    public String getSourceEndpointPassword() {
        return this.sourceEndpointPassword;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
        this.destinationEndpointInstanceType = destinationEndpointInstanceType;
        return this;
    }
    public String getDestinationEndpointInstanceType() {
        return this.destinationEndpointInstanceType;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
        this.destinationEndpointInstanceID = destinationEndpointInstanceID;
        return this;
    }
    public String getDestinationEndpointInstanceID() {
        return this.destinationEndpointInstanceID;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointEngineName(String destinationEndpointEngineName) {
        this.destinationEndpointEngineName = destinationEndpointEngineName;
        return this;
    }
    public String getDestinationEndpointEngineName() {
        return this.destinationEndpointEngineName;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointRegion(String destinationEndpointRegion) {
        this.destinationEndpointRegion = destinationEndpointRegion;
        return this;
    }
    public String getDestinationEndpointRegion() {
        return this.destinationEndpointRegion;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointIP(String destinationEndpointIP) {
        this.destinationEndpointIP = destinationEndpointIP;
        return this;
    }
    public String getDestinationEndpointIP() {
        return this.destinationEndpointIP;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointPort(String destinationEndpointPort) {
        this.destinationEndpointPort = destinationEndpointPort;
        return this;
    }
    public String getDestinationEndpointPort() {
        return this.destinationEndpointPort;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
        this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
        return this;
    }
    public String getDestinationEndpointDatabaseName() {
        return this.destinationEndpointDatabaseName;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointUserName(String destinationEndpointUserName) {
        this.destinationEndpointUserName = destinationEndpointUserName;
        return this;
    }
    public String getDestinationEndpointUserName() {
        return this.destinationEndpointUserName;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointPassword(String destinationEndpointPassword) {
        this.destinationEndpointPassword = destinationEndpointPassword;
        return this;
    }
    public String getDestinationEndpointPassword() {
        return this.destinationEndpointPassword;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
        this.destinationEndpointOracleSID = destinationEndpointOracleSID;
        return this;
    }
    public String getDestinationEndpointOracleSID() {
        return this.destinationEndpointOracleSID;
    }

    public DescribeConnectionStatusRequest setDestinationEndpointArchitecture(String destinationEndpointArchitecture) {
        this.destinationEndpointArchitecture = destinationEndpointArchitecture;
        return this;
    }
    public String getDestinationEndpointArchitecture() {
        return this.destinationEndpointArchitecture;
    }

    public DescribeConnectionStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
