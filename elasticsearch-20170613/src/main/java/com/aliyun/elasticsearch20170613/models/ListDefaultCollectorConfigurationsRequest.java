// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListDefaultCollectorConfigurationsRequest extends TeaModel {
    /**
     * <p>The shipper type. Valid values:</p>
     * <ul>
     * <li>fileBeat</li>
     * <li>metricBeat</li>
     * <li>heartBeat</li>
     * <li>auditBeat</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fileBeat</p>
     */
    @NameInMap("resType")
    public String resType;

    /**
     * <p>The shipper version. The shipper version varies based on the type of the machine on which the shipper is deployed. Valid values:</p>
     * <ul>
     * <li>ECS: 6.8.5_with_community</li>
     * <li>ACK: 6.8.13_with_community</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6.8.5_with_community</p>
     */
    @NameInMap("resVersion")
    public String resVersion;

    /**
     * <p>The type of the machine on which the shipper is deployed. If you do not configure this parameter, the default configuration files of shippers deployed on all types of machines are returned. Valid values:</p>
     * <ul>
     * <li>ECS: ECS instance</li>
     * <li>ACK: ACK cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    public static ListDefaultCollectorConfigurationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultCollectorConfigurationsRequest self = new ListDefaultCollectorConfigurationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDefaultCollectorConfigurationsRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public ListDefaultCollectorConfigurationsRequest setResVersion(String resVersion) {
        this.resVersion = resVersion;
        return this;
    }
    public String getResVersion() {
        return this.resVersion;
    }

    public ListDefaultCollectorConfigurationsRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
